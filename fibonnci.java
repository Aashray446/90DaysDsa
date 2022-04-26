public class fibonnci {
    
    public static void main(String[] args) {
        
        System.out.println(rec(3));
    }

        static int rec(int n){
            
           

            if( n <2 ) {
                return 1;
            }
           
            return (rec(n-2) + rec(n-1));
            

        }

}
