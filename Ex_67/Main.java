package Ex_67;

public class Main {
    public static void main(String[] args){

        ShapeFactory shapeFactory = new ShapeFactory ();

        Shape circle = shapeFactory.getShape (ShapeType.CIRCLE);
        circle.getDraw ();

        Shape rectangle = shapeFactory.getShape (ShapeType.RECTANGLE);
        rectangle.getDraw ();
    }
}
