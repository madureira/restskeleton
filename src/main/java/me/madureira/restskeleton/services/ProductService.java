package me.madureira.restskeleton.services;

import me.madureira.restskeleton.models.Product;

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
