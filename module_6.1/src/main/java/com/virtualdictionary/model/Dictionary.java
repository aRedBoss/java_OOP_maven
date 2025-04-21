package com.virtualdictionary.model;

import java.util.HashMap;

public class Dictionary {

    private HashMap<String, String> dictionary = new HashMap<>();

    public void addWord(String word, String meaning) {
        dictionary.put(word.toLowerCase(), meaning);
    }

    public String search(String word) throws Exception {
        String meaning = dictionary.get(word.toLowerCase());
        if (meaning == null) {
            throw new Exception("Word not found.");
        }
        return meaning;
    }
}

