package net.codejava;

import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class ProductService {
	@Autowired
	private ProductRepository repo;

//	Display all products
	public List<Product> listAll() {
		return repo.findAll();
	}

//	Create
	public void save(Product product) {
		repo.save(product);
	}

//	Display 1 product
	public Product get(Integer id) {
		return repo.findById(id).get();
	}

//	Delete
	public void delete(Integer id) {
		repo.deleteById(id);
	}
}