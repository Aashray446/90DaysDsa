import java.util.HashMap;
import java.util.Stack;

// Solved With Stack

public class valid_parenthesis {

        public static boolean isValid(String s) {
            if(s.length() == 1 || s.length()%2 != 0 ) {
                return false;
            }
           HashMap<String, String> table  = new HashMap<String, String>();
           table.put("[", "]");
           table.put("(", ")");
           table.put("{", "}");
           Stack<String> data = new Stack<String>();
               for(int i = 0; i < s.length(); i++ ) {
                   
                   if(table.containsKey(String.valueOf(s.charAt(i)))){
                       data.push(String.valueOf(s.charAt(i)));
                   } 
                   else { 
                       if(data.empty()){
                           return false;
                       }
                       String tmp = data.pop();
                       tmp = table.get(tmp);
                       if(tmp.charAt(0) != s.charAt(i)) {
                           return false;
                       }
                           
                   }   
                   
               } 
            if(!data.empty()) {
                return false;
            }
           return true;
       }
    
}
