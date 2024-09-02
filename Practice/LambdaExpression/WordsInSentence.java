package Practice.LambdaExpression;

// Write a Java program to implement a lambda expression to count words in a sentence.

public class WordsInSentence {
    public static void main(String[] args) {
        // declare a sentence and print it
        String str = "Java is a programming language";
        System.out.println("Sentence: " + str);

        // counting words in the given sentence
        WordCounter words = s -> s.split("\\s+").length;
        int ctr = words.countWords(str);
        System.out.println("Word count: " + ctr);

        // another
        str = "The quick brown fox jumps over the lazy dog.";
        System.out.println("\nOriginal string: " + str);
        words = s -> s.split("\\s+").length;
        ctr = words.countWords(str);
        System.out.println("Word count: " + ctr);
    }
}

@FunctionalInterface
interface WordCounter {
    int countWords(String text);
}