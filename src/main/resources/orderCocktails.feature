# Author : e.rouquet@IUT_Pgx
Feature: orderCocktailsTest

Background:
	Given the bar exists
	And the cocktail of the month exists
	And the name of the first client is Leblanc
	And the name of the second client name is Pignon


Scenario Outline: orderCocktailTest
	Given 	the price of the cocktail of the month is <price>
	When 	the cocktails are ordered
	Then 	the name of the first client is <client1> and he pays the amount of <bill1>
	And 	the name of the second client is <client2> and he pays the amount of <bill2>
	And 	the number of rounds is <round>
	And 	<client2> mood is <mood>

	Examples:
	| client1    | client2  |  price  | bill1  | bill2  | round | mood    |
	| "Leblanc"  | "Pignon" | 10      | 20     | 0      |   1   | "happy" |
	| "Leblanc"  | "Pignon" | 10      | 10     | 30     |   2   | "sad"   |
