public class pascal_traingle {
    public static void main(String[] args) {
        System.out.println(1);
        
        int prev_count = 0;

        for(int i = 0; i < 6; i++){
            System.out.print(i);
            System.out.print(i+prev_count);
            System.out.print(i+prev_count);
            // System.out.print();
        }

    }
}
