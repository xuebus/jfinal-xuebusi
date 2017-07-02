package com.xuebusi.model;

import com.jfinal.plugin.activerecord.Model;
/**
 * 用户
 * @author	SYJ
 * @date	2017年7月2日下午8:32:06
 * @version 1.0
 */
public class User extends Model<User> {
	public static final User dao = new User();
	public static final int SEX_MALE = 1;//男
	public static final int SEX_FEMALE = 2;//女
}
