# 💡 Illuminating Design Principles

## 1. Encapsulate What Varies 🌈

- Identify the aspects of your application that vary and separate them from what stays the same.
- 💡 **Method Level Encapsulation**
- 💡 **Class Level Encapsulation**

## 2. Program to an Interface, not an Implementation 🚀

- Depend on abstractions, not on concrete classes.
- Embrace the power of interfaces and reduce coupling.
  
## 3. Favor Composition Over Inheritance 🎭

- Inheritance vs. Composition, the eternal dilemma.
- 🏗️ **List of problems with Inheritance:**
  - A subclass can’t reduce the interface of the superclass.
  - Overriding methods requires careful compatibility.
  - Inheritance breaks encapsulation.
  - Subclasses are tightly coupled to superclasses.
  - Inheritance can lead to parallel hierarchies.
- 🏗️ **Composition:**
  - Different “dimensions” of functionality extracted to their own class hierarchies.

# 🌟 SOLID Principles Illuminated

## Single Responsibility Principle 🔍

- A class should have just one reason to change.
- 🌐 **Goal:** Reduce complexity.
- 🌐 **Example:**
  - Employee class manages employee data but also handles timesheet report formatting.
  - Solution: Separate timesheet report handling into a dedicated class.

## Open/Closed Principle 🔒

- Codebase open for extensions but closed for modifications.
- Codebase should be extensible without altering existing code.
- 🌐 **Strategy Design Pattern:**
  - Example: Shipping methods hardcoded in Order class. Solution: Strategy pattern with separate shipping classes.

## Liskov Substitution Principle 🔄

- Subclass should be substitutable for its superclass without breaking the client code.
- 🌐 **Important Points:**
  - Parameter types in a method should match or be more abstract.
  - Return type in a method should match or be a subtype.
  - Method in a subclass shouldn’t throw types not expected by the superclass.
  - ... and more!

## Interface Segregation Principle 🎭

- Clients shouldn’t be forced to depend on methods they do not use.
- Interfaces should be light and focused, ideally with only one method.

## Dependency Inversion Principle 🔄

- High-level classes shouldn’t depend on low-level classes. Both should depend on abstractions.
- Dependency should be inverted, no direct dependency between two concrete classes.
- 🌐 **Example:**
  - High-level budget reporting class depending on low-level database class.
  - Solution: Create a high-level interface for read/write operations and use that interface.

### Dependency Injection 🧬

- Not part of SOLID principles, but an important concept.
- If class A has an attribute of class B, then class A depends on class B.
