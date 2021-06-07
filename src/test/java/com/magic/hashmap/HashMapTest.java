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

    @Test
    public void giveASentence_whenWordsAreAddedToList_ShouldReturnParanoid() {
        String sentence="Paranoids are not paranoid because they are paranoid they keep putting themselves";
        HashTable<String,Integer> hashTable=new HashTable<>();
        String[] words=sentence.toLowerCase().split(" ");
        for(String word:words){
            Integer value = hashTable.get(word);
            if(value==null)
                value=1;
            else
                value=value+1;
            hashTable.add(word,value);
        }
        int frequency=hashTable.get("paranoid");
        hashTable.print();
        Assert.assertEquals(2,frequency);
    }

}