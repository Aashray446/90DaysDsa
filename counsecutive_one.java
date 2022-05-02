public class counsecutive_one {
    
    public static void main(String[] args) {
        System.out.println( calcu(new int[] {1,1,0,0,1,1,1,1,0,0,1,1 } ));        
    }

    public static int calcu(int[] arr) {
        int current_max_streak = 0;

        int count = 0;

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == 1) {
                count += 1;
            }
            else {  
                if(current_max_streak < count) {
                    current_max_streak = count;
                }
                count = 0;
            }

        }
        
        return  current_max_streak;
    }

}

