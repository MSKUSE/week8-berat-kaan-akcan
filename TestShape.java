public class TestShape {
    public static void main(String[] args) {
//    Shape square = new Shape( "blue");
//    square.describe(5,4);
//        Rectangle square= new Rectangle("blue",4,3);
//        square.describe();
        Rectangle rectangle = new Rectangle("blue",4,3);
        Rectangle rectangle2 = new Rectangle("blue",4,3);
        System.out.println(rectangle.equals(rectangle2));

    }

}
