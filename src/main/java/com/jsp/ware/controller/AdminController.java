package com.jsp.ware.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jsp.ware.requestdto.AdminRequest;
import com.jsp.ware.responsedto.AdminResponse;
import com.jsp.ware.service.AdminService;
import com.jsp.ware.utility.ResponseStructure;

@RestController
@RequestMapping("/api/v2")
public class AdminController {
	@Autowired
	private AdminService adminService;
	
	@PostMapping("/registerSuperAdmin")
	public ResponseEntity<ResponseStructure<AdminResponse>>registerSuperAdmin(@RequestBody AdminRequest adminRequest){
		return adminService.registerSuperAdmin(adminRequest);
	}

}
