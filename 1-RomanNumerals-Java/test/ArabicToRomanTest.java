import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class ArabicToRomanTest {
    @Test
    public void shouldConvert1ToI() throws Exception {
        assertThat(ArabicToRoman.convert(1), is("I"));
    }

    @Test
    public void shouldConvert2ToII() throws Exception {
        assertThat(ArabicToRoman.convert(2), is("II"));
    }

    @Test
    public void shouldConvert5ToV() throws Exception {
        assertThat(ArabicToRoman.convert(5), is("V"));
    }

    @Test
    public void shouldConvert4ToIV() throws Exception {
        assertThat(ArabicToRoman.convert(4), is("IV"));
    }

    @Test
    public void shouldConvert6ToVI() throws Exception {
        assertThat(ArabicToRoman.convert(6), is("VI"));
    }

    @Test
    public void shouldConvert7ToVII() throws Exception {
        assertThat(ArabicToRoman.convert(7), is("VII"));
    }

    @Test
    public void shouldConvert9ToIX() throws Exception {
        assertThat(ArabicToRoman.convert(9), is("IX"));
    }

    @Test
    public void shouldConvert11ToXI() throws Exception {
        assertThat(ArabicToRoman.convert(11), is("XI"));
    }

    @Test
    public void shouldConvert14ToXIV() throws Exception {
        assertThat(ArabicToRoman.convert(14), is("XIV"));
    }

    @Test
    public void shouldConvert100ToC() throws Exception {
        assertThat(ArabicToRoman.convert(100), is("C"));
    }

    @Test
    public void shouldConvert101ToC() throws Exception {
        assertThat(ArabicToRoman.convert(101), is("CI"));
    }

    @Test
    public void shouldConvert24ToXXIV() throws Exception {
        assertThat(ArabicToRoman.convert(24), is("XXIV"));
    }

    @Test
    public void shouldConvert50ToL() throws Exception {
        assertThat(ArabicToRoman.convert(50), is("L"));
    }

    @Test
    public void shouldConvert40ToXL() throws Exception {
        assertThat(ArabicToRoman.convert(40), is("XL"));
    }
}
