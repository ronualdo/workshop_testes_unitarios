package workshop;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TesteOrdem {

    @Test
    public void primeiroTeste() {
        System.out.println("primeiro teste");
    }

    @Test
    public void segundoTeste() {
        System.out.println("segundo teste");
    }

    @Test
    public void terceiroTeste() {
        System.out.println("terceiro teste");
    }
}
