# Design - Expense sharing Application (Split-wise)

The goal of this exercise is to design an expense sharing application.
Application should allow users to share expenses among friends.

* Users will be able to organize expenses among multiple heads and share with multiple users.
* User should be able to create a group.
* User should be able to share an expense among the members of group.
* User should be able to send notification to other users on their share to be paid.
* User should be able to create the profile and add bank details for transfer of amount.
* User should be able to track other users who have paid and who have still not paid.

**Use cases**

***Functional Requirements***

* Users should be able to register. User creation is idempotent.
* Registered user should be able to create an expense.
* Expense has three states
    1. Created
    2. Pending
    3. Settled

* Initial state of the expense would be created.
* Registered user should be able to create a group and add users to the group to share the expenses.
* Bifurcation of the expenses is custom no need to implement equal sharing.
* Once the bifurcation is complete the expense state becomes pending.
* There should be provision to send user notification when someone adds them to the expense.
* Users should be able to add their contribution.
* Once the settlement is complete from all the users the expense should become "Settled".
* Any number of users should be able to create expenses at the same time.
* One user should be able to create more than one expense and share it with different set of users.
* Expense creator should be able to track expenses and payments made by users.
* Users can settle expense in parts.

***Non-Functional Requirements***

* The solution should be extendable.
* No need to persist data in database. Data can be stored in memory.

**Workflow/ Sequence of Operations**

* User registers
* User creates an expense
* Add other users
* Share it
* Move Expense state to pending
* Notify
* Users contribute
* Check if the bill is settled
* If so move the expense to settled

**Initial Thoughts**

* What is the problem domain? - Expense Sharing
* Models
    * User
    * Expense
    * ExpenseState
    * ExpenseGroup
    * UserShare
    * Contribution

* So what are the properties of Expense Sharing?
    * An expense has occurred in the past.
    * It has a date, an event/reason, a short description, and a total amount.
    * Assumption: User who is creating an expense is the owner of the expense.
* So what are the properties of User?
    * userId, name, email, and phone number
* So what are the properties of ExpenseGroup?