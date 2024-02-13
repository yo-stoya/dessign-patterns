## Behavioral design pattern
Reduces dependencies and promotes low coupling between classes by restricting direct communication between objects
and forces them to collaborate via a mediator object.

Analogy: Taxi drivers do not communicate directly to each other who will pick up the next customer as then each
driver should know about all of their colleagues. Instead, they talk to their headquarters, which dispatches them to the
address.

## Participants
1. Components - business classes containing a ref to the mediator.
2. Mediator - interface declaring methods of communication between components.
3. Concrete mediator - encapsulates component relations by holding a reference to each of them and sometimes even
   managing their lifecycle.

**Note:** Components should not be aware of each other and if something happens within a component, it should notify the
mediator. Which will take the request, identify the sender and delegate further.

## When to use
When it's hard to change classes due to tight coupling.
When you want to reuse component in a different program but can't because of its dependencies.

## Implementation
1. Identify the group of tightly coupled classes.
2. Declare mediator interface and the communication algorithm.
3. Implement concrete mediator class that will store references to all components.
4. Pass mediator to component constructor to establish the connection.
5. Refactor components to call the mediator's notification method rather than other components directly. Those 
   methods can be extracted to the concrete mediator.
