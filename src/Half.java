import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Half {
    public static void main(String[] args) {

        Random r = new Random();

        ArrayList<String> listaDs = new ArrayList<>(Arrays.asList("Maciel", "Santana", "Byanka", "Kethelyn", "Felipe", "VTorres",
                "Aprigio", "Beck", "Manuela", "Keven", "Pedrinho", "Prates", "Fabio", "Corsi", "Jão", "Vinicius"));
        System.out.println("\nAlunos removidos:\n");
        for(int i = 0; i < 8; i++){
            int removido = r.nextInt(listaDs.size());
            System.out.println(listaDs.get(removido));
            listaDs.remove(removido);
        }
        System.out.println("\nAlunos restantes:\n\n" + listaDs);
    }
}
