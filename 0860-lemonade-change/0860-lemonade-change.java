class Solution {
    public boolean lemonadeChange(int[] bills) {
//         int currsum =0;
//         int cus=0;

    

//     for(int i=0; i<bills.length; i++)
//     {
//         currsum+=bills[i];

//         cus++;
//         if(currsum<bills[i])
//         {
//             return false;
//         }
//         if(bills[i]==10 )
//         {
//            currsum-=5;
//         } else if(bills[i]==20)
//         {
//             currsum-=15;
//         }
        
//     }
// return true;
int five =0;
int ten=0;
for(int i=0; i<bills.length; i++)
{
    if(bills[i]==5)
    {
        five++;
    }else if(bills[i]==10)
    {
        if(five>0)
        {
            five--;
            ten++;
        } else {
            return false;
        }
        // return false;
    }
    else if(bills[i]==20)
    {
        if(ten>0&& five>0)
        {
            ten--;
            five--;
        } else if(five>=3)
        {
            five-=3;
        } else {
            return false;
        }
    }
}
return true;
  
    }
}