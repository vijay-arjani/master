package com.web.controller;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.dao.DbConnection;
import com.domain.product.ProductMaster;
import com.domain.shopDepartment.ContactUs;
import com.domain.shopDepartment.Shop;
import com.domain.shopDepartment.ShopOrder;

import service.serviceImp.productServiceImpl;

@Controller

public class HomeController {

	public static final String login_page = "login.html";
	public static final String home_page = "index.html";

	@RequestMapping("/")
	String log() {
		return login_page;
	}

	@RequestMapping("/getDashbord")
	String login(String string) {

		return home_page;
	}

	@RequestMapping("/product")
	ModelAndView productdetals(ProductMaster location) {
		ModelAndView andView = new ModelAndView();
		productServiceImpl.save(location);
		andView.setViewName(home_page);

		return andView;
	}

	@RequestMapping("/shop")
	ModelAndView shopDetail(Shop shop) {
		SessionFactory factory = DbConnection.getSessionFectory();
		Session session = factory.openSession();

		ModelAndView andView = new ModelAndView();
		session.save(shop);
		session.beginTransaction().commit();
		andView.setViewName(home_page);

		return andView;
	}

	@RequestMapping("shopOrder")

	ModelAndView order(ShopOrder order) {
		ModelAndView andView = new ModelAndView();
		productServiceImpl.save(order);
		andView.setViewName(home_page);

		return andView;
	}

//	@RequestMapping("contact")
//
//	ModelAndView order(ContactUs contact) {
//		ModelAndView andView = new ModelAndView();
//		productServiceImpl.save(contact);
//		andView.setViewName(home_page);
//
//		return andView;
//	}

}
