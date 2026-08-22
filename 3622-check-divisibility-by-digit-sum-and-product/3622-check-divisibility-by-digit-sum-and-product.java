class Solution {
    public boolean checkDivisibility(int n) {
        int sum =0;
        int p=1;
        // int totalsum =0;
        int x=n;



while(x!=0)
{
int ld = x%10;

sum+=ld;
p *=ld;

 x /=10; // remove lastdigit;



}
// int totalsum =sum+p;
// int d=n % totalsum;

return n%(sum+p)==0;

// if(d==0)
// {
//  return true;
// }
//    return false;     

        //  int 

        //  if()

        
    }
}