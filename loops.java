import java.util.*;
public class loops{

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int row  = sc.nextInt();
        int col = sc.nextInt();
        for(int i =1 ; i<=row; i++){
            for(int j =1; j<=col-i+1; j++){
                System.out.print(j);
            }
            System.out.print("\n");
        }
        // String str1
    }
}
//   *  12345
//  **  1234
// ***  123
//****  12
//      1