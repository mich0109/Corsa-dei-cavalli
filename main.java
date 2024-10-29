import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Chiede la lunghezza del percorso
        System.out.print("Inserisci la lunghezza del percorso della gara in metri: ");
        int lunghezzaPercorso = scanner.nextInt();
        scanner.nextLine(); // Riempe la nuova linea rimasta

        // Crea la gara
        GaraDiCavalli gara = new GaraDiCavalli(lunghezzaPercorso);

        // Chiede il numero di cavalli
        System.out.print("Inserisci il numero di cavalli: ");
        int numeroCavalli = scanner.nextInt();
        scanner.nextLine(); 

        // Aggiunge i cavalli alla gara
        for (int i = 0; i < numeroCavalli; i++) {
            System.out.print("Inserisci il nome del cavallo " + (i + 1) + ": ");
            String nomeCavallo = scanner.nextLine();
            gara.aggiungiCavallo(nomeCavallo);
        }

        gara.avviaGara();
        scanner.close();
    }
}


