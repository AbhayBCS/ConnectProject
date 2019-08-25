package com.mess.Mes.client;

import com.google.gwt.user.client.rpc.AsyncCallback;
import com.mess.Mes.shared.Retrieve;

/**
 * The async counterpart of <code>GreetingService</code>.
 */
public interface GreetingServiceAsync {
	void insert(String s1,String s2,String s3,String s4,String s5,String s6, AsyncCallback<String> callback) throws IllegalArgumentException;
	void rem(String s1,String s2,String s3, AsyncCallback<String> callback) throws IllegalArgumentException;
	void login(String s1, String s2, AsyncCallback<String> callback) throws IllegalArgumentException;
	void Contacts(AsyncCallback<Retrieve[]> callback) throws IllegalArgumentException;
	void reg(String s1,String s2,String s3,String s4,String s5, AsyncCallback<String> callback) throws IllegalArgumentException;
	void update(String s1,String s2,String s3, AsyncCallback<String> callback) throws IllegalArgumentException;
	void delete(String s1,String s2,String s3, AsyncCallback<String> callback) throws IllegalArgumentException;
	void state(AsyncCallback<Retrieve[]> callback) throws IllegalArgumentException;
	void zone(AsyncCallback<Retrieve[]> callback) throws IllegalArgumentException;
}