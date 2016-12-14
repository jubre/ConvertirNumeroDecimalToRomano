package dojo;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class ConverterNumberTest {
    private Converter converter = null;
    String result = null;

    @Before
    public void before() {
        converter = new Converter();
        result = "";
    }

    @Test
    public void verifyParseDecimalToRomano1() {
        result = converter.parseDecimalToRomano(1);
        assertEquals("I", result);
    }

    @Test
    public void verifyParseDecimalToRomano2() {
        result = converter.parseDecimalToRomano(2);
        assertEquals("II", result);
    }

    @Test
    public void verifyParseDecimalToRomano3() {
        result = converter.parseDecimalToRomano(3);
        assertEquals("III", result);
    }

    @Test
    public void verifyParseDecimalToRomano4() {
        result = converter.parseDecimalToRomano(4);
        assertEquals("IV", result);
    }

    @Test
    public void verifyParseDecimalToRomano5() {
        result = converter.parseDecimalToRomano(5);
        assertEquals("V", result);
    }

    @Test
    public void verifyParseDecimalToRomano6() {
        result = converter.parseDecimalToRomano(6);
        assertEquals("VI", result);
    }

    @Test
    public void verifyParseDecimalToRomano7() {
        result = converter.parseDecimalToRomano(7);
        assertEquals("VII", result);
    }

    @Test
    public void verifyParseDecimalToRomano8() {
        result = converter.parseDecimalToRomano(8);
        assertEquals("VIII", result);
    }

    @Test
    public void verifyParseDecimalToRomano9() {
        result = converter.parseDecimalToRomano(9);
        assertEquals("IX", result);
    }

    @Test
    public void verifyParseDecimalToRomano10() {
        result = converter.parseDecimalToRomano(10);
        assertEquals("X", result);
    }

    @Test
    public void verifyParseDecimalToRomano11() {
        result = converter.parseDecimalToRomano(11);
        assertEquals("XI", result);
    }

    @Test
    public void verifyParseDecimalToRomano12() {
        result = converter.parseDecimalToRomano(12);
        assertEquals("XII", result);
    }

    @Test
    public void verifyParseDecimalToRomano13() {
        result = converter.parseDecimalToRomano(13);
        assertEquals("XIII", result);
    }

    @Test
    public void verifyParseDecimalToRomano14() {
        result = converter.parseDecimalToRomano(14);
        assertEquals("XIV", result);
    }

    @Test
    public void verifyParseDecimalToRomano15() {
        result = converter.parseDecimalToRomano(15);
        assertEquals("XV", result);
    }

    @Test
    public void verifyParseDecimalToRomano16() {
        result = converter.parseDecimalToRomano(16);
        assertEquals("XVI", result);
    }

    @Test
    public void verifyParseDecimalToRomano17() {
        result = converter.parseDecimalToRomano(17);
        assertEquals("XVII", result);
    }

    @Test
    public void verifyParseDecimalToRomano18() {
        result = converter.parseDecimalToRomano(18);
        assertEquals("XVIII", result);
    }

    @Test
    public void verifyParseDecimalToRomano19() {
        result = converter.parseDecimalToRomano(19);
        assertEquals("XIX", result);
    }

    @Test
    public void verifyParseDecimalToRomano20() {
        result = converter.parseDecimalToRomano(20);
        assertEquals("XX", result);
    }

    @Test
    public void verifyParseDecimalToRomano21() {
        result = converter.parseDecimalToRomano(21);
        assertEquals("XXI", result);
    }

    @Test
    public void verifyParseDecimalToRomano22() {
        result = converter.parseDecimalToRomano(22);
        assertEquals("XXII", result);
    }

    @Test
    public void verifyParseDecimalToRomano23() {
        result = converter.parseDecimalToRomano(23);
        assertEquals("XXIII", result);
    }

    @Test
    public void verifyParseDecimalToRomano24() {
        result = converter.parseDecimalToRomano(24);
        assertEquals("XXIV", result);
    }

    @Test
    public void verifyParseDecimalToRomano25() {
        result = converter.parseDecimalToRomano(25);
        assertEquals("XXV", result);
    }

    @Test
    public void verifyParseDecimalToRomano26() {
        result = converter.parseDecimalToRomano(26);
        assertEquals("XXVI", result);
    }

    @Test
    public void verifyParseDecimalToRomano27() {
        result = converter.parseDecimalToRomano(27);
        assertEquals("XXVII", result);
    }

    @Test
    public void verifyParseDecimalToRomano28() {
        result = converter.parseDecimalToRomano(28);
        assertEquals("XXVIII", result);
    }

    @Test
    public void verifyParseDecimalToRomano29() {
        result = converter.parseDecimalToRomano(29);
        assertEquals("XXIX", result);
    }

    @Test
    public void verifyParseDecimalToRomano30() {
        result = converter.parseDecimalToRomano(30);
        assertEquals("XXX", result);
    }

    @Test
    public void verifyParseDecimalToRomano35() {
        result = converter.parseDecimalToRomano(35);
        assertEquals("XXXV", result);
    }

    @Test
    public void verifyParseDecimalToRomano39() {
        result = converter.parseDecimalToRomano(39);
        assertEquals("XXXIX", result);
    }

    @Test
    public void verifyParseDecimalToRomano40() {
        result = converter.parseDecimalToRomano(40);
        assertEquals("XL", result);
    }

    @Test
    public void verifyParseDecimalToRomano50() {
        result = converter.parseDecimalToRomano(50);
        assertEquals("L", result);
    }

    @Test
    public void verifyParseDecimalToRomano51() {
        result = converter.parseDecimalToRomano(51);
        assertEquals("LI", result);
    }

    @Test
    public void verifyParseDecimalToRomano59() {
        result = converter.parseDecimalToRomano(59);
        assertEquals("LIX", result);
    }

    @Test
    public void verifyParseDecimalToRomano74() {
        result = converter.parseDecimalToRomano(74);
        assertEquals("LXXIV", result);
    }

    @Test
    public void verifyParseDecimalToRomano79() {
        result = converter.parseDecimalToRomano(79);
        assertEquals("LXXIX", result);
    }

    @Test
    public void verifyParseDecimalToRomano89() {
        result = converter.parseDecimalToRomano(89);
        assertEquals("LXXXIX", result);
    }

    @Test
    public void verifyParseDecimalToRomano90() {
        result = converter.parseDecimalToRomano(90);
        assertEquals("XC", result);
    }

    @Test
    public void verifyParseDecimalToRomano99() {
        result = converter.parseDecimalToRomano(99);
        assertEquals("XCIX", result);
    }

    @Test
    public void verifyParseDecimalToRomano100() {
        result = converter.parseDecimalToRomano(100);
        assertEquals("C", result);
    }

    @Test
    public void verifyParseDecimalToRomano101() {
        result = converter.parseDecimalToRomano(101);
        assertEquals("CI", result);
    }

    @Test
    public void verifyParseDecimalToRomano109() {
        result = converter.parseDecimalToRomano(109);
        assertEquals("CIX", result);
    }

    @Test
    public void verifyParseDecimalToRomano399() {
        result = converter.parseDecimalToRomano(399);
        assertEquals("CCCXCIX", result);
    }

    @Test
    public void verifyParseDecimalToRomano899() {
        result = converter.parseDecimalToRomano(899);
        assertEquals("DCCCXCIX", result);
    }

    @Test
    public void verifyParseDecimalToRomano989() {
        result = converter.parseDecimalToRomano(989);
        assertEquals("CMLXXXIX", result);
    }

    @Test
    public void verifyParseDecimalToRomano999() {
        result = converter.parseDecimalToRomano(999);
        assertEquals("CMXCIX", result);
    }

    @Test
    public void verifyParseDecimalToRomano1000() {
        result = converter.parseDecimalToRomano(1000);
        assertEquals("M", result);
    }

    @Test
    public void verifyParseDecimalToRomano1010() {
        result = converter.parseDecimalToRomano(1010);
        assertEquals("MX", result);
    }

    @Test
    public void verifyParseDecimalToRomano1050() {
        result = converter.parseDecimalToRomano(1050);
        assertEquals("ML", result);
    }

    // El maximo valor a testear es 3999, debido ha que no existe el 5000 en
    // romanos y este simbolo es necesario para formar el 4000
    @Test
    public void verifyParseDecimalToRomano3999() {
        result = converter.parseDecimalToRomano(3999);
        assertEquals("MMMCMXCIX", result);
    }

}
