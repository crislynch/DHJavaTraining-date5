//Crea un oggetto data da questa stringa 2023-03-01T13:00:00Z
//Crea un secondo oggetto data da questa stringa 2024-03-01T13:00:00Z
//Verificare che la prima data è precedente alla seconda
//Verificare che la seconda data è successiva alla prima
//Verificare che le due date sono uguali ad ora
//Stampa il risultato

import java.time.OffsetDateTime;

public class Main {
    public static void main(String[] args) {
        String dataString1 = "2023-03-01T13:00:00Z";
        String dataString2 = "2024-03-01T13:00:00Z";

        OffsetDateTime data1 = OffsetDateTime.parse(dataString1);
        OffsetDateTime data2 = OffsetDateTime.parse(dataString2);

        //Verificare che la prima data è precedente alla seconda
        boolean firstIsBefore = data1.isBefore(data2);
        System.out.println("La prima data è precedente alla seconda? " + firstIsBefore);

        //Verificare che la seconda data è successiva alla prima
        boolean secondIsAfter = data2.isAfter(data1);
        System.out.println("La seconda data è successiva alla prima? " + secondIsAfter);

        //Verificare che le due date sono uguali ad ora
        boolean isEquals = data1.isEqual(data2);
        System.out.println("Le due date sono uguali ad ora? " + isEquals);

    }
}