import java.util.Scanner;

public class arrays {
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        // int size = 5;
        // float[] arr1 = new float [size];
        // for(int i =0; i<size; i++){
        //     arr1[i] =  sc.nextFloat();
        // }
        // for(int i =0; i<size; i++){
        //         System.out.println(arr1[i]);

        // }
        // int size2 = sc.nextInt();
        // int[] arr2 = new int[size2];
        // for(int i = 0; i<size2; i++){
        //     arr2[i] = sc.nextInt();
        // }
        // System.out.println("Pleas enter the number ");
        // int x = sc.nextInt();
        // int index = 0;
        // boolean isFound = false;
        // for (int i =0; i<size; i++){
        //     if(arr2[i] == x){
        //         isFound = true;
        //         index = i;
        //         break;
        //     }
        // }
        // if(isFound){
        //     System.out.println(x + " is found at index : " + index);
        // }else{
        //     System.out.println(x + " is not found");
        // }
        // String[] arr3 = {"1,2,3,4,5,6","adsdadss"};

        // // 2D arrays 
        // int [][] arr4 = {{1,2,3,4},{1,2,3,4},{1,2,3,4}};
        int [][] arr4 = new int [4][5];
        for (int i =0 ; i<4; i++){
            for(int j = 0; j<5; j++){
                arr4[i][j] = sc.nextInt();
            }
        }
        // int[] name = new int[2];
        for (int i =0 ; i<4; i++){
            for(int j = 0; j<5; j++){
                if(arr4[i][j] == 5){
                    System.out.println("5"+" is found on index ("+ i+" , "+j+")");
                }
            }
            System.out.println();
        }

    }
}
