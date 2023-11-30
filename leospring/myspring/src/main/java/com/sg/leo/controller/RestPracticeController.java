package com.sg.leo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class RestPracticeController {
	@RequestMapping("/hello") // http://localhost:8080/api/hello
	public String hello() {
		return "return from /hello, RestPracticeController. 10/23 by 김기주";
	}
	
	@GetMapping("/get") //http://localhost:8080/api/get
	public String get() {
		return "return from /get, RestPracticeController. 10/16 by 김기주";
	}
	
	@GetMapping(value = "/getchk/{variable}") //http://localhost:8080/api/getchk/추가단어
	public String getchk(@PathVariable String variable) {
		return "return from /get, RestPracticeController. 10/16 by 김기주 : " + variable;
	}
	
	@GetMapping(value = "/getparam") //http://localhost:8080/api/getparam?name=김기주&email=kkj7388@naver.com
	public String getparam(String name, String email) {
		return "return from /getparam, name = " + name + " / 이메일 주소는 : " + email; 
	}
}