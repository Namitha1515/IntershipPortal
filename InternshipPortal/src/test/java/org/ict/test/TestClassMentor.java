package org.ict.test;


import org.ict.pages.ViewMentor;
import org.testng.annotations.Test;

public class TestClassMentor extends TestBase{
	ViewMentor testObj=null;
	@Test(priority=1)
	public void StudentSubmission() {
		testObj=new ViewMentor(driver);
		testObj.clickSubmission();
		testObj.setAddname("Amazon Project");
		testObj.clickBatch();
		testObj.clickBatchname();
		testObj.clickeMail("Student123@gmail.com");
		testObj.setsubmissionLink("https://github.com/abcd4047/Emp.git");
		testObj.clickStudentsubmit();
		testObj.setsubmitAlert();
		
	}
  @Test(priority=2)
	public void MentorView() {
		testObj=new ViewMentor(driver);
		testObj.clickloginButton();
		testObj.setEmail("adon@gmail.com");
		testObj.setadminPassword("adon123456");
		testObj.setLogin(); 
		testObj.clickShow();
		testObj.clickTesting();
		testObj.clickEvaluatebutton();
		testObj.clickMarks();
		testObj.setkMarks();
		testObj.addComments("Good");
		testObj.clickSubmit();
		testObj.setAlert();
	}
	@Test(priority=3)
	public void delete() {
		testObj=new ViewMentor(driver);
		testObj.clickloginButton();
		testObj.setEmail("adon@gmail.com");
		testObj.setadminPassword("adon123456");
		testObj.setLogin(); 
		testObj.clickShow();
		testObj.clickTesting();
		testObj.setDelete();
		testObj.setdeleteAlert();
	}
	@Test(priority=4)
	public void referenceMaterial() {
		testObj=new ViewMentor(driver);
		testObj.clickloginButton();
		testObj.setEmail("adon@gmail.com");
		testObj.setadminPassword("adon123456");
		testObj.setLogin();
		testObj.setReference();
		testObj.setMaterial();
		testObj.setTitle("API testing");
		testObj.setDescription("API Testing with REST Assured");
		testObj.setLink("https://testsigma.com/guides/api-testing/");
		testObj.setAdd();
		testObj.setDeletereference();
		testObj.setreferencedeleteAlert();
}
}