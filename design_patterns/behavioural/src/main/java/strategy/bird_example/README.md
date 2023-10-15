# STRATEGY DP

- It is used when we have a family of algorithms (set of algorithms available to you).
- It encapsulates each one of them and makes them interchangeable to use.
- It lets the client independent of the algorithm that we use (achieves de-coupling). De-coupled the algorithm from the
  one actually using it.
- Whoever is using the algorithm does not require to change - if the algorithm is changed.

**Duck Strategy Example**

* Here we have family of algorithms for various different behaviors
    * DisplayBehavior, FlyBehavior, QuackBehavior
    * For FlyBehavior - we have different algorithms SimpleFlyBehavior, JetFlyBehavior
* Each algorithm encapsulates the complete algorithm (in form of display(), fly() and quack()) methods.
* Each of these algorithms (like SimpleFlyBehavior and JetFlyBehavior) can be used interchangeably.
* Important point is to check the algorithm is injected into the Duck class independently using constructor injection
  and can help us to create different duck configurations.
* Client instantiates the different behaviors and creates duck instances (configuration) out of it.
* This approach allows us to share the behavior horizontally whereas with the hierarchical structure it is not possible
  to share the behavior horizontally (we can only pass the behavior vertically). 