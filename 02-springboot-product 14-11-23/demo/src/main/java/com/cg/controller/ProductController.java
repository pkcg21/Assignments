package com.cg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.cg.entity.Product;
import com.cg.service.ProductService;

@Controller
public class ProductController {
	
	@Autowired
	ProductService service;
	
	@RequestMapping("/")
	 public String viewHomePage(Model model) {
		List<Product> listProducts=service.listAll();
		model.addAttribute("listProducts",listProducts);
		for(Product p:listProducts) {
			System.out.println("data"+p.getId()+p.getName());
		}
		return "index";
		
		
	
		 
	 }
	
	@RequestMapping("/new")
	public String showNewProductPage(Model model) {
		Product product=new Product();
		model.addAttribute("product",product);
		
		return"new_product";
		
	}
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String saveProduct(@ModelAttribute("product") Product product) {
	    service.save(product);
	    return "redirect:/";
	}
	@RequestMapping("/delete/{id}")
	public String deleteProduct(@PathVariable(name="id") Long id) {
		service.delete(id);
		return "redirect:/";
	}
	@RequestMapping("/edit/{id}")
	public ModelAndView showEditProductPage(@PathVariable(name="id") Long id) {
		ModelAndView mav=new ModelAndView("edit_product");
		Product product=service.get(id);
		mav.addObject("product",product);
		return mav;
	}
}
