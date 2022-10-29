# Design a Pen (Entity Design Problem)

- Overview
    - To identify the problem scope.
    - What kind of problem is it? For example, entity, real time system, management system, api designing, engineering
    - What does the system do exactly?

- Gather Requirements (By suggesting ideas)
    - There can be different types of Pen. Pen can be Gel, Ball, Fountain, Marker.
    - Pens can either have a cap or not have a cap.
    - What qualifies as a Pen? - If anything that can write is a Pen.
        - If Pen is anything that can write, then Pen can be an abstract class or interface (with write method).
    - What are the different details we want to store about Pens like length, width, penBrand, penName, can be refilled
      or not?
    - A refill has a nib and an ink. Ink can be of different colour.
    - Ball Pen and Gel Pen have a Ball Pen Refill and a Gel Pen Refill respectively to write.
    - A fountain pen has an Ink.
    - Refill has a radius. For fountain pen, its tip has a radius.
    - Each pen can write in a different way.
    - Some pens write in the same way.
    - Every pen has a brand and a name.
    - Some pens may allow refilling while others might not.

- Requirement Clarifications
    - can different pens have the same write behavior?

- Use case diagram (not needed for entity based design problems)

- Class diagram (two good ways is using noun and verbs)