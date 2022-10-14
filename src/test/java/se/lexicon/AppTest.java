package se.lexicon;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void sum() {
        String str = null;
        assertThrows(NumberFormatException.class, () -> {
            Integer.valueOf(str);
        });


    }

    @Test
    void sub() {
    }

    @Test
    void multiply() {
    }

    @Test
    void divide() {}


    @Test
    void calculator() {
    }

    @Test
    void main() {
    }
}