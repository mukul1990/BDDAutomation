Feature: Login feature
 
 @WebUI
  Scenario: Home page defaut Login
    Given user is navigated to Home page
    When user enters into applcation with "Mukul" username and "Jain" password
    Then Home page is displayed
    And user details is displayed "true"
 @WebUI   
      Scenario: Home page defaut Login
    Given user is navigated to Home page
    When user enters into applcation with "Felix" username and "Warner" password
    Then Home page is displayed
    And user details is displayed "false"
@Mobile
     Scenario: Home page defaut Login
    Given user is navigated to Home page
    When user enters into applcation with following details
    |Gargi|Saxena|30|Delhi|Married|Lead|
    |Mukul|Jain|33|Delhi|Married|Manager|
    Then Home page is displayed
    And user details is displayed "true"
@RegTest @Mobile  
      Scenario Outline: Home page defaut Login
    Given user is navigated to Home page
    When user enters into UI applcation with <username> and <password> details
    Then Home page is displayed
    And user details is displayed "true"
    
    Examples:
    |username|password|
    |mukul|jain|
    |neha|jain|
    |john|sina|
    |sneha|saxena|