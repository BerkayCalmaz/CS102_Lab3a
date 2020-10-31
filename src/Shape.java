public abstract class Shape implements Locatable {

    public abstract double getArea();
    public abstract double getPerimeter();
    int x;
    int y;
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

}
