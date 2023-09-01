package com.product.manage.exception;

@SuppressWarnings("serial")
public class ProductNotFound extends RuntimeException{
	 public ProductNotFound(String message){
		    super(message);
		  }
}
