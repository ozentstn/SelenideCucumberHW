Feature: Create and edit new records from webtables page
  Background: Click on the Web Tables button and add a record by clicking on the "+" icon.
    Given Webtables page opened
    When Click on the button named webtables
    When Click on the button marked +
    And Enter fName, lName, eMail, age, salary, department and click on the submit
      | First Name | Last Name | Email                 | Age | Salary    | Department |
      | Özen       | Taştan    | ozentastan1@gmail.com | 27  | 123456789 | Meva       |

