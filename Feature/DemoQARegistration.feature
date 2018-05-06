#Author: selvakumar

@tag
Feature: Test All fields in Demo QA Registration page
  
  @tag1
  Scenario: veryfy entered text in all Text Boxes
    Given user launch browser and open Demo QA Registration page
    When user enter firstname,lastname,phonenumber,username,email,aboutYourself,password,confirmpassword
    Then verify entered firstname,lastname,phonenumber,username,email,aboutYourself,password,confirmpassword
    
  @tag2 
  Scenario: Verify radio button selected or not 
   When user click anyone of radio button
   Then user verify radio button selected or not
   
  @tag3
  Scenario: very Checkboxes selected or not 
    When user click all check boxes in hobby section
    Then user verify checkboxes checked or not 
    
  @tag4
  Scenario: verify values correctly choosen in Date Of Birth dropdown
    When user choose month,day and year
    Then user verify given Date of birth choosen or not
    
  
      
      