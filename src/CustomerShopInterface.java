import java.util.Map;
import java.util.Scanner;

public class CustomerShopInterface {
    Scanner scan=new Scanner(System.in);
    public void customerPage() {

        System.out.println("----STYLINSON SPORTS JERSEYS & TEES----");
        System.out.println("---------------------------------------");
        System.out.println("\t\t1. View Shop");
        System.out.println("\t\t2. My Orders");
        System.out.println("\t\t3. View Profile");
        System.out.println("\t\t0. Exit");
        System.out.println("Enter Your Choice:");
        byte choice= scan.nextByte();
        switch (choice){
            case 1:
                viewShop();
                break;
            case 2:
                viewOrders();
                break;
            case 3:
                viewProfile();
                break;
            case 0:
                break;
            default:
                System.out.println("Invalid Choice!");
        }
    }

    public void viewShop() {
        System.out.println("----STYLINSON SPORTS JERSEYS & TEES----");
        System.out.println("---------------------------------------");
        System.out.println("------------------SHOP-----------------");
        for(Map.Entry<Long,JerseyPojo> viewshop:JerseyPojo.jerseyMap.entrySet()){
            JerseyPojo modelValues=viewshop.getValue();
            if(modelValues.getTotalStock()>0) {
                System.out.println("Model ID:" + viewshop.getKey());

                System.out.println("Model Name:" + modelValues.getModelName());
                System.out.println("Model Type:" + modelValues.getModelType());
                System.out.println("Available Sizes:" + modelValues.getModelSize());
                System.out.println("Model Price:" + modelValues.getJerseyPrice());
            }
        }
    }
    public void placeOrder(){

    }

    public void viewOrders() {
    }

    public void viewProfile() {
    }
}
