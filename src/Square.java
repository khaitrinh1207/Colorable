public class Square implements Colorable {
    private double side;
    private String color;
    private boolean filled;

    public Square(){}

    public Square(double side, String color, boolean filled) {
        this.side = side;
        this.color = color;
        this.filled = filled;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

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

    public double getArea(){
        return side*side;
    }

    public double getPerimeter(){
        return side*4;
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides is blue");
    }
}
