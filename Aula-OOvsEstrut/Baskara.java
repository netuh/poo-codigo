import java.util.Scanner;

public class Baskara {
    public static void main(String[] args) {
        double a, b, c;
        double delta, x1, x2;
        Scanner s = new Scanner (System.in);

        System.out.println("digite a:");
        a = s.nextFloat();
        System.out.println("digite b:");
        b = s.nextFloat();
        System.out.println("digite c:");
        c = s.nextFloat();

        delta = b*b - 4*a*c;
        x1 = (-b + Math.sqrt(delta))/2*a;
        x2 = (-b - Math.sqrt(delta))/2*a;
        System.out.println("raiz x1 "+x1);
        System.out.println("raiz x2 "+x2);
    }
}