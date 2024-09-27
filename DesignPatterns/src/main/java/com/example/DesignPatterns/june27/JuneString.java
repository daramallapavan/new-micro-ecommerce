package com.example.DesignPatterns.june27;


import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class JuneString {

    public static void main(String[] args) {
        //Java Program to anagram

        //longest word smallest word
        String str = "Java Developer In India Openings For Freshers";

      char[] chars=  str.replace( " ","" ).toLowerCase().toCharArray();

      Map<Character,Integer> map=new HashMap<>();

      for (int i=0;i<chars.length;i++){
          if (!map.containsKey( chars[i] )){
              map.put( chars[i],1 );
          }else{
              map.put( chars[i],map.get( chars[i] )+1 );
          }

      }
char high=0;

        char low=0;


        System.out.println(map);

        for (Map.Entry<Character,Integer> entry:map.entrySet()) {

         int max=   map.entrySet().stream().mapToInt( (a)-> a.getValue()).max().getAsInt();

            int min=   map.entrySet().stream().mapToInt( (a)-> a.getValue()).min().getAsInt();

            if (entry.getValue()==max){
              high=  entry.getKey();
            }
            if (entry.getValue()==min){
                low=entry.getKey();
            }
        }

        System.out.println("max occuring ch "+high);

        System.out.println("min occuring ch "+low);
    }
}
