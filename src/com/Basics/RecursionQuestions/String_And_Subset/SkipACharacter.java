package com.Basics.RecursionQuestions.String_And_Subset;

public class SkipACharacter {
    public static void main(String[] args){
    String c="aabcdaddaseg";
//    skipChar("",c);
        System.out.println(skip(c));
    }
    static void skipChar(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch= up.charAt(0);
        if(ch=='a'){
            skipChar(p,up.substring(1));
        }
        else{
            skipChar(p+ch,up.substring(1));
        }
    }


    //2nd Approach
    static String skip(String up){
        if(up.isEmpty()){
            return "";
        }
        char ch= up.charAt(0);
        if(ch=='a'){
            return skip(up.substring(1));
        }
        else{
            return ch+skip(up.substring(1));
        }
    }
}
