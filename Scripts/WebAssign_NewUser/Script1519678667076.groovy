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

WebUI.navigateToUrl('https://staging.webassign.net/wa-auth/login')

WebUI.click(findTestObject('Webassign_creation/Page_WebAssign/a_Enter class key'))

WebUI.click(findTestObject('Webassign_creation/Page_WebAssign/div_Enroll With Class Key'))

WebUI.setText(findTestObject('Webassign_creation/Page_WebAssign/input_institution'), 'webassign')

WebUI.setText(findTestObject('Webassign_creation/Page_WebAssign/input_first'), '8625')

WebUI.setText(findTestObject('Webassign_creation/Page_WebAssign/input_second'), '5460')

WebUI.click(findTestObject('Webassign_creation/Page_WebAssign/button_Enroll'))

WebUI.click(findTestObject('Webassign_creation/Page_WebAssign/button_Yes this is my class'))

WebUI.click(findTestObject('Webassign_creation/Page_WebAssign/button_Create Account'))

WebUI.setText(findTestObject('Webassign_creation/Page_WebAssign/input_email'), 'test2s212@mailinator.com')

WebUI.setText(findTestObject('Webassign_creation/Page_WebAssign/input_firstName'), 'test')

WebUI.setText(findTestObject('Webassign_creation/Page_WebAssign/input_lastName'), 'webassign')

WebUI.setText(findTestObject('Webassign_creation/Page_WebAssign/input_password'), 'Password1')

WebUI.setText(findTestObject('Webassign_creation/Page_WebAssign/input_confirmPassword'), 'Password1')

WebUI.click(findTestObject('Webassign_creation/Page_WebAssign/input_agreed'))

WebUI.click(findTestObject('Webassign_creation/Page_WebAssign/button_Create Account_1'))

WebUI.delay(2)

WebUI.click(findTestObject('Webassign_creation/Page_WebAssign/button_Verify Payment'))

//WebUI.rightClick(findTestObject('Webassign_creation/Page_WebAssign - Course Payment/h2_PURCHASE ACCESS'))
WebUI.click(findTestObject('Webassign_creation/Page_WebAssign - Course Payment/button_Continue'))

WebUI.click(findTestObject('Webassign_creation/Page_Shopping Cart/a_Start Secure Checkout'))

WebUI.setText(findTestObject('Webassign_creation/Page_WebAssign - Shipping and Billi/input_firstName'), 'test')

WebUI.setText(findTestObject('Webassign_creation/Page_WebAssign - Shipping and Billi/input_lastName'), 'test')

WebUI.setText(findTestObject('Webassign_creation/Page_WebAssign - Shipping and Billi/input_address1'), '12209 sycamore terrace')

WebUI.setText(findTestObject('Webassign_creation/Page_WebAssign - Shipping and Billi/input_city'), 'Mason')

WebUI.selectOptionByValue(findTestObject('Webassign_creation/Page_WebAssign - Shipping and Billi/select_AlabamaAlaskaArizonaArk'), 
    'OH', true)

WebUI.setText(findTestObject('Webassign_creation/Page_WebAssign - Shipping and Billi/input_zipCode'), '45040')

WebUI.click(findTestObject('Webassign_creation/Page_WebAssign - Shipping and Billi/div_Continue'))

