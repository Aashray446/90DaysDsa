public class brinary_search {


    public static void main(String[] args) {

        System.out.println(search(new int[]{-1,2,4,5,7,8,9}, 9));
    }

        public static int search(int[] nums, int target) {
         
            
            int start = 0;
            int end = nums.length;
            int mid = 0;
            
            while(start+1 != end) {
                
                mid = (start + end)/2;
                
                if( target == nums[mid]) {
                    return mid;
                }
                   
                if( target > nums[mid]){
                    start = mid;
                }
                if(target < nums[mid]){
                    end = mid;
                }
              
                
            }

            return -1;
            
        }
                  

}
