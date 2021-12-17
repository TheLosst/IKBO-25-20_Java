package pr1;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
        Circle c1 = new Circle(4.5,"Red");
        System.out.println(c1);
        c1.setColor("Yellow");
        c1.setRadius(15);
        System.out.println(c1);
    }
}
