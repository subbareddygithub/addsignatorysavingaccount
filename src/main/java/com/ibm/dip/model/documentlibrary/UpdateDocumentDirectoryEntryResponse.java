package com.ibm.dip.model.documentlibrary;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.ibm.dip.model.documentlibrary.UpdateDocumentDirectoryEntryResponseDocumentDirectoryEntry;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * UpdateDocumentDirectoryEntryResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-13T05:08:30.812Z[GMT]")

public class UpdateDocumentDirectoryEntryResponse   {
  @JsonProperty("DocumentDirectoryEntry")
  private UpdateDocumentDirectoryEntryResponseDocumentDirectoryEntry documentDirectoryEntry;

  public UpdateDocumentDirectoryEntryResponse documentDirectoryEntry(UpdateDocumentDirectoryEntryResponseDocumentDirectoryEntry documentDirectoryEntry) {
    this.documentDirectoryEntry = documentDirectoryEntry;
    return this;
  }

  /**
   * Get documentDirectoryEntry
   * @return documentDirectoryEntry
  */
  @ApiModelProperty(value = "")

  @Valid

  public UpdateDocumentDirectoryEntryResponseDocumentDirectoryEntry getDocumentDirectoryEntry() {
    return documentDirectoryEntry;
  }

  public void setDocumentDirectoryEntry(UpdateDocumentDirectoryEntryResponseDocumentDirectoryEntry documentDirectoryEntry) {
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
    UpdateDocumentDirectoryEntryResponse updateDocumentDirectoryEntryResponse = (UpdateDocumentDirectoryEntryResponse) o;
    return Objects.equals(this.documentDirectoryEntry, updateDocumentDirectoryEntryResponse.documentDirectoryEntry);
  }

  @Override
  public int hashCode() {
    return Objects.hash(documentDirectoryEntry);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateDocumentDirectoryEntryResponse {\n");
    
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

