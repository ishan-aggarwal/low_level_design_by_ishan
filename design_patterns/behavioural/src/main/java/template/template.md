## Template Method in Java

Template Method is a behavioral design pattern that allows you to defines a skeleton of an algorithm in a base class and
let subclasses override the steps without changing the overall algorithm’s structure.

**Identification**: Template Method can be recognized if you see a method in base class that calls a bunch of other
methods that are either abstract or empty.

### Problem

**Overriding standard steps of an algorithm**
In this example, the Template Method pattern defines an algorithm of working with a social network. Subclasses that
match a particular social network, implement these steps according to the API provided by the social network.


