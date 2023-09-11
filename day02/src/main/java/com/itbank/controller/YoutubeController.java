package com.itbank.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.itbank.model.YoutubeDTO;
import com.itbank.repository.YoutubeDAO;

@Controller
public class YoutubeController {

	// 컨트롤러의 함수 반환형을 결정하기
	
	// 1) DB에서 불러온 데이터 혹은 다른 데이터를 JSP에게 넘겨줘야 하는가?
	// yes -> ModelAndView
	
	// 2) 요청 주소와 JSP의 이름이 일치하는가?
	// yes -> void, no -> String
	
	@Autowired private YoutubeDAO dao;
	
	@GetMapping("/list")
	public ModelAndView list() {
		ModelAndView mav = new ModelAndView();
		List<YoutubeDTO> list = dao.selectList();
		mav.addObject("list", list);
		return mav;
	}
	                
	@GetMapping("/add")
	public void add() {}
	
	@PostMapping("/add")
	public String insert(YoutubeDTO dto) {
		/*** dto.movietag의 문자열을 수정하는 코드 (service로 이동가능)***/
		String movietag = dto.getMovietag();
		System.out.println(movietag);
		String[] tag = movietag.split(" ");
		for (int i = 0; i < tag.length; i++) {
			if(tag[i].startsWith("width")) {
				tag[i] = "width=\"720\"";
			}
			if(tag[i].startsWith("height")) {
				tag[i] = "height=\"405\"";
			}
		}
		String newTag = String.join(" ", tag);
		dto.setMovietag(newTag);
		/********************************************************/
		int row = dao.insert(dto);
		System.out.println(row + "행이 추가되었습니다.");
		return"redirect:/list";
	}
	
	@GetMapping("/view/{idx}")
	// {}안에 바뀌어서 들어올 파라미터
	public ModelAndView view(@PathVariable("idx") int idx) {
		//@PathVariable 이거는 파라미터를 가져오는 것 !!
		// () 안은 파라미터로 들어올 값!! 
		// 뒤에 선언한 매개변수 타입으로 변환해서 넣어준다.
		
		ModelAndView mav = new ModelAndView("view");

		int row = dao.update(idx);
		System.out.println(row + "행이 업데이트 되었습니다.");
		
		YoutubeDTO dto = dao.selectOne(idx);
		mav.addObject("dto",dto);
		return mav;
	}
	
	@GetMapping("/delete/{idx}")	
	//<a href="">,location.href 모두 GET 메서드이다.
	public String delete(@PathVariable("idx") int idx) {
		int row = dao.delete(idx);
		System.out.println(row + "행이 삭제되었습니다.");
		return "redirect:/list";
	}
	
}
