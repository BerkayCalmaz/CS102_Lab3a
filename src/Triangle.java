/**
 * Author: Berkay Çalmaz
 * Date: 6.11.2020
 */
public class Triangle extends Shape {

    int a;
    int b;
    int c;

    /**
     * Creates a triangle with given side lengths
     * @param a Side a
     * @param b Side b
     * @param c Side c
     */
    public Triangle( int a, int b, int c ){
            this.a = a;
            this.b = b;
            this.c = c;
    }

    @Override
    /**
     * @return Returns the area.
     */
    public double getArea() {
        double s = ( a + b + c ) / 2;
        return ( Math.sqrt( s * ( s - a ) * ( s - b ) * ( s - c ) ) );
    }

    @Override
    /**
     * @return Returns the perimeter
     */
    public double getPerimeter() {
        return ( a + b +c );
    }

    @Override
    public Shape contains(int x, int y) {
        double u = ( a + b + c ) / 2;
        double area = ( Math.sqrt( u * ( u - a ) * ( u - b ) * ( u - c ) ) );
        double r = area * Math.pow( u, -1 );
        if( Math.pow( r, 2 ) >= (Math.pow( x - super.getX(), 2 ) + Math.pow( y - super.getY(), 2 )) ){
            return this;
        }
        else{
            return null;
        }
    }

}
