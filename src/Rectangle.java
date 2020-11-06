/**
 * Author: Berkay Çalmaz
 * Date: 6.11.2020
 */
public class Rectangle extends Shape {

    private int width;
    private int height;

    public Rectangle( int width, int height){
        this.width = width;
        this.height = height;
    }

    @Override
    /**
     * @return Returns the area.
     */
    public double getArea() {
        return ( width * height );
    }

    @Override
    /**
     * @return Returns the perimeter
     */
    public double getPerimeter() {
        return 2 * ( height + width);
    }

    @Override
    public Rectangle contains(int x, int y) {
        if( x < super.getX() + ( this.width * Math.pow( 2.0, -1 ) ) && x > super.getX() - ( this.width * Math.pow( 2.0, -1 ) ) &&
            y < super.getY() + ( this.height * Math.pow( 2.0, -1 ) ) && y > super.getY() - ( this.height * Math.pow( 2.0, -1 ) ) ){
            return this;
        }
        else{
            return null;
        }
        }

}
