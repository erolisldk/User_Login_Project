import java.util.Scanner;

public class LoginMain {


    public static void main(String[] args) {
        start();
    }

    public static void start() {
        //menuyu busan baslatir
        Scanner scanner = new Scanner(System.in);
        UserService userService = new UserService();
        int select;

        do {
            userService.showMenu();
            select=scanner.nextInt();
            switch (select) {
                case 1:
                    userService.register();
                    break;
                case 2:
                    userService.login();
                    break;
                case 3:
                    System.out.println("Iyi Gunler dileriz");
                    break;
                default:
                    System.out.println("Hatali Giris Yaptiniz Yeniden Deneyiniz");

            }
        }while (select != 3) ;


    }
}

