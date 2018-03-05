<?xml version="1.0" encoding="UTF-8"?>
<WebElementEntity>
   <description></description>
   <name>input_payMethodId</name>
   <tag></tag>
   <elementGuidId>406b368e-2584-43da-aa01-aa50aefd5ede</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <webElementProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>tag</name>
      <type>Main</type>
      <value>input</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>type</name>
      <type>Main</type>
      <value>radio</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>value</name>
      <type>Main</type>
      <value>Credit Card</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>name</name>
      <type>Main</type>
      <value>payMethodId</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>id</name>
      <type>Main</type>
      <value>payMethodId_1</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>onchange</name>
      <type>Main</type>
      <value>JavaScript:this.blur(); CheckoutHelperJS.setCurrentPaymentMethodName('Credit Card');
											CheckoutHelperJS.setOrderId('3735009');
											 
											if ( (typeof(supportPaymentTypePromotions) == 'undefined') || (typeof(supportPaymentTypePromotions) != 'undefined' &amp;&amp; !supportPaymentTypePromotions) ) { 
												CheckoutPayments.loadPaymentSnippet(this, 1); 
												CheckoutPayments.updatePaymentObject(1, 'payMethodId');
											}
											
												if (typeof(supportPaymentTypePromotions) != 'undefined' &amp;&amp; supportPaymentTypePromotions) {
														CheckoutPayments.updateUnboundPaymentToOrder(1);
												}
												
											CheckoutPayments.HideOptOutCC('Credit Card');
										</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath</name>
      <type>Main</type>
      <value>id(&quot;WC_CheckoutPaymentsAndBillingAddressf_div_2_1&quot;)/div[@class=&quot;drop_down_billing&quot;]/input[@id=&quot;payMethodId_1&quot;]</value>
   </webElementProperties>
</WebElementEntity>
