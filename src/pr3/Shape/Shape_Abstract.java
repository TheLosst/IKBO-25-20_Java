package pr3.Shape;

public abstract class Shape_Abstract {
    protected String color = "None";
    protected boolean filled = false;

    public Shape_Abstract() {
    }

    public Shape_Abstract(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    abstract double getArea();
    abstract double getPerimeter();


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "Shape_Abstract{" +
                "color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
}
