package cn.com.servyou.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {

	@RequestMapping("/index")
	public ModelAndView handleRequest(HttpServletRequest request,
		HttpServletResponse response) throws Exception {
		//ModelAndView mv = new ModelAndView("/MyJsp.jsp");//ָ�����ص�view
		ModelAndView mv = new ModelAndView("MyJsp");//��ͼ��λ
		mv.addObject("message", "Hello SpringMVC");//ָ�����ص�����
		return mv;
	}

}
