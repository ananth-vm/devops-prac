package org.example;

import org.apache.commons.lang3.StringUtils;

public class Main {

    public static void main(String[] args) {

        String sentence = "I'm Iron Man and I'm gonna die";

        int count = StringUtils.split(sentence).length;

        System.out.println("Sentence : " + sentence);
        System.out.println("Word Count : " + count);
    }
}