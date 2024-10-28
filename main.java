import java.util.Random;

public class Cavallo extends Thread {
    private String nome;
    private int lunghezzaPercorso;
    private int metriPercorsi = 0;
    private Random random = new Random(); // Generatore di numeri casuali per avanzamento

    public Cavallo(String nome, int lunghezzaPercorso) {
        this.nome = nome;
        this.lunghezzaPercorso = lunghezzaPercorso;
    }

    @Override
    public void run() {
            while (metriPercorsi < lunghezzaPercorso) {
                // Ogni step il cavallo avanza tra 1 e 10 metri
                int passo = random.nextInt(10) + 1; 
                metriPercorsi += passo;

                // Limita i metri percorsi alla lunghezza totale della gara
                if (metriPercorsi > lunghezzaPercorso) {
                    metriPercorsi = lunghezzaPercorso;
                }

                // Visualizza l'avanzamento del cavallo
                System.out.println(nome + " ha percorso " + metriPercorsi + " metri.");

                // Pausa tra un passo e l'altro per simulare la corsa (ad esempio 500 ms)
                Thread.sleep(500);
            }

            System.out.println(nome + " ha tagliato il traguardo!");
        } catch (InterruptedException e) {
            System.out.println(nome + " è stato interrotto!");
        }
    }

