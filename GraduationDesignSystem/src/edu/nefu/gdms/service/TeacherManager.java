package edu.nefu.gdms.service;

import java.util.List;

import edu.nefu.gdms.beans.TeacherBean;


public interface TeacherManager {

	/**
	 * ��ʦ��¼
	 * 
	 * @param name ְ����
	 * @param pwd ����
	 * @return
	 */
	boolean login(String name, String pwd);
	
	
	
	/**
	 * �޸Ľ�ʦ��Ϣ
	 * @param number ְ����
	 * @param name ����
	 * @param phone ��ϵ�绰
	 * @param pwd ����
	 * @param email ����
	 * @param major רҵ
	 * @param level ����
	 * @param group ���
	 * @return
	 */
	 void modify(String number, String name, String phone, String pwd, String email, String major, String level,
			String group);
	
	
	
	/**
	 * ɾ����ʦ
	 * @param teid
	 * 
	 */
	void remove(String teid);
	
	
	/**
	 * ���ӽ�ʦ
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
	 * ͨ����ʦid������ʦ
	 * @param teid
	 * @return
	 */
	TeacherBean getByTeid(String teid);
	
	
	/**
	 * ͨ����id������ʦ
	 * @param gid
	 * @return
	 */
	List<TeacherBean> getByGroup(String gid);

}
