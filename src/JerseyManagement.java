import java.util.*;

public class JerseyManagement {

    Scanner scan=new Scanner(System.in);



    public void addJersey() {
        System.out.println("Enter the Number of Designs You Want to Create:");
        int designCount=scan.nextInt();
        for(int i=0;i<designCount;i++){
            JerseyPojo jersey=new JerseyPojo();
            System.out.println("Enter the Jersey Model Name:");
            scan.nextLine();
            jersey.setModelName(scan.nextLine());
            System.out.println("Enter the Model Type:");
            jersey.setModelType(scan.nextLine());
            System.out.println("Available Sizes:");
            System.out.println("Enter the No. Of Sizes Available:");
            byte sizeCount= scan.nextByte();
            ArrayList<String> sizeList=new ArrayList<>();
            System.out.println("Enter the Sizes:");
            for(int j=0;j<sizeCount;j++){
                sizeList.add(scan.next());
            }
            jersey.setModelSize(sizeList);
            System.out.println("Enter the Jersey Price:");
            jersey.setJerseyPrice(scan.nextInt());
            System.out.println("Enter the Total Stock:");
            jersey.setTotalStock(scan.nextInt());
            JerseyPojo.jerseyMap.put(jersey.getModelID(),jersey);
        }
    }

    public void editJersey() {
        JerseyPojo jersey=new JerseyPojo();
        System.out.println("Enter Model ID:");
        long id= scan.nextLong();
        Map.Entry jEntry=null;
        for(Map.Entry jerseyList: JerseyPojo.jerseyMap.entrySet()){
            if(jerseyList.getKey().equals(id)){
                jEntry=jerseyList;
                break;
            }
        }
        if(jEntry!=null){
            System.out.println("Enter the Jersey Model Name:");
            jersey.setModelName(scan.nextLine());
            System.out.println("Enter the Model Type:");
            jersey.setModelType(scan.nextLine());
            System.out.println("Enter the Available Sizes:");
            System.out.println("Enter the No. Of Sizes Available:");
            byte sizeCount= scan.nextByte();
            ArrayList<String> sizeList=new ArrayList<>();
            System.out.println("Enter the Sizes:");
            for(int j=0;j<sizeCount;j++){
                sizeList.add(scan.next());
            }
            jersey.setModelSize(sizeList);
            System.out.println("Enter the Jersey Price:");
            jersey.setJerseyPrice(scan.nextInt());
            System.out.println("Enter the Total Stock:");
            jersey.setTotalStock(scan.nextInt());
            JerseyPojo.jerseyMap.put(jersey.getModelID(),jersey);
        }
        else{
            System.out.println("Given ID Not Found!Please Try Again!");
            editJersey();
        }
    }

    public void removeJersey() {
        JerseyPojo jersey=new JerseyPojo();
        System.out.println("Enter the Model ID to delete:");
        long id= scan.nextLong();
        if(JerseyPojo.jerseyMap.containsKey(id)){
            JerseyPojo.jerseyMap.remove(jersey.getModelID(),jersey);
        }
        else{
            System.out.println("Given ID Not Found! Please Try Again!");
            removeJersey();
        }
    }

    public void viewJersey() {
        System.out.println("----STYLINSON SPORTS JERSEYS & TEES----");
        System.out.println("---------------------------------------");
        System.out.println("------------------SHOP-----------------");
        for(Map.Entry<Long,JerseyPojo> viewshop:JerseyPojo.jerseyMap.entrySet()){
            JerseyPojo modelValues=viewshop.getValue();

            System.out.println("Model ID:" + viewshop.getKey());

            System.out.println("Model Name:" + modelValues.getModelName());
            System.out.println("Model Type:" + modelValues.getModelType());
            System.out.println("Available Sizes:" + modelValues.getModelSize());
            System.out.println("Model Price:" + modelValues.getJerseyPrice());
            System.out.println("Total Stock:"+modelValues.getTotalStock());
        }
    }
}
