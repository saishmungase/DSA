public class Solution {
    public static String customSortString(String order, String s) {
        int arr[] = new int[26];
        int p = 0;
        for(int i = 0; i<s.length(); i++){
            arr[s.charAt(i) - 'a']++;
        }
        char soln[] = new char[s.length()];
        for(int k = 0; k<order.length(); k++){
            if(arr[order.charAt(k)-'a'] > 0){
                while(arr[order.charAt(k)-'a'] > 0){
                    soln[p] = order.charAt(k);
                    p++;
                    arr[order.charAt(k)-'a'] --;
                }
            }
        }
        for(int i = 0; i<26; i++){
            if(arr[i] > 0){
                while(arr[i] > 0){
                    soln[p] = (char)(i+'a');
                    p++;
                    arr[i]--;
                }
            }
        }
        return (String.valueOf(soln));
    }


    
    public static void main(String[] args) {
        String order = "cba";
        String s = "abcd";
        String solution = customSortString(order, s);
        System.out.println(solution);
        
        order = "bcafg";
        s = "abcd";
        solution = customSortString(order, s);
        System.out.println(solution);
    }
}
