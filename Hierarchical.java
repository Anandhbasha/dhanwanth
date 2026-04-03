class dad{
    String bike = "Rx100";
}
class son extends dad{
    String car = "3XO";
}
class daughter extends dad{
    String prop = "House";
}
public class Hierarchical {
    public static void main(String[] args) {
        daughter s = new daughter();
        s.prop = "xuv";
        System.out.println(s.prop);
    }
}
