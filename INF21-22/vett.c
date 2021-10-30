#include <stdio.h>

int main() {
    static int size = 4;
    int vett[size];
    for(int i = 0; i < size; i++) {
        printf("inserisci il %d^ numero: ", i+1);
        scanf("%d", &vett[i]);
    }
    printf("hai inserito (indice:valore):" );
    for(int i = 0; i < size; i++)
       printf(" %d:%d ", i, vett[i]); 


}