Feature: Boarding the Merchant Feature 

Background: 
	Given user is on MerchantManagementPage 
		|username|password|
		|rajkumar+a2biso@valorpaytech.com|Aadhvik@19|
		
Scenario Outline: Boarding merchant with different set of data 

	When user clicks add button for merchant 
	When user clicks the Full Board Option for mechant 
	When user fil the merchan details from given sheetname "<SheetName>" and rownumber <RowNumber> 
	When user select state 
	And  click the next 
	When user select the store from sheet "<SheetName>" and rownumber <RowNumber> 
	And click addstore
	When user select the device from the list
	When user select the processor 
	When add debitshare
	When user fil the cash discount values from the sheetname "<SheetName>" and rownumber <RowNumber> 
	
	
	Examples: 
		|SheetName|RowNumber|
		|info|0|
		
		
	


	
	

