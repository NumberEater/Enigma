package enigma;

public class Enigma {
    Layer[] layers;
    int[] keySequence;

    public Enigma(int layerCount) {
        layers = new Layer[layerCount];
        keySequence = new int[layerCount];

        for (int i = 0; i < layers.length; i++) {
            int layerKey = (int) (Math.random() * 1000) + 1;
            keySequence[i] = layerKey;
            layers[i] = new Layer(layerKey);
            System.out.println(layerKey);
        }
    }

    public String encryptString(String input) {
        char[] chars = input.toCharArray();

        char[] outputChars = new char[chars.length];

        for (int i = 0; i < chars.length; i++) {
            char layerOutput = '!';
            for (Layer l : layers) {
                layerOutput = l.scrambleChar(chars[i]);
            }
            outputChars[i] = layerOutput;
        }

        return String.copyValueOf(outputChars);
    }

    public String decryptString(String input) {
        char[] chars = input.toCharArray();

        char[] outputChars = new char[chars.length];

        for (int i = 0; i < chars.length; i++) {
            char layerOutput = '!';
            for (Layer l : layers) {
                layerOutput = l.unscrambleChar(chars[i]);
            }
            outputChars[i] = layerOutput;
        }

        return String.copyValueOf(outputChars);
    }
}
