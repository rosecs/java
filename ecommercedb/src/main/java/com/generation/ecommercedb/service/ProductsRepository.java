package com.generation.ecommercedb.service;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.generation.ecommercedb.model.Product;

public interface ProductsRepository extends JpaRepository<Product, Long> {
	@Query("SELECT p FROM Product p WHERE p.nombre=?1")
	Optional<Product> findByNombre(String nombre);
}// interface ProductsRepository
