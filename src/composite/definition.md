## Structural design pattern

Composite is an object designed as a composition of one or more similar objects, representing
a tree structure while allowing clients to work with
the composite or any of its parts uniformly.

## Participants

1. Component - common interface for simple and complex elements of the tree.
2. Leaf - basic element of the tree (no subtypes).
3. Composite _aka_ Container-contains tree elements: leaves or other containers represented by the common interface. 
   The container delegates work to the sub-elements and lastly returns final result to the client.
4. Client - works with all elements of the tree using the common interface.

## When to use
When dealing with tree-like structures where having to distinguish between a leaf and branch makes code more complex 
and therefore more error-prone.



