package com.spring.ex02;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

public class UserController extends MultiActionController {
	public ModelAndView login(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String userID = "";
		String passwd = "";
		ModelAndView mav = new ModelAndView();
		request.setCharacterEncoding("utf-8");
		userID = request.getParameter("userID");
		passwd = request.getParameter("passwd");

		mav.addObject("userID", userID);
		mav.addObject("passwd", passwd);
		mav.setViewName("result");
		return mav;
	}

}
