Feature: Login functionality


Background: Successfully canceled initial login page
When User open "Chrome" browser with exe as 
When user enter URL as 
When user cancel initial Login window

@SmokeTest
Scenario: Login fuctionality with valid credentials
When user navigate on Login button
When user click on MyProfile
When user enter "7020348482" as username
When user enter "Admin@12" as password
When user click on Login button
Then Application shows user profile to user
Then browser close

@RegressionTest
Scenario Outline: Login fuctionality by using invalid username in UC and valid password
When user navigate on Login button
When user click on MyProfile
When user enters <username> as username
When user enters <password> as password
When user click on Login button
Then Application shows appropraite error message
Then browser close

Examples:
					|username|password|
					|ASDF|Admin@12|
					|7020348482|ADMION@12|

