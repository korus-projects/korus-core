package test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TestApplicationTest {

    @Test
    void greetReturnsExpected() {
        assertEquals("Hello, Vineet!", TestApplication.greet("Vineet"));
    }
}

