/**
 * Author: Berkay Çalmaz
 * Date: 6.11.2020
 */
public interface Locatable {

    /**
     * This method sets location
     * @param x x coord.
     * @param y y coord.
     */
    public void setLocation( int x, int y );

    /**
     * @return Returns the y location.
     */
    public double getY();

    /**
     * @return Returns the x location.
     */
    public double getX();

}
