package com.board.users.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.board.users.domain.UserDTO;

@Mapper
public interface UserMapper {

	List<UserDTO> getUserList();

	void insertUser2(UserDTO userDTO);

	void insertUser(UserDTO userDTO);

	void deleteUser(UserDTO userDTO);

	UserDTO getUser(UserDTO userDTO);

	void update(UserDTO userDTO);



}
