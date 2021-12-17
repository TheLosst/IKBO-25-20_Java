package pr2.Ball;


public class TestBall {
    public static void main(String[] args) {
        Ball_New test1 = new Ball_New();
        Ball_New test2 = new Ball_New(1, 9);
        System.out.println("1." + test1);
        System.out.println("2." + test2);
        test1.moveBall(10,40.8);
        System.out.println("Двигаем мяч №1: " + test1);
        test2.moveBall(-70,93.88);
        System.out.println("Двигаем мяч №2: " + test2);
    }
}
