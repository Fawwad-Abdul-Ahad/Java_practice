import java.util.*;
public class question1 {
    public static void main (String [] arg ){
        // System.out.println(str1);

        String word1 = "abcdefg";

        String word2 = "pqr";
        // System.err.println(word1.charAt(0));
        StringBuilder newWord = new StringBuilder();
        String sb = "";
     if(word1.length() >= word2.length()){
        for(int i =0; i<word2.length();i++){
            sb = sb + String.valueOf(word1.charAt(i)) + String.valueOf(word2.charAt(i)) ;
        }
        for(int i= word2.length(); i<word1.length(); i++){
            sb = sb + (String.valueOf(word1.charAt(i)));
        }
     }
     else if(word1.length() <= word2.length()){
        for(int i =0; i<word1.length();i++){
            newWord = newWord.append(word1.charAt(i)).append(word2.charAt(i));
        }
        for(int i =word1.length(); i<word2.length();i++){
            newWord = newWord.append(word2.charAt(i));
        }
     }
     System.out.println(sb);
    }

}
