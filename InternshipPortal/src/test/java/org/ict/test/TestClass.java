package org.ict.test;
import java.time.Duration;
import org.ict.pages.AdminView;
import org.testng.annotations.Test;

public class TestClass  extends TestBase{
	AdminView testObj=null;

	@Test(priority=1)
	public void AdminTest() { // FROM LOGIN TO MENTOR TOPIC UPDATE AND SUBMIT
		
		testObj=new AdminView(driver);
		testObj.clickloginButton();
		testObj.setEmail("admin@gmail.com");
		testObj.setadminPassword("admin@12345");
		testObj.setLogin(); 
		testObj.clickMentorform();
		testObj.setmentorName("Mentor");
		testObj.setmentorEmail("Mentor123@gmail.com");
		testObj.setmentorPhone("8956231478");
		testObj.setmentorPassword("Mentor@123");
		testObj.setTopic("Weather forecasting");
		testObj.setmentorSubmit();
	
		testObj.setMentorupdate();
		testObj.setupdateTopic("ICTAK Internship portal- student view");
		testObj.setupdateSubmit();
	//	testObj.navBack();
		
		
	
}
	
	@Test(priority=2)// Page Not Found Looks like you've followed a broken link or entered a URL that doesn't exist on this site.
	public void delete() {
	
		testObj=new AdminView(driver);
		testObj.clickloginButton();
		testObj.setEmail("admin@gmail.com");
		testObj.setadminPassword("admin@12345");
		testObj.setLogin(); 
		testObj.clickMentors();
		testObj.deleteMentors();
		testObj.clickLogout();
}
	@Test(priority=3)
	public void ProjectTest() { //For adding project
	
		testObj=new AdminView(driver);
		testObj.clickloginButton();
		testObj.setEmail("admin@gmail.com");
		testObj.setadminPassword("admin@12345");
		testObj.setLogin();
		testObj.clickProjects();
		testObj.clickaddProjects();
		testObj.setprojectTopic("E Commerce");
		testObj.clickAddbutton();
		
		
		
}
	@Test(priority=4)
	public void deleteTest() {

		testObj=new AdminView(driver);
		testObj.clickloginButton();
		testObj.setEmail("admin@gmail.com");
		testObj.setadminPassword("admin@12345");
		testObj.setLogin();
		testObj.clickProjects();
		testObj.clickDeleteproject();
		testObj.clickLogoutproject();
	}
	
}