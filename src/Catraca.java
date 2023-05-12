import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;
class Catraca {
    private Map<Integer, LocalDateTime> registrosEntrada;

    public Catraca() {
        registrosEntrada = new HashMap<>();
    }

    public void verificarCracha(Cracha cracha) {
        int numeroCracha = cracha.getNumeroCracha();

        if (registrosEntrada.containsKey(numeroCracha)) {
            LocalDateTime dataHoraEntrada = registrosEntrada.get(numeroCracha);
            LocalDateTime dataHoraSaida = LocalDateTime.now();

            System.out.println("\n\nData e Hora de Entrada: " + dataHoraEntrada);
            System.out.println("\nData e Hora de Saída: " + dataHoraSaida);
            System.out.println("\nAdeus! Volte sempre.");
        } else {
            LocalDateTime dataHoraEntrada = LocalDateTime.now();
            registrosEntrada.put(numeroCracha, dataHoraEntrada);

            System.out.println("\nData e Hora de Entrada: " + dataHoraEntrada);
            System.out.println("\nSeja bem-vindo!");
        }
    }
}

