package pr3.Human_Test_Abstract;

public class TestHuman {
    public static void main(String[] args) {
        Human sveta = new Human();
        sveta.setAll(165,"Света",'Ж',true,19);
        System.out.println("Света : " + sveta);
        sveta.makeOlder(3);
        System.out.println("Света : " + sveta);
        sveta.makeYonger(7);
        System.out.println("Света : " + sveta);
        sveta.makeItGrow(15);
        System.out.println("Света : " + sveta);
        sveta.dead();
        System.out.println("Света : " + sveta);
        sveta.live();
        System.out.println("Света : " + sveta);
        sveta.setSex('M');
        System.out.println(sveta.getSex());
    }
}
