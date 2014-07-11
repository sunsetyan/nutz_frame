package com.sunrise22.galaxy.usage;

import javax.servlet.http.HttpServletRequest;

import org.nutz.mvc.annotation.At;
import org.nutz.mvc.annotation.Ok;
import org.nutz.mvc.annotation.Param;

public class HostAction {

	@At
	// @Ok("jsp:html.info")
	@Ok("fm:/WEB-INF/html/info.html")
	public String list(@Param("word") String word, HttpServletRequest request) {
		if (word != null)
			return word;
		return "测试";
	}
}
