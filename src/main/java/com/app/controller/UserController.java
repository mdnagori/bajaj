package com.app.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.DTO.ResUserDTO;
import com.app.DTO.UserDTO;

@RestController
public class UserController {

	@PostMapping("/bfhl")
	public ResUserDTO userResponse(@RequestBody UserDTO userDTO) {
	ResUserDTO returnUser=new ResUserDTO();
	returnUser.setEmail("john@xyz.com");
	returnUser.setUserId("john_doe_17091999");
	returnUser.setIsSuccess("true");
	returnUser.setRollNumber("ABCD123");
		getNumbers(returnUser,userDTO.getData());
		return returnUser;
	}
	
	private void getNumbers(ResUserDTO userDto,String[] arr) {
		
		List<String> listAlpha=new ArrayList<>();
		List<String> listNum =new ArrayList<>();
		for(String s:arr) {
			if(checkNum(s))
				listNum.add(s);
			else
				listAlpha.add(s);
			
		}
		String[] numArray=new String[listNum.size()];
		String[] alphaArray=new String[listAlpha.size()];
		
		for(int i=0;i<listAlpha.size();i++) {
			alphaArray[i]=listAlpha.get(i);
		}
		for(int i=0;i<listNum.size();i++) {
			numArray[i]=listNum.get(i);
		}
		
		userDto.setAlphabets(alphaArray);
		userDto.setNumbers(numArray);
		
	}
	
	private boolean checkNum(String str) {
		try {
			Integer.parseInt(str);
			
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
		return true;
	}
}
