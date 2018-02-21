#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
Feature: Sign Up features
  As a user
  I want to signup to Opteranaitve using my credentials

  Scenario: Successful signup
    When I fill in "name" with "Cucumber testscript"
    #And I fill in  "DateOfBirth" with "09/09/1991"
    #And I fill in "State" with "Illinois"
    #And I fill in "EmailAddress" with "shruthi+cucumtest@opternative.com"
    #And I fill in "Password" with "Qwer1234"
    #And I click on the "Sign Up" button
    #Then I am on the "purchase intent" page on URL "https://staging.opternative.com/onboarding/purchase_intent"
    #And I should see "Choose your vision test" message


   