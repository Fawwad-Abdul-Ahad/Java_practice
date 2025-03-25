import java.util.List;
import java.util.Scanner;

public class strings {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        // if string1> string to then +ve
        // if string < string2 to then -ve value
        // if strings are qual then 0
        if("fawwad".compareTo("Fawwad") == 0){
               System.out.print("Strings are equal");
        }else{
            System.out.println("Fawwad".compareTo("fawwad"));
        }
        String strNum = "123";
        int number = Integer.parseInt(strNum);
        System.out.println(number);
        String numberString = Integer.toString(123);
        System.out.println(numberString);

        //q1
        //aeebcdedf
        // String str1  = sc.next();
        // String result  = "";

        // for(int i = 0; i<str1.length(); i++){
        //     if(str1.charAt(i) == 'e'){
        //         result = result + "i";
        //     }else{
        //         result = result + String.valueOf(str1.charAt(i));
        //     }
        // }
        // System.out.println(result);



        // q2
        // String email = "fawwadabdulahad@gmail.com";
        // String username = "";
        // for (int i =0; i<=email.length(); i++){
        //     if(email.charAt(i) == '@'){
        //         username = email.substring(0, i);
        //         break;
        //     }
        // }
        // System.out.println(username);
        
        // StringBuilders in java provicde that thype of string which are mutable
        StringBuilder sb = new StringBuilder("Fawwad");
        char a  = sb.charAt(0);
        System.out.println(a);

        sb.setCharAt(0, 'F');
        System.out.println(sb);
        // replace the charater in string builder

        sb.insert(1, 'a');
        System.out.println(sb);
        //it inserta the character on any specific position 


        sb.deleteCharAt(1);
        System.out.println(sb);
        sb.delete(1, 2);
        System.out.println(sb);
        //dlete the chacter

        //length of the string
        System.out.println(sb.length());

        //append of the string
        sb.append(" Abdul Ahad");
        System.out.println(sb);

        //reverse the string using string builder 
        StringBuilder sb1 = new StringBuilder("HelloWorld");
        for (int i = 0; i<sb1.length()/2; i++){
            int start = i;
            int end = sb1.length()-1-i;

            char startChar = sb1.charAt(start);
            char endChar  = sb1.charAt(end);

            sb1.setCharAt(start, endChar);
            sb1.setCharAt(end,startChar);
        }
        System.out.println(sb1);

        // Write a Java program to replace a specified character with another character.
        String sb2 = "Red is favorite color. starts with Red?" ;
        boolean startWith = sb2.startsWith("Red");
        if(startWith == true){
            System.out.println("true");
        }else{
            System.out.println("false");
        }

        //questions 
        // String str1 = " fawwad ";
        // String str2 = str1.toUpperCase();
        // System.out.println(str2);
        
        // Write a Java program to check whether there are two consecutive (following each other continuously), identical letters in a given string.

        String str1 = "sokayy";
        boolean isFound = false;
        for(int i =0; i<str1.length()-1; i++){
            if(str1.charAt(i) == str1.charAt(i+1)){
                System.out.println(str1.charAt(i));
                isFound = true;
                break;
            }
        }
        System.out.println(isFound);
    }
}
