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
 * InlineResponse2003
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-05-01T20:48:31.465+08:00[Asia/Shanghai]")
public class InlineResponse2003 {
  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  private String state;

  public static final String SERIALIZED_NAME_MSG = "msg";
  @SerializedName(SERIALIZED_NAME_MSG)
  private String msg;

  public static final String SERIALIZED_NAME_VIRIFYCODEID = "virifycodeid";
  @SerializedName(SERIALIZED_NAME_VIRIFYCODEID)
  private String virifycodeid;

  public static final String SERIALIZED_NAME_VIRIFYIMAGE = "virifyimage";
  @SerializedName(SERIALIZED_NAME_VIRIFYIMAGE)
  private String virifyimage;


  public InlineResponse2003 state(String state) {
    
    this.state = state;
    return this;
  }

   /**
   * -1代表错误 1代表成功 0代表提示
   * @return state
  **/
  @ApiModelProperty(required = true, value = "-1代表错误 1代表成功 0代表提示")

  public String getState() {
    return state;
  }


  public void setState(String state) {
    this.state = state;
  }


  public InlineResponse2003 msg(String msg) {
    
    this.msg = msg;
    return this;
  }

   /**
   * 状态码对应的详细信息
   * @return msg
  **/
  @ApiModelProperty(required = true, value = "状态码对应的详细信息")

  public String getMsg() {
    return msg;
  }


  public void setMsg(String msg) {
    this.msg = msg;
  }


  public InlineResponse2003 virifycodeid(String virifycodeid) {
    
    this.virifycodeid = virifycodeid;
    return this;
  }

   /**
   * 验证码图片ID
   * @return virifycodeid
  **/
  @ApiModelProperty(required = true, value = "验证码图片ID")

  public String getVirifycodeid() {
    return virifycodeid;
  }


  public void setVirifycodeid(String virifycodeid) {
    this.virifycodeid = virifycodeid;
  }


  public InlineResponse2003 virifyimage(String virifyimage) {
    
    this.virifyimage = virifyimage;
    return this;
  }

   /**
   * 验证码图片数据data:image/png;base64,格式
   * @return virifyimage
  **/
  @ApiModelProperty(required = true, value = "验证码图片数据data:image/png;base64,格式")

  public String getVirifyimage() {
    return virifyimage;
  }


  public void setVirifyimage(String virifyimage) {
    this.virifyimage = virifyimage;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2003 inlineResponse2003 = (InlineResponse2003) o;
    return Objects.equals(this.state, inlineResponse2003.state) &&
        Objects.equals(this.msg, inlineResponse2003.msg) &&
        Objects.equals(this.virifycodeid, inlineResponse2003.virifycodeid) &&
        Objects.equals(this.virifyimage, inlineResponse2003.virifyimage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(state, msg, virifycodeid, virifyimage);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2003 {\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    msg: ").append(toIndentedString(msg)).append("\n");
    sb.append("    virifycodeid: ").append(toIndentedString(virifycodeid)).append("\n");
    sb.append("    virifyimage: ").append(toIndentedString(virifyimage)).append("\n");
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
