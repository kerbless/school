#include <stdio.h>

int f1() {
    int nAppartamenti;
    printf("Inserisci il numero di appartamenti del condominio: ");
    scanf("%d", &nAppartamenti);
    return nAppartamenti;
}
void f2() {}
void f3() {}
void f4() {}
void f5() {}
void f6() {}
void f7() {}
void f8() {}
void f9() {}

int main() {
    int nAppartamenti, nAffittati;

    // 1
    nAppartamenti = f1();

    // 2
    printf("Inserisci il numero di appartamenti in affitto: ");
    scanf("%d", &nAffittati);

    // 3
    if (nAffittati > nAppartamenti-nAffittati) {
        printf("Ci sono piu' appartamenti in affitto che di proprieta'\n");
    }
    else {
        printf("Ci sono piu' appartamenti di proprieta' che in affitto (o sono uguali)\n");
    }

    // 4+5
    int metriQuadri[nAppartamenti];
    int totmq = 0;
    for (int i = 0; i < nAppartamenti; i++) {
        printf("Inserisci la dimensione in metri quadri dell'appartamento %d: ", i+1);
        scanf("%d", &metriQuadri[i]);
        totmq += metriQuadri[i];
    }
    printf("Il totale dei metri quadri: %d\n", totmq);

    // 6
    float ampiezzaMedia = (float)totmq/nAppartamenti;

    // 73
    int nAmpiezzaSuperiore = 0;
    for (int i = 0; i < nAppartamenti; i++) {
       if (metriQuadri[i] > ampiezzaMedia) nAmpiezzaSuperiore++;
    }
    if (nAmpiezzaSuperiore > nAppartamenti-nAmpiezzaSuperiore)
        printf("Ci sono piu' appartamenti con ampiezza superiore alla media");
    else printf("Ci sono piu' appartamenti con ampiezza inferiore alla media");

    //8
    float spesaElettrica;
    printf("\nA quanto ammonta la spesa elettrica condominiale?\n> ");
    scanf("%f", &spesaElettrica);

    //9
    printf("\nSPESA ELETTRICA PER APPARTAMENTO (In base ai metri quadri - Approssimata al centesimo)\n");
    printf("|%-13s|%-13s|%-13s|", "Appartamento", "Metri quadri", "SPESA");
    for (int i = 0; i < nAppartamenti; i++) {
        printf("\n|%-13d|%-13d|%-13.2f|", i+1, metriQuadri[i], spesaElettrica/(float)totmq*metriQuadri[i]);
    }
}