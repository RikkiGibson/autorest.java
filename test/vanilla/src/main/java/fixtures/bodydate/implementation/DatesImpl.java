/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.bodydate.implementation;

import com.microsoft.rest.RestProxy;
import com.microsoft.rest.RestResponse;
import fixtures.bodydate.Dates;
import com.google.common.reflect.TypeToken;
import com.microsoft.rest.annotations.BodyParam;
import com.microsoft.rest.annotations.ExpectedResponses;
import com.microsoft.rest.annotations.GET;
import com.microsoft.rest.annotations.Headers;
import com.microsoft.rest.annotations.Host;
import com.microsoft.rest.annotations.PUT;
import com.microsoft.rest.annotations.UnexpectedResponseExceptionType;
import com.microsoft.rest.http.HttpClient;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import fixtures.bodydate.models.ErrorException;
import java.io.IOException;
import org.joda.time.LocalDate;
import rx.functions.Func1;
import rx.Observable;
import rx.Single;

/**
 * An instance of this class provides access to all the operations defined
 * in Dates.
 */
public class DatesImpl implements Dates {
    /** The RestProxy service to perform REST calls. */
    private DatesService service;
    /** The service client containing this operation class. */
    private AutoRestDateTestServiceImpl client;

    /**
     * Initializes an instance of Dates.
     *
     * @param client the instance of the service client containing this operation class.
     */
    public DatesImpl(AutoRestDateTestServiceImpl client) {
        this.service = RestProxy.create(DatesService.class, client.restClient().baseURL(), client.httpClient(), client.serializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for Dates to be
     * used by RestProxy to perform REST calls.
    */
    @Host("https://localhost")
    interface DatesService {
        @Headers({ "x-ms-logging-context: fixtures.bodydate.Dates getNull" })
        @GET("date/null")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Single<RestResponse<Void, LocalDate>> getNull();

        @Headers({ "x-ms-logging-context: fixtures.bodydate.Dates getInvalidDate" })
        @GET("date/invaliddate")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Single<RestResponse<Void, LocalDate>> getInvalidDate();

        @Headers({ "x-ms-logging-context: fixtures.bodydate.Dates getOverflowDate" })
        @GET("date/overflowdate")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Single<RestResponse<Void, LocalDate>> getOverflowDate();

        @Headers({ "x-ms-logging-context: fixtures.bodydate.Dates getUnderflowDate" })
        @GET("date/underflowdate")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Single<RestResponse<Void, LocalDate>> getUnderflowDate();

        @Headers({ "x-ms-logging-context: fixtures.bodydate.Dates putMaxDate" })
        @PUT("date/max")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Single<RestResponse<Void, Void>> putMaxDate(@BodyParam("application/json; charset=utf-8") LocalDate dateBody);

        @Headers({ "x-ms-logging-context: fixtures.bodydate.Dates getMaxDate" })
        @GET("date/max")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Single<RestResponse<Void, LocalDate>> getMaxDate();

        @Headers({ "x-ms-logging-context: fixtures.bodydate.Dates putMinDate" })
        @PUT("date/min")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Single<RestResponse<Void, Void>> putMinDate(@BodyParam("application/json; charset=utf-8") LocalDate dateBody);

        @Headers({ "x-ms-logging-context: fixtures.bodydate.Dates getMinDate" })
        @GET("date/min")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Single<RestResponse<Void, LocalDate>> getMinDate();

    }

    /**
     * Get null date value.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the {@link LocalDate} object if successful.
     */
    public LocalDate getNull() {
        return getNullAsync().toBlocking().value();
    }

    /**
     * Get null date value.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<LocalDate> getNullAsync(ServiceCallback<LocalDate> serviceCallback) {
        return ServiceFuture.fromBody(getNullAsync(), serviceCallback);
    }

    /**
     * Get null date value.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return a {@link Single} emitting the RestResponse<Void, LocalDate> object
     */
    public Single<RestResponse<Void, LocalDate>> getNullWithRestResponseAsync() {
        return service.getNull();
    }

    /**
     * Get null date value.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return a {@link Single} emitting the {@link LocalDate} object
     */
    public Single<LocalDate> getNullAsync() {
            return getNullWithRestResponseAsync()
                .map(new Func1<RestResponse<Void, LocalDate>, LocalDate>() {
                    public LocalDate call(RestResponse<Void, LocalDate> restResponse) {
                        return restResponse.body();
                    }
                });
    }

    /**
     * Get invalid date value.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the {@link LocalDate} object if successful.
     */
    public LocalDate getInvalidDate() {
        return getInvalidDateAsync().toBlocking().value();
    }

    /**
     * Get invalid date value.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<LocalDate> getInvalidDateAsync(ServiceCallback<LocalDate> serviceCallback) {
        return ServiceFuture.fromBody(getInvalidDateAsync(), serviceCallback);
    }

    /**
     * Get invalid date value.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return a {@link Single} emitting the RestResponse<Void, LocalDate> object
     */
    public Single<RestResponse<Void, LocalDate>> getInvalidDateWithRestResponseAsync() {
        return service.getInvalidDate();
    }

    /**
     * Get invalid date value.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return a {@link Single} emitting the {@link LocalDate} object
     */
    public Single<LocalDate> getInvalidDateAsync() {
            return getInvalidDateWithRestResponseAsync()
                .map(new Func1<RestResponse<Void, LocalDate>, LocalDate>() {
                    public LocalDate call(RestResponse<Void, LocalDate> restResponse) {
                        return restResponse.body();
                    }
                });
    }

    /**
     * Get overflow date value.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the {@link LocalDate} object if successful.
     */
    public LocalDate getOverflowDate() {
        return getOverflowDateAsync().toBlocking().value();
    }

    /**
     * Get overflow date value.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<LocalDate> getOverflowDateAsync(ServiceCallback<LocalDate> serviceCallback) {
        return ServiceFuture.fromBody(getOverflowDateAsync(), serviceCallback);
    }

    /**
     * Get overflow date value.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return a {@link Single} emitting the RestResponse<Void, LocalDate> object
     */
    public Single<RestResponse<Void, LocalDate>> getOverflowDateWithRestResponseAsync() {
        return service.getOverflowDate();
    }

    /**
     * Get overflow date value.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return a {@link Single} emitting the {@link LocalDate} object
     */
    public Single<LocalDate> getOverflowDateAsync() {
            return getOverflowDateWithRestResponseAsync()
                .map(new Func1<RestResponse<Void, LocalDate>, LocalDate>() {
                    public LocalDate call(RestResponse<Void, LocalDate> restResponse) {
                        return restResponse.body();
                    }
                });
    }

    /**
     * Get underflow date value.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the {@link LocalDate} object if successful.
     */
    public LocalDate getUnderflowDate() {
        return getUnderflowDateAsync().toBlocking().value();
    }

    /**
     * Get underflow date value.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<LocalDate> getUnderflowDateAsync(ServiceCallback<LocalDate> serviceCallback) {
        return ServiceFuture.fromBody(getUnderflowDateAsync(), serviceCallback);
    }

    /**
     * Get underflow date value.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return a {@link Single} emitting the RestResponse<Void, LocalDate> object
     */
    public Single<RestResponse<Void, LocalDate>> getUnderflowDateWithRestResponseAsync() {
        return service.getUnderflowDate();
    }

    /**
     * Get underflow date value.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return a {@link Single} emitting the {@link LocalDate} object
     */
    public Single<LocalDate> getUnderflowDateAsync() {
            return getUnderflowDateWithRestResponseAsync()
                .map(new Func1<RestResponse<Void, LocalDate>, LocalDate>() {
                    public LocalDate call(RestResponse<Void, LocalDate> restResponse) {
                        return restResponse.body();
                    }
                });
    }

    /**
     * Put max date value 9999-12-31.
     *
     * @param dateBody the LocalDate value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the {@link void} object if successful.
     */
    public void putMaxDate(LocalDate dateBody) {
        putMaxDateAsync(dateBody).toBlocking().value();
    }

    /**
     * Put max date value 9999-12-31.
     *
     * @param dateBody the LocalDate value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> putMaxDateAsync(LocalDate dateBody, ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromBody(putMaxDateAsync(dateBody), serviceCallback);
    }

    /**
     * Put max date value 9999-12-31.
     *
     * @param dateBody the LocalDate value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return a {@link Single} emitting the RestResponse<Void, Void> object
     */
    public Single<RestResponse<Void, Void>> putMaxDateWithRestResponseAsync(LocalDate dateBody) {
        if (dateBody == null) {
            throw new IllegalArgumentException("Parameter dateBody is required and cannot be null.");
        }
        return service.putMaxDate(dateBody);
    }

    /**
     * Put max date value 9999-12-31.
     *
     * @param dateBody the LocalDate value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return a {@link Single} emitting the {@link Void} object
     */
    public Single<Void> putMaxDateAsync(LocalDate dateBody) {
            return putMaxDateWithRestResponseAsync(dateBody)
                .map(new Func1<RestResponse<Void, Void>, Void>() {
                    public Void call(RestResponse<Void, Void> restResponse) {
                        return restResponse.body();
                    }
                });
    }

    /**
     * Get max date value 9999-12-31.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the {@link LocalDate} object if successful.
     */
    public LocalDate getMaxDate() {
        return getMaxDateAsync().toBlocking().value();
    }

    /**
     * Get max date value 9999-12-31.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<LocalDate> getMaxDateAsync(ServiceCallback<LocalDate> serviceCallback) {
        return ServiceFuture.fromBody(getMaxDateAsync(), serviceCallback);
    }

    /**
     * Get max date value 9999-12-31.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return a {@link Single} emitting the RestResponse<Void, LocalDate> object
     */
    public Single<RestResponse<Void, LocalDate>> getMaxDateWithRestResponseAsync() {
        return service.getMaxDate();
    }

    /**
     * Get max date value 9999-12-31.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return a {@link Single} emitting the {@link LocalDate} object
     */
    public Single<LocalDate> getMaxDateAsync() {
            return getMaxDateWithRestResponseAsync()
                .map(new Func1<RestResponse<Void, LocalDate>, LocalDate>() {
                    public LocalDate call(RestResponse<Void, LocalDate> restResponse) {
                        return restResponse.body();
                    }
                });
    }

    /**
     * Put min date value 0000-01-01.
     *
     * @param dateBody the LocalDate value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the {@link void} object if successful.
     */
    public void putMinDate(LocalDate dateBody) {
        putMinDateAsync(dateBody).toBlocking().value();
    }

    /**
     * Put min date value 0000-01-01.
     *
     * @param dateBody the LocalDate value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> putMinDateAsync(LocalDate dateBody, ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromBody(putMinDateAsync(dateBody), serviceCallback);
    }

    /**
     * Put min date value 0000-01-01.
     *
     * @param dateBody the LocalDate value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return a {@link Single} emitting the RestResponse<Void, Void> object
     */
    public Single<RestResponse<Void, Void>> putMinDateWithRestResponseAsync(LocalDate dateBody) {
        if (dateBody == null) {
            throw new IllegalArgumentException("Parameter dateBody is required and cannot be null.");
        }
        return service.putMinDate(dateBody);
    }

    /**
     * Put min date value 0000-01-01.
     *
     * @param dateBody the LocalDate value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return a {@link Single} emitting the {@link Void} object
     */
    public Single<Void> putMinDateAsync(LocalDate dateBody) {
            return putMinDateWithRestResponseAsync(dateBody)
                .map(new Func1<RestResponse<Void, Void>, Void>() {
                    public Void call(RestResponse<Void, Void> restResponse) {
                        return restResponse.body();
                    }
                });
    }

    /**
     * Get min date value 0000-01-01.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the {@link LocalDate} object if successful.
     */
    public LocalDate getMinDate() {
        return getMinDateAsync().toBlocking().value();
    }

    /**
     * Get min date value 0000-01-01.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<LocalDate> getMinDateAsync(ServiceCallback<LocalDate> serviceCallback) {
        return ServiceFuture.fromBody(getMinDateAsync(), serviceCallback);
    }

    /**
     * Get min date value 0000-01-01.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return a {@link Single} emitting the RestResponse<Void, LocalDate> object
     */
    public Single<RestResponse<Void, LocalDate>> getMinDateWithRestResponseAsync() {
        return service.getMinDate();
    }

    /**
     * Get min date value 0000-01-01.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return a {@link Single} emitting the {@link LocalDate} object
     */
    public Single<LocalDate> getMinDateAsync() {
            return getMinDateWithRestResponseAsync()
                .map(new Func1<RestResponse<Void, LocalDate>, LocalDate>() {
                    public LocalDate call(RestResponse<Void, LocalDate> restResponse) {
                        return restResponse.body();
                    }
                });
    }

}
