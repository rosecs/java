package org.generation.demo;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/api/products/")
public class ProductController {
	/*
	 * Create just one product
	@GetMapping
	public Product getProducts() {
		Product p = new Product("Plumon tinta fugaz","Plumon de tinta fugaz color verde para pintarrón","plumonVerde.jpg",25.0);
		return p ;
} // getProducts
*/
	//Create a list of products
	@GetMapping
	public List<Product> getProducts() {
		ArrayList<Product> lista = new ArrayList<Product>();
		lista.add( new Product("Plumon tinta fugaz","Plumon de tinta fugaz color verde para pintarrón","plumonVerde.jpg",25.0));
		lista.add( new Product("Plumon tinta fugaz especial","Plumon de tinta fugaz  especial color negro para pintarrón","plumonNegro.jpg",50.0));
		return lista;
} // getProducts
} // class productController
