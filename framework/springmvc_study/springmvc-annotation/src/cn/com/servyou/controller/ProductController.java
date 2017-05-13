package cn.com.servyou.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import cn.com.servyou.po.Product;

@Controller
public class ProductController {
	@RequestMapping("/addProduct")
	public ModelAndView add(Product product) throws Exception {//Product product ���ڽ���ע��
		// ��Ϊ�Ƿ������ת�����Ե�ַ������ı�
		ModelAndView mv = new ModelAndView("showProduct");
		return mv;
	}
	
	@RequestMapping("/jump")
	public ModelAndView jump() {
		// �ͻ�����ת
		ModelAndView mv = new ModelAndView("redirect:/index");
		return mv;
	}
	
	//������������ͻ����¼���--ÿ���û�����һ��session
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
