package com.abc.OnlinePlantStore1.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.abc.onlinestore.entity.Product;

@Service
public interface ProductService {
	public List<Product>getallProduct();

}