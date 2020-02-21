public class Fan {
    private static final int SLOW = 1;
    private static final int MEDIUM = 2;
    private static final int FAST = 3;
    private int speed = SLOW;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";

    public Fan() {
    }

    public Fan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        if (isOn()) {
            return "Speed: " + this.speed + "\n"
                    + "Color: " + this.color + "\n"
                    + "radius: " + this.radius + "\n"
                    + "Fan is on!";
        }
        return "Fan is off !";
    }

    public static void main(String[] args) {
        Fan fan1 = new Fan();
        Fan fan2 = new Fan(SLOW,true,5,"Yellow");
        Fan fan3 = new Fan(MEDIUM,false,5,"blue");
        System.out.println(fan1.toString()+"\n -----------------------");
        System.out.println(fan2.toString()+"\n -----------------------");
        System.out.println(fan3.toString()+"\n -----------------------");
    }

}
