/**
 * 
 */
package com.jocata.app.service;

import java.util.List;

import com.jocata.app.Exceptions.UserException;
import com.jocata.app.entity.UserDetail;

/**
 * @author Rajeev
 *
 */
public interface UserDetailService {

	public String saveUser(UserDetail userDetail);
	public List<UserDetail> getAllUser();
	public UserDetail getUserById(Long id);
	public String deleteUser(Long id);

}
