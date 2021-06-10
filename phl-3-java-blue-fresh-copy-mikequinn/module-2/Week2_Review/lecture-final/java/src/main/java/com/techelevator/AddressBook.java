package com.techelevator;

import org.apache.commons.dbcp2.BasicDataSource;

import com.techelevator.dao.ContactDao;
import com.techelevator.dao.JdbcContactDao;

public class AddressBook {

	public static void main(String[] args) {
		
		// 1) In order to use a DAO you need a contract
		// 		so define the DAO interface (in this case it is the
		//		ContactDao interface.
		
		// 2) Create skeleton of implementing DAOL class (in this case it is
		//		JdbcContactDo
		
		BasicDataSource dataSource = new BasicDataSource();
		dataSource.setUrl("jdbc:postgresql://localhost:5432/addressbook");
		dataSource.setUsername("postgres");
		dataSource.setPassword("postgres1");

		// Create and use ContactDao
		ContactDao dao = new JdbcContactDao(dataSource);
		
		/***** INFO FROM REVIEW SESSION *****/
		
		// We can call this because it takes a ContactDao param.
		// Even though we created a JdbcContactDao, it can be considered
		// ContactDao because it implements the ContactDao interface
		// and that guarantees all methods in ContactDao interface will
		// be available. That means the code doesn't have to know what
		// our object ACTUALLY is... it just needs to know it can
		// treat it as a ContactDao.
		
		testDao(dao);
		
		// If store our instance in a JdbcContactDao variable rather
		// than a ContactDao variable. We camn STILL call the same method
		// for the same reason... our class guarantees it can be treated as 
		// a ContactDao
		
		JdbcContactDao jdbcDao = new JdbcContactDao(dataSource);
		testDao(jdbcDao);
		
		// if we add a method to JdbcContactDao that is NOT part of the
		// ContactDao contract (interface). We can use that if our
		// object is treated as JdbcContactDao but NOT if it is being treated as
		// a generic ContactDao because the method is not part of what it means
		// to a ContactDao
		
		// so this will work
		jdbcDao.printSomething();
		
		// but this will not
		//dao.printSomething();
		
		// If we know that an object is implented as a JdbcContactDao
		// we can cast it to a JdbcContactDao to use the JdbcContactDao
		// functionality
		((JdbcContactDao)dao).printSomething();
		
		// This will cause runtime errors if the object is NOT implemented
		// as a JdbcContactDao so it is best to check that using instanceof
		// before casting a ContatDao to a JdbcContactDao and calling a method
		// specific to JdbcContactDao
		if (dao instanceof JdbcContactDao) {
			((JdbcContactDao)dao).printSomething();
		}
		
		
		testDao(jdbcDao);
		
	}
	
	public static void testDao(ContactDao dao) {
		
	}

}
