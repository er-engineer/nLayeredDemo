package nLayeredDemo;

import nLayeredDemo.business.abstracts.ProductService;
import nLayeredDemo.business.concretes.ProductManager;
import nLayeredDemo.core.concretes.JLoggerManagerAdapter;
import nLayeredDemo.dataAccess.abstracts.ProductDao;
import nLayeredDemo.dataAccess.concretes.AnyProductDao;
import nLayeredDemo.dataAccess.concretes.HibernateProductDao;
import nLayeredDemo.entities.concretes.Product;

public class Main {

	public static void main(String[] args) {
		ProductService productService = new ProductManager(new HibernateProductDao(), 
				new JLoggerManagerAdapter());
		
		Product productA = new Product(0, 12, "Coffee", 2.99, 18);
		Product productB = new Product(1, 1, "Chair", 18.99, 35);
		
		productService.add(productA);
		productService.add(productB);

	}

}
