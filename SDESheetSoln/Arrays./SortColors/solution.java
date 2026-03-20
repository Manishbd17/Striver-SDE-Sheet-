class Solution { 
    public void swap(int[] nums,int i,int j) {
        int temp = nums[i]; 
        nums[i]=nums[j]; 
        nums[j]=temp; 
    }
    public void sortColors(int[] nums) { 
        int n = nums.length; 
        int st=0,mid=0,end=n-1; 
        while(mid<=end) {
            if(nums[mid]==0) {
                swap(nums,st,mid); 
                mid++; 
                st++; 
            } else if (nums[mid]==1) 
                mid++; 
            else {
                swap(nums,mid,end); 
                end--; 
            }
        }
    }
}