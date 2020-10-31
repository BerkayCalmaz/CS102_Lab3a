public class Rectangle extends Shape {

    private int width;
    private int height;

    public Rectangle( int width, int height){
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return ( width * height );
    }

    @Override
    public double getPerimeter() {
        return 2 * ( height + width);
    }

}
