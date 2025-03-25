import java.util.Scanner;

public class practice2 {
    public static void main(String [] args){
        factorial(4);
        countNumbers();
    }
    public static void factorial(int num){
        if(num<0){
            System.out.println("Invalid Number");
        }else{
        int fact = 1;
        for(int i =1;i<=num;i++){
            fact = fact * i;
        }
        System.out.println(fact);
    }

}


public static void countNumbers(){
    Scanner sc  = new Scanner(System.in);
    // int num = sc.nextInt();
    int countPos = 0;
    int countNeg = 0;
    int countZero = 0;
    char cont;
    do{
    int num = sc.nextInt();

        if(num>0){
            countPos++;
        }
        if(num<0){
            countNeg++;
        }
        if (num == 0) {
            countZero++;
        }
        System.out.println("Wnat to continue y/n");
        cont = sc.next().charAt(0);
    }while(cont!='n');

    System.out.println("positive count are : "+countPos);
    System.out.println("negative count are : "+countNeg);
    System.out.println("zeros count are : "+countZero);


}
}
