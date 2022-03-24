package com.generation.ecommercedb;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.generation.ecommercedb.model.Product;

//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
//import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
//import static org.hamcrest.Matchers.containsString;


import org.springframework.http.MediaType;


@SpringBootTest
@AutoConfigureMockMvc
class EcommercedbApplicationTests {

	@Autowired
	private MockMvc mockMvc;
	
	@Test
	public void testPost() throws Exception {
		Product p = new Product();
		p.setName("Plumón tinta fugaz pequeño 1");
		p.setDescription("Plumón tinta fugaz pequeño color azul para pintarrón");
		p.setUrl_image("plumonVerde.jpg");
		p.setPrice(21.00);
		this.mockMvc.perform(post("/api/productos/").header("Authorization", "Bearer eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmZWxpcGUiLCJyb2xlIjoidXNlciIsImlhdCI6MTY0NjI0MTc1NSwiZXhwIjoxNjQ2Mjc3NzU1fQ.49hz9PQNGQ5gk2xKVBmcRV-wv6PjR4doS9wqcLYEpDA").contentType(MediaType.APPLICATION_JSON).content(asJsonString(p))).andExpect(status().isOk());
	}
	
	// El jackson serializa un objeto, pero hay una manera más sencilla
	// El RequestBody recibe los objetos como json y lo deserializa, yo creo que con el jackson
	
	//Serializa un objecto
	public static String asJsonString(final Object obj) {
		try {return new ObjectMapper().writeValueAsString(obj);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}//catch
	}//asJsonString

}
