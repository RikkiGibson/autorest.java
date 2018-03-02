/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.bodybyte;

import com.microsoft.rest.v2.BodyResponse;
import com.microsoft.rest.v2.RestProxy;
import com.microsoft.rest.v2.ServiceCallback;
import com.microsoft.rest.v2.ServiceFuture;
import com.microsoft.rest.v2.VoidResponse;
import com.microsoft.rest.v2.annotations.BodyParam;
import com.microsoft.rest.v2.annotations.ExpectedResponses;
import com.microsoft.rest.v2.annotations.GET;
import com.microsoft.rest.v2.annotations.Host;
import com.microsoft.rest.v2.annotations.PUT;
import com.microsoft.rest.v2.annotations.UnexpectedResponseExceptionType;
import fixtures.bodybyte.models.ErrorException;
import io.reactivex.Completable;
import io.reactivex.Maybe;
import io.reactivex.Single;
import io.reactivex.annotations.NonNull;
import io.reactivex.functions.Function;

/**
 * An instance of this class provides access to all the operations defined in
 * Bytes.
 */
public final class BytesImpl implements Bytes {
    /**
     * The proxy service used to perform REST calls.
     */
    private BytesService service;

    /**
     * The service client containing this operation class.
     */
    private AutoRestSwaggerBATByteServiceImpl client;

    /**
     * Initializes an instance of BytesImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    public BytesImpl(AutoRestSwaggerBATByteServiceImpl client) {
        this.service = RestProxy.create(BytesService.class, client);
        this.client = client;
    }

    /**
     * The interface defining all the services for Bytes to be used by the
     * proxy service to perform REST calls.
     */
    @Host("http://localhost:3000")
    private interface BytesService {
        @GET("byte/null")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Single<BodyResponse<byte[]>> getNull();

        @GET("byte/empty")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Single<BodyResponse<byte[]>> getEmpty();

        @GET("byte/nonAscii")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Single<BodyResponse<byte[]>> getNonAscii();

        @PUT("byte/nonAscii")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Single<VoidResponse> putNonAscii(@BodyParam("application/json; charset=utf-8") byte[] byteBody);

        @GET("byte/invalid")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Single<BodyResponse<byte[]>> getInvalid();
    }

    /**
     * Get null byte value.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the byte[] object if successful.
     */
    public byte[] getNull() {
        return getNullAsync().blockingGet();
    }

    /**
     * Get null byte value.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a ServiceFuture which will be completed with the result of the network request.
     */
    public ServiceFuture<byte[]> getNullAsync(ServiceCallback<byte[]> serviceCallback) {
        return ServiceFuture.fromBody(getNullAsync(), serviceCallback);
    }

    /**
     * Get null byte value.
     *
     * @return a Single which performs the network request upon subscription.
     */
    public Single<BodyResponse<byte[]>> getNullWithRestResponseAsync() {
        return service.getNull();
    }

    /**
     * Get null byte value.
     *
     * @return a Single which performs the network request upon subscription.
     */
    public Maybe<byte[]> getNullAsync() {
        return getNullWithRestResponseAsync()
            .flatMapMaybe(res -> res.body() == null ? Maybe.empty() : Maybe.just(res.body()));
    }

    /**
     * Get empty byte value ''.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the byte[] object if successful.
     */
    public byte[] getEmpty() {
        return getEmptyAsync().blockingGet();
    }

    /**
     * Get empty byte value ''.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a ServiceFuture which will be completed with the result of the network request.
     */
    public ServiceFuture<byte[]> getEmptyAsync(ServiceCallback<byte[]> serviceCallback) {
        return ServiceFuture.fromBody(getEmptyAsync(), serviceCallback);
    }

    /**
     * Get empty byte value ''.
     *
     * @return a Single which performs the network request upon subscription.
     */
    public Single<BodyResponse<byte[]>> getEmptyWithRestResponseAsync() {
        return service.getEmpty();
    }

    /**
     * Get empty byte value ''.
     *
     * @return a Single which performs the network request upon subscription.
     */
    public Maybe<byte[]> getEmptyAsync() {
        return getEmptyWithRestResponseAsync()
            .flatMapMaybe(res -> res.body() == null ? Maybe.empty() : Maybe.just(res.body()));
    }

    /**
     * Get non-ascii byte string hex(FF FE FD FC FB FA F9 F8 F7 F6).
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the byte[] object if successful.
     */
    public byte[] getNonAscii() {
        return getNonAsciiAsync().blockingGet();
    }

    /**
     * Get non-ascii byte string hex(FF FE FD FC FB FA F9 F8 F7 F6).
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a ServiceFuture which will be completed with the result of the network request.
     */
    public ServiceFuture<byte[]> getNonAsciiAsync(ServiceCallback<byte[]> serviceCallback) {
        return ServiceFuture.fromBody(getNonAsciiAsync(), serviceCallback);
    }

    /**
     * Get non-ascii byte string hex(FF FE FD FC FB FA F9 F8 F7 F6).
     *
     * @return a Single which performs the network request upon subscription.
     */
    public Single<BodyResponse<byte[]>> getNonAsciiWithRestResponseAsync() {
        return service.getNonAscii();
    }

    /**
     * Get non-ascii byte string hex(FF FE FD FC FB FA F9 F8 F7 F6).
     *
     * @return a Single which performs the network request upon subscription.
     */
    public Maybe<byte[]> getNonAsciiAsync() {
        return getNonAsciiWithRestResponseAsync()
            .flatMapMaybe(res -> res.body() == null ? Maybe.empty() : Maybe.just(res.body()));
    }

    /**
     * Put non-ascii byte string hex(FF FE FD FC FB FA F9 F8 F7 F6).
     *
     * @param byteBody Base64-encoded non-ascii byte string hex(FF FE FD FC FB FA F9 F8 F7 F6).
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    public void putNonAscii(@NonNull byte[] byteBody) {
        putNonAsciiAsync(byteBody).blockingAwait();
    }

    /**
     * Put non-ascii byte string hex(FF FE FD FC FB FA F9 F8 F7 F6).
     *
     * @param byteBody Base64-encoded non-ascii byte string hex(FF FE FD FC FB FA F9 F8 F7 F6).
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a ServiceFuture which will be completed with the result of the network request.
     */
    public ServiceFuture<Void> putNonAsciiAsync(@NonNull byte[] byteBody, ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromBody(putNonAsciiAsync(byteBody), serviceCallback);
    }

    /**
     * Put non-ascii byte string hex(FF FE FD FC FB FA F9 F8 F7 F6).
     *
     * @param byteBody Base64-encoded non-ascii byte string hex(FF FE FD FC FB FA F9 F8 F7 F6).
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Single which performs the network request upon subscription.
     */
    public Single<VoidResponse> putNonAsciiWithRestResponseAsync(@NonNull byte[] byteBody) {
        if (byteBody == null) {
            throw new IllegalArgumentException("Parameter byteBody is required and cannot be null.");
        }
        return service.putNonAscii(byteBody);
    }

    /**
     * Put non-ascii byte string hex(FF FE FD FC FB FA F9 F8 F7 F6).
     *
     * @param byteBody Base64-encoded non-ascii byte string hex(FF FE FD FC FB FA F9 F8 F7 F6).
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Single which performs the network request upon subscription.
     */
    public Completable putNonAsciiAsync(@NonNull byte[] byteBody) {
        return putNonAsciiWithRestResponseAsync(byteBody)
            .toCompletable();
    }

    /**
     * Get invalid byte value ':::SWAGGER::::'.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the byte[] object if successful.
     */
    public byte[] getInvalid() {
        return getInvalidAsync().blockingGet();
    }

    /**
     * Get invalid byte value ':::SWAGGER::::'.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a ServiceFuture which will be completed with the result of the network request.
     */
    public ServiceFuture<byte[]> getInvalidAsync(ServiceCallback<byte[]> serviceCallback) {
        return ServiceFuture.fromBody(getInvalidAsync(), serviceCallback);
    }

    /**
     * Get invalid byte value ':::SWAGGER::::'.
     *
     * @return a Single which performs the network request upon subscription.
     */
    public Single<BodyResponse<byte[]>> getInvalidWithRestResponseAsync() {
        return service.getInvalid();
    }

    /**
     * Get invalid byte value ':::SWAGGER::::'.
     *
     * @return a Single which performs the network request upon subscription.
     */
    public Maybe<byte[]> getInvalidAsync() {
        return getInvalidWithRestResponseAsync()
            .flatMapMaybe(res -> res.body() == null ? Maybe.empty() : Maybe.just(res.body()));
    }
}
