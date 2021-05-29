@tag
Feature: Testing a basic cucumber feature with framework
  

  #@tag1
  #Scenario: basic launch
    #Given I launch browser
    #When I navigate to "https://www.seleniumeasy.com/test/"
    #Then I should be displayed with "Home" Page 
    #Then I click "close" button
    #And I click "inputform" button
    #And I click "simpleform" button
    #Then I should be displayed with "simpleform" Page 
    #
	@tag2
  Scenario: basic mid launch
    Given I launch browser
    When I navigate to "https://www.seleniumeasy.com/test/"
    Then I should be displayed with "Home" Page 
    Then I click "close" button
    And I click "inputform" button
    And I click "simpleform" button
    Then I should be displayed with "simpleform" Page
    Then I enter the below details
    |	name	| 
    |	Shan	|