class Solution {
    public int maxDistance(String moves) {
        int u =0, d=0, l=0, r=0, wild=0;

        for(int i=0; i<moves.length(); i++)
        {
            char c = moves.charAt(i);
            if( c=='U')
            {
                u++;
            } else if( c=='D')
            {
                d++;
            } else if( c=='L')
            {
                l++;
            } else if(c=='R')
            {
                r++;
            } else if(c=='_')
            {
                wild++;
            }
        }

        int netVertical = Math.abs(u-d);
        int netHorizontal = Math.abs(r-l);
        return netVertical + netHorizontal +wild;
    }
}