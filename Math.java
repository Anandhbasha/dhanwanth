import java.util.Random;
public class Math {
    public static void main(String[] args) {
        int a = 10;
        double res = java.lang.Math.sqrt(a);
        double res1 = java.lang.Math.pow(a,5);
        double res2 = java.lang.Math.max(a,5);
        System.out.println(res);
        System.out.println(res1);
        System.out.println(res2);
        Random r = new Random();
        int num = r.nextInt(1000);
        System.out.println(num);
    }
}
