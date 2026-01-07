param(
    [Parameter(Mandatory=$true)]
    [string]$ModuleName
)

$moduleClasses = "$ModuleName\target\classes"

if (!(Test-Path $moduleClasses)) {
    Write-Error "Module '$ModuleName' is not compiled. Run mvn -pl $ModuleName -am compile first."
    exit 1
}

Get-ChildItem -Recurse $moduleClasses -Filter *.class |
Where-Object { $_.Name -ne "module-info.class" } |
ForEach-Object {

    $root = (Resolve-Path $moduleClasses).Path
    $relative = $_.FullName.Substring($root.Length + 1)

    $class = $relative.Replace("\", ".").Replace(".class", "")

    $pkg = $relative.Substring(0, $relative.LastIndexOf("\"))
    $prefix = "io\korus\$ModuleName\"
    if ($pkg.StartsWith($prefix)) {
        $pkg = $pkg.Substring($prefix.Length)
    }

    $outDir = "kernel-api\$ModuleName\$pkg"
    New-Item -ItemType Directory -Force -Path $outDir | Out-Null

    $outFile = "$outDir\$($_.BaseName).txt"
    javap -public -classpath $moduleClasses $class > $outFile
}

Write-Host "Kernel API index generated for module '$ModuleName'"