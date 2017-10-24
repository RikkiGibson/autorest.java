/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.bodydatetimerfc1123.implementation;

import com.microsoft.rest.RestProxy;
import com.microsoft.rest.RestResponse;
import fixtures.bodydatetimerfc1123.Datetimerfc1123s;
import com.google.common.reflect.TypeToken;
import com.microsoft.rest.annotations.BodyParam;
import com.microsoft.rest.annotations.ExpectedResponses;
import com.microsoft.rest.annotations.GET;
import com.microsoft.rest.annotations.Headers;
import com.microsoft.rest.annotations.Host;
import com.microsoft.rest.annotations.PUT;
import com.microsoft.rest.annotations.ReturnValueWireType;
import com.microsoft.rest.annotations.UnexpectedResponseExceptionType;
import com.microsoft.rest.DateTimeRfc1123;
import com.microsoft.rest.http.HttpClient;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import fixtures.bodydatetimerfc1123.models.ErrorException;
import java.io.IOException;
import org.joda.time.DateTime;
import rx.functions.Func1;
import rx.Observable;
import rx.Single;

/**
 * An instance of this class provides access to all the operations defined
 * in Datetimerfc1123s.
 */
public class Datetimerfc1123sImpl implements Datetimerfc1123s {
    /** The RestProxy service to perform REST calls. */
    private Datetimerfc1123sService service;
    /** The service client containing this operation class. */
    private AutoRestRFC1123DateTimeTestServiceImpl client;

    /**
     * Initializes an instance of Datetimerfc1123s.
     *
     * @param client the instance of the service client containing this operation class.
     */
    public Datetimerfc1123sImpl(AutoRestRFC1123DateTimeTestServiceImpl client) {
        this.service = RestProxy.create(Datetimerfc1123sService.class, client.restClient().baseURL(), client.httpClient(), client.serializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for Datetimerfc1123s to be
     * used by RestProxy to perform REST calls.
    */
    @Host("https://localhost")
    interface Datetimerfc1123sService {
        @Headers({ "x-ms-logging-context: fixtures.bodydatetimerfc1123.Datetimerfc1123s getNull" })
        @GET("datetimerfc1123/null")
        @ExpectedResponses({200})
        @ReturnValueWireType(DateTimeRfc1123.class)
        @UnexpectedResponseExceptionType(ErrorException.class)
        Single<RestResponse<Void, DateTime>> getNull();

        @Headers({ "x-ms-logging-context: fixtures.bodydatetimerfc1123.Datetimerfc1123s getInvalid" })
        @GET("datetimerfc1123/invalid")
        @ExpectedResponses({200})
        @ReturnValueWireType(DateTimeRfc1123.class)
        @UnexpectedResponseExceptionType(ErrorException.class)
        Single<RestResponse<Void, DateTime>> getInvalid();

        @Headers({ "x-ms-logging-context: fixtures.bodydatetimerfc1123.Datetimerfc1123s getOverflow" })
        @GET("datetimerfc1123/overflow")
        @ExpectedResponses({200})
        @ReturnValueWireType(DateTimeRfc1123.class)
        @UnexpectedResponseExceptionType(ErrorException.class)
        Single<RestResponse<Void, DateTime>> getOverflow();

        @Headers({ "x-ms-logging-context: fixtures.bodydatetimerfc1123.Datetimerfc1123s getUnderflow" })
        @GET("datetimerfc1123/underflow")
        @ExpectedResponses({200})
        @ReturnValueWireType(DateTimeRfc1123.class)
        @UnexpectedResponseExceptionType(ErrorException.class)
        Single<RestResponse<Void, DateTime>> getUnderflow();

        @Headers({ "x-ms-logging-context: fixtures.bodydatetimerfc1123.Datetimerfc1123s putUtcMaxDateTime" })
        @PUT("datetimerfc1123/max")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Single<RestResponse<Void, Void>> putUtcMaxDateTime(@BodyParam("application/json; charset=utf-8") DateTimeRfc1123 datetimeBody);

        @Headers({ "x-ms-logging-context: fixtures.bodydatetimerfc1123.Datetimerfc1123s getUtcLowercaseMaxDateTime" })
        @GET("datetimerfc1123/max/lowercase")
        @ExpectedResponses({200})
        @ReturnValueWireType(DateTimeRfc1123.class)
        @UnexpectedResponseExceptionType(ErrorException.class)
        Single<RestResponse<Void, DateTime>> getUtcLowercaseMaxDateTime();

        @Headers({ "x-ms-logging-context: fixtures.bodydatetimerfc1123.Datetimerfc1123s getUtcUppercaseMaxDateTime" })
        @GET("datetimerfc1123/max/uppercase")
        @ExpectedResponses({200})
        @ReturnValueWireType(DateTimeRfc1123.class)
        @UnexpectedResponseExceptionType(ErrorException.class)
        Single<RestResponse<Void, DateTime>> getUtcUppercaseMaxDateTime();

        @Headers({ "x-ms-logging-context: fixtures.bodydatetimerfc1123.Datetimerfc1123s putUtcMinDateTime" })
        @PUT("datetimerfc1123/min")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Single<RestResponse<Void, Void>> putUtcMinDateTime(@BodyParam("application/json; charset=utf-8") DateTimeRfc1123 datetimeBody);

        @Headers({ "x-ms-logging-context: fixtures.bodydatetimerfc1123.Datetimerfc1123s getUtcMinDateTime" })
        @GET("datetimerfc1123/min")
        @ExpectedResponses({200})
        @ReturnValueWireType(DateTimeRfc1123.class)
        @UnexpectedResponseExceptionType(ErrorException.class)
        Single<RestResponse<Void, DateTime>> getUtcMinDateTime();

    }

    /**
     * Get null datetime value.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the {@link DateTime} object if successful.
     */
    public DateTime getNull() {
        return getNullAsync().toBlocking().value();
    }

    /**
     * Get null datetime value.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<DateTime> getNullAsync(ServiceCallback<DateTime> serviceCallback) {
        return ServiceFuture.fromBody(getNullAsync(), serviceCallback);
    }

    /**
     * Get null datetime value.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return a {@link Single} emitting the RestResponse<Void, DateTime> object
     */
    public Single<RestResponse<Void, DateTime>> getNullWithRestResponseAsync() {
        return service.getNull();
    }

    /**
     * Get null datetime value.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return a {@link Single} emitting the {@link DateTime} object
     */
    public Single<DateTime> getNullAsync() {
            return getNullWithRestResponseAsync()
                .map(new Func1<RestResponse<Void, DateTime>, DateTime>() {
                    public DateTime call(RestResponse<Void, DateTime> restResponse) {
                        return restResponse.body();
                    }
                });
    }

    /**
     * Get invalid datetime value.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the {@link DateTime} object if successful.
     */
    public DateTime getInvalid() {
        return getInvalidAsync().toBlocking().value();
    }

    /**
     * Get invalid datetime value.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<DateTime> getInvalidAsync(ServiceCallback<DateTime> serviceCallback) {
        return ServiceFuture.fromBody(getInvalidAsync(), serviceCallback);
    }

    /**
     * Get invalid datetime value.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return a {@link Single} emitting the RestResponse<Void, DateTime> object
     */
    public Single<RestResponse<Void, DateTime>> getInvalidWithRestResponseAsync() {
        return service.getInvalid();
    }

    /**
     * Get invalid datetime value.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return a {@link Single} emitting the {@link DateTime} object
     */
    public Single<DateTime> getInvalidAsync() {
            return getInvalidWithRestResponseAsync()
                .map(new Func1<RestResponse<Void, DateTime>, DateTime>() {
                    public DateTime call(RestResponse<Void, DateTime> restResponse) {
                        return restResponse.body();
                    }
                });
    }

    /**
     * Get overflow datetime value.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the {@link DateTime} object if successful.
     */
    public DateTime getOverflow() {
        return getOverflowAsync().toBlocking().value();
    }

    /**
     * Get overflow datetime value.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<DateTime> getOverflowAsync(ServiceCallback<DateTime> serviceCallback) {
        return ServiceFuture.fromBody(getOverflowAsync(), serviceCallback);
    }

    /**
     * Get overflow datetime value.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return a {@link Single} emitting the RestResponse<Void, DateTime> object
     */
    public Single<RestResponse<Void, DateTime>> getOverflowWithRestResponseAsync() {
        return service.getOverflow();
    }

    /**
     * Get overflow datetime value.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return a {@link Single} emitting the {@link DateTime} object
     */
    public Single<DateTime> getOverflowAsync() {
            return getOverflowWithRestResponseAsync()
                .map(new Func1<RestResponse<Void, DateTime>, DateTime>() {
                    public DateTime call(RestResponse<Void, DateTime> restResponse) {
                        return restResponse.body();
                    }
                });
    }

    /**
     * Get underflow datetime value.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the {@link DateTime} object if successful.
     */
    public DateTime getUnderflow() {
        return getUnderflowAsync().toBlocking().value();
    }

    /**
     * Get underflow datetime value.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<DateTime> getUnderflowAsync(ServiceCallback<DateTime> serviceCallback) {
        return ServiceFuture.fromBody(getUnderflowAsync(), serviceCallback);
    }

    /**
     * Get underflow datetime value.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return a {@link Single} emitting the RestResponse<Void, DateTime> object
     */
    public Single<RestResponse<Void, DateTime>> getUnderflowWithRestResponseAsync() {
        return service.getUnderflow();
    }

    /**
     * Get underflow datetime value.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return a {@link Single} emitting the {@link DateTime} object
     */
    public Single<DateTime> getUnderflowAsync() {
            return getUnderflowWithRestResponseAsync()
                .map(new Func1<RestResponse<Void, DateTime>, DateTime>() {
                    public DateTime call(RestResponse<Void, DateTime> restResponse) {
                        return restResponse.body();
                    }
                });
    }

    /**
     * Put max datetime value Fri, 31 Dec 9999 23:59:59 GMT.
     *
     * @param datetimeBody the DateTime value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the {@link void} object if successful.
     */
    public void putUtcMaxDateTime(DateTime datetimeBody) {
        putUtcMaxDateTimeAsync(datetimeBody).toBlocking().value();
    }

    /**
     * Put max datetime value Fri, 31 Dec 9999 23:59:59 GMT.
     *
     * @param datetimeBody the DateTime value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> putUtcMaxDateTimeAsync(DateTime datetimeBody, ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromBody(putUtcMaxDateTimeAsync(datetimeBody), serviceCallback);
    }

    /**
     * Put max datetime value Fri, 31 Dec 9999 23:59:59 GMT.
     *
     * @param datetimeBody the DateTime value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return a {@link Single} emitting the RestResponse<Void, Void> object
     */
    public Single<RestResponse<Void, Void>> putUtcMaxDateTimeWithRestResponseAsync(DateTime datetimeBody) {
        if (datetimeBody == null) {
            throw new IllegalArgumentException("Parameter datetimeBody is required and cannot be null.");
        }
        DateTimeRfc1123 datetimeBodyConverted = new DateTimeRfc1123(datetimeBody);
        return service.putUtcMaxDateTime(datetimeBodyConverted);
    }

    /**
     * Put max datetime value Fri, 31 Dec 9999 23:59:59 GMT.
     *
     * @param datetimeBody the DateTime value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return a {@link Single} emitting the {@link Void} object
     */
    public Single<Void> putUtcMaxDateTimeAsync(DateTime datetimeBody) {
            return putUtcMaxDateTimeWithRestResponseAsync(datetimeBody)
                .map(new Func1<RestResponse<Void, Void>, Void>() {
                    public Void call(RestResponse<Void, Void> restResponse) {
                        return restResponse.body();
                    }
                });
    }

    /**
     * Get max datetime value fri, 31 dec 9999 23:59:59 gmt.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the {@link DateTime} object if successful.
     */
    public DateTime getUtcLowercaseMaxDateTime() {
        return getUtcLowercaseMaxDateTimeAsync().toBlocking().value();
    }

    /**
     * Get max datetime value fri, 31 dec 9999 23:59:59 gmt.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<DateTime> getUtcLowercaseMaxDateTimeAsync(ServiceCallback<DateTime> serviceCallback) {
        return ServiceFuture.fromBody(getUtcLowercaseMaxDateTimeAsync(), serviceCallback);
    }

    /**
     * Get max datetime value fri, 31 dec 9999 23:59:59 gmt.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return a {@link Single} emitting the RestResponse<Void, DateTime> object
     */
    public Single<RestResponse<Void, DateTime>> getUtcLowercaseMaxDateTimeWithRestResponseAsync() {
        return service.getUtcLowercaseMaxDateTime();
    }

    /**
     * Get max datetime value fri, 31 dec 9999 23:59:59 gmt.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return a {@link Single} emitting the {@link DateTime} object
     */
    public Single<DateTime> getUtcLowercaseMaxDateTimeAsync() {
            return getUtcLowercaseMaxDateTimeWithRestResponseAsync()
                .map(new Func1<RestResponse<Void, DateTime>, DateTime>() {
                    public DateTime call(RestResponse<Void, DateTime> restResponse) {
                        return restResponse.body();
                    }
                });
    }

    /**
     * Get max datetime value FRI, 31 DEC 9999 23:59:59 GMT.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the {@link DateTime} object if successful.
     */
    public DateTime getUtcUppercaseMaxDateTime() {
        return getUtcUppercaseMaxDateTimeAsync().toBlocking().value();
    }

    /**
     * Get max datetime value FRI, 31 DEC 9999 23:59:59 GMT.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<DateTime> getUtcUppercaseMaxDateTimeAsync(ServiceCallback<DateTime> serviceCallback) {
        return ServiceFuture.fromBody(getUtcUppercaseMaxDateTimeAsync(), serviceCallback);
    }

    /**
     * Get max datetime value FRI, 31 DEC 9999 23:59:59 GMT.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return a {@link Single} emitting the RestResponse<Void, DateTime> object
     */
    public Single<RestResponse<Void, DateTime>> getUtcUppercaseMaxDateTimeWithRestResponseAsync() {
        return service.getUtcUppercaseMaxDateTime();
    }

    /**
     * Get max datetime value FRI, 31 DEC 9999 23:59:59 GMT.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return a {@link Single} emitting the {@link DateTime} object
     */
    public Single<DateTime> getUtcUppercaseMaxDateTimeAsync() {
            return getUtcUppercaseMaxDateTimeWithRestResponseAsync()
                .map(new Func1<RestResponse<Void, DateTime>, DateTime>() {
                    public DateTime call(RestResponse<Void, DateTime> restResponse) {
                        return restResponse.body();
                    }
                });
    }

    /**
     * Put min datetime value Mon, 1 Jan 0001 00:00:00 GMT.
     *
     * @param datetimeBody the DateTime value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the {@link void} object if successful.
     */
    public void putUtcMinDateTime(DateTime datetimeBody) {
        putUtcMinDateTimeAsync(datetimeBody).toBlocking().value();
    }

    /**
     * Put min datetime value Mon, 1 Jan 0001 00:00:00 GMT.
     *
     * @param datetimeBody the DateTime value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> putUtcMinDateTimeAsync(DateTime datetimeBody, ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromBody(putUtcMinDateTimeAsync(datetimeBody), serviceCallback);
    }

    /**
     * Put min datetime value Mon, 1 Jan 0001 00:00:00 GMT.
     *
     * @param datetimeBody the DateTime value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return a {@link Single} emitting the RestResponse<Void, Void> object
     */
    public Single<RestResponse<Void, Void>> putUtcMinDateTimeWithRestResponseAsync(DateTime datetimeBody) {
        if (datetimeBody == null) {
            throw new IllegalArgumentException("Parameter datetimeBody is required and cannot be null.");
        }
        DateTimeRfc1123 datetimeBodyConverted = new DateTimeRfc1123(datetimeBody);
        return service.putUtcMinDateTime(datetimeBodyConverted);
    }

    /**
     * Put min datetime value Mon, 1 Jan 0001 00:00:00 GMT.
     *
     * @param datetimeBody the DateTime value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return a {@link Single} emitting the {@link Void} object
     */
    public Single<Void> putUtcMinDateTimeAsync(DateTime datetimeBody) {
            return putUtcMinDateTimeWithRestResponseAsync(datetimeBody)
                .map(new Func1<RestResponse<Void, Void>, Void>() {
                    public Void call(RestResponse<Void, Void> restResponse) {
                        return restResponse.body();
                    }
                });
    }

    /**
     * Get min datetime value Mon, 1 Jan 0001 00:00:00 GMT.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the {@link DateTime} object if successful.
     */
    public DateTime getUtcMinDateTime() {
        return getUtcMinDateTimeAsync().toBlocking().value();
    }

    /**
     * Get min datetime value Mon, 1 Jan 0001 00:00:00 GMT.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<DateTime> getUtcMinDateTimeAsync(ServiceCallback<DateTime> serviceCallback) {
        return ServiceFuture.fromBody(getUtcMinDateTimeAsync(), serviceCallback);
    }

    /**
     * Get min datetime value Mon, 1 Jan 0001 00:00:00 GMT.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return a {@link Single} emitting the RestResponse<Void, DateTime> object
     */
    public Single<RestResponse<Void, DateTime>> getUtcMinDateTimeWithRestResponseAsync() {
        return service.getUtcMinDateTime();
    }

    /**
     * Get min datetime value Mon, 1 Jan 0001 00:00:00 GMT.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return a {@link Single} emitting the {@link DateTime} object
     */
    public Single<DateTime> getUtcMinDateTimeAsync() {
            return getUtcMinDateTimeWithRestResponseAsync()
                .map(new Func1<RestResponse<Void, DateTime>, DateTime>() {
                    public DateTime call(RestResponse<Void, DateTime> restResponse) {
                        return restResponse.body();
                    }
                });
    }

}
