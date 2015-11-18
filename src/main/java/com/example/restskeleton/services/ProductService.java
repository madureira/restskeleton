package com.example.restskeleton.services;

import com.example.restskeleton.models.Product;

/**
 * Responsible to retrieve the informations about the product.
 * 
 * @author madureira
 *
 */
public interface ProductService {

	/**
	 * Gets product given an id.
	 * 
	 * @param Integer id
	 * @return Product product
	 */
	Product getById(Integer id);

}
