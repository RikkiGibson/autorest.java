/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.azurereport;

import com.microsoft.rest.v2.RestResponse;
import com.microsoft.rest.v2.ServiceCallback;
import com.microsoft.rest.v2.ServiceFuture;
import fixtures.azurereport.models.ErrorException;
import io.reactivex.Maybe;
import io.reactivex.Observable;
import io.reactivex.Single;
import java.io.IOException;
import java.util.Map;

/**
 * The interface for AutoRestReportServiceForAzure class.
 */
public interface AutoRestReportServiceForAzure {
    /**
     * Gets Gets or sets the preferred language for the response..
     *
     * @return the acceptLanguage value.
     */
    String acceptLanguage();

    /**
     * Sets Gets or sets the preferred language for the response..
     *
     * @param acceptLanguage the acceptLanguage value.
     * @return the service client itself
     */
    AutoRestReportServiceForAzure withAcceptLanguage(String acceptLanguage);

    /**
     * Gets Gets or sets the retry timeout in seconds for Long Running Operations. Default value is 30..
     *
     * @return the longRunningOperationRetryTimeout value.
     */
    int longRunningOperationRetryTimeout();

    /**
     * Sets Gets or sets the retry timeout in seconds for Long Running Operations. Default value is 30..
     *
     * @param longRunningOperationRetryTimeout the longRunningOperationRetryTimeout value.
     * @return the service client itself
     */
    AutoRestReportServiceForAzure withLongRunningOperationRetryTimeout(int longRunningOperationRetryTimeout);

    /**
     * Gets When set to true a unique x-ms-client-request-id value is generated and included in each request. Default is true..
     *
     * @return the generateClientRequestId value.
     */
    boolean generateClientRequestId();

    /**
     * Sets When set to true a unique x-ms-client-request-id value is generated and included in each request. Default is true..
     *
     * @param generateClientRequestId the generateClientRequestId value.
     * @return the service client itself
     */
    AutoRestReportServiceForAzure withGenerateClientRequestId(boolean generateClientRequestId);

    /**
     * Get test coverage report.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Map&lt;String, Integer&gt; object if successful.
     */
    Map<String, Integer> getReport();

    /**
     * Get test coverage report.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Map<String, Integer>> getReportAsync(final ServiceCallback<Map<String, Integer>> serviceCallback);

    /**
     * Get test coverage report.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Map&lt;String, Integer&gt; object
     */
    Maybe<Map<String, Integer>> getReportAsync();

    /**
     * Get test coverage report.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Map&lt;String, Integer&gt; object
     */
    Single<RestResponse<Void, Map<String, Integer>>> getReportWithRestResponseAsync();
    /**
     * Get test coverage report.
     *
     * @param qualifier If specified, qualifies the generated report further (e.g. '2.7' vs '3.5' in for Python). The only effect is, that generators that run all tests several times, can distinguish the generated reports.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Map&lt;String, Integer&gt; object if successful.
     */
    Map<String, Integer> getReport(String qualifier);

    /**
     * Get test coverage report.
     *
     * @param qualifier If specified, qualifies the generated report further (e.g. '2.7' vs '3.5' in for Python). The only effect is, that generators that run all tests several times, can distinguish the generated reports.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Map<String, Integer>> getReportAsync(String qualifier, final ServiceCallback<Map<String, Integer>> serviceCallback);

    /**
     * Get test coverage report.
     *
     * @param qualifier If specified, qualifies the generated report further (e.g. '2.7' vs '3.5' in for Python). The only effect is, that generators that run all tests several times, can distinguish the generated reports.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Map&lt;String, Integer&gt; object
     */
    Maybe<Map<String, Integer>> getReportAsync(String qualifier);

    /**
     * Get test coverage report.
     *
     * @param qualifier If specified, qualifies the generated report further (e.g. '2.7' vs '3.5' in for Python). The only effect is, that generators that run all tests several times, can distinguish the generated reports.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Map&lt;String, Integer&gt; object
     */
    Single<RestResponse<Void, Map<String, Integer>>> getReportWithRestResponseAsync(String qualifier);


}
