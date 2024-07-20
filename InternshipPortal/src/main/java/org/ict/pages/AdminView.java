package org.ict.pages;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AdminView {
	WebDriver driver;
	public AdminView (WebDriver driver) {              
		this.driver=driver;
	}
	//SETTING UP MENTOR INFO
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
	public void clickMentorform() {
		WebElement form=driver.findElement(By.xpath("//a[normalize-space()='Mentor Form']"));
		form.click();
	}
	public void setmentorName(String name) {
		WebElement mentorName=driver.findElement(By.name("Name"));
		mentorName.sendKeys(name);
	}
	public void setmentorEmail(String email) {
		WebElement mentorEmail=driver.findElement(By.name("Email"));
		mentorEmail.sendKeys(email);
	}
	public void setmentorPhone(String phno) {
		WebElement phoneNum=driver.findElement(By.name("PhoneNumber"));
		phoneNum.sendKeys(phno);
	}
	public void setmentorPassword(String password) {
		WebElement mentorPass=driver.findElement(By.name("Password"));
		mentorPass.sendKeys(password);
	}
	public void setTopic(String txt) {  //NO SELECT OPTION FOR THIS THE NODE IS DIV
		WebElement topic=driver.findElement(By.id("demo-simple-select"));
	topic.click();
	WebElement projectTopic=driver.findElement(By.xpath("//li[normalize-space()='Weather forecasting']"));
	projectTopic.sendKeys(txt);
	projectTopic.click();
	
	}
	public void setmentorSubmit() {
		WebElement submit=driver.findElement(By.xpath("//button[normalize-space()='SUBMIT']"));
		
		  JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("arguments[0].click();", submit);
	       alertWait();
	   //    navigateBackToAdminDashboard();
	}
	
	private void alertWait() {
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
	    	try {
	            wait.until(ExpectedConditions.alertIsPresent());
	            Alert alert = driver.switchTo().alert();
	            String alertText = alert.getText();
	            System.out.println("Alert Text: " + alertText);
	            alert.accept();
	        } catch (Exception e) {
	            System.out.println("No alert present or unable to handle alert: " + e.getMessage());
	            
	            System.out.println("Current URL: " + driver.getCurrentUrl());
	            System.out.println("Page Source: " + driver.getPageSource());
	            
	        }}
	 

	// UPDATING MENTOR INFO
	
	
	public void setMentorupdate() {
		
		WebElement update=driver.findElement(By.xpath("(//button[@type='button'][normalize-space()='Update'])[12]"));
		update.click();}
		public void setupdateTopic(String txtup) {  //NO SELECT OPTION FOR THIS THE NODE IS DIV
			WebElement topic=driver.findElement(By.id("demo-simple-select"));
		topic.click();
		WebElement updateTopic=driver.findElement(By.xpath("//li[normalize-space()='ICTAK Internship portal- student view']"));
		updateTopic.sendKeys(txtup);
		updateTopic.click();
	}
		public void setupdateSubmit() {
			WebElement submitUpdate=driver.findElement(By.xpath("//button[normalize-space()='SUBMIT']"));
			
			  JavascriptExecutor js = (JavascriptExecutor) driver;
		        js.executeScript("arguments[0].click();", submitUpdate);
		       alertWait();
		       
		}

		private void updatetWait() {
		    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		    	try {
		            wait.until(ExpectedConditions.alertIsPresent());
		            Alert alert = driver.switchTo().alert();
		            String alertText = alert.getText();
		            System.out.println("Alert Text: " + alertText);
		            alert.accept();
		        } catch (Exception e) {
		            System.out.println("No alert present or unable to handle alert: " + e.getMessage());
		            
		            System.out.println("Current URL: " + driver.getCurrentUrl());
		            System.out.println("Page Source: " + driver.getPageSource());
		            
		      
		            
}}
		//DELETING MENTOR INFO
		public void clickMentors() {
			WebElement mentors=driver.findElement(By.xpath("(//a[contains(text(),'Mentors')])[1]"));
			mentors.click();
		}
		public void deleteMentors() {
			WebElement delete=driver.findElement(By.xpath("(//button[@type='button'][normalize-space()='Delete'])[12]"));
			delete.click();
			alertdeleteWait();
		}
		private void alertdeleteWait() {
		    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		    	try {
		            wait.until(ExpectedConditions.alertIsPresent());
		            Alert alert = driver.switchTo().alert();
		            String alertText = alert.getText();
		            System.out.println("Alert Text: " + alertText);
		            alert.accept();
		        } catch (Exception e) {
		            System.out.println("No alert present or unable to handle alert: " + e.getMessage());
		            
		            System.out.println("Current URL: " + driver.getCurrentUrl());
		            System.out.println("Page Source: " + driver.getPageSource());
		            
		        }}
		public void clickLogout() {
			WebElement logout=driver.findElement(By.xpath("(//a[normalize-space()='Logout'])[1]"));
			logout.click();
		}
		// ADDING PROJECTS
		public void clickProjects() {
			WebElement projects=driver.findElement(By.xpath("//a[@href='/project']//div[@class='card']//div[@class='card--title']"));
			projects.click();
		}
		public void clickaddProjects() {
			WebElement addProjects=driver.findElement(By.xpath("//button[normalize-space()='Add Project']"));
			addProjects.click();
		}
		public void setprojectTopic(String topic) {
			WebElement topics=driver.findElement(By.xpath("//input[@id=':r3:']"));
			topics.sendKeys(topic);
		}
		public void clickAddbutton() {
			WebElement button=driver.findElement(By.xpath("//button[normalize-space()='Add']"));
			button.click();
		}
		public void clickEditbutton() {
			WebElement edit=driver.findElement(By.xpath("(//button[@type='button'][normalize-space()='Edit'])[4]"));
			edit.click();
		}
		//DELETE PROJECT TOPIC AND LOGOUT
		public void clickDeleteproject() {
			WebElement projectDelete=driver.findElement(By.xpath("//button[contains(text(), \"Delete\")]"));
			projectDelete.click();
			deleteprojectalertWait();
			}
		private void deleteprojectalertWait() {
		    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		    	try {
		            wait.until(ExpectedConditions.alertIsPresent());
		            Alert alert = driver.switchTo().alert();
		            String alertText = alert.getText();
		            System.out.println("Alert Text: " + alertText);
		            alert.accept();
		        } catch (Exception e) {
		            System.out.println("No alert present or unable to handle alert: " + e.getMessage());
		            
		            System.out.println("Current URL: " + driver.getCurrentUrl());
		            System.out.println("Page Source: " + driver.getPageSource());
		            
		        }}
		public void clickLogoutproject() {
			WebElement projectLogout=driver.findElement(By.xpath("//a[contains(text(), \"Logout\")]"));
			projectLogout.click();
			}

}









