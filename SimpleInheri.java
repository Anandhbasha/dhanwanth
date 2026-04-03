class Dad{
    String property = "Home";
}

class Son extends Dad{
    String property1 = "Bike";
}

public class SimpleInheri {
    public static void main(String[] args){
        Son S = new Son();
        System.out.println(S.property);
        // Dad d = new Dad();
        // System.out.println(d.property1);
    }
}
