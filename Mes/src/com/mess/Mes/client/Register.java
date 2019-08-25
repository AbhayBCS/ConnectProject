package com.mess.Mes.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HasText;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.Widget;

import gwt.material.design.client.ui.MaterialButton;
import gwt.material.design.client.ui.MaterialImage;
import gwt.material.design.client.ui.MaterialTextBox;

public class Register extends Composite{

	private static RegisterUiBinder uiBinder = GWT.create(RegisterUiBinder.class);
	GreetingServiceAsync aa = GWT.create(GreetingService.class);
	interface RegisterUiBinder extends UiBinder<Widget, Register> {
	}

	public Register() {
		initWidget(uiBinder.createAndBindUi(this));
	}

	//@UiField
	//MaterialImage h5;

	@UiField
	MaterialTextBox phone;

	@UiField
	MaterialTextBox name;

	@UiField
	MaterialTextBox des;

	@UiField
	MaterialTextBox email,pswd;

	@UiField
	MaterialButton Register;
	
	@UiHandler("Register")
	public void onClick(ClickEvent event) {
		String s1 = phone.getText();
		String s2 = name.getText();
		String s3 = des.getText();
		String s4 = email.getText();
        String s5 = pswd.getText();
        		
		aa.reg(s1, s2, s3, s4,s5, new AsyncCallback<String>() {
			
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