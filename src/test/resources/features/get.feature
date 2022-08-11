Feature: Information get individual user
  Obtain verifiy the obtention information of a user
  Scenario: Send information get individual user with response success
    Given I Load customer information
    |id|
    |1 |
    When I call get user api
    Then I should see the status code 200
    And I validate quantity key is 2
    And I validate schema response "GetJsonSchema"
    And I validate fields get response api
    And I validate get response contain data expected