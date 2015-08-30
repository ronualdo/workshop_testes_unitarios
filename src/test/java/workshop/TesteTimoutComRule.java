package workshop;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

import static org.junit.Assert.assertTrue;

public class TesteTimoutComRule {

    @Rule
    public Timeout globalTimeout = Timeout.seconds(5);

    @Test
    public void deve_rodar_em_menos_de_5_segundos() throws InterruptedException {
        Thread.sleep(4001);
        assertTrue(true);
    }

    @Test
    public void tambem_deve_rodar_em_menos_de_10_segundos() throws InterruptedException {
        Thread.sleep(4001);
        assertTrue(true);
    }


}
