# Practice 2012 - 04: Math Tutoring

## Background
You are helping a friend with the rule for taking the derivative of a
polynomial, but he just can’t seem to get it! You’ve gone over many examples,
and finally you decide to just write a program to compute the derivatives for
him.
Recall that a polynomial of the form:
`Ax^n + BxX(n−1) + . . . + Yx + Z`
has as its derivative:
`nAx^(n−1) + (n − 1)Bx^(n−2) + . . . + Y`

For example, the derivative of
`2x^3 − x + 3`
is
`6x^2 − 1.`

Likewise, the derivatave of
`3x^4 + 2x^3 + 7x^2 + 5x + 7`
is
`12x^3 + 6x^2 + 14x + 5`.

Given a polynomial, provide the derivative. We are only using polynomials.

## Description

### Input
The rst line of input is the number of test cases that follow.
Each input case appears on a single line, and will start with a single integer,
n (1 ≤ n ≤ 100), which is the highest exponent of the polynomial. n + 1 values
will follow, which are the coefficients of the terms x^n down to x^0 = 1,
respectively. All coefficients will be integers between -1000 and 1000,
inclusive. The highest exponent will always be positive. All numbers will be
separated by a single space.

### Output
For each case, output the line “Case x:” where x is the case number, on a
single line. The output polynomial is to be formatted in the same manner as
the input: the first value being the highest polynomial, and the successive
values being the coefficients for the individual terms. Each output case should
be on one line, with the values separated by one space.

## Sample
### Input
```
4
3 2 0 -1 3
4 3 2 7 5 7
5 6 5 4 3 2 1
1 5 10
```

### Output
```
Case 1: 2 6 0 -1
Case 2: 3 12 6 14 5
Case 3: 4 30 20 12 6 2
Case 4: 0 5
```
