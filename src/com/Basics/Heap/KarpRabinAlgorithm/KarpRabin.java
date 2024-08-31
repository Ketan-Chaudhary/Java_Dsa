package com.Basics.Heap.KarpRabinAlgorithm;

import com.Basics.Prime;

public class KarpRabin {
    private final int PRIME= 101;

    // calculating hash
    private double calculateHash(String str){
        double hash = 0;
        for(int i=0; i<str.length(); i++){
            hash+= str.charAt(i) * Math.pow(PRIME,i);
        }
        return hash;
    }

    // calculating rehash
    private double updateHash(double prevHash, char oldChar, char newChar, int patternLength){
        // deleting the first char
        double newHash = (prevHash - oldChar)/PRIME;
        // adding new char
        newHash += newChar*Math.pow(PRIME, patternLength -1);
        return newHash;
    }

    // Algo
    public void search(String text, String pattern){
        int patternLength = pattern.length();
        // calculating hash
        double patternHash = calculateHash(pattern);
        double textHash = calculateHash(text.substring(0,patternLength));

        for(int i=0; i<= text.length() - patternLength; i++){
            if (textHash == patternHash){
                if(text.substring(i,i+patternLength).equals(pattern)){
                    System.out.println("Pattern found at index : " + i);
                }
            }

            // if hash is not matched
            // calculate the new Hash
            if (i < text.length() - patternLength) {
                textHash = updateHash(textHash,text.charAt(i),text.charAt(i+patternLength),patternLength);
            }
        }
    }
}
