package com.sunrise22.galaxy.web;

import org.nutz.mvc.annotation.Encoding;
import org.nutz.mvc.annotation.Fail;
import org.nutz.mvc.annotation.IocBy;
import org.nutz.mvc.annotation.Localization;
import org.nutz.mvc.annotation.Modules;
import org.nutz.mvc.annotation.Ok;
import org.nutz.mvc.annotation.Views;
import org.nutz.mvc.ioc.provider.ComboIocProvider;

import com.sunrise22.galaxy.extension.FreemarkerViewMaker;
import com.sunrise22.galaxy.usage.HelloNutModule;
import com.sunrise22.galaxy.usage.HiAction;

// 这里指定了配置文件的路径 conf
@IocBy(type=ComboIocProvider.class,args={"*org.nutz.ioc.loader.json.JsonLoader","conf",
	  "*org.nutz.ioc.loader.annotation.AnnotationIocLoader","com.sunrise22.galaxy"})
@Encoding(input="utf8",output="utf8")
@Modules(value={HiAction.class, HelloNutModule.class})
@Views({FreemarkerViewMaker.class})
@Localization("msg")   
//@Ok("json")
//@Fail("json")
public class FacadeModule {}
