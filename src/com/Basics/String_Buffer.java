package com.Basics;

import com.sun.security.jgss.GSSUtil;

import java.util.Random;

public class String_Buffer {
    public static void main(String[] args){
    StringBuffer sb = new StringBuffer("Ketan Chaudhary");
    sb.append(" is a programmer");
    System.out.println(sb);

    // Constructors
        // 1
        StringBuffer second = new StringBuffer();
        second.append("This is a empty string");

        // 2
        StringBuffer third = new StringBuffer(20);
        System.out.println(third.capacity());
        // Default capacity is 16

        // Methods
        // Replace
        StringBuffer test = new StringBuffer("This a test string");
        test.replace(0,1,"t");
        System.out.println(test);

        // Reverse
        test.reverse();
        System.out.println(test);
        test.reverse(); // revert to original

        // Delete
        test.delete(0,5);
        System.out.println(test);

        // Insert
        test.insert(0,"This");
        System.out.println(test);

        // Character at a particular index
        System.out.println( test.charAt(0));

        // Sub Sequence
        System.out.println(test.subSequence(0,5));

        // Sub String
        System.out.println(test.substring(5));
        System.out.println(test.substring(0,4));


        // removing all whiteSpaces from the String
        String str = "This   string contains    irregular white  spaces";
        str= str.replaceAll("\\s" , "");
        System.out.println(str);

        // Generating some random string
        Random random = new Random();
        int size= 5;
        StringBuffer randomString = new StringBuffer();
        for (int i = 0; i < size; i++) {
            char RandomChar = (char)(97+(random.nextInt(0,26)));
            randomString.append(RandomChar);
        }
        System.out.println(randomString);
    }
}
