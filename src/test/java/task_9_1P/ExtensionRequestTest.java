package task_9_1P; 

import org.junit.Assert;
import org.junit.Test;

import task_9_1P.ExtensionService; 

public class ExtensionRequestTest {

    @Test
    public void testSubmitRequest_ValidData_ReturnsSuccess() {
        ExtensionService service = new ExtensionService();
        boolean result = service.submitRequest("Sick for 10 days", "2026-05-08");
        Assert.assertTrue(result);
    }

    @Test
    public void testSubmitRequest_EmptyReason_ReturnsFalse() {
        ExtensionService service = new ExtensionService();
        boolean result = service.submitRequest("", "2026-05-08");
        Assert.assertFalse(result);
    }
}