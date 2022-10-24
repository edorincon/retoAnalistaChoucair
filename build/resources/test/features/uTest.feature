# Autor : Nestor Eduardo Rincon Mora
@stories
Feature: Sign up to Utest.com platform
  As a user, I want to create an account to learn with the courses in the platform
  @scenario1
  Scenario Outline: Fill my personal information to create an account
    Given than I want to learn testing at the platform Utest
    When I enter my personal information in the registration form
      |strName|strLastName|strEmail|strPassword|strConfirmPassword|
      |<strName>|<strLastName>|<strEmail>|<strPassword>|<strConfirmPassword>|
    Then I expect to receive a message confirming the creation of my account
      |strVerify|
      |<strVerify>|

    Examples:
      |strName|strLastName|strEmail|strPassword|strConfirmPassword|strVerify|
      |Eduardo|Rincón|edorincon@gmail.com|Eduardo2022*|Eduardo2022*|Welcome to the world's largest community of freelance software testers!|
