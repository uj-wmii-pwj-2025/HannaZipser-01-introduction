package uj.wmii.pwj.introduction;

public class Reverser {

    public static String reverse(String input) {
        if (input == null){
            return null;
        }
        String inputTrimmed = input.trim();
        StringBuilder builder = new StringBuilder(inputTrimmed);
        return builder.reverse().toString();
    }

    public static String reverseWords(String input) {
        if (input == null){
            return null;
        }

        String inputTrimmed = input.trim();

        String[] words = inputTrimmed.split("\\s");
        StringBuilder builder = new StringBuilder();

        for (int i = words.length - 1; i > 0; i--){
            builder.append(words[i]);
            builder.append(" ");
        }
        builder.append(words[0]);

        return builder.toString();
    }

}
