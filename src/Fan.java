public class Fan {
    public Fan(String make, double radius, String color){
        this.make = make;
        this.radius = radius;
        this.color = color;
    }

    private String make;
    private double radius;
    private String color;

    private boolean isOn;

    private byte speed;


    public void switchOn() {
        this.isOn = true;
        changeSpeed((byte)1);
    }

    public void switchOff() {
        this.isOn = false;
        changeSpeed((byte)0);
    }

    public void changeSpeed(byte interval) {
        this.speed = interval;
    }

    public String toString() {
        return String.format("make - %s, radius - %f, color -%s, isOn - %b, speed - %d", make,radius,color,isOn,speed);
    }
}

