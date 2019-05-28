import java.util.Scanner;


/**
 * Created by OUT-Akopyan-SR on 28.05.2019.
 */
public class Program {
    public static void main(String[] args) {
        int b;
        double sum = 0;
        int value = 0;
        char c;

        Scanner in = new Scanner(System.in);
        System.out.println("Введите число в бинарном формате: ");
        String bin = in.nextLine();
        for (int i = 0; i < bin.length(); i++) {
            c = (bin.charAt(i));
            b = Character.getNumericValue(c);
            int u = (bin.length() - 1 - i);
            sum = sum + b * (Math.pow(2, u));
            value = (int) sum;


        }
        System.out.println(value);

    }
}
