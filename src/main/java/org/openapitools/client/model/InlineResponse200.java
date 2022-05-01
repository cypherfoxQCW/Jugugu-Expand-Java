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
import java.util.ArrayList;
import java.util.List;
import org.openapitools.client.model.InlineResponse200Nfts;

/**
 * InlineResponse200
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-05-01T20:48:31.465+08:00[Asia/Shanghai]")
public class InlineResponse200 {
  public static final String SERIALIZED_NAME_CONTRACT = "contract";
  @SerializedName(SERIALIZED_NAME_CONTRACT)
  private String contract;

  public static final String SERIALIZED_NAME_ACCOUNT = "account";
  @SerializedName(SERIALIZED_NAME_ACCOUNT)
  private String account;

  public static final String SERIALIZED_NAME_NFTS = "nfts";
  @SerializedName(SERIALIZED_NAME_NFTS)
  private List<InlineResponse200Nfts> nfts = new ArrayList<InlineResponse200Nfts>();


  public InlineResponse200 contract(String contract) {
    
    this.contract = contract;
    return this;
  }

   /**
   * Get contract
   * @return contract
  **/
  @ApiModelProperty(required = true, value = "")

  public String getContract() {
    return contract;
  }


  public void setContract(String contract) {
    this.contract = contract;
  }


  public InlineResponse200 account(String account) {
    
    this.account = account;
    return this;
  }

   /**
   * Get account
   * @return account
  **/
  @ApiModelProperty(required = true, value = "")

  public String getAccount() {
    return account;
  }


  public void setAccount(String account) {
    this.account = account;
  }


  public InlineResponse200 nfts(List<InlineResponse200Nfts> nfts) {
    
    this.nfts = nfts;
    return this;
  }

  public InlineResponse200 addNftsItem(InlineResponse200Nfts nftsItem) {
    this.nfts.add(nftsItem);
    return this;
  }

   /**
   * 用户持有的查询合约的所有NFT
   * @return nfts
  **/
  @ApiModelProperty(required = true, value = "用户持有的查询合约的所有NFT")

  public List<InlineResponse200Nfts> getNfts() {
    return nfts;
  }


  public void setNfts(List<InlineResponse200Nfts> nfts) {
    this.nfts = nfts;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse200 inlineResponse200 = (InlineResponse200) o;
    return Objects.equals(this.contract, inlineResponse200.contract) &&
        Objects.equals(this.account, inlineResponse200.account) &&
        Objects.equals(this.nfts, inlineResponse200.nfts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contract, account, nfts);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse200 {\n");
    sb.append("    contract: ").append(toIndentedString(contract)).append("\n");
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    nfts: ").append(toIndentedString(nfts)).append("\n");
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
