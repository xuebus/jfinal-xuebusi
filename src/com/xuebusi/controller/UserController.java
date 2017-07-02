package com.xuebusi.controller;

import java.util.List;

import com.jfinal.core.Controller;
import com.xuebusi.model.User;

public class UserController extends Controller {
	
	/**
	 * 用户列表
	 * 访问http://localhost/user则跳转到/WebRoot/user/list.jsp
	 * @author	SYJ
	 * @date	2017年7月2日下午9:25:18
	 */
	public void index() {
		List<User> users = User.dao.find("select * from user");
		setAttr("users", users);
		System.out.println("数据总数：" + users.size());
		super.render("list.jsp");
	}
	
	/**
	 * 用户表单
	 * 访问http://localhost/user/form则跳转到/WebRoot/user/form.jsp
	 * @author	SYJ
	 * @date	2017年7月2日下午9:25:29
	 */
	public void form() {
		Integer id = getParaToInt(0);
		if (id != null && id > 0) {
			setAttr("user", User.dao.findById(id));
		}
		super.render("form.jsp");
	}
	
	/**
	 * 提交表单
	 * @author	SYJ
	 * @date	2017年7月2日下午10:10:20
	 */
	public void submit() {
		User user = getModel(User.class);
		user.save();
		redirect("/user");
	}
	
	public void update() {
		User user = getModel(User.class);
		user.update();
		redirect("/user");
	}
	
	public void edit() {
		form();
	}
	
	public void del() {
		User.dao.deleteById(getPara(0));
		redirect("/user");
	}
}
