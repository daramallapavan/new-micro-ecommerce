package com.example.DesignPatterns.july21;

public class Programs {


    public static void main(String[] args) {


        String str="Java is a Programming language";


    }




    private static String reverseString(String str){
        //  Write a Java Program to reverse a string without using String inbuilt function.

        String [] words=str.split( " " );
        int start=0;
        int end= words.length-1;
        while (start<end){
            String temp=words[start];
            words[start]=words[end];
            words[end]=temp;
            start++;
            end--;
        }
        String reverseString="";
        for (String word:words){
            reverseString=reverseString+word+" ";
        }

        return reverseString;
    }

    private static String removeLeadingAndTrailingSpaces(String str){
        //How do you remove leading and trailing spaces from a string in Java?
        str=str.trim();

        return str;
    }


    private static String removeWhiteSpaces(String str){
        //How do you remove spaces from a string in Java?

        String result="";
        for (int i=0;i<str.length();i++){
            char ch=str.charAt( i );
            if (!Character.isWhitespace( ch )){
                result=result+ch;
            }
        }

        return result;
    }



    private static boolean isPalindrome(String str){
        /// How do you check whether a string is a palindrome in Java?
        String reverse=new StringBuilder(str).reverse().toString();

        if (str.equalsIgnoreCase( reverse )){
            return true;
        }

        return false;
    }


    private static boolean isVowels(String str){
        //->  Write a Java program to check if a vowel is present in a string.
        for (int i=0;i<str.length();i++){
            char ch=str.charAt( i );
            if (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                return true;
            }
        }

        return false;
    }
}
