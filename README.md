# SOLID_Principles

What is the MOTIVATION behind SOLID Principles???

An Application should take care of frequent changes that are done during the development and the maintaining phase of the application.
For example : New functionalities needs to be added.

Those changes in the existing code should be minimized.

WHY??? Its assumed that the existing code is already unit tested and changes in already written code might affect the existing functionality in an unwanted manner.

S --> Single Responsibility Principle:
--------------------------------

"Things to change for the same reason should be  grouped together, Things to change for different reason should be separated"

 A software entity (class , method ) should have only one reason to change

If a class or a method does more than one procedure , it is advisable to separate it into two distinct classes/ methods ,

It can be easily done with the help of interface !!!

So if we have 2 reasons to change for a class -> we should split the functionality in to 2 separate classes

EACH CLASS WILL HANDLE A SINGLE RESPONSIBILITY !!!

It leads to low coupled design with less and lighter dependencies.




O --> Open / Closed Principle
------------------------------

Open Closed Principle states that the design and writing of the code should be done in a way that new functionality should be added with minimum changes in the existing code .

WE SHOULD KEEP AS MUCH EXISTING CODE UNCHANGED AS POSSIBLE !!!

Software entities should be open for extension , but closed for modification

We have to design every new module -> if we add a new behavior , we do not have to change the existing modules.