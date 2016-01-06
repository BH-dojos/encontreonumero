package telefone;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class ConversorTest {
    Conversor conversor;

    @Before
    public void setUp() throws Exception {
        conversor = new Conversor();
    }

    public void verificaConversao(char recebido, char esperado){
        char convertido = conversor.converte(recebido);
        assertThat(convertido, is(esperado));
    }

    @Test
    public void umNaoSeTransforma() throws Exception {
        char um = '1';
        verificaConversao(um, um);
    }

    @Test
    public void zeroNaoSeTransforma() throws Exception {
        char zero = '0';
        verificaConversao(zero, zero);
    }

    @Test
    public void hifenNaoSeTransforma() throws Exception {
        char hifen = '-';
        verificaConversao(hifen, hifen);
    }

    @Test
    public void letraASeTransformaEmDois() throws Exception {
        char a = 'A';
        verificaConversao(a, '2');
    }

    @Test
    public void letraBSeTransformaEmDois() throws Exception {
        char b = 'B';
        verificaConversao(b, '2');
    }

    @Test
    public void letraCSeTransformaEmDois() throws Exception {
        char c = 'C';
        verificaConversao(c, '2');
    }

}
