package org.Generation.ecommerce.products;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

@Service
public class ProductService {
	public final ArrayList<Product> lista = new ArrayList<Product>();
	
	public ProductService() {
		lista.add( new Product("Plumon tinta fugaz","Plumon de tinta fugaz color verde para pintarrón","plumonVerde.jpg",25.0));
		lista.add( new Product("Plumon tinta fugaz especial","Plumon de tinta fugaz  especial color negro para pintarrón","plumonNegro.jpg",50.0));
		lista.add( new Product("Cuaderno Profesional cuadro chico","Cuaderno Profesional cuadro chico con espiral Norma","cuadernocc.jpg",70.0));
		lista.add( new Product("Borrador pintarrón", 
				"Borrador para pintarrón de tinta fugaz", 
				"borradorB.jpg", 45.0)
				);
		lista.add( new Product("Cuaderno profesional cuadro chico", 
				"Cuaderno profesional cuadro chico Norma", 
				"NormaCuadroChico.jpg", 78.0)
				);

	} //constructor
	
	public ArrayList<Product> getProducts(){
		return lista;
	} // getProducts
	
	public Product getProduct(Long prodId){
		Product tmpProd = null;
		for (Product prod : lista) {
			if (prod.getId() == prodId) {
				tmpProd = prod;
			}// if
		} // for each
		return tmpProd;
	} // getProduct
	
	public void deleteProduct(Long prodId){
		for (Product prod : lista) {
			if (prod.getId() == prodId) {
				lista.remove(prod);
				break;
			}// if
		} // for each
	} // deleteProduct
	
	public void addProduct(Product prod) {
		lista.add(prod);
	} // addProduct
	
	public void updateProduct(Long prodId, String name, String description, double price, String url_image) {
		for (Product prod : lista) {
			if (prod.getId() == prodId) {
				if (name!=null) prod.setName(name);
				if (description!=null) prod.setDescription(description);
				if (price!=0) prod.setPrice(price);
				if (url_image!=null) prod.setUrl_image(url_image);
			}//if
		} // for
	} // updateProduct	
} // productService class
