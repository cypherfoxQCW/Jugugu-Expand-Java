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
 * InlineResponse2001
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-05-01T20:48:31.465+08:00[Asia/Shanghai]")
public class InlineResponse2001 {
  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  private String state;

  public static final String SERIALIZED_NAME_HASH = "hash";
  @SerializedName(SERIALIZED_NAME_HASH)
  private String hash;

  public static final String SERIALIZED_NAME_CONTRACT = "contract";
  @SerializedName(SERIALIZED_NAME_CONTRACT)
  private String contract;

  public static final String SERIALIZED_NAME_FORM = "form";
  @SerializedName(SERIALIZED_NAME_FORM)
  private String form;

  public static final String SERIALIZED_NAME_TO = "to";
  @SerializedName(SERIALIZED_NAME_TO)
  private String to;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private String amount;


  public InlineResponse2001 state(String state) {
    
    this.state = state;
    return this;
  }

   /**
   * 0代表失败  1代表成功
   * @return state
  **/
  @ApiModelProperty(required = true, value = "0代表失败  1代表成功")

  public String getState() {
    return state;
  }


  public void setState(String state) {
    this.state = state;
  }


  public InlineResponse2001 hash(String hash) {
    
    this.hash = hash;
    return this;
  }

   /**
   * state&#x3D;0时为错误信息，state&#x3D;1时交易hash
   * @return hash
  **/
  @ApiModelProperty(required = true, value = "state=0时为错误信息，state=1时交易hash")

  public String getHash() {
    return hash;
  }


  public void setHash(String hash) {
    this.hash = hash;
  }


  public InlineResponse2001 contract(String contract) {
    
    this.contract = contract;
    return this;
  }

   /**
   * 合约地址
   * @return contract
  **/
  @ApiModelProperty(required = true, value = "合约地址")

  public String getContract() {
    return contract;
  }


  public void setContract(String contract) {
    this.contract = contract;
  }


  public InlineResponse2001 form(String form) {
    
    this.form = form;
    return this;
  }

   /**
   * 源地址
   * @return form
  **/
  @ApiModelProperty(required = true, value = "源地址")

  public String getForm() {
    return form;
  }


  public void setForm(String form) {
    this.form = form;
  }


  public InlineResponse2001 to(String to) {
    
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


  public InlineResponse2001 id(String id) {
    
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


  public InlineResponse2001 amount(String amount) {
    
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
    InlineResponse2001 inlineResponse2001 = (InlineResponse2001) o;
    return Objects.equals(this.state, inlineResponse2001.state) &&
        Objects.equals(this.hash, inlineResponse2001.hash) &&
        Objects.equals(this.contract, inlineResponse2001.contract) &&
        Objects.equals(this.form, inlineResponse2001.form) &&
        Objects.equals(this.to, inlineResponse2001.to) &&
        Objects.equals(this.id, inlineResponse2001.id) &&
        Objects.equals(this.amount, inlineResponse2001.amount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(state, hash, contract, form, to, id, amount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2001 {\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    hash: ").append(toIndentedString(hash)).append("\n");
    sb.append("    contract: ").append(toIndentedString(contract)).append("\n");
    sb.append("    form: ").append(toIndentedString(form)).append("\n");
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

