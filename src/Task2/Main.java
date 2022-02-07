package Task2;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Введите натуральное число");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = n;
        System.out.print(n + " = ");
        for (int d = 2; d <= Math.sqrt(n); d++){
            while (a % d == 0){
                System.out.print(d+ " * ");
                a /= d;
            }
        }
        if (a != 1){
            System.out.println(a);
        }
    }
}
