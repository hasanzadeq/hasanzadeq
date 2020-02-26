package app.warmup;

import java.util.ArrayList;

public class RemoveAllVowels implements Filterable {
    public boolean isVowel(char c) {
        if (c == 'a') {
            return true;
        } else if (c == 'e') {
            return true;
        } else if (c == 'i') {
            return true;
        } else if (c == 'o') {
            return true;
        } else if (c == 'u') {
            return true;
        }
        return false;
    }

    @Override
    public String format(String origin) {
        ArrayList<Character> arr = new ArrayList<>();
        String newWord="";

        for (int i = 0; i <origin.length() ; i++) {
            if(isVowel(origin.charAt(i))==false){
                arr.add(origin.charAt(i));
            }
        }

        for (int i = 0; i < arr.size() ; i++) {
            newWord=newWord+arr.get(i);
        }


        return newWord;
    }



}
