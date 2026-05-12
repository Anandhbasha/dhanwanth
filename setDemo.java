import java.util.*;

public class setDemo {
    public static void main(String[] args){
        HashSet<Integer> sets = new HashSet<>();
        sets.add(10);
        sets.add(20);
        sets.add(10);
        sets.add(20);
        sets.add(50);
        sets.add(60);

        System.out.println(sets);
    }
}
