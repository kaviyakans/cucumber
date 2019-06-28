
@tag1 
Feature: Title of your feature
  I want to use this template for my feature file

  Background:
   Given The user is on telecom page
    And The user click add for traiff plans

  @tag2 @smoke
  Scenario Outline: Title of your scenario outline
   
    
    When The user is filling the details"<mth Rent>","<freeloc>","<free inter>","<free SMS>","<loc char>","<Inter Char>","<sms char>"
    And Click for Submit button
    Then Display confirmation pages
    

    Examples: 
      | mth Rent | freeloc | free inter  |free SMS|loc char|Inter Char|sms char|
      |  100     |   200   |     300     |400     |  500   |600       | 700    |
      | 200      |   300   |     400     |500     |  600   |700       |800     |
      
      
   @tag @sanity   
      Scenario: Title of your scenario
   When The user is filling
   | 2000  | 2000 | 3000  | 5000  | 6000 | 7000  | 6000 |
    And Click for Submit button
    Then Display confirmation pages
   