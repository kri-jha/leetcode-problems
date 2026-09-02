class Solution {
    public List<String> letterCombinations(String digits) {
        // Hashtable<String , String> ht = new Hashtable<>();
List<String> res = new ArrayList<>();

if(digits.length()==0) return res;

String[] keypad ={
    "" , "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"
};

solve (0,digits, keypad, new StringBuilder(), res);
return res;

    }

    private void solve 
       ( int index , String digits, String[] keypad , StringBuilder current, List<String> res)
       {
        if(index == digits.length())
        {
            res.add(current.toString());
            return ;
        }

        int digit = digits.charAt(index) - '0'; // current digit 

        String letters = keypad[digit];

        for(char ch : letters.toCharArray())
        {
            current.append(ch);

            solve(index+1 , digits, keypad, current, res);

            current.deleteCharAt(current.length()-1);
        }

       }
    
}