package com.mess.Mes.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.Widget;

import gwt.material.design.client.ui.MaterialButton;
import gwt.material.design.client.ui.MaterialImage;
import gwt.material.design.client.ui.MaterialListBox;
import gwt.material.design.client.ui.MaterialTextBox;

public class Alarm extends Composite {

	private static AlarmUiBinder uiBinder = GWT.create(AlarmUiBinder.class);
	GreetingServiceAsync a1 = GWT.create(GreetingService.class);

	interface AlarmUiBinder extends UiBinder<Widget, Alarm> {
	}

	public Alarm() {
		initWidget(uiBinder.createAndBindUi(this));
		tt.addClickHandler(new ClickHandler() {

			@Override
			public void onClick(ClickEvent event) {
				// TODO Auto-generated method stub

				String s1 = t1.getText();
				String s2 = t2.getText();
				String s3 = t3.getText();
                
				a1.rem(s1, s2, s3, new AsyncCallback<String>() {

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

		
		hh.addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				// TODO Auto-generated method stub
				RootPanel.get().clear();
				Dash k=new Dash();
				RootPanel.get().add(k);
			}
		});
	}

	
	
	@UiField
	MaterialImage h3;
	
	@UiField
	MaterialButton tt;

	@UiField
	MaterialTextBox t1;

	@UiField
	MaterialTextBox t2;

	@UiField
	MaterialTextBox t3;

	@UiField
	MaterialButton hh;
	
}
