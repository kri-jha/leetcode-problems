class Solution {
    public int singleNumber(int[] nums) {
    //     HashMap <Integer ,Integer> map = new HashMap<>();

    //     for(int num: nums)
    //     {
    //         map.put(num , map.getOrDefault(num ,0)+1);

    //     }

    //   for(Map.Entry<Integer ,Integer> entry :map.entrySet())
    //   {
    //     if(entry.getValue() ==1)
    //     {
    //         return entry.getKey();
    //     }
    //   }

    //   return -1;

    int xor =0;

    for(int num:nums)
    {
        xor = num^xor;

    }
    return xor;
    }
}


//  for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
//             if (entry.getValue() == 1) {
//                 return entry.getKey();
//             }
//         }
