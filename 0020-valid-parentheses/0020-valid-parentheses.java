class Solution {
    public boolean isValid(String s) {
       Stack <Character>t = new Stack<>();

       for(char ch : s.toCharArray())
       {
        if(ch== '(')
        {
            t.push(')');

        }  else if(ch=='{')
        {
            t.push('}');

        }
         else if(ch=='[')
        {
            t.push(']');

        } else if(t.isEmpty() || t.pop()!=ch )
        {
            return false;
        }
       }
       return t.isEmpty();
    }
}