package app.model;

import java.util.Collection;

/**
 * Created on 20/03/2016.
 *
 * @author Arthur
 */
public class Product {
    public String label;
    public String description;
    public ProductCategory category;

    public Product(String label, String description, ProductCategory category) {
        this.label = label;
        this.description = description;
        this.category = category;
    }

    public Product() {
    }

    public  void offerProduct(Seller seller, double prix){
        /**
         * TODO complete this method
         */
    }

    public  void requestQuote(User by, int quantity, String comment){
        /**
         * TODO complete this method
         */
    }

    public  Collection<Offer> getOffers(){
        /**
         * TODO complete this method
         */
        return null;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public ProductCategory getCategory() {
        return category;
    }

    public void setCategory(ProductCategory category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return  "(" + getCategory() + ") " + getLabel();
    }
}
