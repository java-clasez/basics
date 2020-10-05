Inheritance
-----------

Passed Down / Inherit

PetSmart:
- Pets                        (L1)                    Wider (Generic / General)
    - Cats                    (L2)                      ^
    - Dogs                    (L2)                      |
    - Fish                    (L2)                      |
        - Saltwater Fish      (L3)                      |
        - Freshwater Fish     (L3)                   Narrower (Specific)

Java uses 'extends' keyword to define parent - child relationship
- You can use class A extends B to make A the child class of B

Method Override
---------------

You can change the behaviour of a method in a child class.(In other words: you "override" the functionality provided
by the parent class)