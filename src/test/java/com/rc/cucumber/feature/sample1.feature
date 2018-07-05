@Functional 
Feature: Hello World program

Background: I installed eclipse
Given I install eclipse

#Scenario: I used to print hello world program
#Given I logged in to eclipse
#When I write program to print hello world
#Then I verify hello world is print

#Scenario: I used to print second hello world program
#Given I logged in to eclipse
#When I write program to print hello world
#Then I verify hello world is print

#@hellow
#Scenario Outline: I want to print Hello and Hi in my program
#Given I logged in to eclipse
#When I write program with '<UserName>'
#And I write program with '<Password>'
#And I write program with '<Login>'
#Then I verify program with '<UserName>'
#And I verify program with '<Password>'
#And I verify program with '<Login>'
#Examples:
#|UserName|Password|Login|
#|Test1|Pass1|login1|
#|Test2|Pass2|login2|

@StepArgument
Scenario: I want to print hello world using step arguments
Given User will launch chrome browser and launch google portal
Then User will Enter number 100
Then User will Clear search text field
And Usewr will enter "Wipro Technologies" in Search Text field

#@StepArgument 
#Scenario: I want to print hello world using data tables
#Given I logged in to eclipse
#When I write program with datatables
#|Hello|Usnername|
#|world|Pass|
#Then I verify hello world is print

#Scenario: I used to print using map
#Given I logged in to eclipse
#When I write program with datatables using map
#|Program|Serial|Comments|
#|Hello|786|cm1|
#|world|321|cm2|
#|chandan|456|cm3|
#Then I verify hello world is print




