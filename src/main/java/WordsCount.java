import java.util.*;

/**
 * Created by yian on 2017/3/16.
 */
public class WordsCount {

    public Set<Word> countWords(String input) {
        String[] wordsString = input.split(" ");
        List<String> wordsList = new ArrayList<String>();
        for(String word : wordsString){
            if(!"".equals(word.trim())){
                wordsList.add(word.trim());
            }
        }
        Set<Word> words = new TreeSet<Word>();
        for(String wordTemp : wordsList){
            Word existWord = getSameWord(words, wordTemp);
            if(existWord != null){
                existWord.setCount(existWord.getCount() + 1);
            }else{
                Word word = new Word();
                word.setName(wordsString[0]);
                word.setCount(1);
                words.add(word);
            }
        }
        return words;
    }

    private Word getSameWord(Set<Word> words, String newWord){
        for (Word existWord: words) {
            if(existWord.getName().equals(newWord)){
                return existWord;
            }
        }
        return null;
    }

}
