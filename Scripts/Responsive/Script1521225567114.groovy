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

WebUI.click(findTestObject('Popup_Copypaste_Link/Page_Higher Ed eBooks  Digital Lear/a_Students'))

WebUI.click(findTestObject('Purchase_Existinguser/Page_Higher Ed eBooks  Digital Lear (1)/searchbox'))

WebUI.setText(findTestObject('Popup_Copypaste_Link/Page_Terrorism and Homeland Securit/input_q'), 'science')

WebUI.click(findTestObject('Purchase_Existinguser/Page_Higher Ed eBooks  Digital Lear (1)/svg'))

WebUI.click(findTestObject('Popup_Copypaste_Link/Page_science - Cengage/a_Science Stories Science Meth'))

WebUI.click(findTestObject('Popup_Copypaste_Link/Page_Science Stories Science Method/a_Copy link here to share lore'))

WebUI.click(findTestObject('Popup_Copypaste_Link/Page_Science Stories Science Method/button_Click Here to Copy Prod'))

WebUI.click(findTestObject('Popup_Copypaste_Link/Page_Science Stories Science Method/button_Click Here to Copy Prod'))

WebUI.click(findTestObject('Popup_Copypaste_Link/Page_Science Stories Science Method/span_Product Link Copied to Cl'))

WebUI.click(findTestObject('Popup_Copypaste_Link/Page_Science Stories Science Method/div_Share Product    Group Cre'))

WebUI.verifyElementPresent(findTestObject('Popup_Copypaste_Link/Page_Science Stories Science Method/span_Product Link Copied to Cl'), 
    2)

