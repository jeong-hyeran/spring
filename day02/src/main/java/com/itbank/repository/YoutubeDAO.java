package com.itbank.repository;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.itbank.model.YoutubeDTO;

public interface YoutubeDAO {
		
	@Select("select * from youtube order by idx")
	List<YoutubeDTO> selectList();
	
	
	// String sql ="insert into youtube values ?,?,?,?,?,?;
	@Insert("insert into youtube(idx,title,channel,thumbnail,movietag) values (#{idx},#{title},#{channel},#{thumbnail},#{movietag})")
	int insert(YoutubeDTO dto);

	@Select("select * from youtube where idx=#{idx}")
	YoutubeDTO selectOne(int idx);

	@Delete("delete youtube where idx= #{idx}")
	int delete(int idx);

	@Update("update youtube set viewcount=viewcount+1 where idx=#{idx}")
	int update(int idx);
	
	

}
