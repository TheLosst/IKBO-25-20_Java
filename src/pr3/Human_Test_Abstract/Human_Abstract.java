package pr3.Human_Test_Abstract;

public abstract class Human_Abstract {
    double height; // Описываем человека, а не фигуру, кекес)
    String name;
    char sex;
    boolean alive;
    int age;

    abstract void makeOlder(int year);
    abstract void makeYonger(int year);
    abstract void makeItGrow(double n);
    abstract void dead();
    abstract void live();

    public Human_Abstract() {
    }

    public Human_Abstract(double height, String name, char sex, boolean alive, int age) {
        this.height = height;
        this.name = name;
        this.sex = sex;
        this.alive = alive;
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public boolean isAlive() {
        return alive;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAll(double height, String name, char sex, boolean alive, int age){
        this.height = height;
        this.name = name;
        this.sex = sex;
        this.alive = alive;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Human{" +
                "height=" + height +
                ", name='" + name + '\'' +
                ", sex=" + sex +
                ", alive=" + alive +
                ", age=" + age +
                '}';
    }
}
