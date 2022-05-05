public class pattern_with_recursion {
    
    public static void main(String[] args) {
        print_recur(5,5);
    }

    public static void print_pattern(int i, int j) {
        
        for(int k = i; k >= 0; k-- ) {
            for(int l = k; l >= 0; l-- ) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
    public static void print_recur(int i , int j) {

       
        if(j != 0) {
            System.out.print("*");
            print_recur(i, j-1);
        }else {
            if(i == 0 ) {
                return;
            }
            System.out.println();
            print_recur(i-1, i-1);
        }
     

    }

    static void print_rec_2(int i, int j) {

        if(i == 6) {
            return;
        }

        if( j != 0) {
            System.out.print("*");
            print_rec_2(i, j-1);
        }
        else {
            System.out.println();
            i = i + 1;
            j = i;
            print_rec_2(i, j);
        }
  
        
    }

}
