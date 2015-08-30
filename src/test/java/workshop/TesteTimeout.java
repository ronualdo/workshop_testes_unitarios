package workshop;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class TesteTimeout {

    @Test(timeout=1001)
    public void deve_rodar_em_10_segundos() throws InterruptedException {
        Thread.sleep(1000);
        assertTrue(true);
    }
}
