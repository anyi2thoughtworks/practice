

import org.junit.Test;

import java.util.Set;


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

}
