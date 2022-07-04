package com.spring.sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.spring.service.BoardService;

@Controller
public class PoongController {
	@Autowired
	private BoardService boardService;
	
	@RequestMapping(value = "/poong/poonghyeok", method = RequestMethod.GET)
	public ModelAndView poong() {
		ModelAndView mav = new ModelAndView();
		int countPoong = boardService.getCount();
		mav.addObject("poongCount", countPoong);
		mav.setViewName("poonghyeok");
		
		return mav;
	}
	
}
