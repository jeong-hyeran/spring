package com.itbank.model;

import org.springframework.web.multipart.MultipartFile;

/*
 *  idx             number          default member2_seq.nextval primary key,
    userid          varchar2(100)   not null unique,
    userpw          varchar2(500)   not null,
    salt            varchar2(10)    not null,
    username        varchar2(100)   not null,
    email           varchar2(100)   not null unique
 * */
public class MemberDTO {
	
	private int idx;
	private String userid;
	private String userpw;
	private String salt;
	private String username;
	private String email;
	private String profileImg;
	private MultipartFile upload;
	
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getProfileImg() {
		return profileImg;
	}
	public void setProfileImg(String profileImg) {
		this.profileImg = profileImg;
	}
	public MultipartFile getUpload() {
		return upload;
	}
	public void setUpload(MultipartFile upload) {
		this.upload = upload;
	}
	
}
