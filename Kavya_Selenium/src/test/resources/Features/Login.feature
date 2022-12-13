Feature: Login Page 


  @Login1
  Scenario Outline: Login Page Navigation
  Given Launch the Guru99 Webpage
    Given User is on Home Page
    
    
    @Flipkart
    Scenario Outline: Flipkart Login Page
    Given Launch the driver
    Then Launch the flipkart Webpage
    When User is on Login Page childwindow
  
   
