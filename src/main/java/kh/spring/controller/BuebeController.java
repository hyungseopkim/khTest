package kh.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import kh.spring.interfaces.BuebeService;

@Controller
public class BuebeController {
	/*@Autowired
	private BuebeService service;*/
	
	@RequestMapping("/write.do")
	public String wirte() {
		return "writeBoard.jsp";
	}
	@RequestMapping("/index.do")
	public String index() {
		return "index.jsp";
	}
}
