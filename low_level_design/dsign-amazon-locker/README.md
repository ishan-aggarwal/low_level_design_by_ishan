# Design Amazon Locker

*What is amazon locker?*
When a customer orders items with amazon they may choose to deliver it to locker or nearby stores which customer can
pick it up on the way to their home.
Locker is like a storage place where somebody can put items in it and customer can pick it up using a code. It can also
be used to return the items.

Customers can also return items to lockers or nearby stores which can be picked up pickup team than pickup from home
geoLocation.

*Locker Sizes*

1. Small
2. Medium
3. Large
4. Extra Large
5. Double Extra Large

Customer while ordering item can pick up their nearest geoLocation of locker where items are shipped to.   
Items are kept for maximum of 3 days.  
User gets locker code using which they can open the locker.  
Once the locker is closed the code is expired and cannot be open again.

*Requirements*

1. Assign the closest locker to a person given current co-ordinates (where customer wants)
2. After order is delivered by courier service to customer specified amazon locker, a 6-digit code will be sent to
   customer .
3. Item will be placed in Amazon locker for 3 days
4. After 3 days, if Item is not picked up from the locker, refund process will be initiated
5. Amazon locker will be assigned to customer based on the size of the locker ( S,M,L,XL,XXL)
6. Only items that are eligible to be put in locker can be assigned to amazon locker .i.e Not all items can be placed
   inside locker (like furniture can't be put inside amazon locker)
7. Access to Amazon locker will depend on Store's opening and closing time.(Since Amazon locker are placed inside
   stores,malls etc)
8. Items can be returned to Amazon locker as well .
9. Items that are eligible Amazon locker item, can only be returned by customer
10. Once the Door is closed. User's code will be expired. (User will not be able to open the locker now)

https://www.amazon.com/primeinsider/tips/amazon-locker-qa.html  
Requirements Courtesy - Leetcode
https://leetcode.com/discuss/interview-question/system-design/233869/Design-Amazon-Locker-system

*Initial Thoughts*

* What is the problem domain? - Locker System
* Models
    * Actor-1
        * Locker (Each locker will have an id, it will have standard size, current state of the locker and also the
          locker
          location)
            * LockerSize
            * LockerState
        * LockerLocation
            * GeoLocation
            * LocationTiming (contains a timingMap which is of day of week and timing class)
                * Timing
    * Actor-2
        * Order A customer places an order - which has orderId, and list of items, deliveryGeoLocation
        * Item will have an id, name and quantity of that item
    * Actor-3 (A package can be kept in the locker) - Now items inside the order will be packaged... So, next we look at
      the package class
        * Package (Pack) has an packageId, packageSize, orderId, and list of items

* So what are the properties of Expense Sharing?
    * An expense has occurred in the past.
    * It has a date, an event/reason, a short description, and a total amount.
    * Assumption: User who is creating an expense is the owner of the expense.
* So what are the properties of User?
    * userId, name, email, and phone number
* So what are the properties of ExpenseGroup?