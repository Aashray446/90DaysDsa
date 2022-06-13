class rotated {
    public static void main(String[] args) {
        System.out.println(check(new int[] {2,1,3,4}));
    }

    public static boolean check(int[] nums) {

     
        int error_result = 0;
        // int rotated_point = 0;
        int rotated_index = 0;
        for(int i = 1; i < nums.length; i++) {
            if( nums[i-1] > nums[i]  ){
                error_result += 1;
                // rotated_point = nums[i-1];
                rotated_index = i-1;
                
            }
            
        }
        if(error_result >= 1 && nums[rotated_index] < nums[nums.length-1]  ) {
                return false;
            }
        return true;
        
    }
}