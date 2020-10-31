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
    public void setLocation(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public double getX() {
        return this.x;
    }

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

    public Shape contains(int x, int y) {
        if( this.getX() == x  && this.getY() == y ){
            return this;
        }
        else{
            return null;
        }
    }
}
