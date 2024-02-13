## Structural design pattern
Composite is an object designed as a composition of one or more similar objects, representing
a tree structure which allows clients to work with
the composite or any of its parts uniformly.

## Participants
1. Component - common interface for simple and complex elements of the tree.
2. Leaf - basic element of the tree (no subtypes).
3. Composite _aka_ Container-contains tree elements: leaves or other containers represented by the common interface. 
   The container delegates work to the sub-elements and lastly return a final result to the client.
4. Client - works with all elements of the tree using the common interface.

## When to use
When dealing with tree-like structures where having to distinguish between a leaf and branch makes code more complex 
and therefore more error-prone.

## Implementation
1. Breakdown application into simple and container elements that form the tree structure. Containers should be able 
   to hold both simple elements and other containers.
2. Declare the _Composite_ interface with common algorithms for both simple elements and containers.
3. Create one or more leaf classes to represent simple elements.
4. Create a container class to represent the composite.
5. Add methods for adding and removing elements to a container.

**Note**: You can add the methods from pt.5 in the Composite interface allowing polymorphism for the client but at the 
price of violating _LSP_ (empty methods in leaf classes).