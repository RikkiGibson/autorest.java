/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.azureresource.implementation;

import com.microsoft.azure.v2.AzureEnvironment;
import com.microsoft.azure.v2.AzureProxy;
import com.microsoft.azure.v2.AzureServiceClient;
import com.microsoft.azure.v2.Resource;
import com.microsoft.rest.v2.RestResponse;
import com.microsoft.rest.v2.ServiceCallback;
import com.microsoft.rest.v2.ServiceFuture;
import com.microsoft.rest.v2.Validator;
import com.microsoft.rest.v2.annotations.BodyParam;
import com.microsoft.rest.v2.annotations.ExpectedResponses;
import com.microsoft.rest.v2.annotations.GET;
import com.microsoft.rest.v2.annotations.HeaderParam;
import com.microsoft.rest.v2.annotations.Host;
import com.microsoft.rest.v2.annotations.PUT;
import com.microsoft.rest.v2.annotations.UnexpectedResponseExceptionType;
import com.microsoft.rest.v2.credentials.ServiceClientCredentials;
import com.microsoft.rest.v2.http.HttpPipeline;
import fixtures.azureresource.AutoRestResourceFlatteningTestService;
import fixtures.azureresource.models.ErrorException;
import fixtures.azureresource.models.FlattenedProduct;
import fixtures.azureresource.models.ResourceCollection;
import io.reactivex.Completable;
import io.reactivex.Maybe;
import io.reactivex.Single;
import io.reactivex.annotations.NonNull;
import io.reactivex.functions.Function;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Initializes a new instance of the AutoRestResourceFlatteningTestService type.
 */
public final class AutoRestResourceFlatteningTestServiceImpl extends AzureServiceClient implements AutoRestResourceFlatteningTestService {
    /**
     * The proxy service used to perform REST calls.
     */
    private AutoRestResourceFlatteningTestServiceService service;

    /**
     * Gets or sets the preferred language for the response.
     */
    private String acceptLanguage;

    /**
     * Gets Gets or sets the preferred language for the response.
     *
     * @return the acceptLanguage value.
     */
    public String acceptLanguage() {
        return this.acceptLanguage;
    }

    /**
     * Sets Gets or sets the preferred language for the response.
     *
     * @param acceptLanguage the acceptLanguage value.
     * @return the service client itself.
     */
    public AutoRestResourceFlatteningTestServiceImpl withAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }

    /**
     * Gets or sets the retry timeout in seconds for Long Running Operations. Default value is 30.
     */
    private int longRunningOperationRetryTimeout;

    /**
     * Gets Gets or sets the retry timeout in seconds for Long Running Operations. Default value is 30.
     *
     * @return the longRunningOperationRetryTimeout value.
     */
    public int longRunningOperationRetryTimeout() {
        return this.longRunningOperationRetryTimeout;
    }

    /**
     * Sets Gets or sets the retry timeout in seconds for Long Running Operations. Default value is 30.
     *
     * @param longRunningOperationRetryTimeout the longRunningOperationRetryTimeout value.
     * @return the service client itself.
     */
    public AutoRestResourceFlatteningTestServiceImpl withLongRunningOperationRetryTimeout(int longRunningOperationRetryTimeout) {
        this.longRunningOperationRetryTimeout = longRunningOperationRetryTimeout;
        return this;
    }

    /**
     * When set to true a unique x-ms-client-request-id value is generated and included in each request. Default is true.
     */
    private boolean generateClientRequestId;

    /**
     * Gets When set to true a unique x-ms-client-request-id value is generated and included in each request. Default is true.
     *
     * @return the generateClientRequestId value.
     */
    public boolean generateClientRequestId() {
        return this.generateClientRequestId;
    }

    /**
     * Sets When set to true a unique x-ms-client-request-id value is generated and included in each request. Default is true.
     *
     * @param generateClientRequestId the generateClientRequestId value.
     * @return the service client itself.
     */
    public AutoRestResourceFlatteningTestServiceImpl withGenerateClientRequestId(boolean generateClientRequestId) {
        this.generateClientRequestId = generateClientRequestId;
        return this;
    }

    /**
     * Initializes an instance of AutoRestResourceFlatteningTestService client.
     *
     * @param credentials the management credentials for Azure.
     */
    public AutoRestResourceFlatteningTestServiceImpl(@NonNull ServiceClientCredentials credentials) {
        this(AzureProxy.createDefaultPipeline(AutoRestResourceFlatteningTestServiceImpl.class, credentials));
    }

    /**
     * Initializes an instance of AutoRestResourceFlatteningTestService client.
     *
     * @param credentials the management credentials for Azure.
     * @param azureEnvironment The environment that requests will target.
     */
    public AutoRestResourceFlatteningTestServiceImpl(@NonNull ServiceClientCredentials credentials, @NonNull AzureEnvironment azureEnvironment) {
        this(AzureProxy.createDefaultPipeline(AutoRestResourceFlatteningTestServiceImpl.class, credentials), azureEnvironment);
    }

    /**
     * Initializes an instance of AutoRestResourceFlatteningTestService client.
     *
     * @param httpPipeline The HTTP pipeline to send requests through.
     */
    public AutoRestResourceFlatteningTestServiceImpl(@NonNull HttpPipeline httpPipeline) {
        this(httpPipeline, null);
    }

    /**
     * Initializes an instance of AutoRestResourceFlatteningTestService client.
     *
     * @param httpPipeline The HTTP pipeline to send requests through.
     * @param azureEnvironment The environment that requests will target.
     */
    public AutoRestResourceFlatteningTestServiceImpl(@NonNull HttpPipeline httpPipeline, @NonNull AzureEnvironment azureEnvironment) {
        super(httpPipeline, azureEnvironment);
        this.acceptLanguage = "en-US";
        this.longRunningOperationRetryTimeout = 30;
        this.generateClientRequestId = true;
        this.service = AzureProxy.create(AutoRestResourceFlatteningTestServiceService.class, this);
    }

    /**
     * The interface defining all the services for
     * AutoRestResourceFlatteningTestService to be used by the proxy service to
     * perform REST calls.
     */
    @Host("http://localhost:3000")
    private interface AutoRestResourceFlatteningTestServiceService {
        @PUT("azure/resource-flatten/array")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Single<RestResponse<Void, Void>> putArray(@BodyParam("application/json; charset=utf-8") List<Resource> resourceArray, @HeaderParam("accept-language") String acceptLanguage);

        @GET("azure/resource-flatten/array")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Single<RestResponse<Void, List<FlattenedProduct>>> getArray(@HeaderParam("accept-language") String acceptLanguage);

        @PUT("azure/resource-flatten/dictionary")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Single<RestResponse<Void, Void>> putDictionary(@BodyParam("application/json; charset=utf-8") Map<String, FlattenedProduct> resourceDictionary, @HeaderParam("accept-language") String acceptLanguage);

        @GET("azure/resource-flatten/dictionary")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Single<RestResponse<Void, Map<String, FlattenedProduct>>> getDictionary(@HeaderParam("accept-language") String acceptLanguage);

        @PUT("azure/resource-flatten/resourcecollection")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Single<RestResponse<Void, Void>> putResourceCollection(@BodyParam("application/json; charset=utf-8") ResourceCollection resourceComplexObject, @HeaderParam("accept-language") String acceptLanguage);

        @GET("azure/resource-flatten/resourcecollection")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Single<RestResponse<Void, ResourceCollection>> getResourceCollection(@HeaderParam("accept-language") String acceptLanguage);
    }

    /**
     * Put External Resource as an Array.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    public void putArray() {
        putArrayAsync().blockingAwait();
    }

    /**
     * Put External Resource as an Array.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link ServiceFuture&lt;Void&gt;} object.
     */
    public ServiceFuture<Void> putArrayAsync(ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromBody(putArrayAsync(), serviceCallback);
    }

    /**
     * Put External Resource as an Array.
     *
     * @return the {@link Single&lt;RestResponse&lt;Void, Void&gt;&gt;} object if successful.
     */
    public Single<RestResponse<Void, Void>> putArrayWithRestResponseAsync() {
        final List<Resource> resourceArray = null;
        return service.putArray(resourceArray, this.acceptLanguage());
    }

    /**
     * Put External Resource as an Array.
     *
     * @return the {@link Completable} object if successful.
     */
    public Completable putArrayAsync() {
        return putArrayWithRestResponseAsync()
            .toCompletable();
    }

    /**
     * Put External Resource as an Array.
     *
     * @param resourceArray External Resource as an Array to put.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    public void putArray(List<Resource> resourceArray) {
        putArrayAsync(resourceArray).blockingAwait();
    }

    /**
     * Put External Resource as an Array.
     *
     * @param resourceArray External Resource as an Array to put.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link ServiceFuture&lt;Void&gt;} object.
     */
    public ServiceFuture<Void> putArrayAsync(List<Resource> resourceArray, ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromBody(putArrayAsync(resourceArray), serviceCallback);
    }

    /**
     * Put External Resource as an Array.
     *
     * @param resourceArray External Resource as an Array to put.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link Single&lt;RestResponse&lt;Void, Void&gt;&gt;} object if successful.
     */
    public Single<RestResponse<Void, Void>> putArrayWithRestResponseAsync(List<Resource> resourceArray) {
        Validator.validate(resourceArray);
        return service.putArray(resourceArray, this.acceptLanguage());
    }

    /**
     * Put External Resource as an Array.
     *
     * @param resourceArray External Resource as an Array to put.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link Completable} object if successful.
     */
    public Completable putArrayAsync(List<Resource> resourceArray) {
        return putArrayWithRestResponseAsync(resourceArray)
            .toCompletable();
    }

    /**
     * Get External Resource as an Array.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List&lt;FlattenedProduct&gt; object if successful.
     */
    public List<FlattenedProduct> getArray() {
        return getArrayAsync().blockingGet();
    }

    /**
     * Get External Resource as an Array.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link ServiceFuture&lt;List&lt;FlattenedProduct&gt;&gt;} object.
     */
    public ServiceFuture<List<FlattenedProduct>> getArrayAsync(ServiceCallback<List<FlattenedProduct>> serviceCallback) {
        return ServiceFuture.fromBody(getArrayAsync(), serviceCallback);
    }

    /**
     * Get External Resource as an Array.
     *
     * @return the {@link Single&lt;RestResponse&lt;Void, List&lt;FlattenedProduct&gt;&gt;&gt;} object if successful.
     */
    public Single<RestResponse<Void, List<FlattenedProduct>>> getArrayWithRestResponseAsync() {
        return service.getArray(this.acceptLanguage());
    }

    /**
     * Get External Resource as an Array.
     *
     * @return the {@link Maybe&lt;List&lt;FlattenedProduct&gt;&gt;} object if successful.
     */
    public Maybe<List<FlattenedProduct>> getArrayAsync() {
        return getArrayWithRestResponseAsync()
            .flatMapMaybe(new Function<RestResponse<Void, List<FlattenedProduct>>, Maybe<List<FlattenedProduct>>>() {
                public Maybe<List<FlattenedProduct>> apply(RestResponse<Void, List<FlattenedProduct>> restResponse) {
                    if (restResponse.body() == null) {
                        return Maybe.empty();
                    } else {
                        return Maybe.just(restResponse.body());
                    }
                }
            });
    }

    /**
     * Put External Resource as a Dictionary.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    public void putDictionary() {
        putDictionaryAsync().blockingAwait();
    }

    /**
     * Put External Resource as a Dictionary.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link ServiceFuture&lt;Void&gt;} object.
     */
    public ServiceFuture<Void> putDictionaryAsync(ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromBody(putDictionaryAsync(), serviceCallback);
    }

    /**
     * Put External Resource as a Dictionary.
     *
     * @return the {@link Single&lt;RestResponse&lt;Void, Void&gt;&gt;} object if successful.
     */
    public Single<RestResponse<Void, Void>> putDictionaryWithRestResponseAsync() {
        final Map<String, FlattenedProduct> resourceDictionary = null;
        return service.putDictionary(resourceDictionary, this.acceptLanguage());
    }

    /**
     * Put External Resource as a Dictionary.
     *
     * @return the {@link Completable} object if successful.
     */
    public Completable putDictionaryAsync() {
        return putDictionaryWithRestResponseAsync()
            .toCompletable();
    }

    /**
     * Put External Resource as a Dictionary.
     *
     * @param resourceDictionary External Resource as a Dictionary to put.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    public void putDictionary(Map<String, FlattenedProduct> resourceDictionary) {
        putDictionaryAsync(resourceDictionary).blockingAwait();
    }

    /**
     * Put External Resource as a Dictionary.
     *
     * @param resourceDictionary External Resource as a Dictionary to put.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link ServiceFuture&lt;Void&gt;} object.
     */
    public ServiceFuture<Void> putDictionaryAsync(Map<String, FlattenedProduct> resourceDictionary, ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromBody(putDictionaryAsync(resourceDictionary), serviceCallback);
    }

    /**
     * Put External Resource as a Dictionary.
     *
     * @param resourceDictionary External Resource as a Dictionary to put.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link Single&lt;RestResponse&lt;Void, Void&gt;&gt;} object if successful.
     */
    public Single<RestResponse<Void, Void>> putDictionaryWithRestResponseAsync(Map<String, FlattenedProduct> resourceDictionary) {
        Validator.validate(resourceDictionary);
        return service.putDictionary(resourceDictionary, this.acceptLanguage());
    }

    /**
     * Put External Resource as a Dictionary.
     *
     * @param resourceDictionary External Resource as a Dictionary to put.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link Completable} object if successful.
     */
    public Completable putDictionaryAsync(Map<String, FlattenedProduct> resourceDictionary) {
        return putDictionaryWithRestResponseAsync(resourceDictionary)
            .toCompletable();
    }

    /**
     * Get External Resource as a Dictionary.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Map&lt;String, FlattenedProduct&gt; object if successful.
     */
    public Map<String, FlattenedProduct> getDictionary() {
        return getDictionaryAsync().blockingGet();
    }

    /**
     * Get External Resource as a Dictionary.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link ServiceFuture&lt;Map&lt;String, FlattenedProduct&gt;&gt;} object.
     */
    public ServiceFuture<Map<String, FlattenedProduct>> getDictionaryAsync(ServiceCallback<Map<String, FlattenedProduct>> serviceCallback) {
        return ServiceFuture.fromBody(getDictionaryAsync(), serviceCallback);
    }

    /**
     * Get External Resource as a Dictionary.
     *
     * @return the {@link Single&lt;RestResponse&lt;Void, Map&lt;String, FlattenedProduct&gt;&gt;&gt;} object if successful.
     */
    public Single<RestResponse<Void, Map<String, FlattenedProduct>>> getDictionaryWithRestResponseAsync() {
        return service.getDictionary(this.acceptLanguage());
    }

    /**
     * Get External Resource as a Dictionary.
     *
     * @return the {@link Maybe&lt;Map&lt;String, FlattenedProduct&gt;&gt;} object if successful.
     */
    public Maybe<Map<String, FlattenedProduct>> getDictionaryAsync() {
        return getDictionaryWithRestResponseAsync()
            .flatMapMaybe(new Function<RestResponse<Void, Map<String, FlattenedProduct>>, Maybe<Map<String, FlattenedProduct>>>() {
                public Maybe<Map<String, FlattenedProduct>> apply(RestResponse<Void, Map<String, FlattenedProduct>> restResponse) {
                    if (restResponse.body() == null) {
                        return Maybe.empty();
                    } else {
                        return Maybe.just(restResponse.body());
                    }
                }
            });
    }

    /**
     * Put External Resource as a ResourceCollection.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    public void putResourceCollection() {
        putResourceCollectionAsync().blockingAwait();
    }

    /**
     * Put External Resource as a ResourceCollection.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link ServiceFuture&lt;Void&gt;} object.
     */
    public ServiceFuture<Void> putResourceCollectionAsync(ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromBody(putResourceCollectionAsync(), serviceCallback);
    }

    /**
     * Put External Resource as a ResourceCollection.
     *
     * @return the {@link Single&lt;RestResponse&lt;Void, Void&gt;&gt;} object if successful.
     */
    public Single<RestResponse<Void, Void>> putResourceCollectionWithRestResponseAsync() {
        final ResourceCollection resourceComplexObject = null;
        return service.putResourceCollection(resourceComplexObject, this.acceptLanguage());
    }

    /**
     * Put External Resource as a ResourceCollection.
     *
     * @return the {@link Completable} object if successful.
     */
    public Completable putResourceCollectionAsync() {
        return putResourceCollectionWithRestResponseAsync()
            .toCompletable();
    }

    /**
     * Put External Resource as a ResourceCollection.
     *
     * @param resourceComplexObject External Resource as a ResourceCollection to put.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    public void putResourceCollection(ResourceCollection resourceComplexObject) {
        putResourceCollectionAsync(resourceComplexObject).blockingAwait();
    }

    /**
     * Put External Resource as a ResourceCollection.
     *
     * @param resourceComplexObject External Resource as a ResourceCollection to put.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link ServiceFuture&lt;Void&gt;} object.
     */
    public ServiceFuture<Void> putResourceCollectionAsync(ResourceCollection resourceComplexObject, ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromBody(putResourceCollectionAsync(resourceComplexObject), serviceCallback);
    }

    /**
     * Put External Resource as a ResourceCollection.
     *
     * @param resourceComplexObject External Resource as a ResourceCollection to put.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link Single&lt;RestResponse&lt;Void, Void&gt;&gt;} object if successful.
     */
    public Single<RestResponse<Void, Void>> putResourceCollectionWithRestResponseAsync(ResourceCollection resourceComplexObject) {
        Validator.validate(resourceComplexObject);
        return service.putResourceCollection(resourceComplexObject, this.acceptLanguage());
    }

    /**
     * Put External Resource as a ResourceCollection.
     *
     * @param resourceComplexObject External Resource as a ResourceCollection to put.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link Completable} object if successful.
     */
    public Completable putResourceCollectionAsync(ResourceCollection resourceComplexObject) {
        return putResourceCollectionWithRestResponseAsync(resourceComplexObject)
            .toCompletable();
    }

    /**
     * Get External Resource as a ResourceCollection.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the ResourceCollection object if successful.
     */
    public ResourceCollection getResourceCollection() {
        return getResourceCollectionAsync().blockingGet();
    }

    /**
     * Get External Resource as a ResourceCollection.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link ServiceFuture&lt;ResourceCollection&gt;} object.
     */
    public ServiceFuture<ResourceCollection> getResourceCollectionAsync(ServiceCallback<ResourceCollection> serviceCallback) {
        return ServiceFuture.fromBody(getResourceCollectionAsync(), serviceCallback);
    }

    /**
     * Get External Resource as a ResourceCollection.
     *
     * @return the {@link Single&lt;RestResponse&lt;Void, ResourceCollection&gt;&gt;} object if successful.
     */
    public Single<RestResponse<Void, ResourceCollection>> getResourceCollectionWithRestResponseAsync() {
        return service.getResourceCollection(this.acceptLanguage());
    }

    /**
     * Get External Resource as a ResourceCollection.
     *
     * @return the {@link Maybe&lt;ResourceCollection&gt;} object if successful.
     */
    public Maybe<ResourceCollection> getResourceCollectionAsync() {
        return getResourceCollectionWithRestResponseAsync()
            .flatMapMaybe(new Function<RestResponse<Void, ResourceCollection>, Maybe<ResourceCollection>>() {
                public Maybe<ResourceCollection> apply(RestResponse<Void, ResourceCollection> restResponse) {
                    if (restResponse.body() == null) {
                        return Maybe.empty();
                    } else {
                        return Maybe.just(restResponse.body());
                    }
                }
            });
    }
}
