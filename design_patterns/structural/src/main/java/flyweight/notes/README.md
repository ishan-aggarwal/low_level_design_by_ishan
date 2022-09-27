# FLYWEIGHT DP

- Flyweight is a structural design pattern that allows programs to support vast quantities of objects by keeping their
  memory consumption low.
- The pattern achieves it by sharing parts of object state between multiple objects.
- In other words, the Flyweight saves RAM by caching the same data used by different objects.

**Usage examples**: The Flyweight pattern has a single purpose: minimizing memory intake. If your program doesn’t
struggle with a shortage of RAM, then you might just ignore this pattern for a while.

**Examples of Flyweight in core Java libraries:**
java.lang.Integer#valueOf(int) (also Boolean, Byte, Character, Short, Long and BigDecimal)
**Identification**: Flyweight can be recognized by a creation method that returns cached objects instead of creating
new.

**Problem**

**Rendering a forest**
In this example, we’re going to render a forest (1.000.000 trees)! Each tree will be represented by its own object that
has some state (coordinates, texture and so on). Although the program does its primary job, naturally, it consumes a lot
of RAM.
**The reason is simple:** too many tree objects contain duplicate data (name, texture, color). That’s why we can apply
the Flyweight pattern and store these values inside separate flyweight objects (the TreeType class). Now, instead of
storing the same data in thousands of Tree objects, we’re going to reference one of the flyweight objects with a
particular set of values.
The client code isn’t going to notice anything since the complexity of reusing flyweight objects is buried inside a
flyweight factory.

**Applicability**

1. Use the Flyweight pattern only when your program must support a huge number of objects which barely fit into
   available RAM.
    - an application needs to spawn a huge number of similar objects
    - this drains all available RAM on a target device
    - the objects contain duplicate states which can be extracted and shared between multiple objects

**Relations with Other Patterns**

- Flyweight shows how to make lots of little objects, whereas Facade shows how to make a single object that represents
  an entire subsystem.

- Flyweight would resemble Singleton if you somehow managed to reduce all shared states of the objects to just one
  flyweight object. But there are two fundamental differences between these patterns:
    - There should be only one Singleton instance, whereas a Flyweight class can have multiple instances with different
      intrinsic states.
    - The Singleton object can be mutable. Flyweight objects are immutable.
