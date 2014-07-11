/**
 * 
 */
package com.sunrise22.galaxy.usage;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.nutz.ioc.annotation.InjectName;
import org.nutz.ioc.loader.annotation.IocBean;
import org.nutz.mvc.annotation.AdaptBy;
import org.nutz.mvc.annotation.At;
import org.nutz.mvc.annotation.Fail;
import org.nutz.mvc.annotation.Ok;
import org.nutz.mvc.upload.UploadAdaptor;

@At("/hellonut")
@AdaptBy(type=UploadAdaptor.class)
@IocBean
@InjectName
public class HelloNutModule {
	
	private static Log log = LogFactory.getLog(HelloNutModule.class.getName());
	
	@At
	@Ok("fm:/WEB-INF/html/hellonut.html")
	@Fail("fm:/WEB-INF/html/fail.html")
	public Map<String, String> doHello(/*@Param("word") String word*/) {
		log.info("通过hellonut/dohello/找到了这个方法..");
		Map<String, String> root = new HashMap<String, String>();
		root.put("username", "shengling");
		return root;
	}
	
}
