package com.szzy.packages.entity;

/**
 * private String �û�ȡ����¼ private String @author mac
 * 
 */
public class UserGetRecord {

	private String systemid;; // ϵͳ��¼���
	private String begtime;; // ���ʱ��
	private String ename;; // ������
	private String bname;; // ������
	private String postman;; // ȡ�����ֻ���
	private String order;; // ������� �� �ɿ�
	private String endtime;; // ȡ��ʱ�䣬�ɿ�
	private String getstyle;; // ȡ�����ǣ�(δȡ��0)
	private String state; // �Ĵ�״̬(0δȡ��1��ȡ)

	public String getSystemid() {
		return systemid;
	}

	public void setSystemid(String systemid) {
		this.systemid = systemid;
	}

	public String getBegtime() {
		return begtime;
	}

	public void setBegtime(String begtime) {
		this.begtime = begtime;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getBname() {
		return bname;
	}

	public void setBname(String bname) {
		this.bname = bname;
	}

	public String getPostman() {
		return postman;
	}

	public void setPostman(String postman) {
		this.postman = postman;
	}

	public String getOrder() {
		return order;
	}

	public void setOrder(String order) {
		this.order = order;
	}

	public String getEndtime() {
		return endtime;
	}

	public void setEndtime(String endtime) {
		this.endtime = endtime;
	}

	public String getGetstyle() {
		return getstyle;
	}

	public void setGetstyle(String getstyle) {
		this.getstyle = getstyle;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	};

}