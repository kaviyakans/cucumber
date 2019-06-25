
@tag
Feature: Title of your feature
  I want to use this template for my feature file

  

  @tag2
  Scenario Outline: Title of your scenario outline
   
    Given The user in the telcom pages
    And The user click add for traiff plans
    When The user is filling the details"<mth Rent>","<freeloc>","<free inter>","<free SMS>","<loc char>","<Inter Char>","<sms char>"
    And Click for Submit button
    Then Display confirmation pages
    

    Examples: 
      | mth Rent | freeloc | free inter  |free SMS|loc char|Inter Char|sms char|
      |  100     |   200   |     300     |400     |  500   |600       | 700    |
      | 200      |   300   |     400     |500     |  600   |700       |800     |
