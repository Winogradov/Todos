import java.util.Scanner;

@SuppressWarnings("ALL")
public class Todos {
    public static void main(String[] args) {
        String b = "Введите задачу";
        int n = 1;
        while (true) {
            System.out.println(b);
            Scanner sc = new Scanner(System.in);

            String s = sc.next();

            System.out.println(n + "." + s);
            n++;
            //String s1 = sc.next();
            if (s.equals("exit")) {
                break;
            }


        }

    }

    public class Color {
        public void Search() {

            String a = "Выберете задачу";
            int n = 1;
            while (true) {
                System.out.println(a);
                Scanner s = new Scanner(System.in);
                int number = s.nextInt();
                System.out.println("Вы выбрали задачу " + s);
            }

        }
    }
}