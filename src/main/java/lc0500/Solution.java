package lc0500;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

class Solution {
    public String[] findWords(String[] words) {
        final List<String> ans = new ArrayList<>(words.length);


        HashSet<Character> dic01 = new HashSet<>();
        for (char c : "qwertyuiop".toCharArray()) {
            dic01.add(c);
        }

        HashSet<Character> dic02 = new HashSet<>();
        for (char c : "asdfghjkl".toCharArray()) {
            dic02.add(c);
        }

        HashSet<Character> dic03 = new HashSet<>();
        for (char c : "zxcvbnm".toCharArray()) {
            dic03.add(c);
        }


        List<HashSet<Character>> dics = new ArrayList<>(3);
        dics.add(dic01);
        dics.add(dic02);
        dics.add(dic03);


        for (String w : words) {
            if (contain(w, dics)) {
                ans.add(w);
            }
        }

        final String[] relt = new String[ans.size()];
        for (int i = 0; i < ans.size(); i++) {
            relt[i] = ans.get(i);
        }
        return relt;
    }

    private boolean contain(String w,
                            List<HashSet<Character>> dics) {
        char[] source = w.toLowerCase().toCharArray();

        for (HashSet<Character> dic : dics) {
            int cnt = 0;
            for (char c : source) {
                if (dic.contains(c)) {
                    cnt++;
                }
            }
            if (cnt == source.length) {
                return true;
            }
        }

        return false;
    }
}