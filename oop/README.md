# Pillars of OOP

1. Abstraction (Principal - fundamental foundation/concept)
2. Inheritance
3. Polymorphism
4. Encapsulation

## Abstraction

- Abstraction is a model of real-world object limited to specific context. (Representation of essential features without
  including the implementation details)
- Concept of making something
- Representing in terms of ideas (abstract)

## Encapsulation

- Ability of an object to hide parts of its state and behavior from other objects, exposing only a limited interface to
  the rest of the program.
- To encapsulate something means to make it private and thus accessible from within the methods of its own class.
- Protected is less restrictive, and makes a member of the class available to subclasses as well.
- Stores the attributes and behavior together of an idea.
- Protects the attributes and behavior from illegitimate access from other classes.

## Inheritance

- Ability to build new classes on top of existing ones.
- Main benefit of inheritance is code reuse.
- Consequence of using inheritance is that subclasses have same interface as that of parent class.
- You can't hide a method in subclass if it was declared in the superclass.
- All abstract methods are required to be implemented.
- Constructor chaining.

## Polymorphism

- Ability of a program to detect the real class of an object and call its implementation even when its real type is
  unknown in current context.
- Compile time polymorphism (Method overloading)
- Runtime polymorphism (Method overriding/ Dynamic binding)

# Relationship between objects

- Association:
    - Type of relationship in which one object uses or interacts with another.
    - Association is represented by something like a field in a class.
- Composition:
    - Composition is a "whole-part" relationship between two objects. (Strong dependency)
    - One of which is composed of one or more instances of the other.
    - A component can only exist as a part of the container.
    - University (Container) -----> Department (Component)
- Aggregation:
    - Aggregation is less strict variant of composition where one object merely contains a reference of another.
    - Container does not control the life cycle of the component.
    - Component can exist without the container and can be linked to several containers at the same time.
    - Department (Container) -----> Professor (Component)

# Terms

- Class: Blueprint/ structure of an idea.
- Object: Real instance of a class. Occupy Memory. Each object is completely separate from others.
- Access Modifiers
    - Public: Anyone outside can access this member from anywhere.
    - Private: Can be accessed by no one from outside. Not even child classes. Accessible from the same class only.
    - Protected: Can be accessed by any class that extends the original class. (Child class in same package or different
      package)
    - Default: Can be accessed by any class with in the package or child classes with in the same package.
- Default Constructor:
    - If we don't define our own constructor, then a default constructor is created without any arguments.
    - Set every attribute of a class to its default value unless we have given a different default value.
    - Created only if we don't define our own constructor.
    - Public in nature
- Overloaded Constructor:
    - It initializes the object with the default values provided in the constructor arguments.
- Copy Constructor:
    - We already have an object of our class.
    - We want to create a new object using the existing object that has the same values as of the existing object.
- Shallow Copy:
    - Created a new Object from some other object but behind the scenes the new object still refers to a few attributes
      of the old object. New and old objects still share some data (attributes).
- Deep Copy:
    - No shared data between new and old object.
- Java Pass by value or Pass by reference:
    - For Primitive types, parameters are pass-by-value
    - For Object types, the object reference is pass-by-value
