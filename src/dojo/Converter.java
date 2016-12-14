package dojo;

import java.util.Map;
import java.util.Stack;

public class Converter {

	Map<Integer, String[]> romanosCharacter = SimboloRomano.obtenerCaracteresRomanos();

	public String parseDecimalToRomano(int decimalValue) {
		String romanoValue = "";

		String decimalValueReverse = new StringBuilder().append(decimalValue).reverse().toString();

		Stack<String> romanoValuePreliminary = new Stack<String>();

		for (int i = 0; i < decimalValueReverse.length(); i++)
			romanoValuePreliminary.push(getRomanoCharacterByDecimalPosition(decimalValueReverse.charAt(i), i));

		while (!romanoValuePreliminary.empty())
			romanoValue += romanoValuePreliminary.pop();

		return romanoValue;
	}

	private String getRomanoCharacterByDecimalPosition(Character valor, int position) {
		int decimalValue = new Integer(valor.toString());

		String romanoCharacter = getRomanoCharacterFrom1To9(decimalValue, romanosCharacter.get(position)[0], romanosCharacter.get(position)[1], romanosCharacter.get(position)[2]);

		return romanoCharacter;
	}

	private String getRomanoCharacterFrom1To9(int valor, String romanoLower, String romanoMiddle, String romanoTop) {
		String romanoValue = "";
		if (valor >= 1 && valor <= 3)
			romanoValue = getPatterRepeatEveryThree(valor, romanoLower);
		else if (valor >= 4 && valor <= 8)
			romanoValue = getPatterRepeatEveryFive(valor, 5, romanoMiddle, romanoLower);
		else if (valor == 9)
			romanoValue = getPatterRepeatEveryFive(valor, 10, romanoTop, romanoLower);
		return romanoValue;
	}

	private String getPatterRepeatEveryThree(int repetitions, String romanoCharacter) {
		String romanoValue = "";
		for (int i = 1; i <= repetitions; i++)
			romanoValue += romanoCharacter;
		return romanoValue;
	}

	private String getPatterRepeatEveryFive(int valor, int valorBase, String romanoBaseCharacter, String romanoLateralCharacter) {
		int lateralDifference = valor - valorBase;

		String romanoValue = recursiveBody(lateralDifference, romanoBaseCharacter, romanoLateralCharacter);

		return romanoValue;
	}

	private String recursiveBody(int lateralDifference, String romanoBaseCharacter, String romanoLateralCharacter) {
		String romanoValue;

		if (lateralDifference < 0) {
			romanoValue = getPatterRepeatEveryThree(Math.abs(lateralDifference), romanoLateralCharacter) + romanoBaseCharacter;
		} else if (lateralDifference == 0) {
			romanoValue = romanoBaseCharacter;
		} else {
			romanoValue = romanoBaseCharacter + getPatterRepeatEveryThree(Math.abs(lateralDifference), romanoLateralCharacter);
		}
		return romanoValue;
	}

}
