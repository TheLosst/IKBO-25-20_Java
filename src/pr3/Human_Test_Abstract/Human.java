package pr3.Human_Test_Abstract;

public class Human extends Human_Abstract {
    @Override
    void makeOlder(int year) {
        age += year;
        System.out.println("Вы постарели на " + year + "лет");
    }

    @Override
    void makeYonger(int year) {
        age -= year;
        System.out.println("Вы стали моложе на " + year + "лет");
    }

    @Override
    void makeItGrow(double n) {
        height += n;
        System.out.println("Вы стали выше на " + n + "см.");
    }

    @Override
    void dead() {
        this.alive = false;
        System.out.println("Вы умерли!");
    }

    @Override
    void live() {
        this.alive = true;
        System.out.println("Я снова живу!1!");
    }
}
