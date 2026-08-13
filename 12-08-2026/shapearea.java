abstract class shape {
    abstract void area();
}
class circle extends shape {
    void area() {
        double radius = 5.0;
        double area = Math.PI * radius * radius;
        System.out.println("Area of Circle: " + area);
    }
}
class rectangle extends shape {
    void area() {
        double length = 4.0;
        double width = 6.0;
        double area = length * width;
        System.out.println("Area of Rectangle: " + area);
    }
}
class triangle extends shape {
    void area() {
        double base = 3.0;
        double height = 5.0;
        double area = 0.5 * base * height;
        System.out.println("Area of Triangle: " + area);
    }
}
public class shapearea {
    public static void main(String[] args) {
        shape circle = new circle();
        shape rectangle = new rectangle();
        shape triangle = new triangle();

        circle.area();
        rectangle.area();
        triangle.area();
    }
}
