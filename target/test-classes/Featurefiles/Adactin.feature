Feature: To validate registeration form in the Adactin Hotel room booking

  Background: 
    Given User should be in Adactin login page

  Scenario: To validate Registeration Form by giving different set of details
    When User should give valid username and valid password and enter login button
      | username | jamespraveen91 |
      | password | jamesrajan     |
    And User should be in valid Search Hotel Page
    And User should select the location,Hotels, Room Type,No of rooms,Check in date,Check out date,Adults per room, Children per room, from the drop down and click search button
    And User should be in valid select hotel page
    And User should select the radio button and then click continue button for the selected Hotel
    And User should be in valid Book a Hotel page
    And User should enter first name, last name,billing address,Sixteen digits credit card number,credit card type,the Expiry month and year,valid cvv number, and click the book now button
    And User should be in valid Booking confimation page
    Then User should get the Order ID for the room booking
