package com.example.rest_practice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.rest_practice.dto.Member;
import com.example.rest_practice.service.MemberService;

@RestController
public class MemberController {
	@Autowired
	private MemberService service;
	
	@GetMapping (path = "/test")
	public List<Member> memberTest() {
		return service.testMember();
	}
	
	@GetMapping (path = "/members") 
	public List<Member> getAllMembers(){
		return service.getAllMembers();
	}
	
	@GetMapping (path = "/members/{id}")
	public List<Member> getMember(@PathVariable Integer id){
		return service.getMember(id);
	}
	
	@PostMapping (path = "/members")
	public Member insertMember(@RequestBody Member member) {
		service.insertMember(member);
		return member;
	}
	
	@PutMapping (path = "/members/{id}")
	public Member updateMember(@PathVariable Integer id, @RequestBody Member member) {
		return service.updateMember(id, member);
	}
	
	@DeleteMapping (path ="/members/{id}")
	public Integer deleteMember(@PathVariable Integer id) {
		return service.deleteMember(id);
	}
}
