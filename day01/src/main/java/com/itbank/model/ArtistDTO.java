package com.itbank.model;

import java.sql.Date;

/*이름         널?       유형            
---------- -------- ------------- 
id         not null number        
name       not null varchar2(200) 
company             varchar2(200) 
country             varchar2(100) 
member     not null varchar2(200) 
debut               date          
type       not null varchar2(100) 
profileimg          varchar2(500) 
*/

public class ArtistDTO {
	
	private int id;
	private String name;
	private String company;
	private String country;
	private String member;
	private Date debut;
	private String type;
	private String profileimg;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getMember() {
		return member;
	}
	public void setMember(String member) {
		this.member = member;
	}
	public Date getDebut() {
		return debut;
	}
	public void setDebut(Date debut) {
		this.debut = debut;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getProfileimg() {
		return profileimg;
	}
	public void setProfileimg(String profileimg) {
		this.profileimg = profileimg;
	}
	

}
