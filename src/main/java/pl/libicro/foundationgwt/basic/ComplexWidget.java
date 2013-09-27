package pl.libicro.foundationgwt.basic;

import com.google.gwt.user.client.DOM;
import com.google.gwt.user.client.ui.ComplexPanel;
import com.google.gwt.user.client.ui.HasWidgets;
import com.google.gwt.user.client.ui.Widget;

public class ComplexWidget extends ComplexPanel implements HasWidgets {

	public ComplexWidget(String tag) {
		setElement(DOM.createElement(tag));
	}

	@Override
	public void add(Widget w) {
		add(w, getElement());
	}
	
	public void insert(Widget w, int beforeIndex) {
		insert(w, getElement(), beforeIndex, true);
	}

//	public void setStyle(Style style) {
//		StyleHelper.setStyle(this, style);
//	}
//
//	public void addStyle(Style style) {
//		StyleHelper.addStyle(this, style);
//	}
//
//	public void removeStyle(Style style) {
//		StyleHelper.removeStyle(this, style);
//	}

//	public void setShowOn(Device device) {
//		ResponsiveHelper.setShowOn(this, device);
//	}
//
//	public void setHideOn(Device device) {
//		ResponsiveHelper.setHideOn(this, device);
//	}

}