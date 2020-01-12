package service.serviceImp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.dao.DbConnection;
import com.domain.product.ProductLocation;
import com.domain.shopDepartment.Shop;

import service.ProductDetailService;

public class productServiceImpl implements ProductDetailService {
	public static void save(Object location) {
		SessionFactory factory = DbConnection.getSessionFectory();
		Session session = factory.openSession();
		session.save(location);
		session.beginTransaction().commit();
	}

}
