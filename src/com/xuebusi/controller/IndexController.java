package com.xuebusi.controller;

import com.jfinal.core.Controller;

public class IndexController extends Controller {
	/**
	 * 默认跳转到首页
	 * 即访问http://localhost/则映射到/WebRoot/index.jsp
	 * @author	SYJ
	 * @date	2017年7月2日下午8:06:25
	 */
	public void index() {
		super.render("index.jsp");
	}
}
