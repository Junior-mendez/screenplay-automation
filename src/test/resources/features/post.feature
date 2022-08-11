Feature: Information post individual user
  Scenario Outline: Send information post individual user with response success
    Given I Load customer information
    |name|job|
    |<name>|<job>|
    When I call post user api
    Then I should see the status code 201
    And I validate quantity key is 4
    And I validate schema response "PostJsonSchema"
    And I validate fields get response api
    And I validate post response contain data initial
    Examples:
      | name | job |
    ##@externaldata@./src/test/resources/data/Testdata.xlsx@Hoja1@1
   |junior   |desarrollador|
