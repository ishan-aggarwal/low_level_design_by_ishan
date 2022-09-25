# Factory Design Pattern

1. Factory Method
2. Abstract Factory
3. Practical Factory

Abstract Factory is to divide the class into two classes/ abstract classes/ interfaces -
- One to have the attributes [Database]
  - Like connectDB(), changeUser(), increasePoolSize(), createDatabaseFactory() - returns DBFactory
- Second to have all the abstractfactory methods [DatabaseFactory]
  - Like createQuery() - Query, createTransactor() - Transaction, createUpdater() - Updater

## Real Use-case
- UI Libraries 
- Framework to create applications
- Flutter/ React native - cross-platform development

## Summary
- Factory
  - Anything that allows us to create new things. (DatabaseFactory: allowing us to create corresponding object of other classes)

- Factory Method/ Abstract Factory 
  - Corresponding classes objects

- Practical Factory
  - Creates an object of the same class. For example,
  - XFactory will have methods to create objects of X based on different criteria
  - Case study - Whenever there are multiple variants of a class, and you want to create an Object of the correct variant based on some parameter. 


## Definitions
- Factory Method 
  - A method in a class that returns a new object of the related class.
- Abstract Factory
  - A collection of abstractfactory methods. 
- Practical Factory
  - Whenever there are multiple variants of a class/ interface, create object of correct one based on parameter. 