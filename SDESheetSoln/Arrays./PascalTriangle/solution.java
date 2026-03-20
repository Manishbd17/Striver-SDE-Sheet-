class Solution {
    public List<Integer> generateRows(int n) {
        List<Integer> lst = new ArrayList<>(); 
        lst.add(1); 
        int temp=1; 
        for(int i=1;i<n;i++) {
            temp*=(n-j); 
            temp/=j;
            lst.add(temp); 
        }
        return temp; 
    }
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>(); 
        for(int i=1;i<=numRows;i++){
            res.add(generateRows(i)); 
        }
        return res;
    }
} 