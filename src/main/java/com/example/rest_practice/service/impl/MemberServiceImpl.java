package com.example.rest_practice.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.rest_practice.dao.MemberDAO;
import com.example.rest_practice.dto.Member;
import com.example.rest_practice.service.MemberService;

@Service
public class MemberServiceImpl implements MemberService {
	@Autowired
	private MemberDAO dao;
	
	@Override
	public List<Member> testMember() {
		return dao.testMember();
	}

	@Override
	public List<Member> getAllMembers() {
		return dao.getAllMembers();
	}

	@Override
	public List<Member> getMember(Integer id) {
		return dao.getMember(id);
	}

	@Override
	public void insertMember(Member member) {
		dao.insertMember(member);
	}

	@Override
	public Member updateMember(Integer id, Member member) {
		Member updateMember = new Member();
		if(dao.updateMember(id, member) == 1) {
			updateMember.setId(id);
			updateMember.setName(member.getName());
			updateMember.setAge(member.getAge());
			updateMember.setDept(member.getDept());
		}
		return updateMember;
	}

	@Override
	public int deleteMember(Integer id) {
		return dao.deleteMember(id);
	}

}
