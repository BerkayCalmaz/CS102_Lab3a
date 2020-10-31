import java.lang.Math;

public class Circle extends Shape {

    private int radius;

    public Circle( int radius ){
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return ( Math.PI * ( Math.pow( radius, 2 ) ) );
    }

    @Override
    public double getPerimeter() {
        return ( 2 * Math.PI * radius);
    }

}
