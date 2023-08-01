@tag
Feature: Scenario Login From Mobile Android
  I want to use this template for my feature file

  @tag1
  Scenario Outline: User login without username and password
  Given Users is on login screen
  When Users click button login
  Then Users can see validation of login button <status>
  
  Examples:
  | status                  |
  | username field is empty |
  
  @tag2
  Scenario Outline: User login without username
  Given Users is on login screen
  And Users input password <password>
  And Users click button login
  Then Users can see validation of login button <status>
  
  Examples:
  | password     | status       |
  | SAtuduaTiga! | username field is empty |
  
  @tag3
  Scenario Outline: User login without password
  Given Users is on login screen
  When Users input username <username>
  And Users click button login
  Then Users can see validation of login button <status>
  
  Examples:
  | username | status                  |
  | pewesqa  | password field is empty |
  
  @tag4
  Scenario Outline: User login with wrong username or password
  Given Users is on login screen
  When Users input username <username>
  And Users input password <password>
  And Users click button login
  Then Users can see validation of login button <status>
  
  Examples:
  | username | password     | status       |
  | pewesqa  | SAtuduaTiga! | login failed |
  
  @tag5
  Scenario Outline: User success logged in
    Given Users is on login screen
    When Users input username <username>
    And Users input password <password>
    And Users click button login
    Then Users can see validation of login button <status>

    Examples: 
      | username | password    | status  |
      | pewesqa  | Pewesqa123! | success |