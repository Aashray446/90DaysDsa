
import java.util.Stack;
public class zero_matrix{
    
    public class pair {
        int a;
        int b;

        public pair(int a , int b ) {
            this.a = a;
            this.b = b;
        }

        public int get_i(){
            return a;
        }

        public int get_j(){
            return b;
        }



    }

    public static void main(String[] args) {

        
    }


    public void caluclate_zero(int[][] matrix ) {

        //ArrayList<pair> is_zero = new ArrayList<pair>();
        Stack<pair> is_zero = new Stack<pair>();
      
        
        for (int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[i].length; j++) {
                if(matrix[i][j] == 0) {
    
                is_zero.push(new pair(i,j));
                }

            }
        }

        int x;
        int y;
        while(!is_zero.empty()) {
            pair tmp = is_zero.pop();
            x = tmp.get_i();
            y = tmp.get_j();

            for(int j = 0; j < matrix[x].length; j++){
                matrix[x][j] = 0;
            }
            for(int i = 0; i < matrix.length; i++){
                matrix[i][y] = 0;
            }

        }
    }
        

                




}