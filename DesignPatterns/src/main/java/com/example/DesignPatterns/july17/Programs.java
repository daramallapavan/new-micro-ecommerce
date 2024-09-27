package com.example.DesignPatterns.july17;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Programs {

    public static void main(String[] args) {

        String str="java is Madam aa programming language";

        String[] words=str.split( " " );

        String palindromeString="";

        String[] palin=palindromeString.split( " " );

        for (String word:words){
            if (isPalindrome( word )){
               palindromeString=palindromeString+ new StringBuilder(word).append( " " ).toString();
            }
        }
        String longestPalin="";
        for (String string:palin){
            if (string.length()>longestPalin.length()){
                longestPalin=longestPalin+string;
            }
        }

        System.out.println(longestPalin);

    }

    private static boolean isPalindrome(String str){

        if (str.length()==1){
            return false;
        }

       String reverse= new StringBuilder(str).reverse().toString();

       if (str.equalsIgnoreCase( reverse )){
           return true;
       }else{
           return false;
       }
    }

    private static char maxOccuringCharacter(String str){

        str=str.toLowerCase().replace( " ","" );

        Map<Character,Integer> map=new HashMap<>();

        for (int i=0;i<str.length();i++){
            char ch=str.charAt( i );
            if (map.containsKey( ch)){
                map.put( ch,map.get( ch )+1 );
            }else{
                map.put( ch,1 );
            }
        }
        int largest=0;
        char largeElement=0;

        int smallest=1;

        char smallElement=0;
        for (Map.Entry<Character,Integer> entry:map.entrySet()){
            if (entry.getValue()>largest){
                largest=entry.getValue();

              largeElement=  entry.getKey();
            }else if (entry.getValue()<smallest){
                smallest=entry.getValue();
                smallElement=entry.getKey();
            }
        }

        System.out.println("largest ="+largeElement+" "+largest);

        System.out.println("smallest ="+smallElement+" "+smallest);
        return largeElement;
    }

    private static String capitalizeFirstCharacter(String str){

        String[] words=str.split( " " );

        StringBuilder stringBuilder=new StringBuilder();
        for (String word:words){
            if (Character.isLowerCase( word.charAt( 0 ) )){
                char c = Character.toUpperCase( word.charAt( 0 ) );
                stringBuilder.append( c ).append( word.substring( 1 ) ).append( " " );

            }
        }

        return stringBuilder.toString();

    }

    /*    String str1 = "pavan";
        String str2="navan";

        if (checkRotation( str1,str2 )){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
       // printPermutations( str,"");

    }


/*    private static boolean checkRotation(String str1,String str2){

        if (str1.length()!=str2.length()){
            return false;
        }
        String st3 = str1 + str1;
        if (st3.contains(str2)) {
            return true;
        } else {
            return false;
        }


    }*/
    //Java Program to find all subsets of a string



//    private static void printPermutations(String str, String ans) {
//        if (str.length() == 0) {
//            System.out.print(ans + " ");
//            return;
//        }
//        for (int i = 0; i < str.length(); i++) {
//            char ch = str.charAt(i);
//            String remaining = str.substring(0, i) + str.substring(i + 1);
//            printPermutations(remaining, ans + ch);
//        }
//    }

}


/*
* public class DivideString {
    public static void main(String[] args) {
        String str = "aaaabbbbcccc"; // Replace with your input string
        int n = 3; // Number of equal parts

        int len = str.length();
        int chars = len / n;
        String[] equalStr = new String[n];

        if (len % n != 0) {
            System.out.println("Sorry, this string cannot be divided into " + n + " equal parts.");
        } else {
            for (int i = 0; i < len; i += chars) {
                String part = str.substring(i, i + chars);
                equalStr[i / chars] = part;
            }

            System.out.println(n + " equal parts of the given string are:");
            for (String part : equalStr) {
                System.out.println(part);
            }
        }
    }
}*/


/*
public class AllSubsets {
    public static void main(String[] args) {
        String str = "FUN";
        int len = str.length();
        int temp = 0;
        String[] arr = new String[len * (len + 1) / 2];

        for (int i = 0; i < len; i++) {
            for (int j = i; j < len; j++) {
                arr[temp] = str.substring(i, j + 1);
                temp++;
            }
        }

        System.out.println("All subsets for the given string are:");
        for (String subset : arr) {
            System.out.println(subset);
        }
    }
}

 */

/*
public class Permutations {
    static void printPermutations(String str, String ans) {
        if (str.length() == 0) {
            System.out.print(ans + " ");
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String remaining = str.substring(0, i) + str.substring(i + 1);
            printPermutations(remaining, ans + ch);
        }
    }

    public static void main(String[] args) {
        String input = "abb"; // Replace with your desired string
        printPermutations(input, "");
    }
}
 */

/*
public class RotationString {
    public static boolean checkRotation(String st1, String st2) {
        if (st1.length() != st2.length()) {
            return false;
        }
        String st3 = st1 + st1;
        if (st3.contains(st2)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        String str1 = "avajava";
        String str2 = "javaava";
        System.out.println("Checking if a string is a rotation of another");
        if (checkRotation(str1, str2)) {
            System.out.println("Yes, " + str2 + " is a rotation of " + str1);
        } else {
            System.out.println("No, " + str2 + " is not a rotation of " + str1);
        }
    }
}
 */

/*
        String str="java is a programming language";

        String[] words=str.split( " " );


        String reverse="";
        for (String word:words){
            reverse =reverse+new StringBuilder(word).reverse().toString()+" ";
        }

        System.out.println(reverse);


    }
 */