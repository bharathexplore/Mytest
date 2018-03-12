package cengag

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import java.rmi.server.UID

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords

import internal.GlobalVariable

import MobileBuiltInKeywords as Mobile
import WSBuiltInKeywords as WS
import WebUiBuiltInKeywords as WebUI

public class login {
	
	@Keyword
	def Logincengage(def UID,def PWD){
		

	WebUI.click(findTestObject('Purchase_Existinguser/Page_Higher Ed eBooks  Digital Lear (1)/a_Sign In'))
	
	WebUI.setText(findTestObject('Purchase_Existinguser/Page_Cengage (1)/input_email'), UID)
	
	WebUI.setText(findTestObject('Purchase_Existinguser/Page_Cengage (1)/input_password'), PWD)
	
	WebUI.click(findTestObject('Purchase_Existinguser/Page_Cengage (1)/button_Sign In'))
	
	if(WebUI.verifyElementPresent('xpath=//text()[contains(.,Account)]/ancestor::a[1]'), 20)){
		
		print 'true'
	}
	

}