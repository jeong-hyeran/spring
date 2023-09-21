package com.itbank.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.itbank.model.ReviewDTO;

@Repository
public interface ReviewDAO {

	int insertReview(ReviewDTO dto);

	int selectMaxIdx(ReviewDTO dto);

	List<ReviewDTO> selectAll();

	ReviewDTO selectOne(int idx);

	int delete(int idx);

}
