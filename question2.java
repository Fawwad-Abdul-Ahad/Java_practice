import java.util.Arrays;
import java.util.Scanner;

public class question2{
    public static void main(String[] args){
        int [] arr1 = {3,4,3};
        findMajorityElement(arr1);

    }

    public static void findMajorityElement(int []arr1){
        int count = 0;
        int candidate = 0;
        int checkCandidate = 0;
        for(int i =0;i<arr1.length;i++){
            if(count == 0){
                candidate = arr1[i];
            }
            if(candidate == arr1[i]){
                count++;
            }else{
                count--;
            }
        }
        for(int i = 0; i<arr1.length;i++){
            if(candidate == arr1[i]){
                checkCandidate++;
            }       
        }
        if(checkCandidate>arr1.length/2){
            System.out.println(candidate+"is found");
        }else{
            System.out.println("not found");
        }
        // System.out.println(candidate);
    }
}