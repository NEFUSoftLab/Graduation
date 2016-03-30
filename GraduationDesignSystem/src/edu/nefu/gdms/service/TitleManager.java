package edu.nefu.gdms.service;

import java.util.List;

import edu.nefu.gdms.beans.TitleBean;

public interface TitleManager {
	
	
	/**
	 * 添加题目
	 * @param teid
	 * @param tname
	 * @param filepath
	 * @param status
	 * @return
	 */
	String add(String teid,String tname,String filepath,String status);
	
	
	/**
	 * 删除题目
	 * @param tid
	 */
	void remove(String tid); 
	
	
	/**
	 * 修改题目信息
	 * @param sid
	 * @param teid
	 * @param tname
	 * @param filepath
	 */
	void modify(String sid,String teid,String tname,String filepath);
	
	/**
	 * 修改题目的状态
	 * @param tid
	 * @param status
	 * @return
	 */
	String changeStatus(String tid,String status);
	
	/**
	 * 获取全部title信息
	 * @return
	 */
	List<TitleBean> getAll();
	
	/**
	 * 通过教师id获得题目
	 * @param teid
	 * @return
	 */
	List<TitleBean> getByTeid(String teid);
	
	
	/**
	 * 通过学生id获得题目
	 * @param sid
	 * @return
	 */
	TitleBean getBySid(String sid);
	
	/**
	 * 通过状态获得题目
	 * @param status
	 * @return
	 */
	TitleBean getByStatus(String status);
	
	
	
	
	

}
