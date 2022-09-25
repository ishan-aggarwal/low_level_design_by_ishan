# Question

## Design a bird.

- Requirements:
    - Assume you have to build a software system where you have to store information about birds.
    - Diversity of birds

### Version1

- Every bird is sharing exactly the same behavior.
- Even though some birds can not fly, still they will fly because of common behavior.
- makeSound2() has too many if, else if conditions and these will keep on growing as more birds (of different
  types) will be added.
- It breaks S and O principal of SOLID.

Note:

- makeSound() is responsible for how a bird will make sound.
- fly() is responsible for how a bird will fly.
- makeDance() is responsible for how a bird will dance.
- Class Bird was responsible to hold attributes and methods of all the birds that exists.

#### Identify violation of SRP

- Method with multiple if-else conditions
    - Not always 'true'. If the if, else-if conditions are part of the logic than it is okay.
- Each block is having completely independent and separate code.
- Monster method
    - Method which has a code that does lot more than what its name suggests.
- SRP is also identified to be violated when we notice code duplication.
- Commons/ Utilities
    - Discouraged - Commons/ Utilities end up becoming garbage for all the code that an engineer does want to think on
      where to put.

#### Summary till now

- Birds (Sparrow, Crow, Pigeon, Owl)
- Let's say a new requirement comes that Peacock is also supported.
- Now, we would have to add another else if block in makeSound() method inside the bird class to support sound from
  Peacock.

#### Why OCP

- Testing becomes easy
- Regression - when because of a new changes something that exists before get breaks.

#### Identify violation of OCP

- New if, else if conditions will result in breaking the OCP.

### Version2

- Let the Bird class be only responsible for generic details and now is specified as abstract.
- now in order to add a new Bird, I just have to create a new child class that extends Bird class.
- Bird class has lesser reasons to change (SRP is also being followed).

### Problem with version2

- Now the problem with version2 is that all birds have to fly()
- New bird is added to the zoo, which is Penguin, it can not fly
- Now we will have to still override the method in Penguin class with an empty implementation OR
  throw some kind of OperationNotSupportedException

### Version3 (Ideal Solution)

- If an entity does not support a behavior it should not have a method to do the behavior implementation.
- so penguin.fly() should not be available
- This can be achieved by having hierarchy of classes like -
    - Bird (abstract class), FlyingBird (abstract class), NonFlyingBird (abstract class)
    - List<Bird>, List<FlyingBird>, List<NonFlyingBird>
- The problem with having such a hierarchy is that it will result in class explosion when there will be more such
  behaviors which are not made available to all the concrete Bird classes. Then we will need to have a lot such
  combination of classes
- For example,
    - Categories: FlyingBird, NonFlyingBird, SoundBird, NonSoundBird
    - Combinations: FlyingSoundBird, FlyingNonSoundBird, NonFlyingSoundBird, NonFlyingNonSoundBird
- Problem is clearly class explosion (2^n)
- Now with these combination of classes available to us, how to get all the birds that can actually fly
- List<?>

### Problem Statement

- Some birds demonstrate a behavior while other birds don't demonstrate that behavior
    - Only the birds that demonstrate the behavior should have to implement that method
    - Also, we should be able to have a list of birds that demonstrate that particular behavior

- So are classes right choice to have behaviors?
- Some birds have a behavior
    - Let them implement the interface
- Other birds that don't have that behavior
    - Those birds don't need to implement the interface
