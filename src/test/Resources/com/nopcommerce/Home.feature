@categoriesList
 Feature: Categories List functionality
  # As a user
  #I want to see the categories list
  #so that i can navigate to teh chosen category

  Scenario Outline: User can  navigate to the Categories pages
  Given user is on teh homepage
 Then user should see the '<Categories>' category on the left panel on the homepage
    When user selects category as '<Categories>'
    Then user should navigate to the '<Categories>' page
    And user should see the heading as '<Categories>'
    Examples:
    |Categories|
    |Books     |
    |Computers |
    |Electronics|
    |Apparel & Shoes|
    |Digital downloads|
    |Jewelry        |
    |Gift Cards       |