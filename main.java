public class main {
    public static void main(String[] args) {
        
        circular_deque cd = new circular_deque(3);

        System.out.println(cd.insertLast(1));
        System.out.println(cd.insertLast(2));
        System.out.println(cd.insertFront(3));
        System.out.println(cd.insertFront(4));

    }
}
