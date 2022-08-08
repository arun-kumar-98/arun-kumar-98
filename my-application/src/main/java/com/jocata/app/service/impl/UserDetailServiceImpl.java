/**
 * 
 */
package com.jocata.app.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jocata.app.Exceptions.UserException;
import com.jocata.app.dao.UserDetailDao;
import com.jocata.app.entity.UserDetail;
import com.jocata.app.service.UserDetailService;

/**
 * @author Rajeev
 *
 */
@Service
public class UserDetailServiceImpl implements UserDetailService{
	
	@Autowired
	private UserDetailDao userDetailDao;

	@Override
	@Transactional
	public String saveUser(UserDetail userDetail){
		
		return userDetailDao.saveUser(userDetail);
	   }

	@Override
	@Transactional
	public List<UserDetail> getAllUser()  {
		List<UserDetail> list = userDetailDao.getAllUser();
		 if(list.size()>0) {
			 return list;
		 }
		 else {
			 return new ArrayList<UserDetail>(); 
		 }
		
		 
	}

	@Override
	@Transactional
	public UserDetail getUserById(Long id) {
		UserDetail userDetail = userDetailDao.getUserById(id);
		 try {
			if(userDetail!=null) {
				 return userDetail;
			 }
			 else {
				 throw new UserException("User Not Found");
				 
			 }
		} catch (Exception e) {
			e.printStackTrace();
		}
		return userDetail;
	}

	@Override
	@Transactional
	public String deleteUser(Long id) {
		return userDetailDao.deleteUser(id);
	}

}
