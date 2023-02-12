# Composite Design Pattern

Composite design pattern is used where we need to treat a group of objects in similar way as a single object.
Composite pattern composes objects in terms of a tree structure to represent part as well as whole hierarchy. This type
of design pattern comes under structural pattern as this pattern creates a tree structure of group of objects.

For example, imagine that you have two types of objects: Products and Boxes . A Box can contain several Products as well
as a number of smaller Boxes . These little Boxes can also hold some Products or even smaller Boxes , and so on.

# Applicability

Use the Composite pattern when you have to implement a tree-like object structure.
Use the pattern when you want the client code to treat both simple and complex elements uniformly.