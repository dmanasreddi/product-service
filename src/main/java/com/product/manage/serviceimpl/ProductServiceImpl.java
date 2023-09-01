package com.product.manage.serviceimpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.product.manage.entity.ProductEntity;
import com.product.manage.mapper.ProductEntityMapper;
import com.product.manage.mapper.ProductModelMapper;
import com.product.manage.model.ProductModel;
import com.product.manage.repository.ProductRepository;
import com.product.manage.service.ProductService;

import jakarta.transaction.Transactional;

@Transactional
@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepository productRepository;

	@Autowired
	private ProductModelMapper productModelMapper;

	@Autowired
	private ProductEntityMapper productEntityMapper;

	@Override
	public void createProduct(ProductModel productModel) {
		productRepository.save(productEntityMapper.modelToProductEntity(productModel));
	}

	@Override
	public void updateProduct(ProductModel productModel) {
		productRepository.save(productEntityMapper.modelToProductEntity(productModel));
	}

	@Override
	public void deleteByProductId(int productId) {
		productRepository.deleteById(productId);
	}

	@Override
	public ProductModel findByProductId(int productId) {
		Optional<ProductEntity> productEntityOptional = productRepository.findById(productId);
		if (productEntityOptional.isPresent()) {
			return productModelMapper.entityToProductModel(productEntityOptional.get());
		} else {
			throw new RuntimeException("product is not found for the given productId");
		}
	}

}
