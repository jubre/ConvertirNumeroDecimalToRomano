package dojo;

import java.util.HashMap;
import java.util.Map;

public enum RomanoCharacter {

    // Enums
    ONE("I"), FIVE("V"), TEN("X"), FIFTY("L"), HUNDRED("C"), FIVE_HUNDRED("D"), THOUSAND(
            "M");

    private String romanoCharacter;

    RomanoCharacter(String valor) {
        romanoCharacter = valor;
    }

    public static Map<Integer, String[]> getRomanoCharacterMap() {
        Map<Integer, String[]> romanoCharacterMap = new HashMap<Integer, String[]>();

        String[] units = {ONE.romanoCharacter,
                FIVE.romanoCharacter, TEN.romanoCharacter};
        String[] tens = {TEN.romanoCharacter,
                FIFTY.romanoCharacter, HUNDRED.romanoCharacter};
        String[] hundreds = {HUNDRED.romanoCharacter,
                FIVE_HUNDRED.romanoCharacter, THOUSAND.romanoCharacter};
        String[] thousands = {THOUSAND.romanoCharacter, "", ""};

        romanoCharacterMap.put(0, units);
        romanoCharacterMap.put(1, tens);
        romanoCharacterMap.put(2, hundreds);
        romanoCharacterMap.put(3, thousands);

        return romanoCharacterMap;
    }

}
