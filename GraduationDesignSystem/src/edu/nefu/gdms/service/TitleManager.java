package edu.nefu.gdms.service;

import java.util.List;

import edu.nefu.gdms.beans.TitleBean;

public interface TitleManager {
	
	
	/**
	 * �����Ŀ
	 * @param teid
	 * @param tname
	 * @param filepath
	 * @param status
	 * @return
	 */
	String add(String teid,String tname,String filepath,String status);
	
	
	/**
	 * ɾ����Ŀ
	 * @param tid
	 */
	void remove(String tid); 
	
	
	/**
	 * �޸���Ŀ��Ϣ
	 * @param sid
	 * @param teid
	 * @param tname
	 * @param filepath
	 */
	void modify(String sid,String teid,String tname,String filepath);
	
	/**
	 * �޸���Ŀ��״̬
	 * @param tid
	 * @param status
	 * @return
	 */
	String changeStatus(String tid,String status);
	
	/**
	 * ��ȡȫ��title��Ϣ
	 * @return
	 */
	List<TitleBean> getAll();
	
	/**
	 * ͨ����ʦid�����Ŀ
	 * @param teid
	 * @return
	 */
	List<TitleBean> getByTeid(String teid);
	
	
	/**
	 * ͨ��ѧ��id�����Ŀ
	 * @param sid
	 * @return
	 */
	TitleBean getBySid(String sid);
	
	/**
	 * ͨ��״̬�����Ŀ
	 * @param status
	 * @return
	 */
	TitleBean getByStatus(String status);
	
	
	
	
	

}
