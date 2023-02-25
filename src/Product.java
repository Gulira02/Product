import java.time.LocalDate;

public class Product {


  //  protected Object products;
    ProductType productType;
    private String name;
    private String description; //Описание
    private int price;
    private LocalDate madeOfDate;

    public Product(String name, String description, int price, LocalDate madeOfDate) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.madeOfDate = madeOfDate;
    }

    public Product() {
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public LocalDate getMadeOfDate() {
        return madeOfDate;
    }

    public void setMadeOfDate(LocalDate madeOfDate) {
        this.madeOfDate = madeOfDate;
    }

    public ProductType getProductType() {
        return productType;
    }

    public void setProductType(ProductType productType) {
        this.productType = productType;
    }



    @Override
    public String toString() {
        return "Product{" +
                "productType=" + productType +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", madeOfDate=" + madeOfDate +
                '}';
    }



}
