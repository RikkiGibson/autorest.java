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
import java.util.Map;

/**
 * Contains all response data for the post202NonRetry400 operation.
 */
public final class LROSADsPost202NonRetry400Response extends RestResponse<LROSADsPost202NonRetry400Headers, Void> {
    /**
     * Creates an instance of LROSADsPost202NonRetry400Response.
     *
     * @param statusCode the status code of the HTTP response.
     * @param headers the deserialized headers of the HTTP response.
     * @param rawHeaders the raw headers of the HTTP response.
     * @param body the deserialized body of the HTTP response.
     */
    public LROSADsPost202NonRetry400Response(int statusCode, LROSADsPost202NonRetry400Headers headers, Map<String, String> rawHeaders, Void body) {
        super(statusCode, headers, rawHeaders, body);
    }

    /**
     * @return the deserialized response headers.
     */
    @Override
    public LROSADsPost202NonRetry400Headers headers() {
        return super.headers();
    }
}
