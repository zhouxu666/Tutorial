package com.wode.pojo;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

public class UserBean {
	@NotEmpty(message="不能为空")
	@Length(max=8,min=4,message="账户必须是4-8位")
	private String userName;
	@NotEmpty(message="密码不能为空")
	private String userPwd;
	//hibernate validator
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPwd() {
		return userPwd;
	}
	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}
	
}
