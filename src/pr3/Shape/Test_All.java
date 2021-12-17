package pr3.Shape;

public class Test_All {
    static void Circle() {
        System.out.println("---------------------------------------------------------------------------------");
        Circle krug = new Circle("Алый",true,15.3);
        System.out.println("Площадь круга: " + krug.getArea());
        System.out.println("Периметр круга: " + krug.getPerimeter());
        System.out.println(krug);
        System.out.println("---------------------------------------------------------------------------------");
    }
    static void Rectangle(){
        Rectangle przmouygol = new Rectangle(15.8,65.3);
        System.out.println("Периметр :" + przmouygol.getPerimeter());
        System.out.println("Площадь :" + przmouygol.getArea());
        System.out.println(przmouygol);
        System.out.println("---------------------------------------------------------------------------------");
    }

    static void Square(){
        Square kvadrat = new Square("Желтый",16, true);
        System.out.println("Периметр :" + kvadrat.getPerimeter());
        System.out.println("Площадь :" + kvadrat.getArea());
        System.out.println(kvadrat);
        System.out.println("---------------------------------------------------------------------------------");
    }


    public static void main(String[] args) {
        Circle();
        Rectangle();
        Square();
    }
}
