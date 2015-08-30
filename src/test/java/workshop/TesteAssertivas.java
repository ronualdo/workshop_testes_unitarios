package workshop;

import org.hamcrest.core.CombinableMatcher;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.Arrays;

import static junit.framework.Assert.assertNotSame;
import static junit.framework.Assert.assertNull;
import static junit.framework.Assert.assertSame;
import static junit.framework.TestCase.assertFalse;
import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.core.Every.everyItem;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class TesteAssertivas {

    @Test
    public void testando_arrays() {
        int[] array1 = { 1, 2, 3 };
        int[] array2 = { 1, 2, 3 };

        assertArrayEquals(array1, array2);
    }

    @Test
    public void testando_igualdade() {
        assertEquals("1 2 3", "1 2 3");
        assertNotEquals("1 2 3", "1 2 4");
    }

    @Test
    public void testando_veracidade() {
        assertFalse(1 == 2);
        assertTrue(2 == 2);
    }

    @Test
    public void testando_se_e_nulo() {
        assertNull(null);
        assertNotNull("not null");
    }

    @Test
    public void testando_se_sao_o_mesmo() {
        BigDecimal um = new BigDecimal(1);

        assertSame(um, um);
        assertNotSame(um, new BigDecimal(1));
    }

    // JUnit Matchers assertThat
    @Test
    public void testando_matchers() {
        String nome = "Ronualdo";
        assertThat(nome, is("Ronualdo"));
        assertThat(nome, both(containsString("a")).and(containsString("l")));
        assertThat(Arrays.asList("um", "dois", "tres"), hasItems("one", "tres"));
        assertThat(Arrays.asList(new String[]{"maria", "joaquim", "ivan"}), everyItem(containsString("i")));
        assertThat("good", allOf(equalTo("good"), startsWith("good")));
        assertThat("good", not(allOf(equalTo("bad"), equalTo("good"))));
        assertThat("good", anyOf(equalTo("bad"), equalTo("good")));
        assertThat(7, not(CombinableMatcher.either(equalTo(3)).or(equalTo(4))));
        assertThat(new Object(), not(sameInstance(new Object())));
    }
}
