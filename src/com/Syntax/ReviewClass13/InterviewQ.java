package com.Syntax.ReviewClass13;

import java.util.HashMap;
import java.util.Map;

public class InterviewQ {
    public static void main(String[] args) {
        String str="afadsfgsd yuytygdg srtyuygd d67og";
        System.out.println(getCount(str));

    }

    public static Map<Character, Integer> getCount(String str){
        char[] charArr=str.toCharArray();

        Map<Character,Integer> map=new HashMap<>();

        for(char c:charArr) {//or for(int i=0;i<charArr.length-1;i++)
            if(map.get(c)==null){
                map.put(c,1);
            }else{
                int count=map.get(c);
                count+=1;
                map.put(c,count);
            }
        }
        return map;
    }
}
