package edu.nefu.gdms.service;

import java.util.List;

import edu.nefu.gdms.beans.TepascoreBean;
import edu.nefu.gdms.domain.Tepascore;

public interface TepascoreManager {
	
	
	
	/**
	 * 添加分数
	 * @param pid
	 * @param teid
	 * @param score
	 * @return
	 */
	String add(String pid,String teid,String score);
	
	/**
	 * 修改打分信息
	 * @param pid
	 * @param teid
	 * @param score
	 */
	void modify(String pid,String teid,String score);
	
	
	/**
	 * 删除该阶段所有打分
	 */
	void removeall();
	/**
	 * 得到所有分数
	 * @return
	 */
	List<TepascoreBean> getAll();
	
	
	/**
	 * 通过论文id与教师id得到对应分数
	 * @param pid
	 * @param teid
	 * @return
	 */
	TepascoreBean getByPTe(String pid,String teid);
	
	/**
	 * 通过论文id获得该论文所有分数
	 * @param pid
	 * @return
	 */
	List<TepascoreBean> getByPid(String pid);
	
	
	/**
	 * 通过老师id获得老师分数
	 * @param teid
	 * @return
	 */
	List<TepascoreBean> getByTeid(String teid);

}
