public class Rectangle extends Shape {

    private int width;
    private int height;

    public Rectangle( int width, int height){
        this.width = width;
        this.height = height;
    }

    /**
     * A constructor for square subclass. !!! IS THIS AN OKAY IMPLEMENTATION? IS THERE A BETTER WAY???
     */
    public Rectangle( int side){
        this.width = side;
        this.height = side;
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
