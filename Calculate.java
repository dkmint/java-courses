// Version 1.
public class Calculate {
    public static void main(String[] arg) {
        System.out.println("Calculate...");
        double first = Double.valueOf(arg[0]);
        double second = Double.valueOf(arg[1]);
        System.out.println(String.format("%s + %s = %s", first, second, add(first, second)));
        System.out.println(String.format("%s - %s = %s", first, second, subtract(first, second)));
        System.out.println(String.format("%s * %s = %s", first, second, multiple(first, second)));
        System.out.println(String.format("%s / %s = %s", first, second, div(first, second)));
        System.out.println(String.format("%s ^ %s = %s", first, second, expand(first, (int)second)));
    }
    public static double add(double first, double second) {
        return first + second;
    }
    public static double subtract(double first, double second) {
        return first - second;
    }
    public static double multiple(double first, double second) {
        return first * second;
    }
    public static double div(double first, double second) {
        return first / second;
    }
    public static double expand(double first, double second) {
        return  (int)first ^ (int)second;
//        return b;
    }
}


