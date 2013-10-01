package pl.libicro.foundationgwt.foundation;

import pl.libicro.foundationgwt.navigation.TopBar;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootPanel;

public class FoundationShowCase implements EntryPoint {

	public void onModuleLoad() {
		RootPanel.get().add(new TopBar());
		RootPanel.get().add(new Label("Foundation"));
	}

}
