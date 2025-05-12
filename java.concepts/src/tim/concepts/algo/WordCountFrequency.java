package tim.concepts.algo;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
Problem: Given a list of words, count the frequency using streams.
 **/
public class WordCountFrequency {


    private static Map<String, Long> countWords (List<String> wordList) {
        if (wordList.isEmpty()) return null;
        return wordList.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
    }
    public static void main(String[] args) {
        List<String> words = List.of("ai", "bot", "agent", "bot", "gen", "ai");
        Map<String, Long> countMap = countWords(words);
        System.out
                .println("The Count of Monte Cristo ;-)" + countMap);
    }

}
