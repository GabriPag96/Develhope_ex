package Ex_67;

public class ShapeFactory {
    public Shape getShape(ShapeType ShapeType){
        switch (ShapeType) {
            case CIRCLE -> {
                return new Circle ();
            }
            case RECTANGLE -> {
                return new Rectangle ();
            }
            default -> throw new IllegalArgumentException ("Invalid Shape" + ShapeType);
        }
    }
}

