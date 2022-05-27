Feature: Login functionality


Background: User is successfully Logged
When User open "Chrome" browser with exe as 
When user enter URL as 
When user cancel initial Login page
When user move on login
When user click on My Profile
When user enter "7020348482" as username
When user enter "Admin@12" as password
When user click on Login

@SmokeTest
Scenario Outline: validate manage address functionality
When user click on manage addresses
When user click on add a new addresses
When user enter <name> as name
When user enter <mobile> as mobile number
When user enter <pinCode> as pinCode
When user enter <locality> as locality
When user select Home as address type
When user click on save button
Then Address added sucessfully
When delete saved address


Examples:
					|name|mobile|pinCode|locality|
					|asdc|7879712|414001|midc|
					

