import java.util.ArrayList;

public class linear_search_rec {
    
    public static void main(String[] args) {

        search(new int[] {1,1,2,3,4,5,6,6,6}, 0, 6);
        System.out.println(contains_index);
        
    }

    static ArrayList<Integer> contains_index = new ArrayList<Integer>();

    public static void search(int[] nums, int index, int search_item) {


        if(index == nums.length) {
            return;
        }

        if( nums[index] ==  search_item ) {

            contains_index.add(index);
            
        }
        search(nums, index+1, search_item);



    }

}
