package com.ibm.dip.model.partylifecyclemanagement;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Documentation
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-13T05:08:15.395Z[GMT]")

public class Documentation   {
  @JsonProperty("PartyLife-cycleRequiredDocumentation")
  private String partyLifeCycleRequiredDocumentation;

  @JsonProperty("PartyLife-cycleDocumentSchedule")
  private String partyLifeCycleDocumentSchedule;

  @JsonProperty("DocumentDirectoryEntryInstanceReference")
  private Object documentDirectoryEntryInstanceReference;

  public Documentation partyLifeCycleRequiredDocumentation(String partyLifeCycleRequiredDocumentation) {
    this.partyLifeCycleRequiredDocumentation = partyLifeCycleRequiredDocumentation;
    return this;
  }

  /**
   * Get partyLifeCycleRequiredDocumentation
   * @return partyLifeCycleRequiredDocumentation
  */
  @ApiModelProperty(value = "")


  public String getPartyLifeCycleRequiredDocumentation() {
    return partyLifeCycleRequiredDocumentation;
  }

  public void setPartyLifeCycleRequiredDocumentation(String partyLifeCycleRequiredDocumentation) {
    this.partyLifeCycleRequiredDocumentation = partyLifeCycleRequiredDocumentation;
  }

  public Documentation partyLifeCycleDocumentSchedule(String partyLifeCycleDocumentSchedule) {
    this.partyLifeCycleDocumentSchedule = partyLifeCycleDocumentSchedule;
    return this;
  }

  /**
   * Get partyLifeCycleDocumentSchedule
   * @return partyLifeCycleDocumentSchedule
  */
  @ApiModelProperty(value = "")


  public String getPartyLifeCycleDocumentSchedule() {
    return partyLifeCycleDocumentSchedule;
  }

  public void setPartyLifeCycleDocumentSchedule(String partyLifeCycleDocumentSchedule) {
    this.partyLifeCycleDocumentSchedule = partyLifeCycleDocumentSchedule;
  }

  public Documentation documentDirectoryEntryInstanceReference(Object documentDirectoryEntryInstanceReference) {
    this.documentDirectoryEntryInstanceReference = documentDirectoryEntryInstanceReference;
    return this;
  }

  /**
   * Get documentDirectoryEntryInstanceReference
   * @return documentDirectoryEntryInstanceReference
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getDocumentDirectoryEntryInstanceReference() {
    return documentDirectoryEntryInstanceReference;
  }

  public void setDocumentDirectoryEntryInstanceReference(Object documentDirectoryEntryInstanceReference) {
    this.documentDirectoryEntryInstanceReference = documentDirectoryEntryInstanceReference;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Documentation documentation = (Documentation) o;
    return Objects.equals(this.partyLifeCycleRequiredDocumentation, documentation.partyLifeCycleRequiredDocumentation) &&
        Objects.equals(this.partyLifeCycleDocumentSchedule, documentation.partyLifeCycleDocumentSchedule) &&
        Objects.equals(this.documentDirectoryEntryInstanceReference, documentation.documentDirectoryEntryInstanceReference);
  }

  @Override
  public int hashCode() {
    return Objects.hash(partyLifeCycleRequiredDocumentation, partyLifeCycleDocumentSchedule, documentDirectoryEntryInstanceReference);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Documentation {\n");
    
    sb.append("    partyLifeCycleRequiredDocumentation: ").append(toIndentedString(partyLifeCycleRequiredDocumentation)).append("\n");
    sb.append("    partyLifeCycleDocumentSchedule: ").append(toIndentedString(partyLifeCycleDocumentSchedule)).append("\n");
    sb.append("    documentDirectoryEntryInstanceReference: ").append(toIndentedString(documentDirectoryEntryInstanceReference)).append("\n");
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

