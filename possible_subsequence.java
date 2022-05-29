public class possible_subsequence {
 
    public static void main(String[] args) {
        subsequence("", "avasdsd");
    }
    
    static void subsequence( String processed,  String unprocessed ) {

        if(unprocessed.isEmpty()) {
            System.out.println(processed);
            return;
        }

        char letter = unprocessed.charAt(0);

        subsequence(processed, unprocessed.substring(1));
        subsequence(processed + letter, unprocessed.substring(1));
    }

    static void subsequence_without_rec(String word){

        

    }

}
