Feature: Undelete item

Scenario: User can undo deleted item from cart

Given User is on ShopTools Website
When user adds product to cart
And deletes product from cart
Then user can also undo the deletion of item