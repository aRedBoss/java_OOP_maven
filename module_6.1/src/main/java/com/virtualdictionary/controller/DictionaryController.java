package com.virtualdictionary.controller;

import com.virtualdictionary.model.Dictionary;

public class DictionaryController {

    private Dictionary dictionary;

    public DictionaryController() {
        dictionary = new Dictionary();
        // Temporary hardcoded entries
        dictionary.addWord("java", "A high-level programming language.");
        dictionary.addWord("controller", "Connects model and view.");
        dictionary.addWord("model", "Represents the application data.");
        dictionary.addWord("view", "Handles the user interface.");
    }

    public String getMeaning(String word) {
        if (word == null || word.trim().isEmpty()) {
            return "Please enter a word.";
        }

        try {
            return dictionary.search(word);
        } catch (Exception e) {
            return e.getMessage();
        }
    }
}

