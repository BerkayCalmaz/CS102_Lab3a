public class ShapeTester {
    public static void main(String[] args) {
        ShapeContainer shapes = new ShapeContainer();
        Rectangle rec1 = new Rectangle( 3, 5  );
        Triangle tri1 = new Triangle( 3, 4, 5);
        Square sqr1 = new Square( 4 );
        Circle crc1 = new Circle( 7 );
        shapes.add( rec1 );
        shapes.add( tri1 );

//        System.out.println( rec1.getArea() );
//        System.out.println( tri1.getArea() );
//        System.out.println( sqr1.getArea() );
//        System.out.println( crc1.getArea() + "\n");
//
//        System.out.println( rec1.getPerimeter() );
//        System.out.println( tri1.getPerimeter() );
//        System.out.println( sqr1.getPerimeter() );
//        System.out.println( crc1.getPerimeter() );

        System.out.println( shapes.getArea() );
        System.out.println( shapes.getPerimeter() );
        System.out.println( shapes.toString() );
    }
}
