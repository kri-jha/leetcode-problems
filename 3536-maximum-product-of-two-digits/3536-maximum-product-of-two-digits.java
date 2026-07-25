class Solution {
    public int maxProduct(int n) {
 int p =0;
 
// int n = 21;
String temp = String.valueOf(n); // "21" ban gaya
int[] arr = new int[temp.length()]; // Size 2 ka array banega

for (int i = 0; i < temp.length(); i++) {
    // charAt(i) se character nikalenge, aur '0' minus karke int mein badal lenge
    arr[i] = temp.charAt(i) - '0'; 
}

// Result: arr[0] = 2, arr[1] = 1


 int maxp =0;
//  int i =arr[0];
//  int j =arr[1];

//  while(i<)
for(int i =0; i<arr.length-1;i++)
{
    for(int j =i+1; j<arr.length; j++ )
    {
         p=arr[i]*arr[j];
        maxp = Math.max(p, maxp);
    }
}
return maxp;


 
    }
}