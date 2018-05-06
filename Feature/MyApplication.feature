#Author: selva87always@gmail.com

@tag
Feature: CheckBox, Radio button Selection & Country Default value checking
  Background: 
	Given user launch browser & open Demo QA Registration page
  
  @tag1
  Scenario: Verify radio button selected or not 
   When user click anyone of radio button
   Then user verify radio button selected or not
  @tag2
  Scenario: very Checkboxes selected or not 
    When user click all check boxes in hobby section
    Then user verify checkboxes checked or not
  @tag3
  Scenario: Verify Default Value is afghanistan or not in country field
    Then user verify default country selected or not in country field
 
