class Solution {
    public double myPow(double x, int n) {
    //  int to long due to overflow 
    long N =n;
    
    return power(x, N);
    
    }
 double power(double x, long N)
 {
    if(N==0)
    {
        return 1;

    }
    if(N<0)
    {
        return power(1/x , -N);
    }

    if(N%2==0)
    {
        return power(x*x , N/2);
    } else {
        return x *power(x*x ,N/2);
    }
 }
}