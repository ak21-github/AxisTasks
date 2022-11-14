package com.example.axisTasks.dao;


import com.example.axisTasks.entity.Role;

public interface RoleDao {
	public Role findRoleByName(String theRoleName);
}
