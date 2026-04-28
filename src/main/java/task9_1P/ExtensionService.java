package task9_1P;

public class ExtensionService {
    public boolean submitRequest(String reason, String date) {
        if (reason == null || reason.trim().isEmpty()) {
            return false;
        }
        if (date == null || date.trim().isEmpty()) {
            return false;
        }
        return true; 
    }
}