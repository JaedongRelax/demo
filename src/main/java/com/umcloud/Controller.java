package com.umcloud;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	@RequestMapping("/hello")
	public  Map getAuditlogs()throws Exception {
		Map a =new HashMap<>();
		a.put("name", "umcloud")	;	
		a.put("value", "hello world")	;	
		return a;
	}
}
