import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {


     Inventory inventory1=new Inventory("tomato","Помидор - один из самых популярных овощей в мире" ,100,
             LocalDate.now(),ProductType.VEGETABLES);

     Inventory inventory2=new Inventory("jeans","Джи́нсы - брюки из плотной хлопчатобумажной ткани с проклёпанными стыками швов на карманах.",
             2500, LocalDate.now(),ProductType.CLOTHES);


     Inventory inventory3=new Inventory("phone"," Телефон- аппарат для передачи и приёма звука  на расстоянии.",
             2508, LocalDate.now(),ProductType.ELECTRONICS);


        Inventory[] inventories = {inventory1,inventory2,inventory3};
        for (Product product :inventories ) {
            System.out.println(product);
        }

        System.out.println("------------------------------------------");
        System.out.println(inventory1.getProduct(inventory1.getName()));
        /*inventory2.getProduct(inventory1.getName());
        inventory3.getProduct(inventory1.getName());*/


        System.out.println("-------------------------");

    }




}


