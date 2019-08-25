package com.mess.Mes.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HasText;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.Widget;

import gwt.material.design.client.ui.MaterialButton;
import gwt.material.design.client.ui.MaterialTextBox;

public class AdminLogin extends Composite  {

	private static AdminLoginUiBinder uiBinder = GWT.create(AdminLoginUiBinder.class);

	interface AdminLoginUiBinder extends UiBinder<Widget, AdminLogin> {
	}

	public AdminLogin() {
		initWidget(uiBinder.createAndBindUi(this));
		
		k3.addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				// TODO Auto-generated method stub
				RootPanel.get().clear();
			    Adminb a=new Adminb();
			    RootPanel.get().add(a);
			}
		});
	}

	@UiField
	MaterialTextBox k1;
	
	@UiField
	MaterialTextBox k2;
	
	@UiField
	MaterialButton k3;

}
