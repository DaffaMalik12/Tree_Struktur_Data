package com.youtube.geekific;

public class MainApp {
    public static void main(String[] args) {

        Tree trie = new Trie();
        trie.insert("develop").insert("developing").insert("developer").insert("development")
                .insert("device").insert("apple").insert("application").insert("applicative")
                .insert("appletv").insert("ape").insert("band");

        System.out.println(trie.containsPrefix("app"));

        System.out.println(trie.wordsWithPrefix("app"));

        System.out.println(trie.contains("applicative"));
        trie.delete("applicative");
        System.out.println(trie.contains("applicative"));

    }

}
