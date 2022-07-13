import java.util.Scanner;

public class MainManagement {
    static Scanner scan=new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("----STYLINSON SPORTS JERSEYS & TEES----");
        System.out.println("---------------------------------------");
        System.out.println("\t\t1.Login");
        System.out.println("\t\t2.Create Account");
        System.out.println("\t\t0.Exit");
        System.out.println("Choose Your Role:");
        byte role= scan.nextByte();

        Login login=new Login();

        switch (role){
            case 1:
                login.commonLogin();
                break;
            case 2:
                login.customerSignUp();
                break;
            case 0:
                break;
            default:
                System.out.println("Invalid Choice!");
        }
    }
}