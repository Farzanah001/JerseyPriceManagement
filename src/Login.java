import java.util.ArrayList;
import java.util.Scanner;

public class Login {
    //admin login details
    static final String adminUser="admin";
    static final String adminPass="admin123";

    //customer login details
//    static final String custUser="customer1";
//    static final String custPass="cust123";

    static ArrayList<UserPojo> customerList=new ArrayList<>();

    Scanner scan=new Scanner(System.in);
    public void adminLogin() {
        System.out.println("----STYLINSON SPORTS JERSEYS & TEES----");
        System.out.println("---------------------------------------");
        System.out.println("\t\t1.Add New Design");
        System.out.println("\t\t2.Edit Design");
        System.out.println("\t\t3.Remove Design");
        System.out.println("\t\t4.View All Products");
        System.out.println("\t\t0.Exit");
        System.out.println("Choose Your Role:");
        byte role= scan.nextByte();
        JerseyManagement jersey=new JerseyManagement();
        switch (role){
            case 1:
                jersey.addJersey();
                break;
            case 2:
                jersey.editJersey();
                break;
            case 3:
                jersey.removeJersey();
                break;
            case 4:
                jersey.viewJersey();
                break;
            case 0:
                break;
            default:
                System.out.println("Invalid Input!");
            }
        }
    public void customerSignUp() {
        UserPojo user=new UserPojo();
        System.out.println("Enter the Username:");
        user.setUserName(scan.next());
        System.out.println("Enter Your Name:");
        user.setName(scan.nextLine());
        System.out.println("Enter Your Password:");
        user.setPassword(scan.next());
        System.out.println("Enter Your Mobile Number");
        user.setMobile(scan.nextLong());
        customerList.add(user);
    }

    public void commonLogin() {
        System.out.println("Enter the UserName:");
        String user=scan.next();
        System.out.println("Enter the Password:");
        String pass= scan.next();
        if(customerList.contains(user)&&customerList.contains(pass)){
            new CustomerShopInterface().customerPage();
        }
        else if (user.equals(adminUser) && pass.equals(adminPass)){
            adminLogin();
        }
        else{
            System.out.println("Invalid Username or Password!");
            //commonLogin();
            System.out.println("Do You Want to Create An Account?(y/n)");
            char res=scan.next().charAt(0);
            if(res=='y'){
                customerSignUp();
            }
            else if (res=='n'){
                commonLogin();
            }
            else {
                System.out.println("Invalid Input. Type either 'y' or 'n'!!");
            }
        }
    }


}
