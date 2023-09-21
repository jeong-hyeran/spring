package com.itbank.model;
/*'
  idx         number              default account_seq.nextval primary key,
    userid      varchar2(100)       unique not null,
    userpw      varchar2(500)       not null,
    salt        varchar2(200)       not null,
    username    varchar2(100)       not null
 */
public class AccountDTO {

	private int idx;
	private	String userid;
	private	String userpw;
	private	String salt;
	private	String username;
	
	public int getIdx() {
		return idx;
	}
	public void setIdx(int idx) {
		this.idx = idx;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getUserpw() {
		return userpw;
	}
	public void setUserpw(String userpw) {
		this.userpw = userpw;
	}
	public String getSalt() {
		return salt;
	}
	public void setSalt(String salt) {
		this.salt = salt;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}

}
