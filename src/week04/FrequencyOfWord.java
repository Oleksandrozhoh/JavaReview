package week04;

public class FrequencyOfWord {
    public static void main(String[] args) {

        // count number of Java words in a sentence:

        String sentence = " Java Java Java Java Python C# C++ Swift Java Java";

        int originalLength = sentence.length();

        String updatedSentence = sentence.replace("Java", "abc");  // replacing the word with another string which has 1 less caracter

        int updatedLength = updatedSentence.length();

        int result = originalLength-updatedLength; // now the length difference will give us the number of matching words that has been replaced

        System.out.println("result = " + result);





    }
}
