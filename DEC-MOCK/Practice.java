import java.util.Arrays;
import java.util.Scanner;

class Practice{
    public static void main(String[] args){
        int[] arr={ -5, -6, 0};
        Arrays.sort(arr);
        int m=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            m=Math.max(m,arr[i]);
        }
        if(m<=0){
            System.out.println(1);
        }else{
            System.out.println(m+1);
        }
    }









}