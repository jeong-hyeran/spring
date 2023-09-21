package com.itbank.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.itbank.model.AccountDTO;
import com.itbank.model.ReviewDTO;
import com.itbank.service.ReviewService;

@Controller
@RequestMapping("/review")
public class ReviewController {

	@Autowired
	private ReviewService reviewService; 
	
	@GetMapping("/write")
	public void write() {}

	@PostMapping("/write")
	public String writer(ReviewDTO dto, HttpSession session) {
		AccountDTO login = (AccountDTO)session.getAttribute("login");
		dto.setAccount_idx(login.getIdx());
		dto.setWriter(login.getUsername());
		int idx = reviewService.write(dto);
		System.out.println(idx + "번 글이 추가되었습니다.");
		return "redirect:/review/view/"+idx;
	}
	
	@GetMapping("/list")
	public ModelAndView list() {
		ModelAndView mav = new ModelAndView();
		List<ReviewDTO> list = reviewService.selectAll();
		mav.addObject("list",list);
		return mav;
	}

	@GetMapping("/view/{idx}")
	public ModelAndView list(@PathVariable("idx") int idx) {
		ModelAndView mav = new ModelAndView("/review/view");
		ReviewDTO dto = reviewService.selectOne(idx);
		mav.addObject("dto",dto);
		return mav;
	}
	@GetMapping("/delete/{idx}")
	public ModelAndView delete(@PathVariable("idx")int idx) {
		ModelAndView mav = new ModelAndView("redirect:/review/list");
		reviewService.delete(idx);
		return mav;
	}
}
