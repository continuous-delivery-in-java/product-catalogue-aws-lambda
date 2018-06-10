package uk.co.danielbryant.djshoppingserverless.productcatalogue;

import org.junit.Test;

import static org.junit.Assert.*;

public class ProductCatalogueFunctionTest {

    @Test
    public void successfulResponse() {
        ProductCatalogueFunction productCatalogueFunction = new ProductCatalogueFunction();
        GatewayResponse result = (GatewayResponse) productCatalogueFunction.handleRequest(null, null);
        assertEquals(result.getStatusCode(), 200);
        assertEquals(result.getHeaders().get("Content-Type"), "application/json");
        String content = result.getBody();
        assertNotNull(content);
        assertTrue(content.contains("\"Widget\""));
    }
}
