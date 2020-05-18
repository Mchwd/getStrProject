package com;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GetStrMaxNumber {
    public static void main(String[] args) {
        String str = "abc3d45678rd345";
        List<String> digitList = new ArrayList<String>();
        List<Integer> list=new ArrayList<>();
        Pattern p = Pattern.compile("[^0-9]");
        Matcher m = p.matcher(str);
        String result = m.replaceAll("");
        for (int i = 0; i < result.length(); i++) {
            digitList.add(result.substring(i, i+1));
        }

        for (int i=0;i<digitList.size();i++){
            Integer it = Integer.valueOf(digitList.get(i));
            list.add(it);
        }

        for (int i =0;i<list.size();i++){
            
        }


        System.out.println();
    }
}
