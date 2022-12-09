Feature: Boarding the ISO Feature 

Background: 
	Given user is on UserManagementPage 
		|username|password|
		|rajkumar+demoadmin@valorpaytech.com|Aadhvik@19|
		
	Scenario: to verify the total users count 
	When User clicks users tile 
	When User clicks Iso tile 
	When User clicks Sub Iso tile 
	When User clicks Merchants tile 
	When User clicks Operators tile 
	When User clicks Internal User tile 	
		
Scenario Outline: Boarding iso with different set of data 

    When user clicks add button 
	When user clicks add customer  
	When user files the details from given sheetname "<SheetName>" and rownumber <RowNumber> 
	And User clicks the next button 
	When user files the processor details from given sheetname "<SheetName>" and rownumber <RowNumber>
	And user click the next button
	When user select all the modules
	Examples: 
	
		|SheetName|RowNumber|
		|rj|0|
	

	
		
		
		
		


	
