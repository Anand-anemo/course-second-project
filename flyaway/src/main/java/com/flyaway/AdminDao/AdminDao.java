package com.flyaway.AdminDao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.flyaway.admin.Admin;

@Component
public class AdminDao {
	
	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	//create
	@Transactional
	public void createAdmin(Admin admin) {
		
		this.hibernateTemplate.save(admin);
		
	}
	
	//get all data
	
	public List<Admin> getAdmins(){
		List<Admin>admins=this.hibernateTemplate.loadAll(Admin.class);
		return admins;
}

}
