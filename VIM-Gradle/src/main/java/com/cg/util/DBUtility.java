package com.cg.util;

import com.cg.dao.CarDAO;
import com.cg.dao.impl.JDBCCarDAO;

/*NA*/
/**
 * 
 * This is a DBUtility class
 * @see java.lang.Object
 * @author Abhishek
 * 
 *
 */
public class DBUtility {
//	private static CarDAO dao = new CopyOfJDBCCarDAO();
	
	private static CarDAO dao = new JDBCCarDAO();
	/**
	 * 
	 * @return	CarDAO a factory for creating DAO 
	 */
	public static CarDAO getCarDAO(){
		return dao;
	}
}
