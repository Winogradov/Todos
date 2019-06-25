import java.util.Scanner;

public class Todos {
    public static void main(String[] args) {
        System.out.println("Введите задачу");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println("1." + s);
    }
}
