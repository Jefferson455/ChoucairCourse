# language:en
# autor: xxxxxxx
@stories
Feature: Academy Choucair
  As a user, i want to learn how to automate in screenplay at the Choucair Academy with the automation course
  @scenario1
  Scenario: Search for a automation course
    Given than brandom wants to learn automation at the academy choucair
    | strUser  |strPassword  |
    | 1006513555 |Choucair2021*|
    When he search for the course on the choucair academy platform
    | strCourse  |
    | Foundation Level |
    Then he finds the course called Foundation Level

