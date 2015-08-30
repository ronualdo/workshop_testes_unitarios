package workshop;

import org.junit.*;

public class TesteFixtures {

    @BeforeClass
    public static void setupQueDeveAcontecerSoUmaVez() {
        System.out.println("Before Class");
    }

    @Before
    public void setupQueDeveAcontecerSempreAntesDosTestes() {
        System.out.println("Before");
    }

    @AfterClass
    public static void tearDownQueDeveAcontecerSoUmaVez() {
        System.out.println("After Class");
    }

    @After
    public void tearDownQueDeveAcontecerSempreDepoisDosTestes() {
        System.out.println("After");
    }

    @Test
    public void teste1() {
        System.out.println("teste 1");
    }

    @Test
    public void teste2() {
        System.out.println("teste 2");
    }
}
