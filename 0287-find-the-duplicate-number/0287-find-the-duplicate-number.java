class Solution {
    public int findDuplicate(int[] arr) {
        int n = arr.length;
        HashMap <Integer, Integer> map = new HashMap<>();

        for(int i =0; i<n; i++)
        {
            map.put(arr[i], map.getOrDefault(arr[i],0)+1);
            if(map.get(arr[i])==2)
            {
                return arr[i];
            }
        }
        return 0;
    }
}
// // Agar frequency 2 ho gayi, matlab yehi duplicate hai!
//             if(map.get(arr[i]) == 2) {
//                 return arr[i]; // Number return karna hai, uski frequency nahi
//             }