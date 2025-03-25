import java.util.*;
public class practice{
    public static void main (String [] args) {
        System.out.println("Hello Java");//it give on line space
        System.out.print("Hello Java");

        String name = "Fawwad";
        name = name + "Abdul Ahad";
        name = "Hello";
        System.out.println(name); 

        //immutability example
        String s1 = "Hello";
        String s2 = s1;
        s1 = s1 + " Java";
        System.out.println(s2);//Hello
        System.out.println(s1);//Hello World
        int num1 = 2;
        num1 = num1 + 2;

        //variables in java
        byte age = 30; // it stores only 2 values
        int phone = 1234567890; // it stores only 10 value
        long number  = 1234567123231223239L; // it stores only 19 value of integer
        double pi = 3.14D; // it stores only point value 
        float pi2 = 3.123131231231F;
        char char1 = 'k';
        boolean isAlign = true;//
        
        int a = 23;
        int  b = 90;
        double c = a+b;
        System.out.print(c);

        //input
        Scanner sc =new Scanner(System.in);
        float num3 = sc.nextFloat();
        System.out.println(num3);
        
        // int n1 = sc.nextInt();
        // int n2 = sc.nextInt();
        // int n3 = n1 + n2; 
        // System.out.print("The sum is :");
        // System.out.println(n3);

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        String add = sc.next();

        switch(add){
            case "+" :
            System.out.println(n1+n2);
            break;

            case "-" :
            System.out.println(n1-n2);
            break;

            case "*":
            System.out.println(n1*n2);
            break;

            case "/" :
            System.out.println(n1/n2);
            break;
        }

    }   
}