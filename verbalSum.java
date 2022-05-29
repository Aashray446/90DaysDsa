import java.util.Stack;

public class verbalSum {
    
    public static void main(String[] args) {
        //Some test cases
        calculateOne("to21");
        calculateOne("200 and 500 equals to");
        calculateOne("10");

    }


    static void calculateOne(String statement){
        // Converting string to array of char
       char[] arrayOfChar = statement.toCharArray();
        Stack<Integer> detectedNumber = new Stack<Integer>();
        String currentStreakOfNumbers = "";

        for (char c : arrayOfChar) {
            
            // If the char is digit 
            if(Character.isDigit(c)) {
                currentStreakOfNumbers += c;
                continue;
            }
            if(currentStreakOfNumbers != "") {
                detectedNumber.push( Integer.parseInt(currentStreakOfNumbers) );
                currentStreakOfNumbers  = "";
            }

            
        }

        // Handling corner case , If the digit is at last
        if(currentStreakOfNumbers != "") {
            detectedNumber.push( Integer.parseInt(currentStreakOfNumbers) );
        }


        // Checking if the number is detected or not
        if( !detectedNumber.isEmpty() ) {
            System.out.println( detectedNumber.size() + " Integers Found");
            int sum = 0;
            while(!detectedNumber.isEmpty()) {
                sum += detectedNumber.pop();
            }
            System.out.println("Sum :" + sum);
        }
        else {
            System.out.println("No Integers found");
        }


    }

}
