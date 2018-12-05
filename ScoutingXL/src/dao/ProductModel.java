package dao;

import entities.*;
import java.util.*;

public class ProductModel {
	
	public List<Product> findAll() {
		try {			
			List<Product> result = new ArrayList<Product>();
			result.add(new Product("Cameron", "R","420_69", 4911, 1, 2, 3, 1, 2, 3, 1, 1, 0, 0));
			return result;
		}catch (Exception e) {
			return null;			
		}
		
	}

}
