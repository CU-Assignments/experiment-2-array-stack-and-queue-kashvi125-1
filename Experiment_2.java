public class Experiment_2 {

        public int[] twoSum(int[] nums, int target) {
            int [] size_arr=new int[2];
            for(int i=0;i<nums.length;i++){
                for(int j=i+1;j<nums.length;j++){
                    if(nums[i]+nums[j]==target){
                        size_arr[0]=i;
                        size_arr[1]=j;
                    }
                }
            }
            return size_arr;
        }
    }

