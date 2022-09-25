# Design Principles

1. Encapsulate What Varies
    - Identify the aspects of your application that vary and separate them from what stays the same.
    - Encapsulation on a method level
    - Encapsulation on a class level
2. Program to an Interface, not an Implementation
    - Program to an interface, not an implementation. Depend on abstractions, not on concrete classes.
3. Favor Composition Over Inheritance
    - Inheritance is probably the most obvious and easy way of reusing code between classes. You have two classes with
      the same code. Create a common base class for these two and move the similar code into it.
    - There’s an alternative to inheritance called composition. Whereas inheritance represents the “is a” relationship
      between classes (a car is a transport), composition represents the “has a” relationship (a car has an engine).
    - List of problems with Inheritance
        - A subclass can’t reduce the interface of the superclass.
        - When overriding methods you need to make sure that the new behavior is compatible with the base one.
        - Inheritance breaks encapsulation of the superclass.
        - Subclasses are tightly coupled to superclasses.
        - Trying to reuse code through inheritance can lead to creating parallel inheritance hierarchies.
    - INHERITANCE: extending a class in several dimensions (cargo type × engine type × navigation type) may lead to a
      combinatorial explosion of subclasses.
    - COMPOSITION: different “dimensions” of functionality extracted to their own class hierarchies.

# SOLID Principles

## Single Responsibility Principle

- A class should have just one reason to change.
- The main goal of this principle is reducing complexity.
- There’s more: if a class does too many things, you have to change it every time one of these things changes. While
  doing that, you’re risking breaking other parts of the class which you didn’t even intend to change.
- Every code unit (class/ method/ package) in my codebase should have exactly one responsibility.
- For example,
    - The Employee class has several reasons to change. The first reason might be related to the main job of
      the class: managing employee data. However, there’s another reason: the format of the timesheet report may change
      over time, requiring you to change the code within the class.
    - Solve the problem by moving the behavior related to printing timesheet reports into a separate class. This change
      lets you move other report-related stuff to the new class.

## Open/Closed Principle

- The main idea of this principle is to keep existing code from breaking when you implement new features.
- Codebase should be open for extensions/enhancements but closed for modifications.
- Codebase should be extensible (easy to add new features), but adding new features should not require changing already
  written code.
- Rather than modifying already written code units, add new code units.
- OCP can be easily solved by making use of Strategy Design Pattern.
    - For example,
        - You have an e-commerce application with an Order class that calculates shipping costs and all
          shipping methods are hardcoded inside the class. If you need to add a new shipping method, you have to change
          the code of the Order class and risk breaking it.
        - You can solve the problem by applying the Strategy pattern. Start by extracting shipping methods into separate
          classes with a common interface.
        - Now when you need to implement a new shipping method, you can derive a new class from the Shipping interface
          without touching any of the Order class’ code. The client code of the Order class will link orders with a
          shipping object of the new class whenever the user selects this shipping methods in the UI.
        - As a bonus, this solution let you move the delivery time and cost calculation to more relevant classes,
          according to the single responsibility principle.

## Liskov Substitution Principle

- When extending a class, remember that you should be able to pass objects of the subclass in place of objects of the
  parent class without breaking the client code.
- This means that the subclass should remain compatible with the behavior of the superclass.
- When overriding a method, extend the base behavior rather than replacing it with something else entirely.
- **Importance**: This concept is critical when developing libraries and frameworks because your classes are going to be
  used by other people whose code you can’t directly access and change.
- LSP says that child class should support at-least all the behaviour of parent class, so that if you replace the
  parent reference with chile reference, then you don't need to make any changes on the client code saying this method
  is not supported in child class.
- LSP says object of any class should be **as-is** substitutable in a variable reference of parent type without
  requiring any code changes.
- **Important points to keep in mind**
    - **Parameter types in a method of a subclass should match or be more abstract than parameter types in the method of
      the superclass**.
      Sounds confusing? Let’s have an example. Say there’s a class with a method that’s supposed to feed cats: feed(Cat
      c). Client code always passes cat objects into this method.
      ◦ **Good**: Say you created a subclass that overrode the method so that it can feed any animal (a superclass of
      cats):feed(Animal c) . Now if you pass an object of this subclass instead of an object of the superclass to the
      client code, everything would still work fine. The method can feed all animals, so it can still feed any cat
      passed by the client.
      ◦ **Bad**: You created another subclass and restricted the feeding method to only accept Bengal cats (a subclass
      of cats):feed(BengalCat c) . What will happen to the client code if you link it with an object like this instead
      of with the original class? Since the method can only feed a specific breed of cats, it won’t serve generic cats
      passed by the client, breaking all related functionality.
    - **The return type in a method of a subclass should match or be a subtype of the return type in the method of the
      superclass.**
      As you can see, requirements for a return type are inverse to requirements for parameter types. Say you have a
      class with a method buyCat(): Cat . The client code expects to receive any cat as a result of executing this
      method.
      ◦ **Good**: A subclass overrides the method as follows: buyCat(): BengalCat . The client gets a Bengal cat, which
      is still a cat, so everything is okay.
      ◦ **Bad**: A subclass overrides the method as follows: buyCat(): Animal . Now the client code breaks since it
      receives an unknown generic animal (an alligator? a bear?) that doesn’t fit a structure designed for a cat.
      Another anti-example comes from the world of programming languages with dynamic typing: the base method returns a
      string, but the overridden method returns a number.
    - **A method in a subclass shouldn’t throw types of exceptions which the base method isn’t expected to throw.**
    - **A subclass shouldn’t strengthen pre-conditions.**
    - **A subclass shouldn’t weaken post-conditions.**
    - **Invariants of a superclass must be preserved.**
    - **A subclass shouldn’t change values of private fields of the superclass.**
- For example,
    - The save method in the ReadOnlyDocuments subclass throws an exception if someone tries to call it. The base method
      doesn’t have this restriction. This means that the client code will break if we don’t check the document type
      before saving it.
      The resulting code also violates the open/closed principle, since the client code becomes dependent on concrete
      classes of documents. If you introduce a new document subclass, you’ll need to change the client code to support
      it.
    - You can solve the problem by redesigning the class hierarchy: a subclass should extend the behavior of a
      superclass, therefore the read-only document becomes the base class of the hierarchy. The writable document is now
      a subclass which extends the base class and adds the saving behavior.

## Interface Segregation Principle

- Clients shouldn’t be forced to depend on methods they do not use.
- Interfaces should be as light as possible, they should have as less methods as possible.
- Ideally interfaces should have only 1 method.
- You should break down “fat” interfaces into more granular and specific ones. Clients should implement only those
  methods that they really need. Otherwise, a change to a “fat” interface would break even clients that don’t use the
  changed methods.

## Dependency Inversion Principle

- High-level classes shouldn’t depend on low-level classes. Both should depend on abstractions. Abstractions shouldn’t
  depend on details. Details should depend on abstractions.
- No two concrete classes should directly depend on each other. They should depend on each other via an interface.
- For example, for a software engineer - never depend on a specific company, just depend on getting a job.
- For example,
    - the high-level budget reporting class uses a low-level database class for reading and persisting its data. This
      means that any change in the low-level class, such as when a new version of the database server gets released, may
      affect the high-level class, which isn’t supposed to care about the data storage details.
    - You can fix this problem by creating a high-level interface that describes read/write operations and making the
      reporting class use that interface instead of the low-level class. Then you can change or extend the original
      low-level class to implement the new read/write interface declared by the business logic.
    - As a result, the direction of the original dependency has been inverted: low-level classes are now dependent on
      high-level abstractions.

**Dependency Injection**

- Dependency Injection is not part of SOLID design principals. It simply states that if a class A has an attribute of
  class B, then class A depends on class B.