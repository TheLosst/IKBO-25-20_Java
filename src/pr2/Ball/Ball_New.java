package pr2.Ball;

public class Ball_New {
    double x = 0.0;
    double y = 0.0;

    public Ball_New() {

    }

    public Ball_New(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
    public void setXY(double x,double y){
        this.y = y;
        this.x = x;
    }
    public void moveBall(double xDist,double yDist){
        this.x += xDist;
        this.y += yDist;
    }

    @Override
    public String toString() {
        return "Ball_New (Коррдинаты) {" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
