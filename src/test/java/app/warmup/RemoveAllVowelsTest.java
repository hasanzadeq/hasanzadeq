package app.warmup;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveAllVowelsTest {

    private Filterable task;

    @BeforeEach
    void setUp() {
       this.task = new RemoveAllVowels();
    }

    @Test
    void filter1() {
        String origin = "Hello";
        String expected = "Hll";
        String actual = task.format(origin);
        assertEquals(expected, actual);
    }

    @Test
    void filter2() {
        String origin = "eee";
        String expected = "";
        String actual = task.format(origin);
        assertEquals(expected, actual);
    }

    @Test
    void filter3() {
        String origin = "";
        String expected = "";
        String actual = task.format(origin);
        assertEquals(expected, actual);
    }

    @Test
    void filter4() {
        String origin = null;
        String expected = null;
        String actual = task.format(origin);
        assertEquals(expected, actual);
    }

    @Test
    void filter5() {
        String origin = "Hello";
        String expected = "Hll";
        String actual = task.format(origin);
        assertEquals(expected, actual);
    }

    @Test
    void filter6() {
        String origin = "Hello";
        String expected = "Hll";
        String actual = task.format(origin);
        assertEquals(expected, actual);
    }
}