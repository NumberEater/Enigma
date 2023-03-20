package enigma;

import enigma.Constants;

public class Layer {
    private int key;

    public Layer(int key_) {
        key = key_;
    }

    public char scrambleChar(char input) {

        // Convert char input to integer
        int charNumber = Constants.ALPHABET.indexOf(input) + 1;

        // Scramble integer to different value
        charNumber += key;
        charNumber = charNumber % Constants.ALPHABET_LENGTH;

        // Output integer as char
        return Constants.ALPHABET.charAt(charNumber);
    }

    public char unscrambleChar(char input) {

        // Convert char input to integer
        int charNumber = Constants.ALPHABET.indexOf(input) - 1;

        // Unscramble integer using layer key
        charNumber -= key;
        charNumber = (charNumber % Constants.ALPHABET_LENGTH + Constants.ALPHABET_LENGTH) % Constants.ALPHABET_LENGTH;

        return Constants.ALPHABET.charAt(charNumber);
    }

    public void setKey(int key_) {
        key = key_;
    }

    public int getKey() {
        return key;
    }
}
