package uk.co.danielbryant.djshoppingserverless.productcatalogue;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.google.gson.Gson;
import uk.co.danielbryant.djshoppingserverless.productcatalogue.services.ProductService;

import java.util.HashMap;
import java.util.Map;

/**
 * Handler for requests to Lambda function.
 */
public class ProductCatalogueFunction implements RequestHandler<Map<String, Object>, Object> {

    private static final int HTTP_OK = 200;
    private static final int HTTP_INTERNAL_SERVER_ERROR = 500;

    private ProductService productService = new ProductService();
    private Gson gson = new Gson();


    public GatewayResponse handleRequest(final Map<String, Object> input, final Context context) {
        Map<String, String> headers = new HashMap<>();
        headers.put("Content-Type", "application/json");

        String output = gson.toJson(productService.getAllProducts());
        return new GatewayResponse(output, headers, HTTP_OK);
    }
}
