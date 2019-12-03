public class Calculate {
    public static void main(String[] arg) {
        System.out.println("Calculate...");
        int first = Integer.valueOf(arg[0]);
        int second = Integer.valueOf(arg[1]);
        int sum = first + second;
        int minus = first - second;
        int mal = first * second;
        float div = first / (float)second;
        int xxor = first ^ second;
        System.out.println("Sum : " + sum);
        System.out.println(String.format("%s + %s = %s", first, second, sum));
        System.out.println(String.format("%s - %s = %s", first, second, minus));
        System.out.println(String.format("%s * %s = %s", first, second, mal));
        System.out.println(String.format("%s / %s = %s", first, second, div));
        System.out.println(String.format("%s ^ %s = %s", first, second, xxor));
    }
}
