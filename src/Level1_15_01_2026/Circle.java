package Level1_15_01_2026;
class Circle {

    double radius;

    void calculateArea() {
        double area = 3.14 * radius * radius;
        System.out.println("Area of Circle: " + area);
    }

    void calculateCircumference() {
        double circumference = 2 * 3.14 * radius;
        System.out.println("Circumference of Circle: " + circumference);
    }

    public static void main(String[] args) {

        Circle c = new Circle();
        c.radius = 5;

        c.calculateArea();
        c.calculateCircumference();
    }
}
