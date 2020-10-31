public class ShapeTester {
    public static void main(String[] args) {
        ShapeContainer shapes = new ShapeContainer();
        Rectangle rec1 = new Rectangle( 3, 5  );
        Triangle tri1 = new Triangle( 3, 4, 5);
        Square sqr1 = new Square( 4 );
        Circle crc1 = new Circle( 7 );
        shapes.add( rec1 );
        shapes.add( tri1 );
        shapes.add( sqr1 );
        shapes.add( crc1 );

//        System.out.println( shapes.getArea() );
//        System.out.println( shapes.getPerimeter() );
//        System.out.println( shapes.toString() );

        crc1.setLocation(3,5);
        System.out.println( crc1.getX() );
        System.out.println(sqr1.getX());

        /*
        If you comment circle's getArea method, compiler gives an error because it extends an abstract
        class and it does not override one of its methods.
        If you make Circle abstract and don't instantiate it, the program works.
        If you make Circle abstract and instantiate it, it gives an error because an abstract class can't be instantiated.
        */
    }
}
