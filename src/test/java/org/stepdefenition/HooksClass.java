package org.stepdefenition;

import org.bassclass.BaseClass;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class HooksClass extends BaseClass {

	@Before
	private void precondtion() {
		launchBrowser();
		windowMaximize();

	}

	@After
	private void postcondition() {
		closeEntireBrowser();

	}

}
