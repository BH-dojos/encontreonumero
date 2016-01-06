package telefone;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class ConversorTest {
    @Test
    public void umNaoSeTransforma() throws Exception {
        char um = '1';
        Conversor conversor = new Conversor();
        char convertido = conversor.converte(um);
        assertThat(convertido, is(um));

    }

    @Test
    public void zeroNaoSeTransforma() throws Exception {
        char zero = '0';
        Conversor conversor = new Conversor();
        char convertido = conversor.converte(zero);
        assertThat(convertido, is(zero));

    }

    @Test
    public void hifenNaoSeTransforma() throws Exception {
        char hifen = '-';
        Conversor conversor = new Conversor();
        char convertido = conversor.converte(hifen);
        assertThat(convertido, is(hifen));

    }

    @Test
    public void letraASeTransformaEmDois() throws Exception {
        char a = 'A';
        Conversor conversor = new Conversor();
        char convertido = conversor.converte(a);
        assertThat(convertido, is('2'));

    }






}
