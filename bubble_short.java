public class bubble_short {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,6,5,0,3,4,6}; 
        bubble_short_recur(arr, true);
        for (int i : arr) {
            System.out.print(i + ", ");
        }
    }
    
    static void regular_bubble_short(int[] arr){
        int tmp = 0;
        boolean is_swapped = true;
        int position = 0;
        while(is_swapped){
            is_swapped = false;
            if(position+1 == arr.length-1){
                position = 0;
            }
           while(position != arr.length-2){
            if( arr[position] > arr[position+1] ) {
                tmp = arr[position];
                arr[position] = arr[position+1];
                arr[position+1] = tmp;
                is_swapped = true;
            }
            position++;
           }
           position = 0;
        }
    }

    static int current_pos = 0;
    static void bubble_short_recur(int[] arr, boolean is_changed) {
      

        if(current_pos == arr.length - 2) {
            if(is_changed == false) {
                return;
            }
            is_changed = false;
            current_pos = 0;
        }

        if(arr[current_pos] > arr[current_pos + 1]){
            swap(arr, current_pos);
            is_changed = true;
        }   
            current_pos = current_pos +1;
        bubble_short_recur(arr, is_changed);
       

    }

    static void swap(int[] arr, int pos){
        int tmp = arr[pos];
        arr[pos] = arr[pos+1];
        arr[pos+1] = tmp; 
    }

}
