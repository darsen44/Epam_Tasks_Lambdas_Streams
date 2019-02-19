package task1;

public class Task1 {
    public static void main(String[] args) {
        ThreeArgInt max =
                (a,b,c) -> (a>b) && (a>c) ? a :(b > c ? b : c);
        ThreeArgInt avr =
                (a,b,c) -> ((a + b + c)/3);
        System.out.println(max.method(12,14,43));
        System.out.println(avr.method(34,33,76));
    }
}
