package com.itbank.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.itbank.model.Board3DTO;
import com.itbank.repository.Board3DAO;

@Controller
public class Board3Controller {
	// 컨트롤러의 함수 반환형을 결정하기
	
	// 1) DB에서 불러온 데이터 혹은 다른 데이터를 JSP에게 넘겨줘야 하는가?
	// yes -> ModelAndView
	
	// 2) 요청 주소와 JSP의 이름이 일치하는가?
	// yes -> void, no -> String
	
	@Autowired 
	private Board3DAO dao;
	
	@GetMapping("/add")
	// 폼태그로 입력받아야한다.
	public void add(){}
	
	@PostMapping("/add")
	// add.jsp에서  폼 태그로 입력 받아서 list.jsp로 리다이렉크해줘야한다.
	public String insert(Board3DTO dto) {
		int row;
		row = dao.insert(dto);
		System.out.println(row + "행이 추가되었습니다.");
		return "redirect:/list";
	}
	
	@GetMapping("/list")
	public ModelAndView list() {
		ModelAndView mav = new ModelAndView();
		List<Board3DTO> list = dao.selectList();
		mav.addObject("list",list);
		return mav;
	}
	
	@PostMapping("/list")
	public ModelAndView search(String search) {
		ModelAndView mav = new ModelAndView("searchlist");
		List<Board3DTO> list = dao.searchList(search);
		mav.addObject("list",list);
		return mav;
	}
	
	@GetMapping("/view/{idx}")
	public ModelAndView view(@PathVariable("idx") int idx) {
		ModelAndView mav = new ModelAndView("view");
		Board3DTO dto = dao.selectOne(idx);
		mav.addObject("dto",dto);
		return mav;
	}
	
	@GetMapping("/update/{idx}")
	public ModelAndView update(@PathVariable("idx") int idx) {
		ModelAndView mav = new ModelAndView("update");
		Board3DTO dto = dao.selectOne(idx);
		mav.addObject("dto",dto);
		return mav;
	}
	
//	@PostMapping("/update/{idx}")
//	public String update(Board3DTO dto) {
//		int row = dao.update(dto);
//		
//		System.out.println(row +"행이 수정되었습니다.");
//		return "redirect:/list";
//	}

	@PostMapping("/update/{idx}")
	public ModelAndView update(Board3DTO dto) {
		ModelAndView mav = new ModelAndView("check");
		int row = dao.update(dto);
		System.out.println(row +"행이 수정되었습니다.");
		
		mav.addObject("row", row);
		return mav;
	}
	
	@GetMapping("/delete/{idx}")
	public ModelAndView delete(@PathVariable("idx") int idx) {
		ModelAndView mav = new ModelAndView("delete");
		Board3DTO dto = dao.selectOne(idx);
		mav.addObject("dto",dto);
		return mav;
	}
	
	@PostMapping("/delete/{idx}")
	public 	ModelAndView delete(Board3DTO dto) {
		ModelAndView mav = new ModelAndView("check");
		int row = dao.delete(dto);
		System.out.println(row + "행이 삭제 되었습니다.");
		mav.addObject("row", row);
		return mav;
	}
}
