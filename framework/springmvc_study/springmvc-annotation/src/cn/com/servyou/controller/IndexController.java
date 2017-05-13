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
		//ModelAndView mv = new ModelAndView("/MyJsp.jsp");//指定返回的view
		ModelAndView mv = new ModelAndView("MyJsp");//视图定位
		mv.addObject("message", "Hello SpringMVC");//指定返回的数据
		return mv;
	}

}
