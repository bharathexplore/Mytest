<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>New Request</name>
   <tag></tag>
   <elementGuidId>3ef8d139-bdb1-423f-82ca-272271881254</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <httpBody></httpBody>
   <restRequestMethod></restRequestMethod>
   <restUrl></restUrl>
   <serviceType>SOAP</serviceType>
   <soapBody>&lt;soapenv:Envelope xmlns:soapenv=&quot;http://schemas.xmlsoap.org/soap/envelope/&quot; xmlns:ssow=&quot;http://ws.thomsonlearning.com:80/ssows&quot; xmlns:java=&quot;java:com.tl.ssows.parameters&quot;>
   &lt;soapenv:Header/>
   &lt;soapenv:Body>
      &lt;ssow:getToken>
         &lt;java:password>Password1&lt;/java:password>
         &lt;java:uid>newuser01@pj.com&lt;/java:uid>
      &lt;/ssow:getToken>
   &lt;/soapenv:Body>
&lt;/soapenv:Envelope></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod>SOAP</soapRequestMethod>
   <soapServiceFunction>getToken</soapServiceFunction>
   <wsdlAddress>http://qa-ws.cengage.com/ssows/SSOws?wsdl</wsdlAddress>
</WebServiceRequestEntity>
