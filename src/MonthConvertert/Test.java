package MonthConvertert;

public class Test {
    public static void main(String[] args) {
        MonthConverter monthConverter=new MonthConverter();
        System.out.println(monthConverter.convert(14));
        System.out.println(monthConverter.convert(12));
        System.out.println(monthConverter.convert(-2));
        System.out.println(monthConverter.convert(4));
    }
}
