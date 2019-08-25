package com.mess.Mes.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.Widget;

import gwt.material.design.client.ui.MaterialButton;
import gwt.material.design.client.ui.MaterialImage;
import gwt.material.design.client.ui.MaterialTextBox;

public class message extends Composite  {

	private static messageUiBinder uiBinder = GWT.create(messageUiBinder.class);

	interface messageUiBinder extends UiBinder<Widget, message> {
	}
	GreetingServiceAsync a1=GWT.create(GreetingService.class);
	public message() {
		initWidget(uiBinder.createAndBindUi(this));

		M.addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				// TODO Auto-generated method stub
				
				String s1=t1.getText();
				String s2=t2.getText();
				String s3=t3.getText();
				String s4=t4.getText();
				String s5=t5.getText();
				String s6=t6.getText();
				
				a1.insert(s1, s2, s3, s4, s5, s6, new AsyncCallback<String>() {
					
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
		});
		
		KK.addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				// TODO Auto-generated method stub
				RootPanel.get().clear();
				Dash g=new Dash();
				RootPanel.get().add(g);
			}
		});
		}

	@UiField
	MaterialImage h3;
	
	@UiField
	MaterialButton M;
	
	@UiField
	MaterialButton M1;
	
	@UiField
	MaterialButton M2;
	
	@UiField
	MaterialButton M3;
	
	@UiField
	MaterialTextBox t1;
	
	@UiField
	MaterialTextBox t2;
	
	@UiField
	MaterialTextBox t3;
	
	@UiField
	MaterialTextBox t4;
	
	@UiField
	MaterialTextBox t5;
	
	@UiField
	MaterialTextBox t6;
	
	@UiField
	MaterialButton KK;
	
}
