package com.example.rest_practice.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.example.rest_practice.dto.Member;

@Repository
public interface MemberDAO {
	List<Member> testMember();

	List<Member> getAllMembers();

	List<Member> getMember(Integer id);

	void insertMember(Member member);

	int updateMember(@Param("id") Integer id, @Param("member") Member member);

	int deleteMember(Integer id);
}
