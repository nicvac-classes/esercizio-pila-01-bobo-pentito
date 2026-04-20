import java.util.Scanner;

class Esercizio {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String parola;

        while (true) {
            System.out.print("Inserisci una parola (x per uscire): ");
            parola = in.nextLine();

            if (parola.equals("x")) {
                System.out.println("Programma terminato.");
                break;
            }

            // Inserisco ogni carattere nella pila
            Pila<Character> pila = new Pila<>();
            for (char c : parola.toCharArray()) {
                pila.push(c);
            }

            // Ricostruisco la parola al contrario estraendo dalla pila
            StringBuilder rovesciata = new StringBuilder();
            while (!pila.isEmpty()) {
                rovesciata.append(pila.pop());
            }

            if (parola.equals(rovesciata.toString())) {
                System.out.println("\"" + parola + "\" è palindroma!");
            } else {
                System.out.println("\"" + parola + "\" NON è palindroma.");
            }
        }

        in.close();
    }
}