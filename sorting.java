import java.util.Arrays;

public class sorting {
    public static void main(String [] args){
        // time complexity of these three algorithms are 0(n^2)
       int [] arr = {9,3,4,1,8,2,5};
        bubbleSort(arr);
        insertionSort(arr);
        selectionSort(arr);
        divide(arr, 0, arr.length-1);
        for(int i =0; i<arr.length; i++){
            System.out.println(arr[i] + " ");
        }
    }
// 5,2,3,1
    public static void bubbleSort(int [] arr){
        for(int i =0; i<arr.length; i++){
            for(int j = 0; j<arr.length-i-1; j++){
                if(arr[j] >arr[j+1]){
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
                }

            }
        }
        System.out.println("sourted array is "+ Arrays.toString(arr));
    }

    public static void insertionSort(int arr[]){
        for (int i =1; i<arr.length; i++){
            int current = arr[i];
            int j = i+1;

            while(j<=0 && current>arr[j]){
                arr[j+1] = arr[j];
                j++;
            }
            arr[j-1] = current;
        }
        System.out.println(Arrays.toString(arr));
    }


    public static void selectionSort(int [] arr){
        for(int i = 0; i<arr.length-1; i++){
            for(int j = i+1; j<arr.length; j++){
                if(arr[i] >arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;

                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }


    public static void divide(int[]arr, int si, int ei){
        if(si>=ei){
            return;
        }
        int mid = si+ (ei-si)/2;
        divide(arr, si, mid);
        divide(arr, mid+1, ei);
        merge(arr,si,mid,ei);
        
    }
    public static void merge (int[] arr,int si,int mid,int ei ){
        int [] mergeArr = new int [ei-si+1]; 
        int indx1 = si;
        int indx2 = mid+1;
        int x = 0;

        while(indx1<= mid && indx2<=ei){
            if(arr[indx1] <= arr[indx2]){
                mergeArr[x] = arr[indx1];
                x++;
                indx1++;
            }else{
                mergeArr[x] = arr[indx2];
                x++;
                indx2++;
            }
        }

        while (indx1<=mid) {
            mergeArr[x] =arr[indx1];
            x++;
            indx1++;
        }

        while (indx2<=ei){
            mergeArr[x] =arr[indx2];
            x++;
            indx2++;
        }
        for(int i =0, j= si; i<mergeArr.length; i++,j++){
            arr[j] = mergeArr[i];
        }
    }
}


