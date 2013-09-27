package pl.libicro.foundationgwt.client;

import pl.libicro.foundationgwt.navigation.TopBar;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.RootPanel;

public class Foundation implements EntryPoint {

	public void onModuleLoad() {
		
		RootPanel.get().add(new TopBar());
		
	}
}
