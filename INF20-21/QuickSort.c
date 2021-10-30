/*______________________________________________*/
/*___________ Burroni Blu - III BIA ____________*/
/*________________ 10/05/2021 __________________*/
/*______________________________________________*/

// PREPROCESSOR
#include <stdio.h>

// FUNCTION PROTOTYPES
void quickSort(int v[], int s, int e);
int partition(int v[], int s, int e);
void printVect(int vect[]);

// GLOBAL VARIABLES
int vector[5] = {1,7,5,2,3};
int size = sizeof(vector) / sizeof(vector[0]);

// MAIN
int main() {
	printf("%-16s", "Initial vector: "); printVect(vector);
	int ciao = partition(vector, 0, size);
	printf("\n%-16s", "Quick sorted: "); printVect(vector); printf("\n%d", ciao);
	
	/* end */
	return 0;
}


// FUNCTION DEFINITIONS
void quickSort(int v[], int s, int e) {
	int lastPivot; //Index of the last pivot
	if (s < e) {
		lastPivot = partition(v, s, e); //Return last pivot but does other stuff too
		quickSort(v, s, lastPivot-1); //first half
		quickSort(v, lastPivot+1, e); //second half
	}
}

int partition(int v[], int s, int e) {
	int pivot = v[e]; //Takes last element as pivot
	int k = 0; //Index of the last smaller than pivot element
	int tmp; //Swap variable
	int i; //Iterator
	for (i = s; i <= e-1; i++) {
		if (v[i] < pivot) {
			/*Swap the smaller than pivot element with first non smaller than pivot element*/
			tmp = v[i];
			v[i] = v[k+1];
			v[k+1] = tmp;
			k++; //Update the index of the last smaller than pivot element
		}
	}
	/*Swap pivot (last element) with the "divison point" */
	tmp = v[pivot];
	v[pivot] = v[k+1];
	v[k+1] = tmp;
	return k+1;
}

void printVect(int vect[]) { /* gets an int vector and prints it's values in line */
	int i; /* Support for older gcc versions */
	
	printf("|");
	for (i = 0; i < size; i++) {
		printf("%d|", vect[i]);
	}
}