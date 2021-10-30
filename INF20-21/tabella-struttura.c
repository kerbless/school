/*______________________________________________*/
/*___________ Burroni Blu - III BIA ____________*/
/*________________ 19/05/2021 __________________*/
/*______________________________________________*/

#include <stdio.h>
#include <stdlib.h>

#define MAXP 100 // max number of elements
#define MAXC 1000 // max lenght of strings

typedef struct {
        char cod[MAXC]; // product code
        char desc[MAXC]; // prduct description
        int pre; // product price
    } prodotti;

int main() {
    prodotti t[MAXP]; // products
    int n = 0; // products count
    int i; // iterator
    FILE *fp; // pointer to file with data

    /* load */
    fp = fopen("tabdata.txt", "a+");
    while(fscanf(fp,"%s %s %d", &t[n].cod, &t[n].desc, &t[n].pre) > 0) // see https://www.ibm.com/docs/en/i/7.3?topic=functions-fscanf-read-formatted-data for more
        n++;
        
    /* add another element */
    printf("Inserisci il codice del prodotto: "); /* input */
    scanf("%s", &t[n].cod);
    printf("Inserisci la descrizione del prodotto: ");
    scanf("%s", &t[n].desc);
    printf("Inserisci il prezzo del prodotto: ");
    scanf("%d", &t[n].pre);    
    fprintf(fp, "%s", t[n].cod); /* write */
    fprintf(fp, " %s", t[n].desc);
    fprintf(fp, " %d", t[n].pre);
    n++;
    
    /* print */
    printf("\ncodice");
    printf(" descrizione");
    printf(" prezzo");
    for(i = 0; i < n; i++) {
        printf("\n%s", t[i].cod);
        printf(" %s", t[i].desc);
        printf(" %d", t[i].pre);
    }
    
    /* exit */
    int retur = fclose(fp);
    return 0;
}