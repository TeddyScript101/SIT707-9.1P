package task_9_1P;

import org.junit.Assert;
import org.junit.Test;

import task9_1P.ExtensionService;

public class ExtensionRequestTest {

    @Test
    public void testSubmitRequest_ValidData_ReturnsSuccess() {
        ExtensionService service = new ExtensionService();
        boolean result = service.submitRequest("Need more time for TDD", "2026-05-10");
        Assert.assertTrue(result);
    }

    @Test
    public void testSubmitRequest_EmptyReason_ReturnsFalse() {
        ExtensionService service = new ExtensionService();

        boolean result = service.submitRequest("", "2026-05-10");
        Assert.assertFalse(result);
    }

    @Test
    public void testSubmitRequest_PastDate_ReturnsFalse() {
        ExtensionService service = new ExtensionService();
  
        boolean result = service.submitRequest("Valid reason", "2020-01-01");
        Assert.assertFalse("Past date should not be allowed", result);
    }
}