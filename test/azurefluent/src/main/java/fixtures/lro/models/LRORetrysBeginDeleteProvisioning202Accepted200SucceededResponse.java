/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.lro.models;

import com.microsoft.rest.v2.RestResponse;
import fixtures.lro.implementation.LRORetrysDeleteProvisioning202Accepted200SucceededHeadersInner;
import fixtures.lro.implementation.ProductInner;
import java.util.Map;

/**
 * Contains all response data for the beginDeleteProvisioning202Accepted200Succeeded operation.
 */
public final class LRORetrysBeginDeleteProvisioning202Accepted200SucceededResponse extends RestResponse<LRORetrysDeleteProvisioning202Accepted200SucceededHeadersInner, ProductInner> {
    /**
     * Creates an instance of LRORetrysBeginDeleteProvisioning202Accepted200SucceededResponse.
     *
     * @param statusCode the status code of the HTTP response.
     * @param headers the deserialized headers of the HTTP response.
     * @param rawHeaders the raw headers of the HTTP response.
     * @param body the deserialized body of the HTTP response.
     */
    public LRORetrysBeginDeleteProvisioning202Accepted200SucceededResponse(int statusCode, LRORetrysDeleteProvisioning202Accepted200SucceededHeadersInner headers, Map<String, String> rawHeaders, ProductInner body) {
        super(statusCode, headers, rawHeaders, body);
    }

    /**
     * @return the deserialized response headers.
     */
    @Override
    public LRORetrysDeleteProvisioning202Accepted200SucceededHeadersInner headers() {
        return super.headers();
    }

    /**
     * @return the deserialized response body.
     */
    @Override
    public ProductInner body() {
        return super.body();
    }
}
