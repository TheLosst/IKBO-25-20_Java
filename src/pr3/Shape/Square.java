package pr3.Shape;

public class Square extends Rectangle{
    public Square() {

    }

    public Square(double Side) {
        this.wight = Side;
        this.length = Side;
    }

    public Square(String color, double Side, boolean filled) {
        this.wight = Side;
        this.length = Side;
        this.color = color;
        this.filled = filled;
    }

    public double getSide(){
        return this.length;
    }

    public void setSide(double Side) {
        this.wight = Side;
        this.length = Side;
    }
    public void setWidth(double Side){
        this.wight = Side;
    }
    public void setlength(double Side){
        this.length = Side;
    }

    @Override
    public String toString() {
        return "Square{" +
                "wight=" + wight +
                ", length=" + length +
                ", color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
}
