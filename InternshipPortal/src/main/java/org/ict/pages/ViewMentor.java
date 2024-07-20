package org.ict.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ViewMentor {
		WebDriver driver;
		 WebDriverWait wait; 
		public ViewMentor(WebDriver driver) {              
			this.driver=driver;
			this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		}
		// STUDENT SUBMISSION
		public void clickSubmission() {
			WebElement submission=driver.findElement(By.xpath("//a[normalize-space()='Student Submissions']"));
			submission.click();
		}
		public void setAddname(String name) {
			WebElement studentName=driver.findElement(By.name("Name"));
			studentName.sendKeys(name);
		}

		public void clickBatch() {
			WebElement batch=driver.findElement(By.xpath("//div[@role='combobox']"));
			batch.click();
		}
		public void clickBatchname() {
			WebElement name=driver.findElement(By.xpath("//li[@data-value='KKEM March ST']"));
			name.click();
		}
		
		public void clickeMail(String emailid) {
			WebElement mailId=driver.findElement(By.name("Email"));
			mailId.sendKeys(emailid);
		}
		public void setsubmissionLink(String link) {
			WebElement submisssionLink=driver.findElement(By.name("SubmissionLink"));
			submisssionLink.sendKeys(link);
		}
		public void clickStudentsubmit() {
			WebElement submitButton=driver.findElement(By.xpath("//button[normalize-space()='SUBMIT']"));
			submitButton.click();
		}
		public void setsubmitAlert() {
			wait.until(ExpectedConditions.alertIsPresent());
	        driver.switchTo().alert().accept();
	    }
		
		//EDIT,EVALUATE AND UPDATE TOPICS
		public void clickloginButton() {
			WebElement login=driver.findElement(By.xpath("//a[normalize-space()='Login']"));
			login.click();
		}
		public void setEmail(String mail) {
			WebElement eMail=driver.findElement(By.id(":r0:"));
			eMail.sendKeys(mail);
		}
		public void setadminPassword(String pword) {
			WebElement password=driver.findElement(By.id(":r1:"));
			password.sendKeys(pword);
		}
		public void setLogin() {
			WebElement loginUser=driver.findElement(By.xpath("//button[@type='submit']"));
			loginUser.click();
		}
		public void clickShow() {
			WebElement showButton=driver.findElement(By.xpath("(//button[normalize-space()='SHOW'])[1]"));
			showButton.click();
		}
		public void clickTesting() {
			WebElement testButton=driver.findElement(By.xpath("(//a[contains(text(),'VIEW')])[2]"));
			testButton.click();
		}
		public void clickEvaluatebutton() {
			WebElement evaluateButton=driver.findElement(By.xpath("(//a[normalize-space()='EVALUATE'])[1]"));
			evaluateButton.click();
		}
		public void clickMarks() {
			WebElement marks=driver.findElement(By.xpath("//div[@ role='combobox']"));
			marks.click();
			
		    
		}
		public void setkMarks() {
		WebElement totalMarks=driver.findElement(By.xpath("//li[@data-value='8']"));
			//  WebElement totalMarks = 	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[@role='option' and @data-value='8']")));
			totalMarks.click();
		}
		public void addComments(String cmd) {
			WebElement comment=driver.findElement(By.name("Comments"));
			 comment.sendKeys(cmd);
		}
		public void clickSubmit() {
			WebElement submit=driver.findElement(By.xpath("//button[@type='button']"));
			 submit.click();
		}
		public void setAlert() {
			wait.until(ExpectedConditions.alertIsPresent());
	        driver.switchTo().alert().accept();
	    }
		//DELETE PROJECT TOPIC
		public void setDelete() {
			//WebElement delete=driver.findElement(By.xpath("(//button[@type='button'][normalize-space()='DELETE'])[14]"));
			WebElement delete=driver.findElement(By.xpath("(//button[@type='button'][normalize-space()='DELETE'])[14]"));
			 delete.click();
	    }
		public void setdeleteAlert() {
			wait.until(ExpectedConditions.alertIsPresent());
	        driver.switchTo().alert().accept();
	    }
		//REFERENCE MATERIAL
		public void setReference() {
			WebElement material=driver.findElement(By.xpath("(//a[normalize-space()='Reference Material'])[1]"));
			 material.click();
		}
		public void setMaterial() {
			WebElement add=driver.findElement(By.xpath("(//button[normalize-space()='Add Material'])[1]"));
			 add.click();
		}
		public void setTitle(String titl) {
			WebElement title=driver.findElement(By.xpath("//label[text()=\"Title\"]/following-sibling::div//input"));
			 title.sendKeys(titl);
		}
		public void setDescription(String dp) {
			WebElement desc=driver.findElement(By.xpath("//label[text()=\"Description\"]/following-sibling::div//input"));
			desc.sendKeys(dp);
		}
		public void setLink(String link) {
			WebElement webLink=driver.findElement(By.xpath("//label[text()=\"Link\"]/following-sibling::div//input"));
			webLink.sendKeys(link);
		}
		public void setAdd() {
			WebElement addButn=driver.findElement(By.xpath("(//button[normalize-space()='Add'])[1]"));
			addButn.click();
	    }
		public void setDeletereference() {
			WebElement delButn=driver.findElement(By.xpath("(//button[@type='button'][normalize-space()='Delete'])[4]"));
			delButn.click();
	    }
		public void setreferencedeleteAlert() {
			wait.until(ExpectedConditions.alertIsPresent());
	        driver.switchTo().alert().accept();
		}

}