import java.util.Scanner;
import java.util.ArrayList;

public class ShapeTester{

    public static void menu(){
        System.out.println( "1-Create a new shape" );
        System.out.println( "2-Show total area and perimeter of all shapes" );
        System.out.println( "3-Find a shape with given x-y coordinates ");
        System.out.println( "4-Remove all selected shapes from the set" );
        System.out.println( "5-Print every shape's information" );
        System.out.println( "0-Quit" );
    }

    public static void shapeMenu(){
        System.out.println( "1-Create a rectangle" );
        System.out.println( "2-Create a square " );
        System.out.println( "3-Create a circle" );
        System.out.println( "4-Create a triangle " );
        System.out.println( "0-Quit to main menu" );
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int input;
        int shapeInput;
        ShapeContainer shapes = new ShapeContainer();

        do{
            menu();
            System.out.println("Select one option: ");
            input = scan.nextInt();
            if( input > 5 ){
                System.out.println("Please enter numbers in interval 0-4!");
            }
            else if( input == 1 ){
                do{
                    shapeMenu();
                    System.out.println( "Choose one shape or exit: " );
                    shapeInput = scan.nextInt();

                    if( shapeInput == 1){
                        int width, length, x ,y;
                        System.out.println( "Enter the width: " );
                        width = scan.nextInt();
                        System.out.println( "Enter the height: " );
                        length = scan.nextInt();
                        Rectangle rec1 = new Rectangle( width, length );
                        System.out.println( "Enter the x location: " );
                        x = scan.nextInt();
                        System.out.println( "Enter the y location:" );
                        y = scan.nextInt();
                        rec1.setLocation( x, y );
                        shapes.add( rec1 );
                    }

                    else if( shapeInput == 2){
                        int side, x , y;
                        System.out.println( "Enter side: " );
                        side = scan.nextInt();
                        Square sqr1 = new Square( side );
                        System.out.println( "Enter the x location: " );
                        x = scan.nextInt();
                        System.out.println( "Enter the y location:" );
                        y = scan.nextInt();
                        sqr1.setLocation( x, y );
                        shapes.add( sqr1 );
                    }

                    else if( shapeInput == 3 ){
                        int radius, x , y;
                        System.out.println( "Enter radius: " );
                        radius = scan.nextInt();
                        Circle crc1 = new Circle(radius);
                        System.out.println( "Enter the x location: " );
                        x = scan.nextInt();
                        System.out.println( "Enter the y location:" );
                        y = scan.nextInt();
                        crc1.setLocation( x, y );
                        shapes.add( crc1 );
                    }

                    else if( shapeInput == 4 ){
                        int a, b, c, x, y;
                        System.out.println( "Enter side 1: ");
                        a = scan.nextInt();
                        System.out.println( "Enter side 2: ");
                        b = scan.nextInt();
                        System.out.println( "Enter side 3: ");
                        c = scan.nextInt();
                        if( (a + b) >= c && (b + c) >= a && (c + a) >= b ) {
                            Triangle tri1 = new Triangle(a, b, c);
                            System.out.println("Enter the x location: ");
                            x = scan.nextInt();
                            System.out.println("Enter the y location:");
                            y = scan.nextInt();
                            tri1.setLocation(x, y);
                            shapes.add(tri1);
                        }
                        else{
                            System.out.println( "This cant be created!" );
                        }

                    }
                }while( shapeInput != 0);
            }

            else if( input == 2 ){
                System.out.println( "Total area of all shapes: " + shapes.getArea() );
                System.out.println( "Total perimeter of all shapes: " + shapes.getPerimeter() );
            }

            else if( input == 3 ){
                int x,y;
                System.out.println("Enter the x location: ");
                x = scan.nextInt();
                System.out.println( "Enter the y location" );
                y = scan.nextInt();
                if( shapes.findShape(x,y ) != null){
                    shapes.findShape(x,y ).setSelected(true);
                    System.out.println( "Shape is found and selected" );
                }
                else{
                    System.out.println( "There is no shape with these locations" );
                }
            }

            else if( input == 4 ){
                shapes.deleteSelected();
            }

            else if( input == 5 ){
                System.out.println( shapes.toString() );
            }

        }while( input != 0 );


    }
        /*
        If you comment circle's getArea method, compiler gives an error because it extends an abstract
        class and it does not override one of its methods.
        If you make Circle abstract and don't instantiate it, the program works.
        If you make Circle abstract and instantiate it, it gives an error because an abstract class can't be instantiated.
        */
}
