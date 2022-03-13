package com.learning;

public class Method {

    private static StringBuilder stringBuilder = new StringBuilder();

    public String reverseAString(String str) {
        String sentence = str;
        char[] sentenceArr = sentence.toCharArray();
        for (int i = sentenceArr.length - 1; i >= 0; i--) {
            System.out.print(sentenceArr[i]);
        }
        return sentenceArr.toString();
    }


}
