Feature: Login with valid functionality
  Rule: Customers need to provide valid credentials to access product catalogue
    Example: A customer logs in with valid credentials and is presented with the products catalog to continue shopping
      Given john is on login page
      When john logs in with valid credentials
      Then he should be presented with a product catalogue
