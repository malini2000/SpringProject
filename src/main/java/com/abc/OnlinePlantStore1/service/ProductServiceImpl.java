package com.abc.OnlinePlantStore1.service;

package com.abc.Onlineplantstore.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abc.onlinestore.entity.Product;
import com.abc.onlinestore.repository.ProductRepository;
@Service
public class ProductServiceImpl implements ProductService{
	@Autowired
	ProductRepository productRepository;
	

	@Override
	public List<Product> getallProduct() {
		// TODO Auto-generated method stub
		return productRepository.findAll();
	}

}