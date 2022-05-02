public class find_is_sorter_array {
    
    public static void main(String[] args) {
        System.out.print(is_sorter( new int[]{0,1,4,0}, 0 ));
    }

    public static boolean is_sorter(int nums[], int pointer) {


        if(pointer == nums.length-1) {
            return true;
        }


        else if(nums[pointer] <  nums[pointer + 1]) {
            return is_sorter(nums, pointer+1);
         
        }
        else {
            return false;
        }
       

        
    }

}
