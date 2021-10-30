// Burroni Blu - 4BIA - 09/10/2021

/* TRACCIA 2:
Scrivere un
programma in C per Inserire in un array di 10 elementi i voti delle
prove in informatica di un alunno.

visualizzare la media dei voti;
visualizzare il numero di insufficienze(voti minori di 6);
visualizzare se l�alunno � promosso (solo se la media � maggiore di 6 e non ha insufficienze);
visualizzare in quale prova ha ottenuto il voto pi� alto;
visualizzare il numero di prove in cui ha avuto un voto maggiore di 7;
visualizzare se l�alunno � respinto(tutti i voti minori di 6);
visualizzare se l�alunno � sospeso(almeno un voto minore di 6).

L�uso del Men� e delle procedure � opzionale ma sar� valutata.
*/

#include <stdio.h>

void perr() {
	printf("[!] Input non valido.\n");
}

void takeGrades(int v[]) { // arrays are always passed by reference
	int i;
	for(i = 0; i < 10; i++) {
			printf("Inserisci il voto dell'alunno nella prova %d (di 10): ", i+1); scanf("%d", &v[i]);
			if (v[i] > 10 || v[i] < 0) { // coarse input control
				perr();
				i--;
			}
		}
	return;
}

void printMenu() {
	printf( "\n\tMENU'"
			"\n0. Visualizza tutte le voci del menu'."
			"\n1. Media dei voti."
			"\n2. Numero di insufficienze."
			"\n3. Stato promozione."
			"\n4. Prova con voto piu' alto."
			"\n5. Prove con voti maggiori di 7."
			"\n6. Stato respinzione."
			"\n7. Stato sospensione."
			"\n8. Pulisci schermo."
			"\n9. Modifica tutti i voti."
			"\n10. Exit."
			);
}

float avg(int v[]) {
	int i, sum = 0;
	for(i = 0; i < 10; i++) {
		sum += v[i];
	}
	return (float)sum/10;
}

int insuff(int v[]) {
	int i, x = 0;
	for(i = 0; i < 10; i++) {
		if(v[i] < 6) x++;
	}
	return x;
}

int maxi(int v[]) {
	int i, max = 0, maxi = 0;
	for(i = 0; i < 10; i++) {
		if(v[i] > max) {
			max = v[i];
			maxi = i;
		}
	}
	return maxi;
}

int maj7(int v[]) {
	int i, count = 0;
	for(i = 0; i < 10; i++) if(v[i] > 7) count++;
	return count;
}

int main() {
	int voti[10] = {6,6,6,6,6,6,6,6,8,4}, choice, i;
	takeGrades(voti);
	system("cls"); // non-portable, see: https://stackoverflow.com/questions/2347770/how-do-you-clear-the-console-screen-in-c
	printMenu();
	do {
		printf("\nInserisci la scelta (0-10): "); scanf("%d", &choice);
		switch(choice) {
			case 0:
			case 1:
				printf("> La media dei voti risulta: %.2f\n", avg(voti));
				if (choice != 0) break;	
			case 2:
				printf("> L'alunno ha %d insufficienze.\n", insuff(voti));
				if (choice != 0) break;
			case 3:
				if(avg(voti) > 6 && insuff(voti) == 0) printf("> L'alunno verra' promosso.\n"); // superfluos recalculation (sometimes)
				else printf("> L'alunno NON verra' promosso.\n");
				if (choice != 0) break;
			case 4:
				printf("> L'alunno ha ottenuto il suo voto piu' alto (%d) nella prova numero %d (di 10).\n", voti[maxi(voti)], maxi(voti)+1); // superfluos recalculation
				printf(" > Potrebbero esserci prove successive con questo stesso voto.\n");
				if (choice != 0) break;
			case 5:
				printf("> L'alunno ha %d voto/i maggiore/i di 7.\n", maj7(voti));
				if (choice != 0) break;
			case 6:
				if(insuff(voti) == 10) printf("> Positivo: L'alunno verra' respinto.\n"); // superfluos recalculation (sometimes)
				else printf("> Negativo: L'alunno NON verra' respinto.\n");
				if (choice != 0) break;
			case 7:
				if(insuff(voti) > 0) printf("> Positivo: L'alunno e' sospeso.\n"); // superfluos recalculation (sometimes)
				else printf("> Negativo: L'alunno NON e' sospeso.\n");	
				break;
			case 8:
				system("cls"); // non-portable, see: https://stackoverflow.com/questions/2347770/how-do-you-clear-the-console-screen-in-c
				printMenu();
				break;
			case 9:
				takeGrades(voti);
				break;
			case 10:
				break;
			default:
				perr();
		}
	} while(choice != 10);
		
	return 0;
}