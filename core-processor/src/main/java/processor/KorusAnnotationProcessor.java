package processor;

import com.google.auto.service.AutoService;

import javax.annotation.processing.*;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.Element;
import javax.lang.model.element.TypeElement;
import javax.tools.Diagnostic;
import java.util.Set;

/**
 * Korus Framework Annotation Processor.
 * 
 * <p>This processor validates the architecture by demonstrating that:</p>
 * <ul>
 *   <li>The processor is correctly discovered via ServiceLoader</li>
 *   <li>The processor runs during user application compilation</li>
 *   <li>Build-time processing is properly isolated from runtime</li>
 * </ul>
 *
 * @author Vinit Shinde
 * @since 1.0.0
 */
@AutoService(Processor.class)
@SupportedAnnotationTypes("*")
@SupportedSourceVersion(SourceVersion.RELEASE_17)
public class KorusAnnotationProcessor extends AbstractProcessor {

    private boolean verbose = false;
    private boolean incremental = false;

    @Override
    public synchronized void init(ProcessingEnvironment processingEnv) {
        super.init(processingEnv);
        
        verbose = Boolean.parseBoolean(
            processingEnv.getOptions().getOrDefault("korus.processing.verbose", "false")
        );
        incremental = Boolean.parseBoolean(
            processingEnv.getOptions().getOrDefault("korus.processing.incremental", "false")
        );

        if (verbose) {
            processingEnv.getMessager().printMessage(
                Diagnostic.Kind.NOTE,
                "Korus Annotation Processor initialized"
            );
            processingEnv.getMessager().printMessage(
                Diagnostic.Kind.NOTE,
                "  Verbose mode: " + verbose
            );
            processingEnv.getMessager().printMessage(
                Diagnostic.Kind.NOTE,
                "  Incremental mode: " + incremental
            );
        }
    }

    @Override
    public boolean process(Set<? extends TypeElement> annotations, RoundEnvironment roundEnv) {
        if (roundEnv.processingOver()) {
            if (verbose) {
                processingEnv.getMessager().printMessage(
                    Diagnostic.Kind.NOTE,
                    "Korus Annotation Processor completed successfully"
                );
            }
            return false;
        }

        if (verbose && !roundEnv.getRootElements().isEmpty()) {
            processingEnv.getMessager().printMessage(
                Diagnostic.Kind.NOTE,
                "Korus Processor: Processing " + roundEnv.getRootElements().size() + " elements"
            );
            
            for (Element element : roundEnv.getRootElements()) {
                if (element instanceof TypeElement) {
                    TypeElement typeElement = (TypeElement) element;
                    processingEnv.getMessager().printMessage(
                        Diagnostic.Kind.NOTE,
                        "  - Processing: " + typeElement.getQualifiedName()
                    );
                }
            }
        }

        return false;
    }

    @Override
    public Set<String> getSupportedOptions() {
        return Set.of(
            "korus.processing.verbose",
            "korus.processing.incremental",
            "korus.processing.annotations"
        );
    }
}
