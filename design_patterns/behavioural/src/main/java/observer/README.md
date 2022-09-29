# OBSERVER DP

**INTENT**

* There are more than one objects in the system and then there is one object which wants to know the changes in state of
  another object for some reason.
* So for weather data example, (Weather Data Measurement) Object1 and (Display Station) Object2 - Object2 wants to know
  the changes in state of Object1.
* Another example, (Article Publisher) Object1 is read by (RSS news-reader client) Object2

**PUSH VS POLL**

So, observer pattern is moving towards the PUSH architecture instead of POLL architecture.
**POLL**: Polling for changes from the other object and asking have you changed on regular intervals and this interval
could be as small as possible. But the problem is once we scale, we might end up with large number of objects who keeps
on polling for changes even though there are no changes in the state of object1.

**PUSH**: Object1 should be responsible to inform all its subscribers that object1 state has changed. Object1 should
know who all are the listeners (Object2)

**Definition**

* When the Observable (Subject) changes all the Observers are notified.
* One to many dependency (relationship) between objects, so that when one object changes state then all of its
  dependents are notified and takes action accordingly.

**UML**
                          0.*       
   |  <<IObservable>>  | -----> <<IObserver>>
   |---------------------------|--------------|
   | add(IObserver)    |       |              |
   | remove(IObserver) |       |              |
   | notify()          |       |              |
   |---------------------------|--------------|
   |-------------------|-------|--------------|



