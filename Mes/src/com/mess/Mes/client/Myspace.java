package com.mess.Mes.client;

import com.google.gwt.user.client.History;
import com.google.gwt.user.client.ui.RootPanel;

public class Myspace {
     static Myspace me=null;
     Login l=null;
     Register r=null;
     Try t=null;
     Cadre c=null;
     Dash d=null;
     Alarm a=null;
     Contacts ct=null;
     message m=null;
     Dashstate dd=null;
     Statecontacts ss=null;
     Dashzone ddd=null;
     Zonecontact z=null;
     
     private Myspace() {
    	 
     }
     
     static Myspace getInstance() {
    	 if(me==null)
    		 me=new Myspace();
    	 return me;
     }
     
     public void koifunct() {
    	 if(History.getToken().equals("ll")) {
    		 RootPanel.get().clear();
    		 RootPanel.get().add(getLogin());
    	 }
    	 
    	 else if(History.getToken().equals("rr")) {
    		 RootPanel.get().clear();
    		 RootPanel.get().add(getRegister());
    	 }
    	 
    	 else if(History.getToken().equals("tt")) {
    		 RootPanel.get().clear();
    		 RootPanel.get().add(getTry());
    	 }
    	 
    	 else if(History.getToken().equals("cc")) {
    		 RootPanel.get().clear();
    		 RootPanel.get().add(getCadre());
    	 }
    	 
    	 else if(History.getToken().equals("dd")) {
    		 RootPanel.get().clear();
    		 RootPanel.get().add(getDash());
    	 }
    	 
    	
    	 
    	 else if(History.getToken().equals("ctt")) {
    		 RootPanel.get().clear();
    		 RootPanel.get().add(getContacts());
    	 }
    	 
    	 else if(History.getToken().equals("mm")) {
    		 RootPanel.get().clear();
    		 RootPanel.get().add(getmessage());
    	 }
    	 else if(History.getToken().equals("aa")) {
    		 RootPanel.get().clear();
    		 RootPanel.get().add(getAlarm());
    	 }
    	 else if(History.getToken().equals("ddss")) {
    		 RootPanel.get().clear();
    		 RootPanel.get().add(getDashstate());
    	 }
    	 
    	 else if(History.getToken().equals("sc")) {
    		 RootPanel.get().clear();
    		 RootPanel.get().add(getStatecontacts());
    	 }
    	 
    	 else if(History.getToken().equals("zone")) {
    		 RootPanel.get().clear();
    		 RootPanel.get().add(getDashzone());
    	 }
    	 
    	 else if(History.getToken().equals("zc")) {
    		 RootPanel.get().clear();
    		 RootPanel.get().add(getZonecontact());
    	 }
     }
     
     Login getLogin() {
    	 if(l==null) {
    		 l=new Login();
    	 }
    	 return l;
     }
     
     Register getRegister() {
    	 if(r==null) {
    		 r=new Register();
    	 }
    	 return r;
     }
     
     Try getTry() {
    	 if(t==null) {
    		 t=new Try();
    	 }
    	 return t;
     }
     
     Cadre getCadre() {
    	 if(c==null) {
    		 c=new Cadre();
    	 }
    	 return c;
     }
     
     Dash getDash() {
    	 if(d==null) {
    		 d=new Dash();
    	 }
    	 return d;
     }
     
   
     
     Contacts getContacts() {
    	 if(ct==null) {
    		 ct=new Contacts();
    	 }
    	 return ct;
     }
     
     message getmessage() {
    	 if(m==null) {
    		 m=new message();
    	 }
    	 return m;
     }
     Alarm getAlarm() {
    	 if(a==null) {
    		 a=new Alarm();
    	 }
    	 return a;
     }
     
     Dashstate getDashstate() {
    	 if(dd==null) {
    		 dd=new Dashstate();
    	 }
    	 return dd;
     }
     
     Statecontacts getStatecontacts() {
    	 if(ss==null) {
    		 ss=new Statecontacts();
    	 }
    	 return ss;
     }
    	
     Dashzone getDashzone() {
    	 if(ddd==null) {
    		 ddd=new Dashzone();
    	 }
    	 return ddd;
     }
     
     Zonecontact getZonecontact() {
    	 if(z==null) {
    		 z=new Zonecontact();
    	 }
    	 return z;
     }
     
     }