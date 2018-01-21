package com.humayun.SweetTech.Model;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Product {
   @Id
private int productId;
private String productName;
private String productCategory;
private String productModel;
private double productPrice;

   public Product(int productId, String productName, String productCategory, String productModel, double productPrice) {
      this.productId = productId;
      this.productName = productName;
      this.productCategory = productCategory;
      this.productModel = productModel;
      this.productPrice = productPrice;
   }

   public Product() {
   }

   public int getProductId() {
      return productId;
   }

   public void setProductId(int productId) {
      this.productId = productId;
   }

   public String getProductName() {
      return productName;
   }

   public void setProductName(String productName) {
      this.productName = productName;
   }

   public String getProductCategory() {
      return productCategory;
   }

   public void setProductCategory(String productCategory) {
      this.productCategory = productCategory;
   }

   public String getProductModel() {
      return productModel;
   }

   public void setProductModel(String productModel) {
      this.productModel = productModel;
   }

   public double getProductPrice() {
      return productPrice;
   }

   public void setProductPrice(double productPrice) {
      this.productPrice = productPrice;
   }
}
