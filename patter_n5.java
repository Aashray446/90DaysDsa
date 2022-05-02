import java.util.*;

public class patter_n5 {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);

    // write ur code here
    
    int n = scn.nextInt();
    
    
   // int print_pointer = 2;
    int sp = n/2;
    int st = 1;
        
    for(int i = 1 ; i <= n; i++ ) {
        
        for(int print_t= sp ; print_t >= 1; print_t-- ) {
            System.out.print("\t");    
        }
        for(int print_s= 1 ; print_s <= st; print_s++ ) {
            System.out.print("*\t");
        }
        
        
        if( i <= n/2) {
            
        sp--;
        st = st+2;
        }
        else {
            sp++;
            st = st-2;
        }
        
        System.out.println("");
    }
    scn.close();
  }
}