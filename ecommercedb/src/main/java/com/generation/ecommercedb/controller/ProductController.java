package com.generation.ecommercedb.controller;

import java.util.List;

import com.generation.ecommercedb.model.Product;
import com.generation.ecommercedb.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/api/products/")
@CrossOrigin(origins="http://localhost:8080")
public class ProductController {
	private final ProductService prodService;
	@Autowired
	public ProductController(ProductService prodService) {
		this.prodService = prodService;
	} // constructor
	
	@GetMapping
	public List<Product> getProducts() {
		return prodService.getProducts();
	} // getProduct
	
	@GetMapping(path = "{prodId}")
	public Product getProduct(@PathVariable("prodId") Long prodId) {
		return prodService.getProduct(prodId);
	} // getProduct
	
	@PostMapping(path = "{prodId}")
	public void postProduct() {} // addProduct
	
	@PutMapping(path = "{prodId}")
	public void updateProduct(@PathVariable("prodId") Long prodId,
		@RequestParam(required = false) String name,
		@RequestParam(required = false) String description,
		@RequestParam(required = false) double price,
		@RequestParam(required = false) String url_image) {
		prodService.updateProduct(prodId,name,description,price,url_image);
	} // updateProduct
	
	@DeleteMapping(path = "{prodId}")
	public void deleteProduct(@PathVariable("prodId") Long prodId) {
		prodService.getProduct(prodId);
	} // deleteProduct

}
