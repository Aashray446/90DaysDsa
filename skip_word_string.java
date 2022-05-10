public class skip_word_string {
    

    public static void main(String[] args) {

        // System.out.println(skip_word("Aashraya", "", 'a', 0));
      // System.out.print(skip_word("Aashraya",  "sh"));
        System.out.print(find_reverse(854));
    }

    // Doing recursively 
    // static String skip_word(String arr, String answer, Character leter, int index) {

    //     if(index >= arr.length()){
    //         return answer;
    //     }

    //     if(arr.charAt(index) != leter) {
    //         answer = answer + arr.charAt(index);
    //     }
    //     index++;
        
    //     return skip_word(arr, answer, leter, index);
    // }

    // Another Approach with less variables

    static String skip_word(String arr, String word) {

        if(arr.isEmpty()) {
            return "";
        }
        
        if( arr.startsWith(word)) {
            return skip_word(arr.substring(word.length()), word);
        }
        return arr.charAt(0) +  skip_word(arr.substring(1), word);

    } 

    static int find_reverse(int num) {
        System.out.println(num);
        if(num < 10) {
            return num;
        }
        int f = num%10;
        return (
            (f) * 10 
            + find_reverse(num/10)) ;


    } 

}
