/*
 * 扩展接入
 * 接入jugugu区块链全包的全部接口，访问IP需要连续管理员，添加业务服务器IP
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.api;

import org.openapitools.client.ApiCallback;
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.Pair;
import org.openapitools.client.ProgressRequestBody;
import org.openapitools.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import org.openapitools.client.model.InlineObject;
import org.openapitools.client.model.InlineObject1;
import org.openapitools.client.model.InlineObject2;
import org.openapitools.client.model.InlineObject3;
import org.openapitools.client.model.InlineObject4;
import org.openapitools.client.model.InlineResponse200;
import org.openapitools.client.model.InlineResponse2001;
import org.openapitools.client.model.InlineResponse2002;
import org.openapitools.client.model.InlineResponse2003;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DefaultApi {
    private ApiClient localVarApiClient;

    public DefaultApi() {
        this(Configuration.getDefaultApiClient());
    }

    public DefaultApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for friendLoginPost
     * @param inlineObject4  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 成功 </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call friendLoginPostCall(InlineObject4 inlineObject4, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = inlineObject4;

        // create path and map variables
        String localVarPath = "/FriendLogin";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call friendLoginPostValidateBeforeCall(InlineObject4 inlineObject4, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = friendLoginPostCall(inlineObject4, _callback);
        return localVarCall;

    }

    /**
     * 4.Cookie登录
     * Cookie无感登录jugugu获取用户信息。使用CookieToken和手机号登录菊咕咕获取信息，安全考虑该方法不会获得操作等级高的token。cookietoken只有有限的操作权限。
     * @param inlineObject4  (optional)
     * @return InlineResponse2002
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 成功 </td><td>  -  </td></tr>
     </table>
     */
    public InlineResponse2002 friendLoginPost(InlineObject4 inlineObject4) throws ApiException {
        ApiResponse<InlineResponse2002> localVarResp = friendLoginPostWithHttpInfo(inlineObject4);
        return localVarResp.getData();
    }

    /**
     * 4.Cookie登录
     * Cookie无感登录jugugu获取用户信息。使用CookieToken和手机号登录菊咕咕获取信息，安全考虑该方法不会获得操作等级高的token。cookietoken只有有限的操作权限。
     * @param inlineObject4  (optional)
     * @return ApiResponse&lt;InlineResponse2002&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 成功 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<InlineResponse2002> friendLoginPostWithHttpInfo(InlineObject4 inlineObject4) throws ApiException {
        okhttp3.Call localVarCall = friendLoginPostValidateBeforeCall(inlineObject4, null);
        Type localVarReturnType = new TypeToken<InlineResponse2002>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * 4.Cookie登录 (asynchronously)
     * Cookie无感登录jugugu获取用户信息。使用CookieToken和手机号登录菊咕咕获取信息，安全考虑该方法不会获得操作等级高的token。cookietoken只有有限的操作权限。
     * @param inlineObject4  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 成功 </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call friendLoginPostAsync(InlineObject4 inlineObject4, final ApiCallback<InlineResponse2002> _callback) throws ApiException {

        okhttp3.Call localVarCall = friendLoginPostValidateBeforeCall(inlineObject4, _callback);
        Type localVarReturnType = new TypeToken<InlineResponse2002>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for juguguGetPhoneCodePost
     * @param inlineObject2  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 成功 </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call juguguGetPhoneCodePostCall(InlineObject2 inlineObject2, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = inlineObject2;

        // create path and map variables
        String localVarPath = "/Jugugu_GetPhoneCode";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call juguguGetPhoneCodePostValidateBeforeCall(InlineObject2 inlineObject2, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = juguguGetPhoneCodePostCall(inlineObject2, _callback);
        return localVarCall;

    }

    /**
     * 2.获取登录短信验证码
     * 获取登录短信验证码，验证码重复发送周期为60秒。验证码有效时间为3分钟
     * @param inlineObject2  (optional)
     * @return InlineResponse2002
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 成功 </td><td>  -  </td></tr>
     </table>
     */
    public InlineResponse2002 juguguGetPhoneCodePost(InlineObject2 inlineObject2) throws ApiException {
        ApiResponse<InlineResponse2002> localVarResp = juguguGetPhoneCodePostWithHttpInfo(inlineObject2);
        return localVarResp.getData();
    }

    /**
     * 2.获取登录短信验证码
     * 获取登录短信验证码，验证码重复发送周期为60秒。验证码有效时间为3分钟
     * @param inlineObject2  (optional)
     * @return ApiResponse&lt;InlineResponse2002&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 成功 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<InlineResponse2002> juguguGetPhoneCodePostWithHttpInfo(InlineObject2 inlineObject2) throws ApiException {
        okhttp3.Call localVarCall = juguguGetPhoneCodePostValidateBeforeCall(inlineObject2, null);
        Type localVarReturnType = new TypeToken<InlineResponse2002>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * 2.获取登录短信验证码 (asynchronously)
     * 获取登录短信验证码，验证码重复发送周期为60秒。验证码有效时间为3分钟
     * @param inlineObject2  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 成功 </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call juguguGetPhoneCodePostAsync(InlineObject2 inlineObject2, final ApiCallback<InlineResponse2002> _callback) throws ApiException {

        okhttp3.Call localVarCall = juguguGetPhoneCodePostValidateBeforeCall(inlineObject2, _callback);
        Type localVarReturnType = new TypeToken<InlineResponse2002>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for jugugugGetReleaseNFT1155PNGCodePost
     * @param inlineObject3  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 成功 </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call jugugugGetReleaseNFT1155PNGCodePostCall(InlineObject3 inlineObject3, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = inlineObject3;

        // create path and map variables
        String localVarPath = "/Jugugug_GetReleaseNFT1155_PNGCode";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call jugugugGetReleaseNFT1155PNGCodePostValidateBeforeCall(InlineObject3 inlineObject3, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = jugugugGetReleaseNFT1155PNGCodePostCall(inlineObject3, _callback);
        return localVarCall;

    }

    /**
     * 1.获得验证码图片
     * 获取验证码图片，用于防止机器人。
     * @param inlineObject3  (optional)
     * @return InlineResponse2003
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 成功 </td><td>  -  </td></tr>
     </table>
     */
    public InlineResponse2003 jugugugGetReleaseNFT1155PNGCodePost(InlineObject3 inlineObject3) throws ApiException {
        ApiResponse<InlineResponse2003> localVarResp = jugugugGetReleaseNFT1155PNGCodePostWithHttpInfo(inlineObject3);
        return localVarResp.getData();
    }

    /**
     * 1.获得验证码图片
     * 获取验证码图片，用于防止机器人。
     * @param inlineObject3  (optional)
     * @return ApiResponse&lt;InlineResponse2003&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 成功 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<InlineResponse2003> jugugugGetReleaseNFT1155PNGCodePostWithHttpInfo(InlineObject3 inlineObject3) throws ApiException {
        okhttp3.Call localVarCall = jugugugGetReleaseNFT1155PNGCodePostValidateBeforeCall(inlineObject3, null);
        Type localVarReturnType = new TypeToken<InlineResponse2003>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * 1.获得验证码图片 (asynchronously)
     * 获取验证码图片，用于防止机器人。
     * @param inlineObject3  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 成功 </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call jugugugGetReleaseNFT1155PNGCodePostAsync(InlineObject3 inlineObject3, final ApiCallback<InlineResponse2003> _callback) throws ApiException {

        okhttp3.Call localVarCall = jugugugGetReleaseNFT1155PNGCodePostValidateBeforeCall(inlineObject3, _callback);
        Type localVarReturnType = new TypeToken<InlineResponse2003>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for transferNFTPost
     * @param inlineObject1  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 成功 </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call transferNFTPostCall(InlineObject1 inlineObject1, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = inlineObject1;

        // create path and map variables
        String localVarPath = "/TransferNFT";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call transferNFTPostValidateBeforeCall(InlineObject1 inlineObject1, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = transferNFTPostCall(inlineObject1, _callback);
        return localVarCall;

    }

    /**
     * 转移NFT
     * 转移指定ID的NFT，指定数量Amount，至指定用户区块链地址
     * @param inlineObject1  (optional)
     * @return InlineResponse2001
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 成功 </td><td>  -  </td></tr>
     </table>
     */
    public InlineResponse2001 transferNFTPost(InlineObject1 inlineObject1) throws ApiException {
        ApiResponse<InlineResponse2001> localVarResp = transferNFTPostWithHttpInfo(inlineObject1);
        return localVarResp.getData();
    }

    /**
     * 转移NFT
     * 转移指定ID的NFT，指定数量Amount，至指定用户区块链地址
     * @param inlineObject1  (optional)
     * @return ApiResponse&lt;InlineResponse2001&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 成功 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<InlineResponse2001> transferNFTPostWithHttpInfo(InlineObject1 inlineObject1) throws ApiException {
        okhttp3.Call localVarCall = transferNFTPostValidateBeforeCall(inlineObject1, null);
        Type localVarReturnType = new TypeToken<InlineResponse2001>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * 转移NFT (asynchronously)
     * 转移指定ID的NFT，指定数量Amount，至指定用户区块链地址
     * @param inlineObject1  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 成功 </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call transferNFTPostAsync(InlineObject1 inlineObject1, final ApiCallback<InlineResponse2001> _callback) throws ApiException {

        okhttp3.Call localVarCall = transferNFTPostValidateBeforeCall(inlineObject1, _callback);
        Type localVarReturnType = new TypeToken<InlineResponse2001>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for userNFTsPost
     * @param inlineObject  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 成功 </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call userNFTsPostCall(InlineObject inlineObject, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = inlineObject;

        // create path and map variables
        String localVarPath = "/UserNFTs";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call userNFTsPostValidateBeforeCall(InlineObject inlineObject, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = userNFTsPostCall(inlineObject, _callback);
        return localVarCall;

    }

    /**
     * 查询用户NFT
     * 查询指定合约用户徽章持有ID和对应的数量。
     * @param inlineObject  (optional)
     * @return InlineResponse200
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 成功 </td><td>  -  </td></tr>
     </table>
     */
    public InlineResponse200 userNFTsPost(InlineObject inlineObject) throws ApiException {
        ApiResponse<InlineResponse200> localVarResp = userNFTsPostWithHttpInfo(inlineObject);
        return localVarResp.getData();
    }

    /**
     * 查询用户NFT
     * 查询指定合约用户徽章持有ID和对应的数量。
     * @param inlineObject  (optional)
     * @return ApiResponse&lt;InlineResponse200&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 成功 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<InlineResponse200> userNFTsPostWithHttpInfo(InlineObject inlineObject) throws ApiException {
        okhttp3.Call localVarCall = userNFTsPostValidateBeforeCall(inlineObject, null);
        Type localVarReturnType = new TypeToken<InlineResponse200>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * 查询用户NFT (asynchronously)
     * 查询指定合约用户徽章持有ID和对应的数量。
     * @param inlineObject  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 成功 </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call userNFTsPostAsync(InlineObject inlineObject, final ApiCallback<InlineResponse200> _callback) throws ApiException {

        okhttp3.Call localVarCall = userNFTsPostValidateBeforeCall(inlineObject, _callback);
        Type localVarReturnType = new TypeToken<InlineResponse200>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
