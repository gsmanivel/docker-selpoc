package com.docker.tests;

import org.testng.annotations.Test;
import com.docker.pages.GooglePage;

public class GoogleTest extends BaseTest {

	private GooglePage google;

	@Test
	public void googleTest1() throws InterruptedException {
		google = new GooglePage(driver);
		google.goTo();
		google.searchFor("automation");
	}

	@Test
	public void googleTest2() throws InterruptedException {
		google = new GooglePage(driver);
		google.goTo();
		google.searchFor("auto");
	}

	@Test
	public void googleTest3() throws InterruptedException {
		google = new GooglePage(driver);
		google.goTo();
		google.searchFor("mation");
	}

	@Test
	public void googleTest4() throws InterruptedException {
		google = new GooglePage(driver);
		google.goTo();
		google.searchFor("tom");
	}

	@Test
	public void googleTest5() throws InterruptedException {
		google = new GooglePage(driver);
		google.goTo();
		google.searchFor("mat");
	}

}