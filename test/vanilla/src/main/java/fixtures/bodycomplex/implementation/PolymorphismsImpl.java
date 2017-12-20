/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.bodycomplex.implementation;

import com.google.common.reflect.TypeToken;
import com.microsoft.rest.v2.RestProxy;
import com.microsoft.rest.v2.RestResponse;
import com.microsoft.rest.v2.ServiceCallback;
import com.microsoft.rest.v2.ServiceFuture;
import com.microsoft.rest.v2.Validator;
import com.microsoft.rest.v2.annotations.BodyParam;
import com.microsoft.rest.v2.annotations.ExpectedResponses;
import com.microsoft.rest.v2.annotations.GET;
import com.microsoft.rest.v2.annotations.Headers;
import com.microsoft.rest.v2.annotations.Host;
import com.microsoft.rest.v2.annotations.PUT;
import com.microsoft.rest.v2.annotations.UnexpectedResponseExceptionType;
import com.microsoft.rest.v2.http.HttpClient;
import fixtures.bodycomplex.Polymorphisms;
import fixtures.bodycomplex.models.ErrorException;
import fixtures.bodycomplex.models.Fish;
import fixtures.bodycomplex.models.Salmon;
import io.reactivex.Completable;
import io.reactivex.Maybe;
import io.reactivex.Observable;
import io.reactivex.Single;
import io.reactivex.functions.Function;
import java.io.IOException;

/**
 * An instance of this class provides access to all the operations defined in
 * Polymorphisms.
 */
public class PolymorphismsImpl implements Polymorphisms {
    /**
     * The RestProxy service to perform REST calls.
     */
    private PolymorphismsService service;

    /**
     * The service client containing this operation class.
     */
    private AutoRestComplexTestServiceImpl client;

    /**
     * Initializes an instance of Polymorphisms.
     *
     * @param client the instance of the service client containing this operation class.
     */
    public PolymorphismsImpl(AutoRestComplexTestServiceImpl client) {
        this.service = RestProxy.create(PolymorphismsService.class, client.httpPipeline(), client.serializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for Polymorphisms to be used by
     * RestProxy to perform REST calls.
     */
    @Host("http://localhost:3000")
    interface PolymorphismsService {
        @Headers({ "x-ms-logging-context: fixtures.bodycomplex.Polymorphisms getValid" })
        @GET("complex/polymorphism/valid")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Single<RestResponse<Void, Fish>> getValid();

        @Headers({ "x-ms-logging-context: fixtures.bodycomplex.Polymorphisms putValid" })
        @PUT("complex/polymorphism/valid")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Single<RestResponse<Void, Void>> putValid(@BodyParam("application/json; charset=utf-8") Fish complexBody);

        @Headers({ "x-ms-logging-context: fixtures.bodycomplex.Polymorphisms getComplicated" })
        @GET("complex/polymorphism/complicated")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Single<RestResponse<Void, Salmon>> getComplicated();

        @Headers({ "x-ms-logging-context: fixtures.bodycomplex.Polymorphisms putComplicated" })
        @PUT("complex/polymorphism/complicated")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Single<RestResponse<Void, Void>> putComplicated(@BodyParam("application/json; charset=utf-8") Salmon complexBody);

        @Headers({ "x-ms-logging-context: fixtures.bodycomplex.Polymorphisms putValidMissingRequired" })
        @PUT("complex/polymorphism/missingrequired/invalid")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Single<RestResponse<Void, Void>> putValidMissingRequired(@BodyParam("application/json; charset=utf-8") Fish complexBody);

    }

    /**
     * Get complex types that are polymorphic.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Fish object if successful.
     */
    public Fish getValid() {
        return getValidAsync().blockingGet();
    }

    /**
     * Get complex types that are polymorphic.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Fish> getValidAsync(ServiceCallback<Fish> serviceCallback) {
        return ServiceFuture.fromBody(getValidAsync(), serviceCallback);
    }

    /**
     * Get complex types that are polymorphic.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return a {@link Single} emitting the RestResponse<Void, Fish> object
     */
    public Single<RestResponse<Void, Fish>> getValidWithRestResponseAsync() {
        return service.getValid();
    }

    /**
     * Get complex types that are polymorphic.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return a {@link Single} emitting the RestResponse<Void, Fish> object
     */
    public Maybe<Fish> getValidAsync() {
        return getValidWithRestResponseAsync()
            .flatMapMaybe(new Function<RestResponse<Void, Fish>, Maybe<Fish>>() {
                public Maybe<Fish> apply(RestResponse<Void, Fish> restResponse) {
                    if (restResponse.body() == null) {
                        return Maybe.empty();
                    } else {
                        return Maybe.just(restResponse.body());
                    }
                }
            });
    }

    /**
     * Put complex types that are polymorphic.
     *
     * @param complexBody Please put a salmon that looks like this:
     * {
     *         'fishtype':'Salmon',
     *         'location':'alaska',
     *         'iswild':true,
     *         'species':'king',
     *         'length':1.0,
     *         'siblings':[
     *           {
     *             'fishtype':'Shark',
     *             'age':6,
     *             'birthday': '2012-01-05T01:00:00Z',
     *             'length':20.0,
     *             'species':'predator',
     *           },
     *           {
     *             'fishtype':'Sawshark',
     *             'age':105,
     *             'birthday': '1900-01-05T01:00:00Z',
     *             'length':10.0,
     *             'picture': new Buffer([255, 255, 255, 255, 254]).toString('base64'),
     *             'species':'dangerous',
     *           },
     *           {
     *             'fishtype': 'goblin',
     *             'age': 1,
     *             'birthday': '2015-08-08T00:00:00Z',
     *             'length': 30.0,
     *             'species': 'scary',
     *             'jawsize': 5
     *           }
     *         ]
     *       };
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the void object if successful.
     */
    public void putValid(Fish complexBody) {
        putValidAsync(complexBody).blockingAwait();
    }

    /**
     * Put complex types that are polymorphic.
     *
     * @param complexBody Please put a salmon that looks like this:
     * {
     *         'fishtype':'Salmon',
     *         'location':'alaska',
     *         'iswild':true,
     *         'species':'king',
     *         'length':1.0,
     *         'siblings':[
     *           {
     *             'fishtype':'Shark',
     *             'age':6,
     *             'birthday': '2012-01-05T01:00:00Z',
     *             'length':20.0,
     *             'species':'predator',
     *           },
     *           {
     *             'fishtype':'Sawshark',
     *             'age':105,
     *             'birthday': '1900-01-05T01:00:00Z',
     *             'length':10.0,
     *             'picture': new Buffer([255, 255, 255, 255, 254]).toString('base64'),
     *             'species':'dangerous',
     *           },
     *           {
     *             'fishtype': 'goblin',
     *             'age': 1,
     *             'birthday': '2015-08-08T00:00:00Z',
     *             'length': 30.0,
     *             'species': 'scary',
     *             'jawsize': 5
     *           }
     *         ]
     *       };
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> putValidAsync(Fish complexBody, ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromBody(putValidAsync(complexBody), serviceCallback);
    }

    /**
     * Put complex types that are polymorphic.
     *
     * @param complexBody Please put a salmon that looks like this:
     * {
     *         'fishtype':'Salmon',
     *         'location':'alaska',
     *         'iswild':true,
     *         'species':'king',
     *         'length':1.0,
     *         'siblings':[
     *           {
     *             'fishtype':'Shark',
     *             'age':6,
     *             'birthday': '2012-01-05T01:00:00Z',
     *             'length':20.0,
     *             'species':'predator',
     *           },
     *           {
     *             'fishtype':'Sawshark',
     *             'age':105,
     *             'birthday': '1900-01-05T01:00:00Z',
     *             'length':10.0,
     *             'picture': new Buffer([255, 255, 255, 255, 254]).toString('base64'),
     *             'species':'dangerous',
     *           },
     *           {
     *             'fishtype': 'goblin',
     *             'age': 1,
     *             'birthday': '2015-08-08T00:00:00Z',
     *             'length': 30.0,
     *             'species': 'scary',
     *             'jawsize': 5
     *           }
     *         ]
     *       };
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return a {@link Single} emitting the RestResponse<Void, Void> object
     */
    public Single<RestResponse<Void, Void>> putValidWithRestResponseAsync(Fish complexBody) {
        if (complexBody == null) {
            throw new IllegalArgumentException("Parameter complexBody is required and cannot be null.");
        }
        Validator.validate(complexBody);
        return service.putValid(complexBody);
    }

    /**
     * Put complex types that are polymorphic.
     *
     * @param complexBody Please put a salmon that looks like this:
     * {
     *         'fishtype':'Salmon',
     *         'location':'alaska',
     *         'iswild':true,
     *         'species':'king',
     *         'length':1.0,
     *         'siblings':[
     *           {
     *             'fishtype':'Shark',
     *             'age':6,
     *             'birthday': '2012-01-05T01:00:00Z',
     *             'length':20.0,
     *             'species':'predator',
     *           },
     *           {
     *             'fishtype':'Sawshark',
     *             'age':105,
     *             'birthday': '1900-01-05T01:00:00Z',
     *             'length':10.0,
     *             'picture': new Buffer([255, 255, 255, 255, 254]).toString('base64'),
     *             'species':'dangerous',
     *           },
     *           {
     *             'fishtype': 'goblin',
     *             'age': 1,
     *             'birthday': '2015-08-08T00:00:00Z',
     *             'length': 30.0,
     *             'species': 'scary',
     *             'jawsize': 5
     *           }
     *         ]
     *       };
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return a {@link Single} emitting the RestResponse<Void, Void> object
     */
    public Completable putValidAsync(Fish complexBody) {
        return putValidWithRestResponseAsync(complexBody)
            .toCompletable();
    }

    /**
     * Get complex types that are polymorphic, but not at the root of the hierarchy; also have additional properties.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Salmon object if successful.
     */
    public Salmon getComplicated() {
        return getComplicatedAsync().blockingGet();
    }

    /**
     * Get complex types that are polymorphic, but not at the root of the hierarchy; also have additional properties.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Salmon> getComplicatedAsync(ServiceCallback<Salmon> serviceCallback) {
        return ServiceFuture.fromBody(getComplicatedAsync(), serviceCallback);
    }

    /**
     * Get complex types that are polymorphic, but not at the root of the hierarchy; also have additional properties.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return a {@link Single} emitting the RestResponse<Void, Salmon> object
     */
    public Single<RestResponse<Void, Salmon>> getComplicatedWithRestResponseAsync() {
        return service.getComplicated();
    }

    /**
     * Get complex types that are polymorphic, but not at the root of the hierarchy; also have additional properties.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return a {@link Single} emitting the RestResponse<Void, Salmon> object
     */
    public Maybe<Salmon> getComplicatedAsync() {
        return getComplicatedWithRestResponseAsync()
            .flatMapMaybe(new Function<RestResponse<Void, Salmon>, Maybe<Salmon>>() {
                public Maybe<Salmon> apply(RestResponse<Void, Salmon> restResponse) {
                    if (restResponse.body() == null) {
                        return Maybe.empty();
                    } else {
                        return Maybe.just(restResponse.body());
                    }
                }
            });
    }

    /**
     * Put complex types that are polymorphic, but not at the root of the hierarchy; also have additional properties.
     *
     * @param complexBody the Salmon value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the void object if successful.
     */
    public void putComplicated(Salmon complexBody) {
        putComplicatedAsync(complexBody).blockingAwait();
    }

    /**
     * Put complex types that are polymorphic, but not at the root of the hierarchy; also have additional properties.
     *
     * @param complexBody the Salmon value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> putComplicatedAsync(Salmon complexBody, ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromBody(putComplicatedAsync(complexBody), serviceCallback);
    }

    /**
     * Put complex types that are polymorphic, but not at the root of the hierarchy; also have additional properties.
     *
     * @param complexBody the Salmon value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return a {@link Single} emitting the RestResponse<Void, Void> object
     */
    public Single<RestResponse<Void, Void>> putComplicatedWithRestResponseAsync(Salmon complexBody) {
        if (complexBody == null) {
            throw new IllegalArgumentException("Parameter complexBody is required and cannot be null.");
        }
        Validator.validate(complexBody);
        return service.putComplicated(complexBody);
    }

    /**
     * Put complex types that are polymorphic, but not at the root of the hierarchy; also have additional properties.
     *
     * @param complexBody the Salmon value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return a {@link Single} emitting the RestResponse<Void, Void> object
     */
    public Completable putComplicatedAsync(Salmon complexBody) {
        return putComplicatedWithRestResponseAsync(complexBody)
            .toCompletable();
    }

    /**
     * Put complex types that are polymorphic, attempting to omit required 'birthday' field - the request should not be allowed from the client.
     *
     * @param complexBody Please attempt put a sawshark that looks like this, the client should not allow this data to be sent:
     * {
     *     "fishtype": "sawshark",
     *     "species": "snaggle toothed",
     *     "length": 18.5,
     *     "age": 2,
     *     "birthday": "2013-06-01T01:00:00Z",
     *     "location": "alaska",
     *     "picture": base64(FF FF FF FF FE),
     *     "siblings": [
     *         {
     *             "fishtype": "shark",
     *             "species": "predator",
     *             "birthday": "2012-01-05T01:00:00Z",
     *             "length": 20,
     *             "age": 6
     *         },
     *         {
     *             "fishtype": "sawshark",
     *             "species": "dangerous",
     *             "picture": base64(FF FF FF FF FE),
     *             "length": 10,
     *             "age": 105
     *         }
     *     ]
     * }
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the void object if successful.
     */
    public void putValidMissingRequired(Fish complexBody) {
        putValidMissingRequiredAsync(complexBody).blockingAwait();
    }

    /**
     * Put complex types that are polymorphic, attempting to omit required 'birthday' field - the request should not be allowed from the client.
     *
     * @param complexBody Please attempt put a sawshark that looks like this, the client should not allow this data to be sent:
     * {
     *     "fishtype": "sawshark",
     *     "species": "snaggle toothed",
     *     "length": 18.5,
     *     "age": 2,
     *     "birthday": "2013-06-01T01:00:00Z",
     *     "location": "alaska",
     *     "picture": base64(FF FF FF FF FE),
     *     "siblings": [
     *         {
     *             "fishtype": "shark",
     *             "species": "predator",
     *             "birthday": "2012-01-05T01:00:00Z",
     *             "length": 20,
     *             "age": 6
     *         },
     *         {
     *             "fishtype": "sawshark",
     *             "species": "dangerous",
     *             "picture": base64(FF FF FF FF FE),
     *             "length": 10,
     *             "age": 105
     *         }
     *     ]
     * }
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> putValidMissingRequiredAsync(Fish complexBody, ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromBody(putValidMissingRequiredAsync(complexBody), serviceCallback);
    }

    /**
     * Put complex types that are polymorphic, attempting to omit required 'birthday' field - the request should not be allowed from the client.
     *
     * @param complexBody Please attempt put a sawshark that looks like this, the client should not allow this data to be sent:
     * {
     *     "fishtype": "sawshark",
     *     "species": "snaggle toothed",
     *     "length": 18.5,
     *     "age": 2,
     *     "birthday": "2013-06-01T01:00:00Z",
     *     "location": "alaska",
     *     "picture": base64(FF FF FF FF FE),
     *     "siblings": [
     *         {
     *             "fishtype": "shark",
     *             "species": "predator",
     *             "birthday": "2012-01-05T01:00:00Z",
     *             "length": 20,
     *             "age": 6
     *         },
     *         {
     *             "fishtype": "sawshark",
     *             "species": "dangerous",
     *             "picture": base64(FF FF FF FF FE),
     *             "length": 10,
     *             "age": 105
     *         }
     *     ]
     * }
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return a {@link Single} emitting the RestResponse<Void, Void> object
     */
    public Single<RestResponse<Void, Void>> putValidMissingRequiredWithRestResponseAsync(Fish complexBody) {
        if (complexBody == null) {
            throw new IllegalArgumentException("Parameter complexBody is required and cannot be null.");
        }
        Validator.validate(complexBody);
        return service.putValidMissingRequired(complexBody);
    }

    /**
     * Put complex types that are polymorphic, attempting to omit required 'birthday' field - the request should not be allowed from the client.
     *
     * @param complexBody Please attempt put a sawshark that looks like this, the client should not allow this data to be sent:
     * {
     *     "fishtype": "sawshark",
     *     "species": "snaggle toothed",
     *     "length": 18.5,
     *     "age": 2,
     *     "birthday": "2013-06-01T01:00:00Z",
     *     "location": "alaska",
     *     "picture": base64(FF FF FF FF FE),
     *     "siblings": [
     *         {
     *             "fishtype": "shark",
     *             "species": "predator",
     *             "birthday": "2012-01-05T01:00:00Z",
     *             "length": 20,
     *             "age": 6
     *         },
     *         {
     *             "fishtype": "sawshark",
     *             "species": "dangerous",
     *             "picture": base64(FF FF FF FF FE),
     *             "length": 10,
     *             "age": 105
     *         }
     *     ]
     * }
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return a {@link Single} emitting the RestResponse<Void, Void> object
     */
    public Completable putValidMissingRequiredAsync(Fish complexBody) {
        return putValidMissingRequiredWithRestResponseAsync(complexBody)
            .toCompletable();
    }

}
