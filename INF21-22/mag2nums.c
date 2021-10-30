// Inseriti due numeri determinare il maggiore
#include <stdio.h>

int main() {
    int num, num2;
    printf("Primo numero: "); scanf("%d", &num);
    printf("Secondo numero: "); scanf ("%d", &num2);
    printf("Il numero maggiore e': ");
    if (num > num2) {
        printf("%d", num);
    }
    else {
        printf("%d", num2);
    }
    return 0;
}