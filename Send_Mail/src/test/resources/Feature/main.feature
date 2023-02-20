Feature: Gmail
  Scenario: Send mail
    Given Go to google
    When Enter gmail
    Then Click register
    And Add gmail account
    And Click account next
#    And Click show password
    And Add gmail password
    And Click password next
#    And Click try another way
#    And Add phone number
    And Create new mail
    And Add mail to
    And Add subject
    And Add mail text
    And Click send button