package com.itbank.model;
/*idx          number         
title        varchar2(500)  
channel      varchar2(100)  
viewcount    number         
thumbnail    varchar2(500)  
movietag     varchar2(1000) */

public class YoutubeDTO {
	
	private int idx;
	private String title;
	private String channel;
	private int viewcount;
	private String thumbnail;
	private String movietag;
	
	public int getIdx() {
		return idx;
	}
	public void setIdx(int idx) {
		this.idx = idx;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getChannel() {
		return channel;
	}
	public void setChannel(String channel) {
		this.channel = channel;
	}
	public int getViewcount() {
		return viewcount;
	}
	public void setViewcount(int viewcount) {
		this.viewcount = viewcount;
	}
	public String getThumbnail() {
		return thumbnail;
	}
	public void setThumbnail(String thumbnail) {
		this.thumbnail = thumbnail;
	}
	public String getMovietag() {
		return movietag;
	}
	public void setMovietag(String movietag) {
		this.movietag = movietag;
	}
	

}
