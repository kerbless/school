#include <stdio.h>

float perimetro(float x) {
    return x*4;
}

float area(float x) {
    return x*x;
}

void menu() {
    printf("\n\tMENU");
    printf("\n0. Esci");
    printf("\n1. Perimetro");
    printf("\n2. Area");
}

int main() {
    float lato;
    int scelta;
    printf("Inserisci il lato del quadrato: ");
    scanf("%f", &lato);
    do {
        menu();
        printf("\nScegli: ");
        scanf("%d", &scelta);
        switch(scelta) {
            case 0:
                printf("Esco...");
                break;
            case 1:
                printf("Perimetro: %f", perimetro(lato));
                break;
            case 2:
                printf("Area: %f", area(lato));
                break;
            default:
                printf("La tua scelta non esiste.");
        }
    } while (scelta != 0); 
}