package task9_1P;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;

public class ExtensionService {

    public boolean submitRequest(String reason, String dateStr) {
        if (!isValidInput(reason, dateStr)) {
            return false;
        }

        LocalDate requestDate = parseDate(dateStr);
        if (requestDate == null) {
            return false;
        }

        if (isPastDate(requestDate)) {
            log("Validation Failed: Date is in the past.");
            return false;
        }

        log("Extension submitted successfully for: " + dateStr);
        return true;
    }

    private boolean isValidInput(String reason, String dateStr) {
        return reason != null && !reason.trim().isEmpty()
                && dateStr != null && !dateStr.trim().isEmpty();
    }

    private LocalDate parseDate(String dateStr) {
        try {
            return LocalDate.parse(dateStr);
        } catch (DateTimeParseException e) {
            log("Validation Failed: Invalid date format.");
            return null;
        }
    }

    private boolean isPastDate(LocalDate date) {
        return date.isBefore(LocalDate.now());
    }

    private void log(String message) {
        System.out.println(message);
    }
}