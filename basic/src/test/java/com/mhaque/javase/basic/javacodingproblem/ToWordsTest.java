package com.mhaque.javase.basic.javacodingproblem;

import static org.assertj.core.api.Assertions.assertThat;

import java.io.IOException;
import java.util.List;

import org.apache.commons.io.IOUtils;
import org.junit.Test;

public class ToWordsTest {

    @Test
    public void shouldSplitInWords() throws IOException 
    {
        assertThat(ToWords.toWords("Het spaanse graan heeft de orkaan doorstaan"))
            .startsWith("Het", "spaanse", "graan");
    }

    @Test
    public void shouldSplitInWordsWithPunctuation() throws IOException
    {
        assertThat(ToWords.toWords("'ha, ha' said the clown"))
            .startsWith("ha", "ha", "said", "the", "clown");
    }
    @Test
    public void shouldCountMatchingWords() throws IOException {
        List<String> lines = IOUtils.readLines(ToWordsTest.class.getResourceAsStream("/sample.txt"), "UTF-8");
        assertThat(ToWords.countMatchingWords(lines, "garlic"))
            .isEqualTo(5);
    }

    @Test
    public void shouldCountOtherWord() throws IOException {
        List<String> lines = IOUtils.readLines(ToWordsTest.class.getResourceAsStream("/sample.txt"), "UTF-8");
        assertThat(ToWords.countMatchingWords(lines, "terrible"))
            .isEqualTo(6);
    }

    @Test
    public void shouldWordsMostCommonFirst() throws IOException
    {
        List<String> lines = IOUtils.readLines(ToWordsTest.class.getResourceAsStream("/sample.txt"), "UTF-8");
        assertThat(ToWords.wordsMostCommonFirst(lines))
            .startsWith("the", "and", "i");
    }

}
