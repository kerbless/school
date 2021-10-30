#include <stdio.h>

int requestNum() {
    // funzione di relativa utilità aggiunta per dimostrazione
    int n;
    printf("\nInserisci un numero (0 per uscire): "); 
    scanf("%d", &n);
    return n;
}

int main() {
    int num = -1, sum = 0;
    while(num != 0) {
        num = requestNum();
        sum += num;
        printf("Totale: %d", sum);
    }
    return 0;
}