package com.itbank.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itbank.component.FileComponent;
import com.itbank.component.HashComponent;
import com.itbank.model.MemberDTO;
import com.itbank.repository.MemberDAO;

@Service
public class MemberService {
	@Autowired
	private HashComponent hashComponent;
	@Autowired
	private FileComponent fileComponent;
	@Autowired
	private MemberDAO memberDAO;
	
	public int join(MemberDTO dto) {
		String salt = hashComponent.getRandomSalt();
		String hash = hashComponent.getHash(dto.getUserpw(), salt);
		dto.setSalt(salt);
		dto.setUserpw(hash);
		String profileImg = fileComponent.upload(dto.getUpload());
		dto.setProfileImg(profileImg);
		return memberDAO.insert(dto);
	}

	public MemberDTO login(MemberDTO dto) {
		MemberDTO login =  memberDAO.selectOneById(dto.getUserid());
		String hash = hashComponent.getHash(dto.getUserpw(), login.getSalt());
		if(login.getUserpw().equals(hash) == false) {
			return null;
		}
		return login;
		
	}

}
