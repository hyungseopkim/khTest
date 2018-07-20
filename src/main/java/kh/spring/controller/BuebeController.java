package kh.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import kh.spring.dto.BuebeDTO;
import kh.spring.interfaces.BuebeService;

@Controller
public class BuebeController {
	@Autowired
	private BuebeService service;
	
	@RequestMapping("/write.do")
	public String wirte() {
		return "writeBoard.jsp";
	}
	
	@RequestMapping("/index.do")
	public String index() {
		return "index.jsp";
	}
	
	@RequestMapping("/writeBoard.do")
	public ModelAndView writeBoard(BuebeDTO dto) {
		ModelAndView mav = new ModelAndView();
		int result = service.insertData(dto);
		mav.addObject("result",result);
		mav.setViewName("writeBoardProc.jsp");
		return mav;
		
	}
	
	@RequestMapping("/board.do")
	public ModelAndView toBoard() {
		List<BuebeDTO> list = this.service.selectData();
		ModelAndView mav = new ModelAndView();
		mav.addObject("list", list);
		mav.setViewName("board.jsp");
		return mav;
	}
	
	@RequestMapping("/readArticle.do") 
	public ModelAndView toArticle(@RequestParam int seq) {
		BuebeDTO dto = this.service.getArticle(seq);
		ModelAndView mav = new ModelAndView();
		mav.addObject("result", dto);
		mav.setViewName("readArticle.jsp");
		return mav;
	}
}
