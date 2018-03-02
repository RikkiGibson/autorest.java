/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.http.implementation;

import com.microsoft.rest.v2.BodyResponse;
import com.microsoft.rest.v2.RestProxy;
import com.microsoft.rest.v2.ServiceCallback;
import com.microsoft.rest.v2.ServiceFuture;
import com.microsoft.rest.v2.annotations.ExpectedResponses;
import com.microsoft.rest.v2.annotations.GET;
import com.microsoft.rest.v2.annotations.Host;
import com.microsoft.rest.v2.annotations.UnexpectedResponseExceptionType;
import fixtures.http.HttpFailures;
import fixtures.http.models.ErrorException;
import io.reactivex.Maybe;
import io.reactivex.Single;
import io.reactivex.functions.Function;

/**
 * An instance of this class provides access to all the operations defined in
 * HttpFailures.
 */
public final class HttpFailuresImpl implements HttpFailures {
    /**
     * The proxy service used to perform REST calls.
     */
    private HttpFailuresService service;

    /**
     * The service client containing this operation class.
     */
    private AutoRestHttpInfrastructureTestServiceImpl client;

    /**
     * Initializes an instance of HttpFailuresImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    public HttpFailuresImpl(AutoRestHttpInfrastructureTestServiceImpl client) {
        this.service = RestProxy.create(HttpFailuresService.class, client);
        this.client = client;
    }

    /**
     * The interface defining all the services for HttpFailures to be used by
     * the proxy service to perform REST calls.
     */
    @Host("http://localhost:3000")
    private interface HttpFailuresService {
        @GET("http/failure/emptybody/error")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Single<BodyResponse<Boolean>> getEmptyError();

        @GET("http/failure/nomodel/error")
        @ExpectedResponses({200})
        Single<BodyResponse<Boolean>> getNoModelError();

        @GET("http/failure/nomodel/empty")
        @ExpectedResponses({200})
        Single<BodyResponse<Boolean>> getNoModelEmpty();
    }

    /**
     * Get empty error form server.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the boolean object if successful.
     */
    public boolean getEmptyError() {
        return getEmptyErrorAsync().blockingGet();
    }

    /**
     * Get empty error form server.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a ServiceFuture which will be completed with the result of the network request.
     */
    public ServiceFuture<Boolean> getEmptyErrorAsync(ServiceCallback<Boolean> serviceCallback) {
        return ServiceFuture.fromBody(getEmptyErrorAsync(), serviceCallback);
    }

    /**
     * Get empty error form server.
     *
     * @return a Single which performs the network request upon subscription.
     */
    public Single<BodyResponse<Boolean>> getEmptyErrorWithRestResponseAsync() {
        return service.getEmptyError();
    }

    /**
     * Get empty error form server.
     *
     * @return a Single which performs the network request upon subscription.
     */
    public Maybe<Boolean> getEmptyErrorAsync() {
        return getEmptyErrorWithRestResponseAsync()
            .flatMapMaybe(res -> res.body() == null ? Maybe.empty() : Maybe.just(res.body()));
    }

    /**
     * Get empty error form server.
     *
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the boolean object if successful.
     */
    public boolean getNoModelError() {
        return getNoModelErrorAsync().blockingGet();
    }

    /**
     * Get empty error form server.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a ServiceFuture which will be completed with the result of the network request.
     */
    public ServiceFuture<Boolean> getNoModelErrorAsync(ServiceCallback<Boolean> serviceCallback) {
        return ServiceFuture.fromBody(getNoModelErrorAsync(), serviceCallback);
    }

    /**
     * Get empty error form server.
     *
     * @return a Single which performs the network request upon subscription.
     */
    public Single<BodyResponse<Boolean>> getNoModelErrorWithRestResponseAsync() {
        return service.getNoModelError();
    }

    /**
     * Get empty error form server.
     *
     * @return a Single which performs the network request upon subscription.
     */
    public Maybe<Boolean> getNoModelErrorAsync() {
        return getNoModelErrorWithRestResponseAsync()
            .flatMapMaybe(res -> res.body() == null ? Maybe.empty() : Maybe.just(res.body()));
    }

    /**
     * Get empty response from server.
     *
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the boolean object if successful.
     */
    public boolean getNoModelEmpty() {
        return getNoModelEmptyAsync().blockingGet();
    }

    /**
     * Get empty response from server.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a ServiceFuture which will be completed with the result of the network request.
     */
    public ServiceFuture<Boolean> getNoModelEmptyAsync(ServiceCallback<Boolean> serviceCallback) {
        return ServiceFuture.fromBody(getNoModelEmptyAsync(), serviceCallback);
    }

    /**
     * Get empty response from server.
     *
     * @return a Single which performs the network request upon subscription.
     */
    public Single<BodyResponse<Boolean>> getNoModelEmptyWithRestResponseAsync() {
        return service.getNoModelEmpty();
    }

    /**
     * Get empty response from server.
     *
     * @return a Single which performs the network request upon subscription.
     */
    public Maybe<Boolean> getNoModelEmptyAsync() {
        return getNoModelEmptyWithRestResponseAsync()
            .flatMapMaybe(res -> res.body() == null ? Maybe.empty() : Maybe.just(res.body()));
    }
}
