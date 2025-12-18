package test;

public class TestController {

    private TestService testService;

    public TestController() {
        this.testService = new TestService();
    }

    public void handleRequest() {
        System.out.println("TestController: Handling request...");
        String message = testService.getMessage();
        System.out.println("TestController: Received message: " + message);
        testService.performAction();
    }
}
