package com.actualcare.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.actualcare.beans.PersonalInfo;
import com.actualcare.dao.PersonalInfoDao;
import com.actualcare.dao.PersonalInfoDaoImpl;



public class PersonalInfoDaoTest {
	@Test(priority = 1)
	public void insertTest() {
		PersonalInfo pi = new PersonalInfo();
		PersonalInfoDao piDao = new PersonalInfoDaoImpl();
		Integer p_id = piDao.insert(pi);
		Assert.assertEquals(piDao.returnPersonalInfo(p_id).getPersonal_id(),p_id);
	}

	@Test(priority = 2)
	public void returnTest() {
		PersonalInfo pi = new PersonalInfo();
		PersonalInfoDao piDao = new PersonalInfoDaoImpl();
		int personal_id = piDao.insert(pi);
		Assert.assertEquals((piDao.returnPersonalInfo(personal_id)).getPersonal_id(), pi.getPersonal_id());
	}

	@Test(priority = 3)
	public void returnDocTest() {
		PersonalInfo pi = new PersonalInfo();
		PersonalInfoDao piDao = new PersonalInfoDaoImpl();
		Integer personal_id = piDao.insert(pi);
		Assert.assertEquals(piDao.returnPersonalInfo(personal_id).getPersonal_id(), personal_id);
	}
	
	@Test(priority = 4)
	public void deleteTest() {
		PersonalInfo pi = new PersonalInfo();
		PersonalInfoDao piDao = new PersonalInfoDaoImpl();
		int personal_id = piDao.insert(pi);
		piDao.delete(pi);
		Assert.assertEquals(piDao.returnPersonalInfo(personal_id), null);
	}

}
