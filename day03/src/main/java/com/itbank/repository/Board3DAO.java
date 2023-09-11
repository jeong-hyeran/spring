package com.itbank.repository;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.itbank.model.Board3DTO;

public interface Board3DAO {

	@Insert("insert into board3 (password, title, writer, content) values (#{password},#{title},#{writer},#{content})")
	int insert(Board3DTO dto);

	@Select("select * from board3 order by idx")
	List<Board3DTO> selectList();

	@Select("select * from board3 where idx=#{idx}")
	Board3DTO selectOne(int idx);

	@Update("update board3 set title=#{title}, content=#{content} where password=#{password} and idx=#{idx}")
	int update(Board3DTO dto);

	@Delete("delete from board3 where idx=#{idx} and password=#{password}")
	int delete(Board3DTO dto);

	@Select("select * from board3 where title like '%${search}%' or writer like '%${search}%'")
	List<Board3DTO> searchList(String search);
	
	

}
