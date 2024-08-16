package com.jsp.ware.mapper;

import org.springframework.stereotype.Component;

import com.jsp.ware.entity.Admin;
import com.jsp.ware.requestdto.AdminRequest;
import com.jsp.ware.responsedto.AdminResponse;
@Component
public class AdminMapper {

	public Admin mapToAdmin(AdminRequest adminRequest,Admin admin) {
		admin.setAdminName(adminRequest.getAdminName());
		admin.setEmail(adminRequest.getEmail());
		admin.setPassword(adminRequest.getPassword());
		return admin;
	}
	
	public AdminResponse mapToAdminResponse(Admin admin) {
		return AdminResponse.builder()
				.adminId(admin.getAdminId())
				.adminname(admin.getAdminName())
				.adminType(admin.getAdminType())
				.email(admin.getEmail())
				.build();
	}
}
