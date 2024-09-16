public class Solution {
    public static int removeDuplicates(int[] nums) {
        if (nums.length <= 2) return nums.length;

        int writeIndex = 2;
        for (int i = 2; i < nums.length; i++) {
            if (nums[i] != nums[writeIndex - 2]) {
                nums[writeIndex] = nums[i];
                writeIndex++;
            }
        }
        
        return writeIndex;
    }

    public static void printer(int arr[]){
        for(int i =0; i<arr.length; i++){
            System.out.print(arr[i] +" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {1,1,1,2,2,3};
        int val = removeDuplicates(arr);
        System.out.println(val);
        printer(arr);
    }
}