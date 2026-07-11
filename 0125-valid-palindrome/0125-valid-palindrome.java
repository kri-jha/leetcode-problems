// class Solution {
//     public boolean isPalindrome(String s) {
//         int low =0;
//         int high   = s.length()-1;

//         while(low<=high)
//         {
//            char start = s.charAt(low);
//            char end = s.charAt(high);

//            if(!Character.isLetterOrDigit(start)) // non alphanumeric charactwer ko skip karo 
//            {
//               low++;
//            } else if (!Character.isLetterOrDigit(end))
//            {
//             high--;
//            }

//            else {
//             if(Character.toLowerCase(start)!=Character.toLowerCase(end))
//             {
//                 return false;
//             }
//            }
//            low++;
//            high--;

//         }
//         return true;
//     }
// }
class Solution {
    public boolean isPalindrome(String s) {
        int low = 0;
        int high = s.length() - 1;

        while(low <= high) {
            char start = s.charAt(low);
            char end = s.charAt(high);

            // Non-alphanumeric characters ko skip karo
            if(!Character.isLetterOrDigit(start)) {
                low++;
            } 
            else if (!Character.isLetterOrDigit(end)) {
                high--;
            }
            // Jab dono valid characters hon
            else {
                // BUG 1 FIX: Dono ko toLowerCase() kiya
                if(Character.toLowerCase(start) != Character.toLowerCase(end)) {
                    return false;
                }
                
                // BUG 2 FIX: Agar match ho gaye, toh dono pointers move karo
                low++;
                high--;
            }
        }
        return true;
    }
}