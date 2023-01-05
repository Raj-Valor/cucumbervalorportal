Feature: Portal Login 

@sanityTest
Scenario: Login withcorrect credentials 
	Given user is on loginpage 
	When user enters username "rajkumar+demoadmin@valorpaytech.com" 
	And user enters password "Aadhvik@19" 
	When user clicks on continue button 
	When user clicks on login button
	 
@sanityTest	 
Scenario: Login with incorrect username credentials 
	Given user is on loginpage 
	When user enters username "rajkumar+demoadmin@valorpaytech.co" 
	And user enters password "Aadhvik@19" 
	When user clicks on continue button 
	

Scenario: Login with incorrect password credentials 
	Given user is on loginpage 
	When user enters username "rajkumar+demoadmin@valorpaytech.com" 
	And user enters password "Aadhvik@" 
	When user clicks on continue button 
@sanityTest		
Scenario: Forget password link for valid user
	Given user is on loginpage
	When user enters valid username "rajkumar+demoadmin@valorpaytech.com"
	And user click submit button
	
Scenario: Forget password link for invalid user
	Given user is on loginpage
	When user enters the invalid username "raj"
	And user click submit button		
	
	
	
	