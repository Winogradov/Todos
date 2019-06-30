import java.util.Scanner;

@SuppressWarnings("ALL")
public class Todos {
    public static void main(String[] args) {
        String b = "Введите задачу";
        int n = 1;
        while (true) {
            System.out.println(b);
            Scanner sc = new Scanner(System.in);

            String s = sc.nextLine();

            System.out.println(n + "." + s);
            n++;
        }
    }
}