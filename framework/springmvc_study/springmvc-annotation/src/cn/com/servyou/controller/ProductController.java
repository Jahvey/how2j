package cn.com.servyou.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import cn.com.servyou.po.Product;

@Controller
public class ProductController {
	@RequestMapping("/addProduct")
	public ModelAndView add(Product product) throws Exception {//Product product 用于接受注入
		// 因为是服务端跳转，所以地址栏不会改变
		ModelAndView mv = new ModelAndView("showProduct");
		return mv;
	}
	
	@RequestMapping("/jump")
	public ModelAndView jump() {
		// 客户端跳转
		ModelAndView mv = new ModelAndView("redirect:/index");
		return mv;
	}
	
	//换了浏览器，就会重新计数--每个用户会有一个session
	@RequestMapping("/check") 
	public ModelAndView check(HttpSession session) {
		Integer i = (Integer) session.getAttribute("count");
		if (i == null) {
			i = 0;
		}
		i++;
		session.setAttribute("count", i);
		ModelAndView mv = new ModelAndView("check");
		return mv;
	}
	

}
