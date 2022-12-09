Feature: Portal Login Feature 


Scenario: Login withcorrect credentials 
	Given user is on loginpage 
	When user enters username "rajkumar+demoadmin@valorpaytech.com" 
	And user enters password "Aadhvik@19" 
	When user clicks on continue button 
	When user clicks on login button 
