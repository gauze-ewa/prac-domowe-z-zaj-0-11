package rightTriangle;

public class RightTriangle {

    private boolean isRightTriangle(Triangle triangle) {
        boolean result = true;
        double a = triangle.getSideA();
        double b = triangle.getSideB();
        double c = triangle.getSideC();
        if ((a * a) + (b * b) == (c * c))
            result = true;
        else if ((c * c) + (b * b) == a * a)
            result = true;
        else if ((c * c) + (a * a) == b * b)
            result = true;
        else
            result = false;
        return result;
    }
    public void printInfo(Triangle triangle){
        System.out.println("Trójkąt o bokach: "+triangle.getSideA()+", "+triangle.getSideB()+", "+triangle.getSideC()+
        " jest trójkątem prostokątnym: "+isRightTriangle(triangle));
    }
}

