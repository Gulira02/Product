import java.time.LocalDate;
import java.util.Arrays;

public class Inventory extends Product {

    private Product[] products;
    ProductType productType;


    public Inventory(String name, String description, int price, LocalDate madeOfDate, ProductType productType) {
        super(name, description, price, madeOfDate);

        this.productType = productType;
    }

    public Inventory(){}
    public Product[] getProducts() {
        return products;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }

    @Override
    public ProductType getProductType() {
        return productType;
    }

    @Override
    public void setProductType(ProductType productType) {
        this.productType = productType;
    }

    Product getProduct(String productName) {
        for (Product product : products) {
            if (productName.equals(product.getName())) {
                return product;
            } else {
                System.out.println("Нет токого продукта");
            }
        }
        return null;
    }

    Product getProductByTypes(String productType) {
        for (Product product : products) {
            if (product.getProductType().name().equals(productType.toUpperCase())) {
                return product;
            } else {
                System.out.println("No this types");
            }
        }
        return null;
    }

    Product ProductDay() {

        LocalDate now = LocalDate.of(2023, 02, 12);
        for (Product productDay : products) {
            if (now == getMadeOfDate()) {
                ProductType vegetables = ProductType.VEGETABLES;
                System.out.println("Просроченный товар");
            } else {
                ProductType vegetables = ProductType.VEGETABLES;
                System.out.println("Не просроченный товар");
            }

        }
        return null;
    }


    Product ElectronicClothes() {

        LocalDate now1 = LocalDate.of(2022, 05, 01);
        LocalDate now2 = LocalDate.of(2022, 04, 25);
        for (Product productDay : products) {
            if (now1 == getMadeOfDate()||now2==getMadeOfDate()) {
                ProductType electronics = ProductType.ELECTRONICS;
                ProductType clothes = ProductType.CLOTHES;
                System.out.println("50% скидка");
            } else {

                ProductType electronics = ProductType.ELECTRONICS;
                ProductType clothes = ProductType.CLOTHES;
                System.out.println(" скидка нет");            }

        }
        return null;
    }
// Arrays.toString(products) +
    @Override
    public String toString() {
        return "Inventory{" +
                "products:  " +super.toString()+"\n" +
                "productType: " + productType +"\n"+
                '}';
    }
}
