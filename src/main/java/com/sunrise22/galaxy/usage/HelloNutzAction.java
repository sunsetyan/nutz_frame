package com.sunrise22.galaxy.usage;

import java.util.HashMap;
import java.util.Map;

import org.nutz.mvc.annotation.At;
import org.nutz.mvc.annotation.Ok;

public class HelloNutzAction {
	
	@At("/hellonutz/")
	@Ok("fm:/WEB-INF/html/hellonutz.html")
	public Map<String, String> helloNutz() {
		Map<String, String> rtn = new HashMap<String, String>();
		
		rtn.put("thename", "xiaoling");
		
		return rtn;
	}

}
