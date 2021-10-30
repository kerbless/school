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
int stampaI(int x) { // prints x
    printf("%d\n", x);
}

// 10
float stampaF(float x) { // prints x
    printf("%f\n", x);
}

void printmenu() { // prints the menu
    printf("\tMENU");
    printf("\n0. exit");
    printf("\n1. returns the product of the two factors");
    printf("\n2. returns the base squared");
    printf("\n3. returns the major between x and y");
    printf("\n4. returns the average of x, y and z."); 
    printf("\n5. returns the previus number (x-1)");
    printf("\n6. returns the negative of the absolute value of x");
    printf("\n7. returns the difference between 10 and 1 or -1 if x is greater than 10");
    printf("\n8. returns the closest next multiple of 10 of x");
}

int main() {
    int choice = -1, pm = 1, a, b, c;
    printmenu();
    while(choice =! 0) {
        printf("\nInserisci un'opzione: "); scanf("%d", &choice);
        switch(choice) {
            case 0:
                printmenu();
                break;
            case 1:
                printf("Inserisci un valore: "); scanf("%d", &a);
                printf("Inserisci un valore: "); scanf("%d", &b);
                stampaI(prod(a, b));
                break;
            case 2:
                printf("Inserisci un valore: "); scanf("%d", &a);
                stampaI(sqrd(a));
                break;
            case 3:
                printf("Inserisci un valore: "); scanf("%d", &a);
                printf("Inserisci un valore: "); scanf("%d", &b);
                stampaI(maj(a, b));
                break;
            case 4:
                printf("Inserisci un valore: "); scanf("%d", &a);
                printf("Inserisci un valore: "); scanf("%d", &b);
                printf("Inserisci un valore: "); scanf("%d", &c);
                stampaF(avg(a, b, c));
                break;
            case 5:
                printf("Inserisci un valore: "); scanf("%d", &a);
                stampaI(prec(a));
                break;
            case 6:
                printf("Inserisci un valore: "); scanf("%d", &a);
                stampaI(negative(a));
                break;
            case 7:
                printf("Inserisci un valore: "); scanf("%d", &a);
                stampaI(comp10(a));
                break;
            case 8:
                printf("Inserisci un valore: "); scanf("%d", &a);
                stampaI(multiple10(a));
                break;
            default:
                printf("[!] L'opzione non esiste.\n");
        }
    }

    return 0;
}