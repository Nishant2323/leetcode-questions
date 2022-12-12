// class Solution {
//     public int climbStairs(int n) {
//         if(n==0){
//             return 1;
//         }
//         if(n<0){
//             return 0;
//         }
//          int stepone= climbStairs(n-1);
//           int steptwo= climbStairs(n-2);
//         return stepone+steptwo;
//     }
// }
class Solution {
    
    public int climbStairs(int n) {
        
        if(n == 1 || n == 0) return 1;
        
        int a = 0; int b = 1; int c = 0;
        
        for(int i = 1 ; i <= n ; i ++){
            c = a + b;
            a = b ; b = c;
        }
        return c;
    }
}