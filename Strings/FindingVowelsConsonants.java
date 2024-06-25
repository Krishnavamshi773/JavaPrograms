package Strings;

import java.util.StringTokenizer;

public class FindingVowelsConsonants {
    public static void main(String args[]) {
        String str = "krishna vamshi";
        int vcount = 0;
        int ccount = 0;
        int wrdcount = 0;
        StringTokenizer token = new StringTokenizer(str, " ");
      
        wrdcount = token.countTokens();
        while (token.hasMoreTokens()) {
            String word = token.nextToken();
            for (int i = 0; i < word.length(); i++) {
                char ch = word.charAt(i);
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vcount++;
                } else {
                    ccount++;
                }
            }
        }
        System.out.println("The number of vowels in the string is " + vcount);
        System.out.println("The number of consonants in the string is " + ccount);
        System.out.println("The number of words in the string is " + wrdcount);
    }
}
