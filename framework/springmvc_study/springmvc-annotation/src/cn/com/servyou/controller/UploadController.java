package cn.com.servyou.controller;

import java.io.File;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang.xwork.RandomStringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import cn.com.servyou.po.UploadedImageFile;


@Controller
public class UploadController {
	
	@RequestMapping("/uploadImage")
	public ModelAndView upload(HttpServletRequest request, UploadedImageFile imageFile) throws IllegalStateException, IOException {
		
		String name = RandomStringUtils.randomAlphanumeric(10);
		String newFileName = name + ".jpg";
		File newFile = new File(request.getServletContext().getRealPath("/image"), newFileName);//request.getServletContext().getRealPath("/image") : 当前运行文件在服务器上的绝对路径
		newFile.getParentFile().mkdirs();
		imageFile.getImage().transferTo(newFile);//拷贝文件到服务器中
		//System.out.println("yyl "+imageFile.getImage());//为什么这类代码最终打印在了后台dos框中
					//如果用log.debug会不会打印到日志文件中
		ModelAndView mv = new ModelAndView("showUploadedFile");
		mv.addObject("imageName", newFileName);
		return mv;
	}

}
