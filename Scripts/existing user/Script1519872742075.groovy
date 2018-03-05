import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://s-www.cengage.com/')

WebUI.click(findTestObject('Purchase_Existinguser/Page_Higher Ed eBooks  Digital Lear (1)/a_Sign In'))

WebUI.setText(findTestObject('Purchase_Existinguser/Page_Cengage (1)/input_email'), 'cengage@test1.com')

WebUI.setText(findTestObject('Purchase_Existinguser/Page_Cengage (1)/input_password'), 'Password1')

WebUI.click(findTestObject('Purchase_Existinguser/Page_Cengage (1)/button_Sign In'))

WebUI.click(findTestObject('Purchase_Existinguser/Page_Higher Ed eBooks  Digital Lear (1)/a_Students'))

WebUI.click(findTestObject('Purchase_Existinguser/Page_Higher Ed eBooks  Digital Lear (1)/searchbox'))

WebUI.setText(findTestObject('Purchase_Existinguser/Page_Higher Ed eBooks  Digital Lear (1)/input_q'), 'science')

WebUI.click(findTestObject('Purchase_Existinguser/Page_Higher Ed eBooks  Digital Lear (1)/svg'))

WebUI.click(findTestObject('Purchase_Existinguser/Page_science - Cengage (1)/a_Science Stories Science Meth'))

WebUI.click(findTestObject('Purchase_Existinguser/Page_Science Stories Science Method (1)/button_Add to Cart'))

WebUI.click(findTestObject('Purchase_Existinguser/Page_Science Stories Science Method (1)/a_here'))

WebUI.click(findTestObject('Purchase_Existinguser/Page_CengageUS - Shipping and Billi/a_YES use it anyway'))

WebUI.click(findTestObject('Purchase_Existinguser/Page_Shopping Cart (1)/div_START SECURE CHECKOUT'))

WebUI.click(findTestObject('Purchase_Existinguser/Page_CengageUS - Shipping and Billi (1)/input_SameShippingAndBillingAd'))

WebUI.click(findTestObject('Purchase_Existinguser/Page_CengageUS - Shipping and Billi (1)/div_Next Choose Shipping'))

WebUI.click(findTestObject('Purchase_Existinguser/Page_CengageUS - Shipping and Billi (1)/div_grayOut'))

WebUI.click(findTestObject('Purchase_Existinguser/Page_CengageUS - Shipping and Billi (1)/a_YES use it anyway'))

WebUI.click(findTestObject('Purchase_Existinguser/Page_CengageUS - Shipping and Billi (1)/div_Next Choose Payment'))

WebUI.click(findTestObject('Purchase_Existinguser/Page_CengageUS - Shipping and Billi (1)/div_Complete Purchase'))

a = WebUI.getText(findTestObject('Object Repository/Purchase_Existinguser/Page_CengageUS - Order Confirmation (1)/b_3770012'))

WebUI.closeBrowser()

