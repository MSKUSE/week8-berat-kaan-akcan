public class Shape {
    private String color = "white";
    public Shape() {


    }
    public Shape(String color) {
        this.color = color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getColor() {
        return color;
    }
    public double area(){
        return 0.0;
    };

    public double perimeter(){
        return 0.0;
    }


    public void describe(int sideA, int sideB){
        System.out.println("side a is "+sideA+" side b is "+sideB);
    }

    public void describe(int sideA){
        System.out.println("side a is "+sideA);
    }
    public void describe(double sideA){
        System.out.println("radius is "+sideA);
    }





    public void describe(){
        System.out.println("this is a sahpe and color is "+this.color);
    }

}

