# Author : e.rouquet@IUT_Pgx
Feature: barCompletTest

Background: 
Given The bar exists

Scenario Outline: barCompletTest
	Given The bar has <maxSeats> limited seats
	And   <occupiedSeats> seats are already occupied in the bar
	When   A group of <newClients> want to enter the bar
	Then  The status of the bar is <status> 
	

	Examples:
	| maxSeats |  occupiedSeats|   newClients  	|      status        |
    |  10      |        9      |   		2		|"Complet"           |
    |  10      |        8      |        3  		|"Complet"		     |
	|  10      |        2      |        3  		|"Places disponibles"|
	
	
