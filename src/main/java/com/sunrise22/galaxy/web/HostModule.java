package com.sunrise22.galaxy.web;

import org.nutz.mvc.annotation.Fail;
import org.nutz.mvc.annotation.Localization;
import org.nutz.mvc.annotation.Modules;
import org.nutz.mvc.annotation.Views;

import com.sunrise22.galaxy.extension.FreemarkerViewMaker;
import com.sunrise22.galaxy.usage.HostAction;

@Modules( { HostAction.class })   
@Views({FreemarkerViewMaker.class})   
@Localization("msg")   
@Fail("json")    
public class HostModule {

}
