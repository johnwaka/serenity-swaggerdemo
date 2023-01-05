Feature: Login with invalid functionality


  Rule: Customers need to provide valid credentials to access product catalogue
    Example: A customer logs in with invalid credentials and is locked out from accessing the Products Catalog
      Given john is on login page
      When john logs in with invalid credentials
      Then he should be locked out from the product catalogue