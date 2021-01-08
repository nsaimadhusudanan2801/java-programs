# java-programs

Exercise 1. Write program that draws letter N of n size. Number n is a positive integer entered
by the user. For example, if n = 5 then drawing looks like the following:

```math
*       *
* *     *
*   *   *
*     * *
*       *
```
Use WHILE iteration loop.

Exercise 2. Write program that generates 80-element list of random integer numbers belonging to
the interval [30,100], prints this list and calculates the sum of those elements that are odd (prints the
proper message about this sum on the console).

Exercise 3. Write the program that calculates the area and the perimeter of the romboid. The
diagonals e and f of the romboid are positive float numbers entered by the user. Program should contain
functions public static float area(float e, float f ) and public static float perimeter(float
e, float f ) that return the characteristics of the romboid. You should also secure the program in the
case of wrong input data using TRY – CATCH and IF – ELSE instructions.

Exercise 4. Create Rectangular class that defines objects that are rectangulars having parameters
a, b and c that are the attributes (fields) of the class. The class should contain three methods:
three–parametrical constructor Rectangular(float a, float b, float c) and methods float area()
and float diagonal() that are responsible for calculating the total area and the diagonal of the rectangular.
You should secure the constructor (values a, b and c should be positive). In the case when
they are not correct the object should not be created (use System.exit(0) instruction). In the main
part of the program you should check correctness of the created class. The needed formulae for the
area and the diagonal are presented below:

```math
A = 2*(a*b + a*c + b*c)
d = sqrt{a^2 + b^2 + c^2}
```


