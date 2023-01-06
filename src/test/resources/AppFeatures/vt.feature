Feature: Virtual Termainal feature

Background: 
	Given user is on vtPage 
		|username|password|
		|rajkumar@valorpaytech.com|Aadhvik@19|

Scenario: to do Sale
	When user clicks sale radio button
	Then user enter amount
	
	|1000|
	|9790484550|
	
	When user enters following details
	
	|Cardnumber|cvv|MM/YY|cardholdername|
	|4111 1111 1111 1111|999|12/23|peter|
	
	
	Then select process
	And  click summary details
	And click close
