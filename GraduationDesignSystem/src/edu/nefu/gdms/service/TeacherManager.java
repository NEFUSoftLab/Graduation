package edu.nefu.gdms.service;

import java.util.List;

import edu.nefu.gdms.beans.TeacherBean;


public interface TeacherManager {

	/**
	 * 教师登录
	 * 
	 * @param name 职工号
	 * @param pwd 密码
	 * @return
	 */
	boolean login(String name, String pwd);
	
	
	
	/**
	 * 修改教师信息
	 * @param number 职工号
	 * @param name 姓名
	 * @param phone 联系电话
	 * @param pwd 密码
	 * @param email 邮箱
	 * @param major 专业
	 * @param level 级别
	 * @param group 组别
	 * @return
	 */
	 void modify(String number, String name, String phone, String pwd, String email, String major, String level,
			String group);
	
	
	
	/**
	 * 删除教师
	 * @param teid
	 * 
	 */
	void remove(String teid);
	
	
	/**
	 * 增加教师
	 * @param number
	 * @param name
	 * @param phone
	 * @param pwd
	 * @param email
	 * @param major
	 * @param level
	 * @param group
	 * 
	 */
	void add(String number, String name, String phone, String pwd, String email, String major, String level,
			String group);
	
	
	/**
	 * 通过教师id搜索教师
	 * @param teid
	 * @return
	 */
	TeacherBean getByTeid(String teid);
	
	
	/**
	 * 通过组id搜索教师
	 * @param gid
	 * @return
	 */
	List<TeacherBean> getByGroup(String gid);

}
