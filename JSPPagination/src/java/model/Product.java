package model;

public class Product {  
    private int productID;
    private String name;
    private int quantity;
    private int price;
    private int categoryID;
 
    public Product(){}
    /**
     * Get the value of productID
     *
     * @return the value of productID
     */
    public int getProductID() {
        return productID;
    }

    /**
     * Set the value of productID
     *
     * @param productID new value of productID
     */
    public void setProductID(int productID) {
        this.productID = productID;
    }

    /**
     * Get the value of name
     *
     * @return the value of name
     */
    public String getName() {
        return name;
    }

    /**
     * Set the value of name
     *
     * @param name new value of name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Get the value of quantity
     *
     * @return the value of quantity
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * Set the value of quantity
     *
     * @param quantity new value of quantity
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    /**
     * Get the value of price
     *
     * @return the value of price
     */
    public int getPrice() {
        return price;
    }

    /**
     * Set the value of price
     *
     * @param price new value of price
     */
    public void setPrice(int price) {
        this.price = price;
    }

    /**
     * Get the value of categoryID
     *
     * @return the value of categoryID
     */
    public int getCategoryID() {
        return categoryID;
    }

    /**
     * Set the value of categoryID
     *
     * @param categoryID new value of categoryID
     */
    public void setCategoryID(int categoryID) {
        this.categoryID = categoryID;
    }

}

