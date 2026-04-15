public class exception {
    public static void main(String[] args) {
        try {
            int a =10/2;
            System.out.println(a);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by Zero");
        }
        System.out.println("Always Execute");
    }
}