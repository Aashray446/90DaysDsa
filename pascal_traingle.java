import java.util.ArrayList;
import java.util.List;

public class pascal_traingle {
    public static void main(String[] args) {
        
        for (List<Integer> arr : make_traingle(6)) {
                System.out.println( arr.toString() );
        }
    }

    static List<List<Integer>> make_traingle(int no) {

        List<List<Integer>> main = new ArrayList<List<Integer>>();

 
        List<Integer> prev = new ArrayList<Integer>();
        prev.add(1);
        prev.add(1);
        main.add(prev);

        for(int i = 0; i <= no; i ++ ) {

            List<Integer> new_arr = new ArrayList<>(prev.size() + 1);
            new_arr.add(1);

            for(int j = 1;  j <prev.size(); j++) {

                    new_arr.add(prev.get(j-1) + prev.get(j));

            }
            new_arr.add(1);
            main.add(new_arr);
            prev=new_arr;
        }

        return main;
    }
}
/// Optimized solution 

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>>result=new ArrayList<>();
        if(numRows==0)
            return new ArrayList();
        for(int i=1;i<=numRows;i++)
        {
            List<Integer>row=new ArrayList<>();
            
            for(int j=0;j<i;j++)
            {
                if(j==0 || j==i-1)
                {
                    row.add(1);
            }
                else {
                    row.add(result.get(i-2).get(j)+result.get(i-2).get(j-1));
                }
            }
                 result.add(row);
            }
        return result;
    }
}
