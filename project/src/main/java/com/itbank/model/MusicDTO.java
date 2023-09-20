package com.itbank.model;
/*
id        not null number        
artist_id not null number        
album_id  not null number        
name      not null varchar2(200) 
genre     not null varchar2(100) 
playtime  not null number        
lyrics             clob          
playcount          number        
istitle            number        
*/
public class MusicDTO {
	
	private int id;
	private int artist_id;
	private int album_id;
	private String name;
	private String genre;
	private int playtime;
	private String lyrics;
	private int playcount;
	private int istitle;
	
	private String artist_name; //조인으로 같이 불러올 아티스트의 이름
	private String album_name; // 조인으로 같이 불러올 앨범의 이름
	

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getArtist_id() {
		return artist_id;
	}
	public void setArtist_id(int artist_id) {
		this.artist_id = artist_id;
	}
	public int getAlbum_id() {
		return album_id;
	}
	public void setAlbum_id(int album_id) {
		this.album_id = album_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public int getPlaytime() {
		return playtime;
	}
	public void setPlaytime(int playtime) {
		this.playtime = playtime;
	}
	public String getLyrics() {
		return lyrics;
	}
	public void setLyrics(String lyrics) {
		this.lyrics = lyrics;
	}
	public int getPlaycount() {
		return playcount;
	}
	public void setPlaycount(int playcount) {
		this.playcount = playcount;
	}
	public int getIstitle() {
		return istitle;
	}
	public void setIstitle(int istitle) {
		this.istitle = istitle;
	}
	
	
	public String getArtist_name() {
		return artist_name;
	}
	public void setArtist_name(String artist_name) {
		this.artist_name = artist_name;
	}
	public String getAlbum_name() {
		return album_name;
	}
	public void setAlbum_name(String album_name) {
		this.album_name = album_name;
	}
	
}
