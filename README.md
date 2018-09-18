# SOLID_Principles

Single Responsibility Principle:
--------------------------------

"Things to change for the same reason should be  grouped together, Things to change for different reason should be separated"

 A software entity (class , method ) should have only one reason to change

If a class or a method does more than one procedure , it is advisable to separate it into two distinct classes/ methods ,

It can be easily done with the help of interface !!!

So if we have 2 reasons to change for a class -> we should split the functionality in to 2 separate classes

EACH CLASS WILL HANDLE A SINGLE RESPONSIBILITY !!!

It leads to low coupled design with less and lighter dependencies.