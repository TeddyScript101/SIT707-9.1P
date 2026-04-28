package task9_1P;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;

public class ExtensionService {

    public boolean submitRequest(String reason, String dateStr) {

        if (reason == null || reason.trim().isEmpty() || dateStr == null) {
            return false;
        }

        try {

            LocalDate requestDate = LocalDate.parse(dateStr);
            LocalDate today = LocalDate.now();


            if (requestDate.isBefore(today)) {
                System.out.println("Validation Failed: Date is in the past.");
                return false;
            }

     
            System.out.println("Extension submitted successfully for: " + dateStr);
            return true;

        } catch (DateTimeParseException e) {
            return false;
        }
    }
}