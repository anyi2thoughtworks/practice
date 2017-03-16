

import org.junit.Test;

import java.util.Set;
import java.util.TreeSet;


import static org.junit.Assert.assertNotNull;
import static org.fest.assertions.api.Assertions.assertThat;


/**
 * Created by yian on 2017/3/16.
 */
public class WordsCountTest {

    @Test
    public void should_return_the_1_given_input_the() {
        String input = "the";
        WordsCount wc = new WordsCount();
        Set<Word> outputs = wc.countWords(input);

        assertNotNull(outputs);
        assertThat(outputs.size()).isEqualTo(1);
        for (Word word: outputs) {
            assertThat(word.getName()).isEqualTo("the");
            assertThat(word.getCount()).isEqualTo(1);
        }
    }

    @Test
    public void should_return_1_word_given_input_2_the() {
        String input = "the the";
        WordsCount wc = new WordsCount();
        Set<Word> outputs = wc.countWords(input);

        assertThat(outputs.size()).isEqualTo(1);
        for (Word word: outputs) {
            assertThat(word.getName()).isEqualTo("the");
            assertThat(word.getCount()).isEqualTo(2);
        }
    }

    @Test
    public void should_return_2_word_given_input_one_the() {
        String input = "the one";
        WordsCount wc = new WordsCount();
        TreeSet<Word> outputs = wc.countWords(input);

        assertThat(outputs.size()).isEqualTo(2);
        assertThat(outputs.first().getName()).isEqualTo("one");
        assertThat(outputs.first().getCount()).isEqualTo(1);

    }

    @Test
    public void should_return_3_word_given_input_3one_2the_1she() {
        String input = "the one one the she one";
        WordsCount wc = new WordsCount();
        TreeSet<Word> outputs = wc.countWords(input);

        assertThat(outputs.size()).isEqualTo(3);
        assertThat(outputs.first().getName()).isEqualTo("one");
        assertThat(outputs.first().getCount()).isEqualTo(3);

    }

}
