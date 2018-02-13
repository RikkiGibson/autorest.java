/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.azurespecials;

import com.microsoft.rest.v2.RestResponse;
import com.microsoft.rest.v2.ServiceCallback;
import com.microsoft.rest.v2.ServiceFuture;
import fixtures.azurespecials.models.HeaderCustomNamedRequestIdHeaders;
import fixtures.azurespecials.models.HeaderCustomNamedRequestIdHeadHeaders;
import fixtures.azurespecials.models.HeaderCustomNamedRequestIdParamGroupingHeaders;
import fixtures.azurespecials.models.HeaderCustomNamedRequestIdParamGroupingParameters;
import io.reactivex.Completable;
import io.reactivex.Maybe;
import io.reactivex.Single;
import io.reactivex.annotations.NonNull;

/**
 * An instance of this class provides access to all the operations defined in
 * Headers.
 */
public interface Headers {
    /**
     * Send foo-client-request-id = 9C4D50EE-2D56-4CD3-8152-34347DC9F2B0 in the header of the request.
     *
     * @param fooClientRequestId The fooRequestId.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void customNamedRequestId(@NonNull String fooClientRequestId);

    /**
     * Send foo-client-request-id = 9C4D50EE-2D56-4CD3-8152-34347DC9F2B0 in the header of the request.
     *
     * @param fooClientRequestId The fooRequestId.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link ServiceFuture&lt;Void&gt;} object.
     */
    ServiceFuture<Void> customNamedRequestIdAsync(@NonNull String fooClientRequestId, ServiceCallback<Void> serviceCallback);

    /**
     * Send foo-client-request-id = 9C4D50EE-2D56-4CD3-8152-34347DC9F2B0 in the header of the request.
     *
     * @param fooClientRequestId The fooRequestId.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link Single&lt;RestResponse&lt;HeaderCustomNamedRequestIdHeaders, Void&gt;&gt;} object if successful.
     */
    Single<RestResponse<HeaderCustomNamedRequestIdHeaders, Void>> customNamedRequestIdWithRestResponseAsync(@NonNull String fooClientRequestId);

    /**
     * Send foo-client-request-id = 9C4D50EE-2D56-4CD3-8152-34347DC9F2B0 in the header of the request.
     *
     * @param fooClientRequestId The fooRequestId.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link Completable} object if successful.
     */
    Completable customNamedRequestIdAsync(@NonNull String fooClientRequestId);

    /**
     * Send foo-client-request-id = 9C4D50EE-2D56-4CD3-8152-34347DC9F2B0 in the header of the request, via a parameter group.
     *
     * @param headerCustomNamedRequestIdParamGroupingParameters Additional parameters for the operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void customNamedRequestIdParamGrouping(@NonNull HeaderCustomNamedRequestIdParamGroupingParameters headerCustomNamedRequestIdParamGroupingParameters);

    /**
     * Send foo-client-request-id = 9C4D50EE-2D56-4CD3-8152-34347DC9F2B0 in the header of the request, via a parameter group.
     *
     * @param headerCustomNamedRequestIdParamGroupingParameters Additional parameters for the operation.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link ServiceFuture&lt;Void&gt;} object.
     */
    ServiceFuture<Void> customNamedRequestIdParamGroupingAsync(@NonNull HeaderCustomNamedRequestIdParamGroupingParameters headerCustomNamedRequestIdParamGroupingParameters, ServiceCallback<Void> serviceCallback);

    /**
     * Send foo-client-request-id = 9C4D50EE-2D56-4CD3-8152-34347DC9F2B0 in the header of the request, via a parameter group.
     *
     * @param headerCustomNamedRequestIdParamGroupingParameters Additional parameters for the operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link Single&lt;RestResponse&lt;HeaderCustomNamedRequestIdParamGroupingHeaders, Void&gt;&gt;} object if successful.
     */
    Single<RestResponse<HeaderCustomNamedRequestIdParamGroupingHeaders, Void>> customNamedRequestIdParamGroupingWithRestResponseAsync(@NonNull HeaderCustomNamedRequestIdParamGroupingParameters headerCustomNamedRequestIdParamGroupingParameters);

    /**
     * Send foo-client-request-id = 9C4D50EE-2D56-4CD3-8152-34347DC9F2B0 in the header of the request, via a parameter group.
     *
     * @param headerCustomNamedRequestIdParamGroupingParameters Additional parameters for the operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link Completable} object if successful.
     */
    Completable customNamedRequestIdParamGroupingAsync(@NonNull HeaderCustomNamedRequestIdParamGroupingParameters headerCustomNamedRequestIdParamGroupingParameters);

    /**
     * Send foo-client-request-id = 9C4D50EE-2D56-4CD3-8152-34347DC9F2B0 in the header of the request.
     *
     * @param fooClientRequestId The fooRequestId.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the boolean object if successful.
     */
    boolean customNamedRequestIdHead(@NonNull String fooClientRequestId);

    /**
     * Send foo-client-request-id = 9C4D50EE-2D56-4CD3-8152-34347DC9F2B0 in the header of the request.
     *
     * @param fooClientRequestId The fooRequestId.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link ServiceFuture&lt;Boolean&gt;} object.
     */
    ServiceFuture<Boolean> customNamedRequestIdHeadAsync(@NonNull String fooClientRequestId, ServiceCallback<Boolean> serviceCallback);

    /**
     * Send foo-client-request-id = 9C4D50EE-2D56-4CD3-8152-34347DC9F2B0 in the header of the request.
     *
     * @param fooClientRequestId The fooRequestId.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link Single&lt;RestResponse&lt;HeaderCustomNamedRequestIdHeadHeaders, Boolean&gt;&gt;} object if successful.
     */
    Single<RestResponse<HeaderCustomNamedRequestIdHeadHeaders, Boolean>> customNamedRequestIdHeadWithRestResponseAsync(@NonNull String fooClientRequestId);

    /**
     * Send foo-client-request-id = 9C4D50EE-2D56-4CD3-8152-34347DC9F2B0 in the header of the request.
     *
     * @param fooClientRequestId The fooRequestId.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link Maybe&lt;Boolean&gt;} object if successful.
     */
    Maybe<Boolean> customNamedRequestIdHeadAsync(@NonNull String fooClientRequestId);
}
