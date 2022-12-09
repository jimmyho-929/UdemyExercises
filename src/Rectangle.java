public class Rectangle {
    private int length;
    private int width;

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
    public void setLength(int length) {
        this.length = length;
    }

    public Rectangle(int width, int length){
        this.width = width;
        this.length = length;
    }

    public int calcPerimeter(){
        return (this.length *2) + (this.width * 2);
    }

    public int calcArea(){
        return this.length * this.width;
    }
}
