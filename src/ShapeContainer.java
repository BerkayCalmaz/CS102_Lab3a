import java.util.ArrayList;

/**
 * Author: Berkay Çalmaz
 * Date: 6.11.2020
 */
public class ShapeContainer {

    ArrayList<Shape> shapes;

    /**
     * Creates an arraylist of shape
     */
    public ShapeContainer(){
        this.shapes = new ArrayList<Shape>(0);
    }

    /**
     * Creates a shape
     * @param s The shape parameter
     */
    public void add( Shape s){
        shapes.add( s );
    }

    /**
     * @return Returns the area.
     */
    public double getArea(){
        double totalArea;
        totalArea = 0;
        for( int i = 0; i < shapes.size(); i++){
            totalArea += shapes.get(i).getArea();
        }
        return totalArea;
    }

    /**
     * @return Returns the perimeter
     */
    public double getPerimeter(){
        double totalPerim;
        totalPerim = 0;
        for( int i = 0; i < shapes.size(); i++) {
            totalPerim += shapes.get(i).getPerimeter();
        }
        return totalPerim;
    }

    /**
     * @return Returns the string representaiton
     */
    public String toString(){
        String totalToString = "";
        for( int i = 0; i < shapes.size(); i++ ) {
            totalToString = totalToString + shapes.get(i).toString() + "\n";
        }
    return totalToString;
    }

    /**
     * Finds a shape
     * @param x x coord of shape
     * @param y y coord of shape
     * @return
     */
    public Shape findShape(int x, int y){
        for( int i = 0; i < shapes.size(); i++){
            if( shapes.get(i).contains( x, y) != null){
                return shapes.get(i);
            }
        }
        return null;
    }

    /**
     * Deletes the selected shapes.
     */
    public void deleteSelected(){
        int counter = 0;
        for( int i = 0; i < shapes.size(); i++){
            if( shapes.get(i).getSelected() ){
                shapes.remove(i);
                System.out.println( counter + " shape is deleted" );
                counter++;
            }
        }
    }

}
