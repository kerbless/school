// Blu Burroni - 4BIA - 02/10/21
#include <stdio.h>

// 1
int prod(int fact, int fact2) { // returns the product of the two factors
    return fact*fact2;
}

// 2
int sqrd(int base) { // returns the base squared
    return base*base;
}

// 3
int maj(int x, int y) { // returns the major between x and y
    if (x > y) return x;
    else return y;
}

// 4
float avg(int x, int y, int z) { // returns the average of x, y and z.
    return (float)(x+y+z)/3;
}

// 5
int prec(int x) { // returns the previus number (x-1)
    return x-1;
}

// 6
int negative(int x) { // returns the negative of the absolute value of x
    if (x > 0) return x*-1;
    else return x;
}

// 7
int comp10(int x) { // returns the difference between 10 and 1 or -1 if x is greater than 10
    if(x > 10) return -1;
    else return 10-x;
}

// 8
int multiple10(int x) { // returns the closest next multiple of 10 of x
    int r = x%10;
    if(r == 0) return x;
    else return x+(10-r);
}

// 9
int stampaI(int x) { //prints x
    printf("%d\n", x);
}

// 10
float stampaF(float x) { //prints x
    printf("%f\n", x);
}

int main() {
    int val1, val2;
    printf("Inserisci un valore: "); scanf("%d", &val1);
    printf("Inserisci un valore: "); scanf("%d", &val2);
    int product = prod(val1, val2); stampaI(product);
    int val1sqrd = sqrd(val1); stampaI(val1sqrd);
    int greater = maj(product, val1sqrd); stampaI(greater);
    stampaF(avg(val1, val2, greater));
    stampaI(prec(val1));
    stampaI(negative(val2));
    stampaI(comp10(val2));
    stampaI(multiple10(val1));

    return 0;
}