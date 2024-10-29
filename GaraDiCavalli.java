import java.util.ArrayList;
import java.util.List;

public class GaraDiCavalli {
    private int lunghezzaGara;
    private List<Cavallo> cavalli = new ArrayList<>();

    public GaraDiCavalli(int lunghezzaGara) {
        this.lunghezzaGara = lunghezzaGara;
    }

    public void aggiungiCavallo(String nome) {
        cavalli.add(new Cavallo(nome, lunghezzaGara));
    }

    public void avviaGara() {
        System.out.println("I cavalli sono pronti! Partenza...");

        // Avvia tutti i cavalli
        for (Cavallo cavallo : cavalli) {
            cavallo.start();
        }

        // Attende che tutti i cavalli terminino la gara
        for (Cavallo cavallo : cavalli) {
            try {
                cavallo.join();
            } catch (InterruptedException e) {
                System.out.println("La gara è stata interrotta.");
            }
        }

        System.out.println("La gara è terminata!");
    }
}