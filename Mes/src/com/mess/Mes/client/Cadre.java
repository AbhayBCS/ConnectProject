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
import com.google.gwt.user.client.ui.ListBox;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.Widget;

import gwt.material.design.client.ui.MaterialButton;
import gwt.material.design.client.ui.MaterialImage;

public class Cadre extends Composite  {

	private static CadreUiBinder uiBinder = GWT.create(CadreUiBinder.class);

	interface CadreUiBinder extends UiBinder<Widget, Cadre> {
	}

	public Cadre() {
		initWidget(uiBinder.createAndBindUi(this));
		
		K1.addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				// TODO Auto-generated method stub
				History.newItem("dd");
				Myspace.getInstance().koifunct();
			}
		});
		
		S2.addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				// TODO Auto-generated method stub
				RootPanel.get().clear();
				Login l=new Login();
				RootPanel.get().add(l);
				
			}
		});
		
		K2.addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				// TODO Auto-generated method stub
				History.newItem("zone");
				Myspace.getInstance().koifunct();
			}
		});
		
		K3.addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				// TODO Auto-generated method stub
				History.newItem("ddss");
				Myspace.getInstance().koifunct();
			}
		});
		
		K4.addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				// TODO Auto-generated method stub
				Dash s=new Dash();
				RootPanel.get().add(s);
			}
		});
	}

	@UiField
	MaterialImage h1;
	
	@UiField
	MaterialButton K7;
	
	@UiField
	MaterialButton K1;
	
	@UiField
	MaterialButton K2;
	
	@UiField
	MaterialButton K3;
	
	@UiField
	MaterialButton K4;
	
	@UiField
	MaterialButton K8;
	
	@UiField
	MaterialButton K9;
	
	@UiField
	MaterialButton K5;
	
	@UiField
	MaterialButton K6;

	@UiField
	MaterialButton S1;
	
	@UiField
	MaterialButton S2;
	
	@UiField
	ListBox L1;
	
	
}