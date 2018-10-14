
Feature: Login to the automation test site
  I want to use this template for my feature file


  Scenario: Login to the automationtest site
    Given user launches the browser
    And user is on signin page
    And user enters emailid and password
    And user clicks on Signin button
    Then homepage is displayed
    And validate homepage title

#  @tag1
#  Scenario outline: Select an item from the menu
#    Given select an <Item> from the menu
#    And select the <option>
#
#      | Item     | option   |
#      | WOMEN    | T-Shirts |
#      | DRESSES  |
#      | T-SHIRTS |
#
#    Then validate the selected <option> displayed in the webpage

#  @tag2
#  Scenario: Quick View the image
#    Given user is in the
#    And Get the details of the each item
#    And Mouse hover on one first item
#  when Click on the Quickview of the item
#    Then validate the item details with the selected item
#
#  @tag3
#  Scenario:
#    Given Get the details of an item
#  Currency | QTY | Size  |Color|
#  $16.51 | 1 |S | orange|
#  when select the size of an item
#    Then validate the item details
#
#  @tag4
#  Scenario: add to the cart
#    Given get the details of an item
#  Currency | QTY | Size  |Color|
#  when click on the "Add to cart"
#    Then validate the details of the item
#  Product
  
  
