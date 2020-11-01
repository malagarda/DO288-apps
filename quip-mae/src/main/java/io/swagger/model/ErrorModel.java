package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ErrorModel
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-11-01T18:02:49.240Z[GMT]")


public class ErrorModel   {
  @JsonProperty("message")
  private String message = null;

  @JsonProperty("code")
  private Integer code = null;

  public ErrorModel message(String message) {
    this.message = message;
    return this;
  }

  /**
   * Get message
   * @return message
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

    public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public ErrorModel code(Integer code) {
    this.code = code;
    return this;
  }

  /**
   * Get code
   * minimum: 100
   * maximum: 600
   * @return code
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

  @Min(100) @Max(600)   public Integer getCode() {
    return code;
  }

  public void setCode(Integer code) {
    this.code = code;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ErrorModel errorModel = (ErrorModel) o;
    return Objects.equals(this.message, errorModel.message) &&
        Objects.equals(this.code, errorModel.code);
  }

  @Override
  public int hashCode() {
    return Objects.hash(message, code);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorModel {\n");
    
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
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
