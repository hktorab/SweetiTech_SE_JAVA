package com.humayun.SweetTech.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ProductCategory {
    @Id
    private int ProductCategoryId;
    private String ProductCategoryName;


    public ProductCategory( int productCategoryId,String productCategoryName) {
        ProductCategoryName = productCategoryName;
        ProductCategoryId = productCategoryId;
    }

    @Override
    public String toString() {
        return "ProductCategory{" +
                "ProductCategoryId=" + ProductCategoryId +
                ", ProductCategoryName='" + ProductCategoryName + '\'' +
                '}';
    }

    public ProductCategory() {
    }

    public String getProductCategoryName() {
        return ProductCategoryName;
    }

    public void setProductCategoryName(String productCategoryName) {
        ProductCategoryName = productCategoryName;
    }

    public int getProductCategoryId() {
        return ProductCategoryId;
    }

    public void setProductCategoryId(int productCategoryId) {
        ProductCategoryId = productCategoryId;
    }
}
