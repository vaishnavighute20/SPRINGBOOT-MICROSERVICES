package com.crm.dao;

public interface ILoginDao {

	boolean loginCheck(String email,String password);

	boolean validateLogin(String email, String password);
}
