package dojo;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class ConverterNumeroTest {
	private Converter converter = null;
	String resultadoConversion = null;

	@Before
	public void inicia() {
		converter = new Converter();
		resultadoConversion = "";
	}

	@Test
	public void verificarConversionNumero1() {
		resultadoConversion = converter.parseDecimalToRomano(1);
		assertEquals("I", resultadoConversion);
	}

	@Test
	public void verificarConversionNumero2() {
		resultadoConversion = converter.parseDecimalToRomano(2);
		assertEquals("II", resultadoConversion);
	}

	@Test
	public void verificarConversionNumero3() {
		resultadoConversion = converter.parseDecimalToRomano(3);
		assertEquals("III", resultadoConversion);
	}

	@Test
	public void verificarConversionNumero4() {
		resultadoConversion = converter.parseDecimalToRomano(4);
		assertEquals("IV", resultadoConversion);
	}

	@Test
	public void verificarConversionNumero5() {
		resultadoConversion = converter.parseDecimalToRomano(5);
		assertEquals("V", resultadoConversion);
	}

	@Test
	public void verificarConversionNumero6() {
		resultadoConversion = converter.parseDecimalToRomano(6);
		assertEquals("VI", resultadoConversion);
	}

	@Test
	public void verificarConversionNumero7() {
		resultadoConversion = converter.parseDecimalToRomano(7);
		assertEquals("VII", resultadoConversion);
	}

	@Test
	public void verificarConversionNumero8() {
		resultadoConversion = converter.parseDecimalToRomano(8);
		assertEquals("VIII", resultadoConversion);
	}

	@Test
	public void verificarConversionNumero9() {
		resultadoConversion = converter.parseDecimalToRomano(9);
		assertEquals("IX", resultadoConversion);
	}

	@Test
	public void verificarConversionNumero10() {
		resultadoConversion = converter.parseDecimalToRomano(10);
		assertEquals("X", resultadoConversion);
	}

	@Test
	public void verificarConversionNumero11() {
		resultadoConversion = converter.parseDecimalToRomano(11);
		assertEquals("XI", resultadoConversion);
	}

	@Test
	public void verificarConversionNumero12() {
		resultadoConversion = converter.parseDecimalToRomano(12);
		assertEquals("XII", resultadoConversion);
	}

	@Test
	public void verificarConversionNumero13() {
		resultadoConversion = converter.parseDecimalToRomano(13);
		assertEquals("XIII", resultadoConversion);
	}

	@Test
	public void verificarConversionNumero14() {
		resultadoConversion = converter.parseDecimalToRomano(14);
		assertEquals("XIV", resultadoConversion);
	}

	@Test
	public void verificarConversionNumero15() {
		resultadoConversion = converter.parseDecimalToRomano(15);
		assertEquals("XV", resultadoConversion);
	}

	@Test
	public void verificarConversionNumero16() {
		resultadoConversion = converter.parseDecimalToRomano(16);
		assertEquals("XVI", resultadoConversion);
	}

	@Test
	public void verificarConversionNumero17() {
		resultadoConversion = converter.parseDecimalToRomano(17);
		assertEquals("XVII", resultadoConversion);
	}

	@Test
	public void verificarConversionNumero18() {
		resultadoConversion = converter.parseDecimalToRomano(18);
		assertEquals("XVIII", resultadoConversion);
	}

	@Test
	public void verificarConversionNumero19() {
		resultadoConversion = converter.parseDecimalToRomano(19);
		assertEquals("XIX", resultadoConversion);
	}

	@Test
	public void verificarConversionNumero20() {
		resultadoConversion = converter.parseDecimalToRomano(20);
		assertEquals("XX", resultadoConversion);
	}

	@Test
	public void verificarConversionNumero21() {
		resultadoConversion = converter.parseDecimalToRomano(21);
		assertEquals("XXI", resultadoConversion);
	}

	@Test
	public void verificarConversionNumero22() {
		resultadoConversion = converter.parseDecimalToRomano(22);
		assertEquals("XXII", resultadoConversion);
	}

	@Test
	public void verificarConversionNumero23() {
		resultadoConversion = converter.parseDecimalToRomano(23);
		assertEquals("XXIII", resultadoConversion);
	}

	@Test
	public void verificarConversionNumero24() {
		resultadoConversion = converter.parseDecimalToRomano(24);
		assertEquals("XXIV", resultadoConversion);
	}

	@Test
	public void verificarConversionNumero25() {
		resultadoConversion = converter.parseDecimalToRomano(25);
		assertEquals("XXV", resultadoConversion);
	}

	@Test
	public void verificarConversionNumero26() {
		resultadoConversion = converter.parseDecimalToRomano(26);
		assertEquals("XXVI", resultadoConversion);
	}

	@Test
	public void verificarConversionNumero27() {
		resultadoConversion = converter.parseDecimalToRomano(27);
		assertEquals("XXVII", resultadoConversion);
	}

	@Test
	public void verificarConversionNumero28() {
		resultadoConversion = converter.parseDecimalToRomano(28);
		assertEquals("XXVIII", resultadoConversion);
	}

	@Test
	public void verificarConversionNumero29() {
		resultadoConversion = converter.parseDecimalToRomano(29);
		assertEquals("XXIX", resultadoConversion);
	}

	@Test
	public void verificarConversionNumero30() {
		resultadoConversion = converter.parseDecimalToRomano(30);
		assertEquals("XXX", resultadoConversion);
	}

	@Test
	public void verificarConversionNumero35() {
		resultadoConversion = converter.parseDecimalToRomano(35);
		assertEquals("XXXV", resultadoConversion);
	}

	@Test
	public void verificarConversionNumero39() {
		resultadoConversion = converter.parseDecimalToRomano(39);
		assertEquals("XXXIX", resultadoConversion);
	}

	@Test
	public void verificarConversionNumero40() {
		resultadoConversion = converter.parseDecimalToRomano(40);
		assertEquals("XL", resultadoConversion);
	}

	@Test
	public void verificarConversionNumero50() {
		resultadoConversion = converter.parseDecimalToRomano(50);
		assertEquals("L", resultadoConversion);
	}

	@Test
	public void verificarConversionNumero51() {
		resultadoConversion = converter.parseDecimalToRomano(51);
		assertEquals("LI", resultadoConversion);
	}

	@Test
	public void verificarConversionNumero59() {
		resultadoConversion = converter.parseDecimalToRomano(59);
		assertEquals("LIX", resultadoConversion);
	}

	@Test
	public void verificarConversionNumero74() {
		resultadoConversion = converter.parseDecimalToRomano(74);
		assertEquals("LXXIV", resultadoConversion);
	}

	@Test
	public void verificarConversionNumero79() {
		resultadoConversion = converter.parseDecimalToRomano(79);
		assertEquals("LXXIX", resultadoConversion);
	}

	@Test
	public void verificarConversionNumero89() {
		resultadoConversion = converter.parseDecimalToRomano(89);
		assertEquals("LXXXIX", resultadoConversion);
	}

	@Test
	public void verificarConversionNumero90() {
		resultadoConversion = converter.parseDecimalToRomano(90);
		assertEquals("XC", resultadoConversion);
	}

	@Test
	public void verificarConversionNumero99() {
		resultadoConversion = converter.parseDecimalToRomano(99);
		assertEquals("XCIX", resultadoConversion);
	}

	@Test
	public void verificarConversionNumero100() {
		resultadoConversion = converter.parseDecimalToRomano(100);
		assertEquals("C", resultadoConversion);
	}

	@Test
	public void verificarConversionNumero101() {
		resultadoConversion = converter.parseDecimalToRomano(101);
		assertEquals("CI", resultadoConversion);
	}

	@Test
	public void verificarConversionNumero109() {
		resultadoConversion = converter.parseDecimalToRomano(109);
		assertEquals("CIX", resultadoConversion);
	}

	@Test
	public void verificarConversionNumero399() {
		resultadoConversion = converter.parseDecimalToRomano(399);
		assertEquals("CCCXCIX", resultadoConversion);
	}

	@Test
	public void verificarConversionNumero899() {
		resultadoConversion = converter.parseDecimalToRomano(899);
		assertEquals("DCCCXCIX", resultadoConversion);
	}

	@Test
	public void verificarConversionNumero989() {
		resultadoConversion = converter.parseDecimalToRomano(989);
		assertEquals("CMLXXXIX", resultadoConversion);
	}

	@Test
	public void verificarConversionNumero999() {
		resultadoConversion = converter.parseDecimalToRomano(999);
		assertEquals("CMXCIX", resultadoConversion);
	}

	@Test
	public void verificarConversionNumero1000() {
		resultadoConversion = converter.parseDecimalToRomano(1000);
		assertEquals("M", resultadoConversion);
	}

	@Test
	public void verificarConversionNumero1010() {
		resultadoConversion = converter.parseDecimalToRomano(1010);
		assertEquals("MX", resultadoConversion);
	}

	@Test
	public void verificarConversionNumero1050() {
		resultadoConversion = converter.parseDecimalToRomano(1050);
		assertEquals("ML", resultadoConversion);
	}

	// El maximo valor a testear es 3999, debido ha que no existe el 5000 en
	// romanos y este simbolo es necesario para formar el 4000
	@Test
	public void verificarConversionNumero3999() {
		resultadoConversion = converter.parseDecimalToRomano(3999);
		assertEquals("MMMCMXCIX", resultadoConversion);
	}

}
