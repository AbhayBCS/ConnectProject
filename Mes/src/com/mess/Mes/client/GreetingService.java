package com.mess.Mes.client;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;
import com.mess.Mes.shared.Retrieve;

/**
 * The client-side stub for the RPC service.
 */
@RemoteServiceRelativePath("greet")
public interface GreetingService extends RemoteService {
	String insert(String s1,String s2,String s3,String s4,String s5,String s6) throws IllegalArgumentException;
	String rem(String s1,String s2,String s3) throws IllegalArgumentException;
	String login(String s1,String s2) throws IllegalArgumentException;
	Retrieve[] Contacts()throws IllegalArgumentException;
	String reg(String s1,String s2,String s3,String s4,String s5)throws IllegalArgumentException;
	String update(String s1,String s2,String s3) throws IllegalArgumentException;
	String delete(String s1,String s2,String s3) throws IllegalArgumentException;
	Retrieve[] state()throws IllegalArgumentException;
	Retrieve[] zone()throws IllegalArgumentException;
}