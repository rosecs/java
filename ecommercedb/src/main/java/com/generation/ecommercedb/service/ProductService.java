package com.generation.ecommercedb.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.generation.ecommercedb.model.Product;

@Service
public class ProductService {
	private final ProductsRepository productsRepository;
	@Autowired
	public ProductService(ProductsRepository productsRepository) {
		this.productsRepository = productsRepository;
	} // constructor

	public List<Product> getProducts() {
		return productsRepository.findAll();
	}

	public Product getProduct(Long prodId) {
		return productsRepository.findById(prodId).
				orElseThrow(() -> new IllegalStateException("The product with the Id" + prodId + "doesn't exist." ));		
	}

	public void updateProduct(Long prodId, String name, String description, double price, String url_image) {
		if(productsRepository.existsById(prodId)) {
			Product p = productsRepository.getById(prodId);
			if (name != null) p.setName(name);
			if (description != null) p.setDescription(description);
			if (price != 0 ) p.setPrice(price);
			if (url_image != null) p.setUrl_image(url_image);
			productsRepository.save(p);
		} else {
			System.out.println("The Id doesn´t exists " + prodId);
			System.err.println("*The Id doesn´t exists " + prodId);
		}
	}
		
	public void addProduct(Product prod) {
		Optional<Product> prodByName = 
				productsRepository.findByNombre(prod.getName());
		if (prodByName.isPresent()) {
			throw new IllegalStateException("The product called" + "[" + prod.getName() + "] it alredy exists."  );
		} else {
			productsRepository.save(prod);
		} // else if
	}// addProduct
	
	public void deleteProduct(Long prodId) {
		if (productsRepository.existsById(prodId)) {
			productsRepository.deleteById(prodId);
		} // if exist
	} // deleteProduct
	
}
