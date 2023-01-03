Feature: login
  Rule: Customers need to provide valid credentials to access product catalogue
    Example: john logs in with valid credentials
      Given john is on login page
      When john logs in with valid credentials
      Then he should be presented with a product catalogue
