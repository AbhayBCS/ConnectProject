package com.mess.Mes.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.History;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

import gwt.material.design.client.ui.MaterialButton;
import gwt.material.design.client.ui.MaterialImage;
import gwt.material.design.client.ui.MaterialTextBox;

public class Login extends Composite  {

	private static LoginUiBinder uiBinder = GWT.create(LoginUiBinder.class);

	GreetingServiceAsync aa = GWT.create(GreetingService.class);
	interface LoginUiBinder extends UiBinder<Widget, Login> {
	}

	public Login() {
		initWidget(uiBinder.createAndBindUi(this));
		
		Login.addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				// TODO Auto-generated method stub
				History.newItem("cc");
				Myspace.getInstance().koifunct();
			}
		});
	}

	@UiField
	MaterialImage h4;
	
	@UiField
	MaterialTextBox name;

	

	@UiField
	MaterialTextBox password;

	@UiField
	MaterialButton Login;

	


	@UiHandler("Login")
	public void onClick(ClickEvent e) {
		String s1 = name.getText();
		String s2 = password.getText();
		aa.login(s1, s2, new AsyncCallback<String>() {
			
			@Override
			public void onSuccess(String result) {
				// TODO Auto-generated method stub
				Window.alert(result);
			}
			
			@Override
			public void onFailure(Throwable caught) {
				// TODO Auto-generated method stub
				Window.alert(caught.getMessage());
			}
		});
	
	}
}
