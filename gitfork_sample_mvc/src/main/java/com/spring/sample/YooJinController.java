package com.spring.sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.spring.service.BoardService;
import com.spring.service.UserServiceYoojin;

@Controller
public class YooJinController {
	
	@Autowired
	private UserServiceYoojin userServiceYoojin;
	
	@RequestMapping(value = "/yoojin/yoojin", method = RequestMethod.GET)
	public ModelAndView yoojin() {
		ModelAndView mav = new ModelAndView();
		int yooJinCount = userServiceYoojin.getCount();
		mav.addObject("yooJinCount", yooJinCount);
		mav.setViewName("yooJinCount");
		
		return mav;
	}
}
