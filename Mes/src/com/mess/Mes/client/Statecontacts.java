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
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.Widget;
import com.mess.Mes.shared.Retrieve;

import gwt.material.design.client.ui.MaterialButton;
import gwt.material.design.client.ui.MaterialColumn;
import gwt.material.design.client.ui.MaterialRow;
import gwt.material.design.client.ui.MaterialTextBox;

public class Statecontacts extends Composite  {

	private static StatecontactsUiBinder uiBinder = GWT.create(StatecontactsUiBinder.class);

	interface StatecontactsUiBinder extends UiBinder<Widget, Statecontacts> {
	}

	public Statecontacts() {
		initWidget(uiBinder.createAndBindUi(this));
	}
	GreetingServiceAsync a2=GWT.create(GreetingService.class);
	@UiHandler("b3")
	public void onClick(ClickEvent e)
	{
		a2.state(new AsyncCallback<Retrieve[]>() {

			@Override
			public void onFailure(Throwable caught) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void onSuccess(Retrieve[] result) {
				// TODO Auto-generated method stub
				for(int i=0;i<result.length;i++)
				{
	                  MaterialRow r=new MaterialRow();
	                  
	                  MaterialColumn c2=new MaterialColumn();
	                  MaterialTextBox tb2=new MaterialTextBox();
	                  tb2.setText(result[i].getPhone());
	                  
	                  MaterialColumn c1=new MaterialColumn();
	                  MaterialTextBox tb1=new MaterialTextBox();
	                  tb1.setText(result[i].getName());
	                 
	                  MaterialColumn c3=new MaterialColumn();
	                  MaterialTextBox tb3=new MaterialTextBox();
	                  tb3.setText(result[i].getDes());
	                  r.add(c2);
	                  r.add(c1);
	                  r.add(c3);
	                  c2.add(tb2);
	                  c1.add(tb1);
	                  c3.add(tb3);
	                  RootPanel.get().add(r);
				}
			}
	});
}
	
	
	
	@UiField
	MaterialButton b1;
	
	@UiField
	MaterialButton b2;
	
	@UiField
	MaterialButton b3;
	
	@UiField
	MaterialTextBox v1;
	
	@UiField
	MaterialTextBox v2;
	
	@UiField
	MaterialTextBox v3;
	

}