package com.example.restskeleton.services.impl;

import static java.util.Arrays.asList;

import org.springframework.stereotype.Component;

import com.example.restskeleton.models.Product;
import com.example.restskeleton.services.ProductService;

/**
 * {@inheritDoc}
 */
@Component("productService")
public class ProductServiceImpl implements ProductService {

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Product getById(Integer id) {
		Product product = new Product();
		product.setId(id);
		product.setName("Silent Hill 2");
		product.setDescription("Game Silent Hill 2");
		product.setKeywords(asList("silent hill 2", "game", "playstation 2", "xbox", "pc"));

		return product;
	}

}
