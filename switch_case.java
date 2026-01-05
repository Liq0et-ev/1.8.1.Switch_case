import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean go = true;

        while (go) {
            String ask = sc.nextLine();

            switch (ask) {
                case "comp":

                    break;

                case "decomp":
                    decomp();
                    break;

                case "about":
                    about();
                    break;

                case "exit":
                    exit();
                    go = false;
                    break;

                default:
                    System.out.println("wrong command");
                    break;
            }
        }

        sc.close();
    }

    private static void comp() {

    }

    private static void decomp() {

    }

    private static void about() {
        System.out.println("241RDB316  Vladislav Ebert 7.gruppa");
    }

    private static void exit() {
        System.out.println("Yipeee. It ends!");
    }
}
