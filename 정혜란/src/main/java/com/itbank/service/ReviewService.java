package com.itbank.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itbank.component.FileComponent;
import com.itbank.model.ReviewDTO;
import com.itbank.repository.ReviewDAO;

@Service
public class ReviewService {
	
	@Autowired
	private ReviewDAO reviewDAO;
	@Autowired
	private FileComponent fileComponent;
	
	public int write(ReviewDTO dto) {
		int idx =0;
		if (dto.getUploadFile().isEmpty() == false) {	
			String filename = fileComponent.upload(dto.getUploadFile());
			dto.setFilename(filename);
		}
		int row = reviewDAO.insertReview(dto);
		if (row != 0) {
			idx = reviewDAO.selectMaxIdx(dto);
		}
		return idx;
	}

	public List<ReviewDTO> selectAll() {
		return reviewDAO.selectAll();
	}

	public ReviewDTO selectOne(int idx) {
		return reviewDAO.selectOne(idx);
	}

	public int delete(int idx) {
		ReviewDTO dto = reviewDAO.selectOne(idx);
		String filename = dto.getFilename();
		fileComponent.delete(filename);
		reviewDAO.delete(idx);
		return 0;
	}


}
