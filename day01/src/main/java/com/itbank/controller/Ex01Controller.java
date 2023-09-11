package com.itbank.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
// 객체생성을 프로젝트 만들때 하기 때문에 뒤에 추가하고 나서는 꼭 서버 재실행을 해줘야한다.
public class Ex01Controller {
	
	//@GetMapping은 @RequestMapping (value="",method=RequestMethod.GET)과 같다
	@GetMapping("/ex01")
	public void test() {}
	// 컨트롤러 함수의 반환형이 void이면 요청 주소가 viewName으로 활용된다.
	// 컨트롤러에서 수행할 코드가 없고, 곧바로 jsp를 띄우면 될 경우에 주로 활용한다.

	//@RequestParam
	//request.getParameter의 역할
	// 요즘은 생략 가능하지만 
	// HashMap<String, Object> 으로 받을 떄는 무조건 적어줘야한다.

	@PostMapping("/ex01")
	public String test2(
			/*@RequestParam("name")*/String name,
			/*@RequestParam("age")*/int age, 
			Model model) {
		
		String adult = age >= 20 ? "성인" : "미성년자";
		model.addAttribute("adult", adult);
		model.addAttribute("age", age);
		return"ex01-action";
	}
}
