package workshop;

import org.junit.Ignore;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.fail;

public class TesteExcessoes {

    @Test(expected = IndexOutOfBoundsException.class)
    public void deve_disparar_um_IndexOutOfBoundsException_ao_acessar_primeiro_indice_de_lista_vazia() {
        new ArrayList<>().get(0);
    }

    @Test
    public void deve_indicar_o_indice_e_tamanho_na_mensagem() {
        try {
            new ArrayList<>().get(0);
            fail("Expected an IndexOutOfBoundsException to be thrown");
        } catch (IndexOutOfBoundsException anIndexOutOfBoundsException) {
            assertThat(anIndexOutOfBoundsException.getMessage(), is("Index: 0, Size: 0"));
        }
    }

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void deve_indicar_o_indice_e_tamanho_na_mensagem_usando_rule() throws IndexOutOfBoundsException {
        List<Object> lista = new ArrayList<>();

        thrown.expect(IndexOutOfBoundsException.class);
        thrown.expectMessage("Index: 0, Size: 0");
        lista.get(0);
    }

    @Test @Ignore("o teste está ignorado pq é apenas um exemplo")
    public void deve_lidar_com_CheckedException() throws FileNotFoundException {
        new FileReader(new File("arquivo_inexistente.txt"));
    }
}
