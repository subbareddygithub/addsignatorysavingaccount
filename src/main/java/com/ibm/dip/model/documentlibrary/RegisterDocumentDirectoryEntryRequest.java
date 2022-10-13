package com.ibm.dip.model.documentlibrary;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.ibm.dip.model.documentlibrary.RegisterDocumentDirectoryEntryRequestDocumentDirectoryEntry;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RegisterDocumentDirectoryEntryRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-13T05:08:30.812Z[GMT]")

public class RegisterDocumentDirectoryEntryRequest   {
  @JsonProperty("DocumentDirectoryEntry")
  private RegisterDocumentDirectoryEntryRequestDocumentDirectoryEntry documentDirectoryEntry;

  public RegisterDocumentDirectoryEntryRequest documentDirectoryEntry(RegisterDocumentDirectoryEntryRequestDocumentDirectoryEntry documentDirectoryEntry) {
    this.documentDirectoryEntry = documentDirectoryEntry;
    return this;
  }

  /**
   * Get documentDirectoryEntry
   * @return documentDirectoryEntry
  */
  @ApiModelProperty(value = "")

  @Valid

  public RegisterDocumentDirectoryEntryRequestDocumentDirectoryEntry getDocumentDirectoryEntry() {
    return documentDirectoryEntry;
  }

  public void setDocumentDirectoryEntry(RegisterDocumentDirectoryEntryRequestDocumentDirectoryEntry documentDirectoryEntry) {
    this.documentDirectoryEntry = documentDirectoryEntry;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RegisterDocumentDirectoryEntryRequest registerDocumentDirectoryEntryRequest = (RegisterDocumentDirectoryEntryRequest) o;
    return Objects.equals(this.documentDirectoryEntry, registerDocumentDirectoryEntryRequest.documentDirectoryEntry);
  }

  @Override
  public int hashCode() {
    return Objects.hash(documentDirectoryEntry);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RegisterDocumentDirectoryEntryRequest {\n");
    
    sb.append("    documentDirectoryEntry: ").append(toIndentedString(documentDirectoryEntry)).append("\n");
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

