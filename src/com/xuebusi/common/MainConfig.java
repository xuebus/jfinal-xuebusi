package com.xuebusi.common;

import com.jfinal.config.Constants;
import com.jfinal.config.Handlers;
import com.jfinal.config.Interceptors;
import com.jfinal.config.JFinalConfig;
import com.jfinal.config.Plugins;
import com.jfinal.config.Routes;
import com.jfinal.core.JFinal;
import com.jfinal.kit.PropKit;
import com.jfinal.plugin.activerecord.ActiveRecordPlugin;
import com.jfinal.plugin.c3p0.C3p0Plugin;
import com.jfinal.render.ViewType;
import com.jfinal.template.Engine;
import com.xuebusi.controller.IndexController;
import com.xuebusi.controller.UserController;
import com.xuebusi.model.User;

/**
 * 配置类
 * @author	SYJ
 * @date	2017年7月2日下午8:09:05
 * @version 1.0
 */
public class MainConfig extends JFinalConfig {

	@Override
	public void configConstant(Constants me) {
		// 指定我们的视图类型为jsp
		me.setViewType(ViewType.JSP);
		// 数据配置
		PropKit.use("config.properties");
	}

	@Override
	public void configRoute(Routes me) {
		/**
		 * 根目录路径映射
		 * 即访问http://localhost/则映射到IndexController类
		 */
		me.add("/", IndexController.class);
		
		/**
		 * 用户路径映射
		 * 即访问http://localhost/user的请求映射到UserController
		 */
		me.add("/user", UserController.class);
		
	}

	@Override
	public void configEngine(Engine me) {
		// TODO Auto-generated method stub

	}

	@Override
	public void configPlugin(Plugins me) {
		// 数据库连接池插件
		C3p0Plugin c3p0Plugin = new C3p0Plugin(PropKit.get("jdbcUrl"), PropKit.get("user"), PropKit.get("password"));
		
		// 数据库表结构映射插件
		ActiveRecordPlugin arp = new ActiveRecordPlugin(c3p0Plugin);
		arp.setShowSql(true);
		arp.addMapping("user", User.class);
		
		me.add(c3p0Plugin);
		me.add(arp);
	}

	@Override
	public void configInterceptor(Interceptors me) {
		// TODO Auto-generated method stub

	}

	@Override
	public void configHandler(Handlers me) {
		// TODO Auto-generated method stub
		
	}
	/**
	 * 直接运行main方法,接口启动项目,而不必使用tomcat服务器
	 * @author	SYJ
	 * @date	2017年7月2日下午8:08:09
	 * @param args
	 */
	public static void main(String[] args) {
		JFinal.start("WebRoot", 80, "/", 5);
	}

}
