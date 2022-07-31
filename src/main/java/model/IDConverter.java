package model;

public class IDConverter {
    private static IDConverter INSTANCE;
    private static String baseCharacters;
    private static final Integer BASE = 62;

    private IDConverter() {
        initialize();
    }

    public static synchronized IDConverter getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new IDConverter();
        }
        return INSTANCE;
    }
    public String toBase62(String input) {
        Integer inputValue = Integer.valueOf(input);
        if (inputValue == 0) return "0";
        String output = "";
        while (inputValue > 0) {
            int remain = inputValue % BASE;
            output += baseCharacters.charAt(remain);
            inputValue /= BASE;
        }

        while (output.length() < 5) {
            output = "0".concat(output);
        }

        return output;
    }

    private void initialize() {
        baseCharacters = "";
        for (char i = '0'; i <= '9'; i++) baseCharacters += i;
        for (char i = 'a'; i <= 'z'; i++) baseCharacters += i;
        for (char i = 'A'; i <= 'Z'; i++) baseCharacters += i;
    }

}
