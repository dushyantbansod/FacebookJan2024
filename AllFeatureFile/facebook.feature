Feature: Test the facebook Application

  @Register
  Scenario: Test Register page of facebook Application
    Given user open "edge" browser
    When user is on register page
    And user enter valid "Akshay" , "patil","Akshay@gmail.com" and "akshay@123"
    And user select DOB as  "24" , "Feb" ,"2012" and user select gender as "Male"
