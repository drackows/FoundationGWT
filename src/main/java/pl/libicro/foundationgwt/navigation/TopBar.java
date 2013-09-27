package pl.libicro.foundationgwt.navigation;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.Element;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

public class TopBar extends Composite {

	private static TopBarUiBinder uiBinder = GWT.create(TopBarUiBinder.class);
	
	@UiField Element topNav;
	
	interface TopBarUiBinder extends UiBinder<Widget, TopBar> {
	}

	public TopBar() {
		initWidget(uiBinder.createAndBindUi(this));
		
		topNav.addClassName("dupeczkla");
		
	}

}
