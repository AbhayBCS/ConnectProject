package com.mess.Mes.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HasText;
import com.google.gwt.user.client.ui.Widget;

import gwt.material.design.client.ui.MaterialButton;

public class Adminb extends Composite  {

	private static AdminbUiBinder uiBinder = GWT.create(AdminbUiBinder.class);

	interface AdminbUiBinder extends UiBinder<Widget, Adminb> {
	}

	public Adminb() {
		initWidget(uiBinder.createAndBindUi(this));
	}

	@UiField
	MaterialButton p1;
	
	@UiField
	MaterialButton p2;

}
