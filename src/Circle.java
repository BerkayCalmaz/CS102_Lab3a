import java.lang.Math;
/**
 * Author: Berkay Çalmaz
 * Date: 6.11.2020
 */
public class Circle extends Shape {

    private int radius;

    public Circle( int radius ){
        this.radius = radius;
    }

    @Override
    /**
     * @return Returns the area.
     */
    public double getArea() {
        return ( Math.PI * ( Math.pow( radius, 2 ) ) );
    }

    @Override
    /**
     * @return Returns the perimeter
     */
    public double getPerimeter() {
        return ( 2 * Math.PI * radius);
    }

    @Override
    public Shape contains(int x, int y) {
        if( Math.pow( radius, 2 ) >= (Math.pow( x - super.getX(), 2 ) + Math.pow( y - super.getY(), 2 ))   ){
            return this;
        }
        else{
            return null;
        }
    }


}
