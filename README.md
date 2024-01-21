# Low-Level Design Series by Ishan

Welcome to the Low-Level Design (LLD) series by Ishan! 🚀 💻
This repository is a comprehensive collection of detailed low-level design problems, structured into different modules
covering Object-Oriented Programming (OOP), SOLID design principles, design patterns (Creational, Structural,
Behavioral), and specific low-level design problems.

## Table of Contents

1. Object-Oriented Programming (OOP) [:link:](/oop/)
2. SOLID Design Principles [:link:](/design_principles/)
3. Design Patterns [🔗](/design_patterns/)
    - Creational [🔗](/design_patterns/creational/)
    - Structural [🔗](/design_patterns/structural/)
    - Behavioral [🔗](/design_patterns/behavioural/)
        - [Chain of Responsibility](/design_patterns/behavioural/src/main/java/chain_of_responsibility/) 🔄: Illustrated
          through a real-life example involving a hierarchical approval system within an organization. The chain
          involves managers, senior managers, and directors, each capable of approving specific types of requests, with
          unapproved requests cascading up the hierarchy.
        - [Command Pattern](/design_patterns/behavioural/src/main/java/command/) 🛠️: Explored through two diverse
          examples:
            - **Banking Scenario:** Demonstrates how commands can be used to execute various banking operations.
            - **Air Conditioner System:** Introduces a flexible command pattern where commands are issued from a remote
              to the AC, allowing for easy addition of new commands without altering existing code.
        - [Iterator Design Pattern](/design_patterns/behavioural/src/main/java/iterator/) 🔍: Focuses on the creation of
          a custom iterator that traverses a list of browsing history objects, providing a convenient way to obtain
          desired results.
        - [Mediator Design Pattern](/design_patterns/behavioural/src/main/java/mediator/) 🤝: Examined through a chat
          server and client interaction, where communication between users is facilitated through a mediator (server).
          Also applied to an auction system, illustrating how live bids are managed.
        - [Memento Design Pattern](/design_patterns/behavioural/src/main/java/memento/) 🕰️: Explored using an article
          storage scenario, demonstrating how the pattern enables the storage of previous states that can be recovered
          at any point in the future.
        - [Observer Design Pattern](/design_patterns/behavioural/src/main/java/observer/) 🔍👀: Examined through multiple
          examples where a subject is tracked by various observers. The subject notifies registered observers,
          triggering their update methods.
        - [State Design Pattern](/design_patterns/behavioural/src/main/java/state/) 🔄📦: Illustrated through two
          examples:
            - **Order State Lifecycle:** Captures the lifecycle of an order with various states.
            - **TV State Management:** Manages the state of a TV, showcasing the transition between different
              operational states.
        - [Strategy Design Pattern](/design_patterns/behavioural/src/main/java/strategy/) 🎮🔧: Explored through diverse
          scenarios:
            - **Bird Management System:** Demonstrates how different birds have different flying and quacking behaviors.
            - **Payment Strategy System:** Applied during runtime for shopping payments, allowing flexible payment
              strategy selection.
        - [Template Design Pattern](/design_patterns/behavioural/src/main/java/template/) 📜🎮: Demonstrated through
          examples in gaming, where different games share a common structure for initialization,
          start, and stop methods. The play method is intentionally not overrideable by child classes, ensuring a
          consistent template.
        - [Visitor Design Pattern](/design_patterns/behavioural/src/main/java/visitor/) 🚗💳: Beautifully illustrated
          through two real-life scenarios:
            - **Car Service Center:** Represents a car visiting a service center to receive various services.
            - **Offer System:** Deals with multiple offers and credit cards, utilizing visitor methods for each card
              to interact with specific offers, creating numerous possible combinations.
4. Low-Level Design Problems [:link:](/low_level_design/)
    - [Design Pen (Entity Design Problem)](/low_level_design/design-pen/) 🖋️: A fundamental exercise in designing
      entities and their relationships. Explore the concept of object modeling.
    - [Design Newsletter Subscription (Observer Behaviour DP)](/low_level_design/newsletter-subscription/) 📬: Apply the
      Observer pattern to create a system for managing newsletter subscriptions.
    - [Apply Coupons on Shopping Cart (Decorator Structure DP)](/low_level_design/apply-coupons-on-shopping-cart/) 🛒:
      Implement the Decorator pattern to add coupon functionality to a shopping cart.
    - [Design Null Object Handler (Avoid Null Checks In Code)](/low_level_design/design-nullobject-handler/) 🚫: Solve
      the null-check problem by designing a Null Object Handler.
    - [Design TicTacToe Version 1 (Interactive Real World Multi Player Game)](/low_level_design/design-tictactoe-v1/) 🎮:
      Create a basic version of TicTacToe, a multiplayer game with interactive features.
    - [Design TicTacToe (Interactive Real World Multi Player Game)](/low_level_design/design-tictactoe/) 🕹️: Enhance the
      TicTacToe design to include more features and improve gameplay.
    - [Design Snake and Ladder (Real World Game Design)](/low_level_design/design-snake-and-ladder/) 🐍🎲: Dive into the
      design of the classic Snake and Ladder game with real-world considerations.
    - [Design Car Rental System (Management System)](/low_level_design/design-car-rental-system/) 🚗💼: Build a
      comprehensive car rental system, covering user interactions and management aspects.
    - [Design Logging System (Chain Of Responsibility Behaviour DP)](/low_level_design/design-logging-system/) 📝🔄:
      Implement the Chain of Responsibility pattern for an efficient logging system.
    - [Design Amazon Locker](/low_level_design/design-amazon-locker/) 📦🔐: Explore the design of an Amazon Locker system
      for secure package storage and retrieval.
    - [Design Splitwise](/low_level_design/design-splitwise/) 💸💡: Tackle the low-level design challenges of a
      Splitwise-like expense sharing application.
    - [Others](/low_level_design/Others/) 🧩: Miscellaneous low-level design problems.
    - [Rate Limiter](/low_level_design/rate-limiter/) ⏳🚫: Implement a rate limiter to control the rate of incoming
      requests.
    - [Service Orchestrator](/low_level_design/service-orchestrator/) 🔄🔧: Design a service orchestrator to manage and
      coordinate various services.
    - [Request Scheduler](/low_level_design/request-scheduler/) 🗓️🕰️: Develop a request scheduler for efficient task
      scheduling.

## OOP

The OOP module contains fundamental Java concepts, providing a solid foundation for understanding object-oriented
programming.

## SOLID Design Principles

Explore detailed explanations of the SOLID design principles, helping you write maintainable and scalable code.

## Design Patterns

Dive into the world of design patterns, categorized into three sub-modules:

### Creational

Discover design patterns that deal with object creation mechanisms, trying to create objects in a manner suitable to the
situation.

### Structural

Explore patterns that focus on simplifying the composition of classes or objects, emphasizing the composition of classes
or objects.

### Behavioral Design Patterns [🔗](/design_patterns/behavioural/)

In the Behavioral module of Design Patterns, we explore solutions that focus on algorithms, communication, and the
assignment of responsibilities between objects.

#### 1. Chain of Responsibility [🔗](/design_patterns/behavioural/src/main/java/chain_of_responsibility/) 🔄

Illustrated through a real-life example involving a hierarchical approval system within an organization. The chain
involves managers, senior managers, and directors, each capable of approving specific types of requests, with unapproved
requests cascading up the hierarchy.

#### 2. Command Pattern [🔗](/design_patterns/behavioural/src/main/java/command/) 🛠️

Explored through two diverse examples:

- **Banking Scenario:** Demonstrates how commands can be used to execute various banking operations.
- **Air Conditioner System:** Introduces a flexible command pattern where commands are issued from a remote to the AC,
  allowing for easy addition of new commands without altering existing code.

#### 3. Iterator Design Pattern [🔗](/design_patterns/behavioural/src/main/java/iterator/) 🔍

Focuses on the creation of a custom iterator that traverses a list of browsing history objects, providing a convenient
way to obtain desired results.

#### 4. Mediator Design Pattern [🔗](/design_patterns/behavioural/src/main/java/mediator/) 🤝

Examined through a chat server and client interaction, where communication between users is facilitated through a
mediator (server). Also applied to an auction system, illustrating how live bids are managed.

#### 5. Memento Design Pattern [🔗](/design_patterns/behavioural/src/main/java/memento/) 🕰️

Explored using an article storage scenario, demonstrating how the pattern enables the storage of previous states that
can be recovered at any point in the future.

#### 6. Observer Design Pattern [🔗](/design_patterns/behavioural/src/main/java/observer/) 🔍👀

Examined through multiple examples where a subject is tracked by various observers. The subject notifies registered
observers, triggering their update methods.

#### 7. State Design Pattern [🔗](/design_patterns/behavioural/src/main/java/state/) 🔄📦

Illustrated through two examples:

- **Order State Lifecycle:** Captures the lifecycle of an order with various states.
- **TV State Management:** Manages the state of a TV, showcasing the transition between different operational states.

#### 8. Strategy Design Pattern [🔗](/design_patterns/behavioural/src/main/java/strategy/) 🎮🔧

Explored through diverse scenarios:

- **Bird Management System:** Demonstrates how different birds have different flying and quacking behaviors.
- **Payment Strategy System:** Applied during runtime for shopping payments, allowing flexible payment strategy
  selection.

#### 9. Template Design Pattern [🔗](/design_patterns/behavioural/src/main/java/template/) 📜🎮

Demonstrated through examples in gaming, where different games share a common structure for initialization, start, and
stop methods. The play method is intentionally not overrideable by child classes, ensuring a consistent template.

#### 10. Visitor Design Pattern [🔗](/design_patterns/behavioural/src/main/java/visitor/) 🚗💳

Beautifully illustrated through two real-life scenarios:

- **Car Service Center:** Represents a car visiting a service center to receive various services.
- **Offer System:** Deals with multiple offers and credit cards, utilizing visitor methods for each card to interact
  with specific offers, creating numerous possible combinations.

## Low-Level Design Problems

Each directory in this module corresponds to a specific low-level design problem. Inside each directory, you'll find a
comprehensive solution along with explanations, diagrams, and code samples.

## Contact Information

If you have a specific design problem you'd like me to cover or if you simply want to share your thoughts, feel free to
reach out:

- **Email:** [ishan.aggarwal.1423@gmail.com](mailto:ishan.aggarwal.1423@gmail.com)
- **LinkedIn:** [Ishan Aggarwal](https://www.linkedin.com/in/ishan-aggarwal/)
- **Medium Articles:** [Ishan Aggarwal on Medium](https://ishan-aggarwal.medium.com/)

Thank you for being a part of the Low-Level Design Series community! 🚀

## Show your Support

If you find this repository helpful or have suggestions for improvement, don't forget to ⭐️ it! Your support keeps this
project active and encourages further development.

Happy coding! 🚀
