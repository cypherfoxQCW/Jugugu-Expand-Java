# DefaultApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**friendLoginPost**](DefaultApi.md#friendLoginPost) | **POST** /FriendLogin | 4.Cookie登录
[**juguguGetPhoneCodePost**](DefaultApi.md#juguguGetPhoneCodePost) | **POST** /Jugugu_GetPhoneCode | 2.获取登录短信验证码
[**jugugugGetReleaseNFT1155PNGCodePost**](DefaultApi.md#jugugugGetReleaseNFT1155PNGCodePost) | **POST** /Jugugug_GetReleaseNFT1155_PNGCode | 1.获得验证码图片
[**transferNFTPost**](DefaultApi.md#transferNFTPost) | **POST** /TransferNFT | 转移NFT
[**userNFTsPost**](DefaultApi.md#userNFTsPost) | **POST** /UserNFTs | 查询用户NFT


<a name="friendLoginPost"></a>
# **friendLoginPost**
> InlineResponse2002 friendLoginPost(inlineObject4)

4.Cookie登录

Cookie无感登录jugugu获取用户信息。使用CookieToken和手机号登录菊咕咕获取信息，安全考虑该方法不会获得操作等级高的token。cookietoken只有有限的操作权限。

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    InlineObject4 inlineObject4 = new InlineObject4(); // InlineObject4 | 
    try {
      InlineResponse2002 result = apiInstance.friendLoginPost(inlineObject4);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#friendLoginPost");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inlineObject4** | [**InlineObject4**](InlineObject4.md)|  | [optional]

### Return type

[**InlineResponse2002**](InlineResponse2002.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | 成功 |  -  |

<a name="juguguGetPhoneCodePost"></a>
# **juguguGetPhoneCodePost**
> InlineResponse2002 juguguGetPhoneCodePost(inlineObject2)

2.获取登录短信验证码

获取登录短信验证码，验证码重复发送周期为60秒。验证码有效时间为3分钟

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    InlineObject2 inlineObject2 = new InlineObject2(); // InlineObject2 | 
    try {
      InlineResponse2002 result = apiInstance.juguguGetPhoneCodePost(inlineObject2);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#juguguGetPhoneCodePost");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inlineObject2** | [**InlineObject2**](InlineObject2.md)|  | [optional]

### Return type

[**InlineResponse2002**](InlineResponse2002.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | 成功 |  -  |

<a name="jugugugGetReleaseNFT1155PNGCodePost"></a>
# **jugugugGetReleaseNFT1155PNGCodePost**
> InlineResponse2003 jugugugGetReleaseNFT1155PNGCodePost(inlineObject3)

1.获得验证码图片

获取验证码图片，用于防止机器人。

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    InlineObject3 inlineObject3 = new InlineObject3(); // InlineObject3 | 
    try {
      InlineResponse2003 result = apiInstance.jugugugGetReleaseNFT1155PNGCodePost(inlineObject3);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#jugugugGetReleaseNFT1155PNGCodePost");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inlineObject3** | [**InlineObject3**](InlineObject3.md)|  | [optional]

### Return type

[**InlineResponse2003**](InlineResponse2003.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | 成功 |  -  |

<a name="transferNFTPost"></a>
# **transferNFTPost**
> InlineResponse2001 transferNFTPost(inlineObject1)

转移NFT

转移指定ID的NFT，指定数量Amount，至指定用户区块链地址

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    InlineObject1 inlineObject1 = new InlineObject1(); // InlineObject1 | 
    try {
      InlineResponse2001 result = apiInstance.transferNFTPost(inlineObject1);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#transferNFTPost");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inlineObject1** | [**InlineObject1**](InlineObject1.md)|  | [optional]

### Return type

[**InlineResponse2001**](InlineResponse2001.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | 成功 |  -  |

<a name="userNFTsPost"></a>
# **userNFTsPost**
> InlineResponse200 userNFTsPost(inlineObject)

查询用户NFT

查询指定合约用户徽章持有ID和对应的数量。

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    InlineObject inlineObject = new InlineObject(); // InlineObject | 
    try {
      InlineResponse200 result = apiInstance.userNFTsPost(inlineObject);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#userNFTsPost");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inlineObject** | [**InlineObject**](InlineObject.md)|  | [optional]

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | 成功 |  -  |

