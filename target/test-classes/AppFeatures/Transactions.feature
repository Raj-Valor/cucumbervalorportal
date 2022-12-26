Feature: Transactions feature for portal


Background: 
	Given user is on TransactionsPage 
		|username|password|
		|rajkumar+demoadmin@valorpaytech.com|Aadhvik@19|


Scenario: to verify the transactions details from the portal
	When User check the today's transactions
	When User check transaction with multpleoptions
	When User performs the export on transactions
	When To Verify the count 
	And To show the approved tax

 