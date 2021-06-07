package com.magic.hashmap;
import org.junit.Assert;
import org.junit.Test;
public class HashMapTest {
    @Test
    public void given_a_sentence_when_words_are_added_to_list_return_frequency() {
        String sentence="To Be Or Not To Be";
        HashMap<String, Integer> hashMap = new HashMap<>();
        String[] words=sentence.toLowerCase().split(" ");
        for(String word:words){
            Integer value = hashMap.get(word);
            if(value==null)
                value=1;
            else
                value=value+1;
            hashMap.add(word,value);
        }
        int frequency=hashMap.get("Be");
        hashMap.printMap();
        Assert.assertEquals(2,frequency);
    }

    
}