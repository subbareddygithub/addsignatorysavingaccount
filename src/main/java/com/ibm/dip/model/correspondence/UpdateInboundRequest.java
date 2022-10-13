package com.ibm.dip.model.correspondence;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.ibm.dip.model.correspondence.InitiateInboundRequestInbound;
import com.ibm.dip.model.correspondence.InitiateOutboundRequestCorrespondenceOperatingSession;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * UpdateInboundRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-13T05:08:34.896Z[GMT]")

public class UpdateInboundRequest   {
  @JsonProperty("CorrespondenceOperatingSession")
  private InitiateOutboundRequestCorrespondenceOperatingSession correspondenceOperatingSession;

  @JsonProperty("Inbound")
  private InitiateInboundRequestInbound inbound;

  public UpdateInboundRequest correspondenceOperatingSession(InitiateOutboundRequestCorrespondenceOperatingSession correspondenceOperatingSession) {
    this.correspondenceOperatingSession = correspondenceOperatingSession;
    return this;
  }

  /**
   * Get correspondenceOperatingSession
   * @return correspondenceOperatingSession
  */
  @ApiModelProperty(value = "")

  @Valid

  public InitiateOutboundRequestCorrespondenceOperatingSession getCorrespondenceOperatingSession() {
    return correspondenceOperatingSession;
  }

  public void setCorrespondenceOperatingSession(InitiateOutboundRequestCorrespondenceOperatingSession correspondenceOperatingSession) {
    this.correspondenceOperatingSession = correspondenceOperatingSession;
  }

  public UpdateInboundRequest inbound(InitiateInboundRequestInbound inbound) {
    this.inbound = inbound;
    return this;
  }

  /**
   * Get inbound
   * @return inbound
  */
  @ApiModelProperty(value = "")

  @Valid

  public InitiateInboundRequestInbound getInbound() {
    return inbound;
  }

  public void setInbound(InitiateInboundRequestInbound inbound) {
    this.inbound = inbound;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateInboundRequest updateInboundRequest = (UpdateInboundRequest) o;
    return Objects.equals(this.correspondenceOperatingSession, updateInboundRequest.correspondenceOperatingSession) &&
        Objects.equals(this.inbound, updateInboundRequest.inbound);
  }

  @Override
  public int hashCode() {
    return Objects.hash(correspondenceOperatingSession, inbound);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateInboundRequest {\n");
    
    sb.append("    correspondenceOperatingSession: ").append(toIndentedString(correspondenceOperatingSession)).append("\n");
    sb.append("    inbound: ").append(toIndentedString(inbound)).append("\n");
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

