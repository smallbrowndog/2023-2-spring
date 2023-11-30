package com.sg.leo;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
//	@GetMapping("/middle")
//	public Middle httpGet() {
//		Middle findmiddle = Middle.builder().english("A").korean("가").latin("L").build();
//		return findmiddle;
//	}
	
	@DeleteMapping("/middle")
	public String httpDelete() {
		return "Delete request process id : 김기주 1023";
	}
}
