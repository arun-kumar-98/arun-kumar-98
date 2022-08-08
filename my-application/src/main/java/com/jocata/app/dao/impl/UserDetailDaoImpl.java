/**
 * 
 */
package com.jocata.app.dao.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jocata.app.dao.UserDetailDao;
import com.jocata.app.entity.UserDetail;

/**
 * @author Rajeev
 *
 */
@Repository
public class UserDetailDaoImpl implements UserDetailDao {
	
	@Autowired
    private SessionFactory sessionFactory;
 
    public void setSessionFactory(SessionFactory sf) {
        this.sessionFactory = sf;
    }

	@Override
	public String saveUser(UserDetail userDetail) {
		Session session = this.sessionFactory.getCurrentSession();
        session.save(userDetail);
		return "User added Successfully";
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<UserDetail> getAllUser() {
		List<UserDetail> userlist;
		Session session = this.sessionFactory.getCurrentSession();
		userlist =session.createQuery("select ud.userId,ud.userName,ud.userAddress,ud.age,ud.mobile,ud.email from UserDetail ud").list();
		return userlist;
	}

	@Override
	 public UserDetail getUserById(Long id) {
		Session session = this.sessionFactory.getCurrentSession();
        UserDetail detail =	(UserDetail)session.get(UserDetail.class, id);
		return detail;
	 }

	@Override
	public String deleteUser(Long id) {
		Session session = this.sessionFactory.getCurrentSession();
		UserDetail detail = (UserDetail)session.load(UserDetail.class, id);
		 if(detail!=null) {
			 session.delete(detail);
		 }
		return "User deleted successfully";
	}

}
