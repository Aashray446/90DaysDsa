import java.util.ArrayList;
// Not optimized one but many other problems gonna requried this stuff
// Without using parameters Array list , 
// Declaring the result Array list inside the body of recursive functions
public class linear_search_rc_2 {
    
    public static void main(String[] args) {

        System.out.println( search( new int[] {1,2,3,4,5,6,6,7,8}, 0, 6) );
    }

    public static ArrayList<Integer> search(int[] nums, int index, int search_item) {

        ArrayList<Integer> result = new ArrayList<Integer>();

        if(index == nums.length ) {
            return result;
        }
 
        if(nums[index] == search_item ) {
            result.add(index);
            
        }

       result.addAll(search(nums, index+1, search_item));

        return result;




    }


}
