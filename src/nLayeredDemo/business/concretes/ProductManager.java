package nLayeredDemo.business.concretes;

import java.util.List;

import nLayeredDemo.business.abstracts.ProductService;
import nLayeredDemo.core.abstracts.LoggerService;
import nLayeredDemo.dataAccess.abstracts.ProductDao;
import nLayeredDemo.entities.concretes.Product;

public class ProductManager implements ProductService{
	//Abstraction
	//Independent injection via constructor.
	private ProductDao productDao;
	private LoggerService loggerService;
	
	public ProductManager(ProductDao productDao, LoggerService loggerService) {
		this.productDao = productDao;
		this.loggerService = loggerService;
	}
	
	@Override
	public void add(Product product) {
		//Rules here to add new product to database.
		if(product.getCategoryId() == 12) {
			System.out.println("Item cannot be added to this category: " + product.getCategoryId());
			return;
		}
		this.productDao.add(product);
		loggerService.log("Item added, " + product.getName());
	
	}

	@Override
	public List<Product> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
