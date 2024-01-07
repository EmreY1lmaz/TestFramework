Feature: Search Engine Test

  Scenario: Searching for a term
    Given I navigate to the search engine page
    When I submit the search term "Clover"
    Then the first result should contain the search term