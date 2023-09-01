package com.product.manage.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.product.manage.model.ProductModel;
import com.product.manage.service.ProductService;

@RestController
@RequestMapping("/api/v1/product")
public class ProductController {

	@Autowired
	private ProductService productService;

	@PostMapping("/create")
	public void createProduct(@RequestBody ProductModel productModel) {
		productService.createProduct(productModel);
	}

	@PutMapping("/update")
	public void updateProduct(@RequestBody ProductModel productModel) {
		productService.updateProduct(productModel);
	}

	@DeleteMapping("/deleteByProductId/{ProductId}")
	public void deleteProduct(@PathVariable int ProductId) {
		productService.deleteByProductId(ProductId);
	}

	@GetMapping("/findByProductId/{ProductId}")
	public ProductModel findByProductId(@PathVariable int ProductId) {
		return productService.findByProductId(ProductId);

	}

}
