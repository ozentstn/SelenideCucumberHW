Feature: Create and edit new records from webtables page

  Scenario: Click on the Web Tables button and add a record by clicking on the "+" icon.
    Given Webtables page opened
    When Click on the button named webtables
    When Click on the button marked +
    When Enter fName, lName, eMail, age, salary, department and click on the submit
    When Edit last record with inputData
