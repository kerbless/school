// Inseriti tre numeri determinare il maggiore
#include <stdio.h>

int main() {
    static int N = 3;
    int num[N], max = 0;
    int i = 0;
    while(i < N) {
        printf("inserisci il %d^ numero: ", i+1);
        scanf("%d", &num[i]);
        if (num[i] > max) max = num[i];
        i++;
    }
    printf("Il numero maggiore e': %d", max);
    return 0;
}       