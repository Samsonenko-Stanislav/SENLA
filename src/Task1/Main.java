package Task1;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Введите предложение:");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int sum = 0;
        char chars[] = str.toCharArray();
        for (int i = 0; i < str.length(); i++ ){
            if (Character.isDigit(chars[i])){
                String t = Character.toString(chars[i]);
                sum += Integer.parseInt(t);
            }
        }
        System.out.println(sum);
    }
}


