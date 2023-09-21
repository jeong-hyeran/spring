package com.itbank.model;
/*
 *  idx             number          default review_seq.nextval primary key,
    account_idx     number          not null,
    writer          varchar2(100)   not null,
    content         varchar2(1000)  not null,
    wdate           date            default sysdate,
    filename        varchar2(500)   not null,*/

import java.sql.Date;

import org.springframework.web.multipart.MultipartFile;

public class ReviewDTO {
	
	private int idx;
	private int account_idx;
	private String title;
	private String writer;
	private String content;
	private Date wdate;
	private String filename;
	private MultipartFile uploadFile;
	
	private String account_name;

	public int getIdx() {
		return idx;
	}

	public void setIdx(int idx) {
		this.idx = idx;
	}

	public int getAccount_idx() {
		return account_idx;
	}

	public void setAccount_idx(int account_idx) {
		this.account_idx = account_idx;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getWdate() {
		return wdate;
	}

	public void setWdate(Date wdate) {
		this.wdate = wdate;
	}

	public String getFilename() {
		return filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}

	public MultipartFile getUploadFile() {
		return uploadFile;
	}

	public void setUploadFile(MultipartFile uploadFile) {
		this.uploadFile = uploadFile;
	}

	public String getAccount_name() {
		return account_name;
	}

	public void setAccount_name(String account_name) {
		this.account_name = account_name;
	}

	
}
