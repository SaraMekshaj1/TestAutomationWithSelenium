# Automation with Selenium & Java 

## This project have some requirements: 
1. Use Selenium framework
2. Use TestNG
3. Use POM structure
4. Use asserts to do the verifications asked in diferent steps
5. Use wait methods (avoid thread.sleep)
6. Configure Screenshot Capture on failure



## There are 4 tests: 
- [Test1](#test1)
- [Test2](#test2)
- [Test3](#test3)
- [Test4](#test4)


## Test1: Register Test
Test 1: Register Test
1. Navigate to: https://automationexercise.com/
2. Click on Signup/Login from the top menu.
3. Verify that the page title is Login to your account.
4. Fill out the New User Signup! section with:
   Name
   Email
5. Click Signup button.
6. On the next page (Enter Account Information):
   <>Fill in all required details (title, password, DOB, etc.)
   <>Checkboxes: Sign up for newsletter + Receive special offers
   <>Fill Address Details
7. Click Create Account button.
8. Verify that ACCOUNT CREATED! text is displayed.
9. Click Continue.
10. Verify that Logged in as [Name] is visible.

Test 2: Login Test


## Test: Login Test
1. Navigate to: https://automationexercise.com/
2. Click on Signup/Login from the top menu.
3. Enter the valid email and password you registered with.
4. Click Login button.
5. Verify that:
  <> Logged in as [Name] is displayed at the top.
  <>Delete Account button is visible.
6. Log out by clicking Logout.
7. Verify that you are redirected back to the Login page.




## Test3:  Dashboard / Wishlist / Cart Test
1. Navigate to: https://automationexercise.com/products
2. Hover over a few products.
3. Add two products to the Cart by clicking Add to cart.
4. After adding each product:
   <>Verify that a popup "Added!" message appears.
   <>Click Continue Shopping.
5. Click on Cart button at the top.
6. Verify that both added products are visible inside the cart.
7. Verify that the number of items in Cart (icon at top) is 2.
8. Close the browser.



## Test4:  Shopping Cart Checkout Test
Precondition: You have added 2 products into cart (Test 3).

1. Navigate to: https://automationexercise.com/view_cart
2. Verify that you are on the Shopping Cart page.
3. Verify that:
   <>Proceed To Checkout button is visible.
   <>Product names, quantities, and individual prices are displayed.
4. Click Proceed To Checkout.
5. Verify that the Delivery Address matches the one you entered during Registration.
6. Enter a comment in the text area (like: "Please deliver soon").
7. Click Place Order button.
8. Enter Payment Details (you can fill dummy data like name on card, card number, cvc, expiration).
9. Click Pay and Confirm Order button.
10. Verify that Your order has been placed successfully! is displayed.
11. Close the browser.









