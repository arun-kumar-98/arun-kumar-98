/**
 * 
 */
package com.jocata.app.dao;

import java.util.List;

import com.jocata.app.entity.UserDetail;

/**
 * @author Rajeev
 *
 */
public interface UserDetailDao {

	public String saveUser(UserDetail userDetail);
	public List<UserDetail> getAllUser();
	public UserDetail getUserById(Long id);
	public String deleteUser(Long id); 
	

}
