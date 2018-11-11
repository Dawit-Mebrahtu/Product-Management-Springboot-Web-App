package mum.swe.democrud.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mum.swe.democrud.model.Product;
import mum.swe.democrud.repository.ProductRepository;
import mum.swe.democrud.service.ProductService;

@Service("studentService")
public class ProductServiceImpl implements ProductService {

	@Autowired
	ProductRepository studentRepository;
	
	@Override
	public List<Product> findAll() {
		return studentRepository.findAll();
	}

	@Override
	public Product save(Product product) {
		return studentRepository.save(product);
	}

	@Override
	public Product findOne(Long id) {
		return studentRepository.findOne(id);
	}

	@Override
	public void delete(Long id) {
		studentRepository.delete(id);
	}

}
