class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(i1,i2) -> Integer.compare(i1[0],i2[0])); 
        List<int[]> res = new ArrayList<>(); 
        int[] curr = intervals[0]; 
        for(int i=1;i<intervals.length;i++) {
            if(curr[1] < intervals[i][0]) {
                res.add(curr); 
                curr = intervals[i]; 
            } else {
                curr[1] = Math.max(curr[1],intervals[i][1]); 
            }
        } 
        res.add(curr); 
        return res.toArray(new int[res.size()][]); 
    }
}