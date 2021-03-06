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


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * InlineObject1
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-05-01T20:48:31.465+08:00[Asia/Shanghai]")
public class InlineObject1 {
  public static final String SERIALIZED_NAME_APPID = "appid";
  @SerializedName(SERIALIZED_NAME_APPID)
  private String appid;

  public static final String SERIALIZED_NAME_TO = "to";
  @SerializedName(SERIALIZED_NAME_TO)
  private String to;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private String amount;


  public InlineObject1 appid(String appid) {
    
    this.appid = appid;
    return this;
  }

   /**
   * 交互APPID
   * @return appid
  **/
  @ApiModelProperty(required = true, value = "交互APPID")

  public String getAppid() {
    return appid;
  }


  public void setAppid(String appid) {
    this.appid = appid;
  }


  public InlineObject1 to(String to) {
    
    this.to = to;
    return this;
  }

   /**
   * 目的地址
   * @return to
  **/
  @ApiModelProperty(required = true, value = "目的地址")

  public String getTo() {
    return to;
  }


  public void setTo(String to) {
    this.to = to;
  }


  public InlineObject1 id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * NFT的ID
   * @return id
  **/
  @ApiModelProperty(required = true, value = "NFT的ID")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public InlineObject1 amount(String amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * 转移的数量
   * @return amount
  **/
  @ApiModelProperty(required = true, value = "转移的数量")

  public String getAmount() {
    return amount;
  }


  public void setAmount(String amount) {
    this.amount = amount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineObject1 inlineObject1 = (InlineObject1) o;
    return Objects.equals(this.appid, inlineObject1.appid) &&
        Objects.equals(this.to, inlineObject1.to) &&
        Objects.equals(this.id, inlineObject1.id) &&
        Objects.equals(this.amount, inlineObject1.amount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appid, to, id, amount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineObject1 {\n");
    sb.append("    appid: ").append(toIndentedString(appid)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

