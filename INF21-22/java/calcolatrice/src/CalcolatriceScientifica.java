public class CalcolatriceScientifica extends Calcolatrice {
    public float potenza(float base, float potenza) {
        if (potenza == 0) return 1;
        else {
            float ris = 1;
            for (int i = 0; i < potenza; i++) {
                ris *= potenza;
            }
            return ris;
        }
    }
}
