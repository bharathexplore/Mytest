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

WebUI.navigateToUrl('https://s-c-login.cengage.com/cb/')

WebUI.click(findTestObject('Purchase_Newuser_SSO/Page_Cengage/a_Student'))

WebUI.setText(findTestObject('Purchase_Newuser_SSO/Page_CengageBrain - Login or Regist/input_email'), 'ssodasboard1@mailinator.com')

WebUI.click(findTestObject('Purchase_Newuser_SSO/Page_CengageBrain - Login or Regist/a_Create a new account'))

WebUI.setText(findTestObject('Purchase_Newuser_SSO/Page_CengageBrain - New Student Reg/input_fname'), 'Test')

WebUI.setText(findTestObject('Purchase_Newuser_SSO/Page_CengageBrain - New Student Reg/input_lname'), 'test')

WebUI.setText(findTestObject('Purchase_Newuser_SSO/Page_CengageBrain - New Student Reg/input_password'), 'Password1')

WebUI.setText(findTestObject('Purchase_Newuser_SSO/Page_CengageBrain - New Student Reg/input_confirmPassword'), 'Password1')

WebUI.click(findTestObject('Purchase_Newuser_SSO/Page_CengageBrain - New Student Reg/i_questionSelectBoxItArrow'))

WebUI.click(findTestObject('Purchase_Newuser_SSO/Page_CengageBrain - New Student Reg/div_New Students'))

WebUI.setText(findTestObject('Purchase_Newuser_SSO/Page_CengageBrain - New Student Reg/input_answer'), 'Test')

WebUI.click(findTestObject('Purchase_Newuser_SSO/Page_CengageBrain - New Student Reg/input_acceptEULA'))

WebUI.click(findTestObject('Purchase_Newuser_SSO/Page_CengageBrain - New Student Reg/a_Create my account'))

WebUI.click(findTestObject('Purchase_Newuser_SSO/Page_CengageBrain - Find your insti/span_Select a Location'))

WebUI.click(findTestObject('Purchase_Newuser_SSO/Page_CengageBrain - Find your insti/div_Select your Institution Ty'))

WebUI.click(findTestObject('Purchase_Newuser_SSO/Page_CengageBrain - Find your insti/i_institutionTypeSelectBoxItAr'))

WebUI.click(findTestObject('Purchase_Newuser_SSO/Page_CengageBrain - Find your insti/div_of my            zipcode'))

WebUI.click(findTestObject('Purchase_Newuser_SSO/Page_CengageBrain - Find your insti/i_radiusSelectBoxItArrow'))

WebUI.click(findTestObject('Purchase_Newuser_SSO/Page_CengageBrain - Find your insti/label_statecity'))

WebUI.setText(findTestObject('Purchase_Newuser_SSO/Page_CengageBrain - Find your insti/input_zipcode'), '45040')

WebUI.click(findTestObject('Purchase_Newuser_SSO/Page_CengageBrain - Find your insti/a_Find'))

WebUI.click(findTestObject('Purchase_Newuser_SSO/Page_CengageBrain - Select your ins/input_institutionId'))

WebUI.click(findTestObject('Purchase_Newuser_SSO/Page_CengageBrain - Select your ins/a_Continue'))

WebUI.click(findTestObject('Purchase_Newuser_SSO/Page_Cengage/a_Add a Course or Register a P'))

WebUI.setText(findTestObject('Purchase_Newuser_SSO/Page_Cengage/input_accessCode'), '4LPPG21ZZB79')

WebUI.click(findTestObject('Purchase_Newuser_SSO/Page_Cengage/button_SUBMIT'))

WebUI.click(findTestObject('Purchase_Newuser_SSO/Page_Cengage/button_Enter the new course'))

WebUI.click(findTestObject('Purchase_Newuser_SSO/Page_Cengage/button_See Purchase Options'))

WebUI.click(findTestObject('Purchase_Newuser_SSO/Page_Cengage/input_digitalSingleProductOpti'))

WebUI.click(findTestObject('Purchase_Newuser_SSO/Page_Cengage/button_Add to Cart'))

WebUI.closeBrowser()

