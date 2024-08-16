package com.jsp.ware.service;

import org.springframework.http.ResponseEntity;

import com.jsp.ware.requestdto.AdminRequest;
import com.jsp.ware.responsedto.AdminResponse;
import com.jsp.ware.utility.ResponseStructure;

public interface AdminService {

	ResponseEntity<ResponseStructure<AdminResponse>> registerSuperAdmin(AdminRequest adminRequest);

}
