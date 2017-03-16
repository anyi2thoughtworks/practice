import java.util.*;

/**
 * Created by yian on 2017/3/16.
 */
public class WordsCount {

    public Set<Word> countWords(String input) {
        String[] wordsString = input.split(" ");
        Set<Word> words = new TreeSet<Word>();
        Word word = new Word();
        word.setName(wordsString[0]);
        word.setCount(1);
        words.add(word);
        return words;
    }

}
