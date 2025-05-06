### Write a library with hierarchy of shapes.

- There should be Square and Circle.
- It should also be possible to calculate Area for those.
- Consider, it is not expected for hierarchy to grow but new operation could be added later.

### Bad Design

In the bad design that we have done, it looks simple and readable too.
After all, that what we were always taught.
It even allows us to use polymorphic reference:

```
    IShape shape = new Square(4);
    System.out.println(shape.getArea());
```

### Update existing code to calculate Perimeter.

Sure, in our fake example, it is not a problem at all.
Update an interface and all derived classes — a piece of cake.
But let's look wider. In real word, you would have more than two classes in hierarchy.
There will be like twenty or even more. And that's where shit got real.

Seems like our architecture need tiny enhancement.
So we can rewrite it with little help from **_Visitor_**.

### Good Design

Notice how both Square and Circle no longer implement GetArea.
Instead, it has been moved to Visitor.
And the only thing our shapes know how to do is to accept our visitor.

The usage is quite similar:

```
    IShape shape = new Square(4);
    double area = shape.accept(new GetAreaVisitor()); // where the magic happens
    System.out.println(area);
```

**Operation logic is encapsulated in a single class.**
Moreover, it also corresponds to Open/Close principle. We don’t edit any code, just add a new one.

But do not haste with rewriting everything. There is a reverse side of a medal.
What if we need to add another shape, like Triangle. That would mean to update every visitor.

We cannot achieve expanding hierarchy and operation together 😟

**Visitor helps to define a new operation for some hierarchy of classes without changing them**
It is good when:

* new operations need to be added frequently
* the hierarchy of classes is known and not expected to change

Visitor is bad when:

* new operations need to be added rarely
* the hierarchy of classes is not known and expected to change