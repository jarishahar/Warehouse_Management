package com.jsp.ware.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.jsp.ware.entity.Admin;
import com.jsp.ware.enums.AdminType;
import com.jsp.ware.exception.SuperAdminAlreadyExistException;
import com.jsp.ware.mapper.AdminMapper;
import com.jsp.ware.repository.AdminRepository;
import com.jsp.ware.requestdto.AdminRequest;
import com.jsp.ware.responsedto.AdminResponse;
import com.jsp.ware.service.AdminService;
import com.jsp.ware.utility.ResponseStructure;
@Service
public class AdminServiceImpl implements AdminService {
	@Autowired
	private AdminRepository adminRepository;

	@Autowired
	private AdminMapper adminMapper;
	@Override
	public ResponseEntity<ResponseStructure<AdminResponse>> registerSuperAdmin(AdminRequest adminRequest) {
		if(adminRepository.existsByAdminType(AdminType.SUPER_ADMIN))
		throw new SuperAdminAlreadyExistException("Super admin already exist");

		Admin admin = adminMapper.mapToAdmin(adminRequest, new Admin());
		admin.setAdminType(AdminType.SUPER_ADMIN);

		admin= adminRepository.save(admin);

		return ResponseEntity.status(HttpStatus.CREATED)
				.body(new ResponseStructure<AdminResponse>()
						.setStatus(HttpStatus.CREATED.value())
						.setMessage("SuperAdmin Created")
						.setData(adminMapper.mapToAdminResponse(admin)));
	}

}
