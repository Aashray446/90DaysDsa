import java.nio.file.FileAlreadyExistsException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class weekly {

    public static void main(String[] args) {
        System.out.println(rearrangeCharacters("ilovecodingonleetcode",
        "code"));
    }

    public static int rearrangeCharacters(String s, String target) {

        Map<Character, Integer> map = new HashMap<>();


        for (char w : target.toCharArray()) {
            Integer n = map.get(w);
            n = (n == null) ? 1 : ++n;
            map.put(w, n);
        }

        System.out.println(map);

        int asci_target_count = 0;
        int asci_s_count = 0;

        for (char c : target.toCharArray()) {
          asci_target_count += c;
        }

        for (char c : s.toCharArray()) {
            if(map.containsKey(c)){
                asci_s_count += c;
            }
        }
        

        return (asci_s_count / asci_target_count) ;
  
        
       



      

    }

       
}