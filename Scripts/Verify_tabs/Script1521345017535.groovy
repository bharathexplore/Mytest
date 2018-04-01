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

WebUI.click(findTestObject('Purchase_Existinguser/Page_Higher Ed eBooks  Digital Lear (1)/a_Students'))

WebUI.click(findTestObject('Purchase_Existinguser/Page_Higher Ed eBooks  Digital Lear (1)/searchbox'))

WebUI.setText(findTestObject('Purchase_Existinguser/Page_Higher Ed eBooks  Digital Lear (1)/input_q'), 'science')

WebUI.click(findTestObject('Purchase_Existinguser/Page_Higher Ed eBooks  Digital Lear (1)/svg'))

WebUI.click(findTestObject('Purchase_Existinguser/Page_science - Cengage (1)/a_Science Stories Science Meth'))

WebUI.click(findTestObject('Tabs/Page_Terrorism and Homeland Securit/em_TextbookeBook'))

WebUI.verifyElementPresent(findTestObject('Tabs/Page_Terrorism and Homeland Securit/em_TextbookeBook'), 1)

WebUI.click(findTestObject('Tabs/Page_Terrorism and Homeland Securit/a_.st0fill-ruleevenoddclip-rul'))

WebUI.verifyElementPresent(findTestObject('Tabs/Page_Terrorism and Homeland Securit/em_Digital Platform'), 1)

WebUI.click(findTestObject('Tabs/Page_Terrorism and Homeland Securit/a_Digital Platform  Printfrom1'))

WebUI.verifyElementPresent(findTestObject('Tabs/Page_Terrorism and Homeland Securit/a_Digital Platform  Printfrom1'), 1)

WebUI.click(findTestObject('Tabs/Page_Terrorism and Homeland Securit/a_Bundlefrom219.95'))

WebUI.verifyElementPresent(findTestObject('Tabs/Page_Terrorism and Homeland Securit/em_Bundle'), 1)

WebUI.closeBrowser()

