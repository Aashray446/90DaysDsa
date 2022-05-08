public class merge_short {
    
    public static void main(String[] args) {
        int[] tmp_arr = get_shorted_arr(new int [] {1,3,2});
        // int[] tmp_arr = do_merge(new int[]{1}, new int[]{1,3});
        for (int i : tmp_arr) {
            System.out.print(i + " ");
        }
    }
    
    static int[] get_shorted_arr(int[] arr) {

        // Declaring the base condition 
        if(arr.length == 1 )
            return arr; 
        
        int[] tmp_1;
        int[] tmp_2;

        int length_of_arr = arr.length / 2;
        // Merge short need to Be Fixed for even length of the array
        if( (length_of_arr%2 != 0 && length_of_arr != 1 ) ) {
            tmp_1 = new int[length_of_arr];
            tmp_2 = new int[length_of_arr+1];            
        }
        else{
            tmp_1 = new int[length_of_arr];
            tmp_2 = new int[length_of_arr];

        }    

        int pointer = 0;
        for(int i= 0 ; i < tmp_1.length; i++) {
            tmp_1[i] = arr[pointer];
            pointer++; 
        }
        for(int i= 0 ; i < tmp_2.length; i++) {
            tmp_2[i] = arr[pointer];
            pointer++; 
        }
    

        return do_merge(get_shorted_arr(tmp_1 ), get_shorted_arr(tmp_2));
        
    }

    static int[] do_merge( int[] arr_1, int[] arr_2 ) {
        int p1=0;
        int p2 = 0;
        int[] tmp_arr = new int[arr_1.length + arr_2.length];
        int p3 = 0;
        while( p1 < arr_1.length && p2 < arr_2.length ) {
            if(arr_1[p1] < arr_2[p2] ) {
                tmp_arr[p3] = arr_1[p1];
                p1++;
            }
            else {
                tmp_arr[p3] = arr_2[p2];
                p2++;
            }
            p3++;
        }
        
        while(p1 != arr_1.length){
            tmp_arr[p3] = arr_1[p1];
            p1++;
            p3++;
        }
        while(p2 != arr_2.length ) {
            tmp_arr[p3] = arr_2[p2];
            p2++;
            p3++;
        }
        
        return tmp_arr;
    }

    //mer

}
