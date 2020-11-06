/**
 * Author: Berkay Çalmaz
 * Date: 6.11.2020
 */
public abstract class Shape implements Locatable, Selectable {
    int x;
    int y;
    boolean selected;

    public abstract double getArea();
    public abstract double getPerimeter();

    public String toString(){
            return ( "Area is: " + this.getArea() + " Perimeter is: " + this.getPerimeter() +
                    " Is selected: " + this.getSelected() + ". X and Y coordinates are: " +
                    this.getX() + " , " + this.getY() );
    }

    @Override
    /**
     * This method sets location
     * @param x x coord.
     * @param y y coord.
     */
    public void setLocation(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    /**
     * @return Returns the x location.
     */
    public double getX() {
        return this.x;
    }

    /**
     * @return Returns the y location.
     */
    @Override
    public double getY() {
        return this.y;
    }

    @Override
    public boolean getSelected() {
        return this.selected;
    }

    @Override
    public void setSelected(boolean bool) {
        this.selected = bool;
    }

    public abstract Shape contains(int x, int y);
}
