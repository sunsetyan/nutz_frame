package com.sunrise22.galaxy.web;

import org.nutz.mvc.annotation.Encoding;
import org.nutz.mvc.annotation.Fail;
import org.nutz.mvc.annotation.IocBy;
import org.nutz.mvc.annotation.Modules;
import org.nutz.mvc.annotation.Ok;
import org.nutz.mvc.ioc.provider.ComboIocProvider;

import com.sunrise22.galaxy.usage.HiAction;

@IocBy(type=ComboIocProvider.class,args={"*org.nutz.ioc.loader.json.JsonLoader","conf",
	  "*org.nutz.ioc.loader.annotation.AnnotationIocLoader","com.sunrise22.galaxy"})
@Encoding(input="utf8",output="utf8")
@Modules(value={HiAction.class})
@Ok("json")
@Fail("json")
public class FacadeModule {}
