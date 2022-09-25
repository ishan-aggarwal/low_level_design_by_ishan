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