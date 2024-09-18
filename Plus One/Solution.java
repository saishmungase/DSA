public class Solution {
    public static int[] plusOne(int[] digits) {
        int n = digits.length;
        for(int i = n-1; i>=0; i--){
            if(digits[i]<9){
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        int temp[] = new int[n+1];
        temp[0] = 1;
        return temp;
    }

    //For printing values
    public static void print(int arr[]){
        int n = arr.length;
        for(int i = 0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr1[] = {1,2,3};
        print(plusOne(arr1));;
        int arr2[] = {4,3,2,1};
        print(plusOne(arr2));;
        int arr3[] = {9};
        print(plusOne(arr3));;
    }
}