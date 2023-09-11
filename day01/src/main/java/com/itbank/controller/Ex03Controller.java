package com.itbank.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.itbank.model.ArtistDTO;
import com.itbank.repository.Ex03DAO;

@Controller
@RequestMapping("/ex03")	// 컨트롤러 하위의 모든 메서드에게 주소를 적용한다.
public class Ex03Controller {
	
	@Autowired private Ex03DAO ex03DAO;
	// 모두다가 무슨 형식을 따라간다고?!
	
	@GetMapping
	public ModelAndView list() {
		ModelAndView mav = new ModelAndView();
		// ModelAndView매개 변수에 jsp를 안 적으면 void와 같은 것을 반환
		// RequestMapping (요청주소)주소로 나온다.
		List<ArtistDTO> list = ex03DAO.selectList();
		mav.addObject("list", list);
		return mav;
	}

}
