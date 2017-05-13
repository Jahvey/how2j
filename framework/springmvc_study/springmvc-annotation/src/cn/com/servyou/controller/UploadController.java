package cn.com.servyou.controller;

import java.io.File;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang.xwork.RandomStringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import cn.com.servyou.po.UploadedImageFile;


@Controller
public class UploadController {
	
	@RequestMapping("/uploadImage")
	public ModelAndView upload(HttpServletRequest request, UploadedImageFile imageFile) {
		
		String name = RandomStringUtils.randomAlphanumeric(10);
		String newFileName = name + ".jpg";
		File newFile = new File(request.getServletContext().getRealPath("/image"), newFileName);
	}

}
