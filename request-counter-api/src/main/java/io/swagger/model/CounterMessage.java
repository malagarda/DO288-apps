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
 * CounterMessage
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-10-08T08:00:53.858Z[GMT]")


public class CounterMessage   {
  @JsonProperty("numberOfRequests")
  private Integer numberOfRequests = 0;

  public CounterMessage numberOfRequests(Integer numberOfRequests) {
    this.numberOfRequests = numberOfRequests;
    return this;
  }

  /**
   * Get numberOfRequests
   * @return numberOfRequests
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

    public Integer getNumberOfRequests() {
    return numberOfRequests;
  }

  public void setNumberOfRequests(Integer numberOfRequests) {
    this.numberOfRequests = numberOfRequests;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CounterMessage counterMessage = (CounterMessage) o;
    return Objects.equals(this.numberOfRequests, counterMessage.numberOfRequests);
  }

  @Override
  public int hashCode() {
    return Objects.hash(numberOfRequests);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CounterMessage {\n");
    
    sb.append("    numberOfRequests: ").append(toIndentedString(numberOfRequests)).append("\n");
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
