package com.klef.jfsd.exam;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {
	 public List<Product> getAllProducts() {
	        String apiUrl = "https://fakestoreapi.com/products";
	        RestTemplate restTemplate = new RestTemplate();
	        Product[] products = restTemplate.getForObject(apiUrl, Product[].class);
	        return Arrays.asList(products);
	    }
}
