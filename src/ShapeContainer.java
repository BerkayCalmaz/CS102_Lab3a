import java.util.ArrayList;

public class ShapeContainer {

    ArrayList<Shape> shapes;

    public ShapeContainer(){
        this.shapes = new ArrayList<Shape>(0);
    }

    public void add( Shape s){
        shapes.add( s );
    }

    public double getArea(){
        double totalArea;
        totalArea = 0;
        for( int i = 0; i < shapes.size(); i++){
            totalArea += shapes.get(i).getArea();
        }
        return totalArea;
    }

    public double getPerimeter(){
        double totalPerim;
        totalPerim = 0;
        for( int i = 0; i < shapes.size(); i++) {
            totalPerim += shapes.get(i).getPerimeter();
        }
        return totalPerim;
    }

    public String toString(){
        String totalToString = "";
        for( int i = 0; i < shapes.size(); i++ ) {
            totalToString = totalToString + shapes.get(i).toString() + "\n";
        }
    return totalToString;
    }

    public Shape findShape(int x, int y){
        for( int i = 0; i < shapes.size(); i++){
            if( shapes.get(i).getX() == x && shapes.get(i).getY() == y ){
                return shapes.get(i);
            }
        }
        return null;
    }

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
