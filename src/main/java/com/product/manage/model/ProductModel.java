package com.product.manage.model;

import java.time.LocalDate;

import jakarta.validation.constraints.NotBlank;

public class ProductModel {
	private int productId;
	@NotBlank(message="productName should not be found")
	private String productName;
	private String description;
	@NotBlank(message="price should not be found")
	private double price;
	private LocalDate manufacturedDate;
	private LocalDate expiryDate;

	private CategoryModel categoryModel;
	private ProductModel productModel;

	public ProductModel() {
		super();
	}

	public ProductModel(int productId, String productName, String description, double price, LocalDate manufacturedDate,
			LocalDate expiryDate, CategoryModel categoryModel, ProductModel productModel) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.description = description;
		this.price = price;
		this.manufacturedDate = manufacturedDate;
		this.expiryDate = expiryDate;
		this.categoryModel = categoryModel;
		this.productModel = productModel;
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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public LocalDate getManufacturedDate() {
		return manufacturedDate;
	}

	public void setManufacturedDate(LocalDate manufacturedDate) {
		this.manufacturedDate = manufacturedDate;
	}

	public LocalDate getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(LocalDate expiryDate) {
		this.expiryDate = expiryDate;
	}

	public CategoryModel getCategoryModel() {
		return categoryModel;
	}

	public void setCategoryModel(CategoryModel categoryModel) {
		this.categoryModel = categoryModel;
	}

	public ProductModel getProductModel() {
		return productModel;
	}

	public void setProductModel(ProductModel productModel) {
		this.productModel = productModel;
	}

	@Override
	public String toString() {
		return "ProductModel [productId=" + productId + ", productName=" + productName + ", description=" + description
				+ ", price=" + price + ", manufacturedDate=" + manufacturedDate + ", expiryDate=" + expiryDate
				+ ", categoryModel=" + categoryModel + ", productModel=" + productModel + "]";
	}

	public void setProductTypeModel(ProductTypeModel entityToProductTypeModel) {
		// TODO Auto-generated method stub
		
	}

	public ProductTypeModel getProductTypeModel() {
		// TODO Auto-generated method stub
		return null;
	}

	
}
