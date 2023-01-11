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
		|rajkumar@valorpaytech.com|
	When user enters following details 
		|Cardnumber|cvv|MM/YY|cardholdername|
		|4111 1111 1111 1111|999|12/23|peter|	
	Then select process 
	And  click summary details 
	And click close 
@Sanity 
Scenario: to do Authorization 
	When user clicks Authorization radio button 
	Then user enters amount 
		|1000|
		|9790484550|
		|rajkumar@valorpaytech.com|	
	When user enter following details 
		|Cardnumber|cvv|MM/YY|cardholdername|
		|4111 1111 1111 1111|999|12/23|peter|	
	Then select on process 
	And  clicks summary details 
	And clicks close 
@refund 
Scenario: to do Refund 
	When user clicks Refund radio button 
	Then user enters amount for refund 
		|1000|
		|9790484550|
		|rajkumar@valorpaytech.com|
	When user enter following card details 
		|Cardnumber|cvv|MM/YY|cardholdername|
		|4111 1111 1111 1111|999|12/23|peter|	
	Then select on the process 
	And  clicks the summary details 
	And clicks the close 
@einvoice 
Scenario: to do E-invoic 
	When user clicks Einvoice radio button 
	Then user enters amount for paynowlink 
		|1000|
		|9790484550|	
		|rajkumar@valorpaytech.com|
	And click send E-invoice 
@cash 
Scenario: to do Cash  
	When user clicks cash radio button 
	Then user enters amount for cash
		|1000|
		|9790484550|	
		|rajkumar@valorpaytech.com|
		
		
		
	