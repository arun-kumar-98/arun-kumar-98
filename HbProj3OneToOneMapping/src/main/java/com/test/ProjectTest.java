package com.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.model.Modul;
import com.model.Project;
import com.resource.HibernateConfig;

public class ProjectTest {

	public static void main(String[] args) {

		Session ses = new HibernateConfig().getSessionFactory().openSession();
		Transaction tx = ses.beginTransaction();
		/*
		 * Modul m = new Modul(); Project p = new Project(); p.setProjName("CodeHiker");
		 * p.setDuration(90); p.setModul(m);
		 * 
		 * m.setModuleId(101); m.setModuleName("SDL23"); m.setTitle("HBProj1");
		 * m.setProject(p);
		 * 
		 * ses.save(p); ses.save(m); System.out.println("done.....");
		 * 
		 * tx.commit();
		 */

		Project p = ses.get(Project.class, 1);
		System.out.println(p);
		ses.close();

	}

}
