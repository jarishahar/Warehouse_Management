package com.jsp.ware.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.ware.entity.Admin;
import com.jsp.ware.enums.AdminType;

public interface AdminRepository  extends JpaRepository<Admin, Integer>{

	boolean existsByAdminType(AdminType superAdmin);

}
