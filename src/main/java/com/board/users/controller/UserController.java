package com.board.users.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.board.users.domain.UserDTO;
import com.board.users.mapper.UserMapper;

@Controller
public class UserController {
	
	@Autowired
	private  UserMapper   userMapper;
	
	@RequestMapping("/Users/List")
	public  String  list( Model model ) {
		
		List<UserDTO>  userList   = userMapper.getUserList();
		System.out.println( userList );
		
		//                 key(jstl)   value
		model.addAttribute("userList", userList);   
		
		return "users/list";
		// src/main/webapp/WEB-INF/views/menus/list.jsp  
	}
	
	@RequestMapping("/Users/WriteForm")
	public  String  writeForm() {
		return "users/write";
	}
	
	@RequestMapping("/Users/WriteForm2")
	public  String  writeForm2() {
		return "users/write2";
	}
	
	@RequestMapping("/Users/Write")
	public  String  write( UserDTO userDTO, Model model ) {
		
		userMapper.insertUser( userDTO );
		
		/*
		List<MenuDTO> menuList = menuMapper.getMenuList();		
		model.addAttribute("menuList", menuList);		
		return "menus/list";   // rd.forward(request, response)
		*/
		return   "redirect:/Users/List"; // response.sendRedirect()
	}
	
	@RequestMapping("/Users/Write2")
	public   String   write2( UserDTO userDTO ) {
		// menu_name 만 넘어온
		System.out.println( userDTO );
		
		// 메뉴 추가
		userMapper.insertUser2( userDTO );		
		
		return  "redirect:/Users/List";
	}
	
	// http://localhost:9090/Menus/Delete?menu_id=MENU01
	@RequestMapping("/Users/Delete")
	public  String  delete( UserDTO userDTO  ) {
		
		// System.out.println( menuDTO );
		userMapper.deleteUser( userDTO  );
		
		return  "redirect:/Users/List";
	}
	
	// http://localhost:9090/Menus/UpdateForm?menu_id=MENU08
	@RequestMapping("/Users/UpdateForm")
	public  String   updateForm( UserDTO userDTO, Model model   ) {
		
		// 넘어온 정보(?menu_id=MENU08)확인
		// MenuDTO [menu_id=MENU02, menu_name=null, menu_seq=0]
		System.out.println("남어온 정보:" + userDTO );
		
		// 넘어온 정보로 수정할 정보를 조회
		UserDTO  user = userMapper.getUser( userDTO );
		System.out.println( "조회한 정보:" +  user );
		
		// 조회한 정보를 update.jsp 에 넘긴다
		model.addAttribute("user", user);
		
		return  "users/update";  // menus/update.jsp
	}
	
	// http://localhost:9090/Menus/Update
	@RequestMapping("/Users/Update")
	public  String   update( UserDTO  userDTO ) {
		// 넘어온 정보확인
		System.out.println("넘어온 정보:" + userDTO );
		
		// 수정하러 가기
		userMapper.update( userDTO );		
		
		return "redirect:/Users/List";
	}
	
	
}




