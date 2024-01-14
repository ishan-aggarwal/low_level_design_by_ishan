# Design Apply coupons on shopping cart | Decorator Structural Design Pattern example

Given a shopping cart with products and coupons. You have to calculate the net price after applying coupons on the
products. Coupons can be of different types and after applying certain conditions -

- N% off that is 10% off for all the individuals
- P% off on next item
- D% off on Nth item of type T.

Sequentially wants to apply all applicable coupons on the cart and calculate the final cart price.

## Solution

At the first glance - we have objects like ShoppingCart, Product and Coupon
Also, for each of the product in the shopping cart based on the conditions - different coupons might be applicable that
is a possibility.
For Product1 -> C1, C2, and C8 are applicable.
For Product2 -> C4, C7 are applicable.

So, this looks very similar to adding some responsibilities at runtime to the base class Product (Recursively adding
responsibilities at runtime). In shopping cart - we can directly apply coupons to products based on the conditions that
are satisfied.