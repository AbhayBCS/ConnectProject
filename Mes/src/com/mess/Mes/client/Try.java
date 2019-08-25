package com.mess.Mes.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.History;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HasText;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.Widget;

import gwt.material.design.client.ui.MaterialLink;

public class Try extends Composite  {

	private static TryUiBinder uiBinder = GWT.create(TryUiBinder.class);

	interface TryUiBinder extends UiBinder<Widget, Try> {
	}

	public Try() {
		initWidget(uiBinder.createAndBindUi(this));
		b1.addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				// TODO Auto-generated method stub
				History.newItem("ll");
				Myspace.getInstance().koifunct();
			}
		});
		
		b3.addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				// TODO Auto-generated method stub
				History.newItem("rr");
				Myspace.getInstance().koifunct();
			}
		});
		
		m1.addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				// TODO Auto-generated method stub
				RootPanel.get().clear();
				AdminLogin a=new AdminLogin();
				RootPanel.get().add(a);
			}
		});
		
		
		
	}

	
	
	@UiField
	MaterialLink b1;

	@UiField
	MaterialLink s1;
	
	@UiField
	MaterialLink b3;
	
	@UiField
	MaterialLink m1;
}
