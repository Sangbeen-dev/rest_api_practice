package com.example.rest_practice.service;

import java.util.List;

import com.example.rest_practice.dto.Member;

public interface MemberService {
	List<Member> testMember();
	List<Member> getAllMembers();
	List<Member> getMember(Integer id);
	void insertMember(Member member);
	Member updateMember(Integer id, Member member);
	int deleteMember(Integer id);
}
