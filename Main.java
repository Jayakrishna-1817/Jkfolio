// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void swap(int [] nums,int l, int r)
    {
        int temp =nums[l];
        nums[l]=nums[r];
        nums[r]=temp;
    }
    public static void main(String[] args) {
        int nums[]={2,0,2,1,1,0};
        int l=0;
        int r=nums.length-1;
        while(l<nums.length)
        {
            if(r>0&&nums[l]>nums[r])
            {
                swap(nums,l,r);
                //r--;
            }
            if(r<l)
            {
               r=nums.length-1;
               l++;
            }
            r--;
        }
        for(int i:nums)
        System.out.println(i);
        
    }
}