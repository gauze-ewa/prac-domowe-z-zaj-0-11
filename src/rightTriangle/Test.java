package rightTriangle;

public class Test {
    public static void main(String[] args) {
        Triangle triangle1 = new Triangle(4, 3, 5);
        Triangle triangle2 = new Triangle(4, 3, 6.5);
        RightTriangle rightTriangle = new RightTriangle();
        rightTriangle.printInfo(triangle1);
        rightTriangle.printInfo(triangle2);

    }
}
