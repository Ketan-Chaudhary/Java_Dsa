package com.Ketan.RecursionQuestions.String_And_Subset;

public class SkipStringNRequired {
    public static void main(String[] args){
        String s= "appisnotapple";
        System.out.println(skipAppNotApple(s));
    }
    static String skipAppNotApple(String up){
        if(up.isEmpty()){
            return "";
        }
        if(up.startsWith("app")&& !up.startsWith("apple")){
            return skipAppNotApple(up.substring(3));
        }
        else{
            return up.charAt(0)+skipAppNotApple(up.substring(1));
        }
    }
}
