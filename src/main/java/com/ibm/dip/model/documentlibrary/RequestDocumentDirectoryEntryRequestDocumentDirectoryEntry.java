package com.ibm.dip.model.documentlibrary;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RequestDocumentDirectoryEntryRequestDocumentDirectoryEntry
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-13T05:08:30.812Z[GMT]")

public class RequestDocumentDirectoryEntryRequestDocumentDirectoryEntry   {
  @JsonProperty("DocumentProvisioningHistory")
  private String documentProvisioningHistory;

  @JsonProperty("DocumentProvisioningRequest")
  private String documentProvisioningRequest;

  @JsonProperty("DocumentProvisioningSchedule")
  private String documentProvisioningSchedule;

  @JsonProperty("DocumentVersionHistory")
  private String documentVersionHistory;

  @JsonProperty("DocumentVersionDate")
  private String documentVersionDate;

  @JsonProperty("DocumentVerificationHistory")
  private String documentVerificationHistory;

  @JsonProperty("DocumentVerificationTaskDescription")
  private String documentVerificationTaskDescription;

  @JsonProperty("DocumentVerificationServiceProviderReference")
  private Object documentVerificationServiceProviderReference;

  @JsonProperty("DocumentAmendmentHistory")
  private String documentAmendmentHistory;

  @JsonProperty("DocumentAmendmentDescription")
  private String documentAmendmentDescription;

  @JsonProperty("DocumentUpdateHistory")
  private String documentUpdateHistory;

  @JsonProperty("DocumentUpdateDescription")
  private String documentUpdateDescription;

  @JsonProperty("DocumentArchivingHistory")
  private String documentArchivingHistory;

  @JsonProperty("DocumentArchivingAction")
  private String documentArchivingAction;

  public RequestDocumentDirectoryEntryRequestDocumentDirectoryEntry documentProvisioningHistory(String documentProvisioningHistory) {
    this.documentProvisioningHistory = documentProvisioningHistory;
    return this;
  }

  /**
   * Get documentProvisioningHistory
   * @return documentProvisioningHistory
  */
  @ApiModelProperty(value = "")


  public String getDocumentProvisioningHistory() {
    return documentProvisioningHistory;
  }

  public void setDocumentProvisioningHistory(String documentProvisioningHistory) {
    this.documentProvisioningHistory = documentProvisioningHistory;
  }

  public RequestDocumentDirectoryEntryRequestDocumentDirectoryEntry documentProvisioningRequest(String documentProvisioningRequest) {
    this.documentProvisioningRequest = documentProvisioningRequest;
    return this;
  }

  /**
   * Get documentProvisioningRequest
   * @return documentProvisioningRequest
  */
  @ApiModelProperty(value = "")


  public String getDocumentProvisioningRequest() {
    return documentProvisioningRequest;
  }

  public void setDocumentProvisioningRequest(String documentProvisioningRequest) {
    this.documentProvisioningRequest = documentProvisioningRequest;
  }

  public RequestDocumentDirectoryEntryRequestDocumentDirectoryEntry documentProvisioningSchedule(String documentProvisioningSchedule) {
    this.documentProvisioningSchedule = documentProvisioningSchedule;
    return this;
  }

  /**
   * Get documentProvisioningSchedule
   * @return documentProvisioningSchedule
  */
  @ApiModelProperty(value = "")


  public String getDocumentProvisioningSchedule() {
    return documentProvisioningSchedule;
  }

  public void setDocumentProvisioningSchedule(String documentProvisioningSchedule) {
    this.documentProvisioningSchedule = documentProvisioningSchedule;
  }

  public RequestDocumentDirectoryEntryRequestDocumentDirectoryEntry documentVersionHistory(String documentVersionHistory) {
    this.documentVersionHistory = documentVersionHistory;
    return this;
  }

  /**
   * Get documentVersionHistory
   * @return documentVersionHistory
  */
  @ApiModelProperty(value = "")


  public String getDocumentVersionHistory() {
    return documentVersionHistory;
  }

  public void setDocumentVersionHistory(String documentVersionHistory) {
    this.documentVersionHistory = documentVersionHistory;
  }

  public RequestDocumentDirectoryEntryRequestDocumentDirectoryEntry documentVersionDate(String documentVersionDate) {
    this.documentVersionDate = documentVersionDate;
    return this;
  }

  /**
   * Get documentVersionDate
   * @return documentVersionDate
  */
  @ApiModelProperty(value = "")


  public String getDocumentVersionDate() {
    return documentVersionDate;
  }

  public void setDocumentVersionDate(String documentVersionDate) {
    this.documentVersionDate = documentVersionDate;
  }

  public RequestDocumentDirectoryEntryRequestDocumentDirectoryEntry documentVerificationHistory(String documentVerificationHistory) {
    this.documentVerificationHistory = documentVerificationHistory;
    return this;
  }

  /**
   * Get documentVerificationHistory
   * @return documentVerificationHistory
  */
  @ApiModelProperty(value = "")


  public String getDocumentVerificationHistory() {
    return documentVerificationHistory;
  }

  public void setDocumentVerificationHistory(String documentVerificationHistory) {
    this.documentVerificationHistory = documentVerificationHistory;
  }

  public RequestDocumentDirectoryEntryRequestDocumentDirectoryEntry documentVerificationTaskDescription(String documentVerificationTaskDescription) {
    this.documentVerificationTaskDescription = documentVerificationTaskDescription;
    return this;
  }

  /**
   * Get documentVerificationTaskDescription
   * @return documentVerificationTaskDescription
  */
  @ApiModelProperty(value = "")


  public String getDocumentVerificationTaskDescription() {
    return documentVerificationTaskDescription;
  }

  public void setDocumentVerificationTaskDescription(String documentVerificationTaskDescription) {
    this.documentVerificationTaskDescription = documentVerificationTaskDescription;
  }

  public RequestDocumentDirectoryEntryRequestDocumentDirectoryEntry documentVerificationServiceProviderReference(Object documentVerificationServiceProviderReference) {
    this.documentVerificationServiceProviderReference = documentVerificationServiceProviderReference;
    return this;
  }

  /**
   * Get documentVerificationServiceProviderReference
   * @return documentVerificationServiceProviderReference
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getDocumentVerificationServiceProviderReference() {
    return documentVerificationServiceProviderReference;
  }

  public void setDocumentVerificationServiceProviderReference(Object documentVerificationServiceProviderReference) {
    this.documentVerificationServiceProviderReference = documentVerificationServiceProviderReference;
  }

  public RequestDocumentDirectoryEntryRequestDocumentDirectoryEntry documentAmendmentHistory(String documentAmendmentHistory) {
    this.documentAmendmentHistory = documentAmendmentHistory;
    return this;
  }

  /**
   * Get documentAmendmentHistory
   * @return documentAmendmentHistory
  */
  @ApiModelProperty(value = "")


  public String getDocumentAmendmentHistory() {
    return documentAmendmentHistory;
  }

  public void setDocumentAmendmentHistory(String documentAmendmentHistory) {
    this.documentAmendmentHistory = documentAmendmentHistory;
  }

  public RequestDocumentDirectoryEntryRequestDocumentDirectoryEntry documentAmendmentDescription(String documentAmendmentDescription) {
    this.documentAmendmentDescription = documentAmendmentDescription;
    return this;
  }

  /**
   * Get documentAmendmentDescription
   * @return documentAmendmentDescription
  */
  @ApiModelProperty(value = "")


  public String getDocumentAmendmentDescription() {
    return documentAmendmentDescription;
  }

  public void setDocumentAmendmentDescription(String documentAmendmentDescription) {
    this.documentAmendmentDescription = documentAmendmentDescription;
  }

  public RequestDocumentDirectoryEntryRequestDocumentDirectoryEntry documentUpdateHistory(String documentUpdateHistory) {
    this.documentUpdateHistory = documentUpdateHistory;
    return this;
  }

  /**
   * Get documentUpdateHistory
   * @return documentUpdateHistory
  */
  @ApiModelProperty(value = "")


  public String getDocumentUpdateHistory() {
    return documentUpdateHistory;
  }

  public void setDocumentUpdateHistory(String documentUpdateHistory) {
    this.documentUpdateHistory = documentUpdateHistory;
  }

  public RequestDocumentDirectoryEntryRequestDocumentDirectoryEntry documentUpdateDescription(String documentUpdateDescription) {
    this.documentUpdateDescription = documentUpdateDescription;
    return this;
  }

  /**
   * Get documentUpdateDescription
   * @return documentUpdateDescription
  */
  @ApiModelProperty(value = "")


  public String getDocumentUpdateDescription() {
    return documentUpdateDescription;
  }

  public void setDocumentUpdateDescription(String documentUpdateDescription) {
    this.documentUpdateDescription = documentUpdateDescription;
  }

  public RequestDocumentDirectoryEntryRequestDocumentDirectoryEntry documentArchivingHistory(String documentArchivingHistory) {
    this.documentArchivingHistory = documentArchivingHistory;
    return this;
  }

  /**
   * Get documentArchivingHistory
   * @return documentArchivingHistory
  */
  @ApiModelProperty(value = "")


  public String getDocumentArchivingHistory() {
    return documentArchivingHistory;
  }

  public void setDocumentArchivingHistory(String documentArchivingHistory) {
    this.documentArchivingHistory = documentArchivingHistory;
  }

  public RequestDocumentDirectoryEntryRequestDocumentDirectoryEntry documentArchivingAction(String documentArchivingAction) {
    this.documentArchivingAction = documentArchivingAction;
    return this;
  }

  /**
   * Get documentArchivingAction
   * @return documentArchivingAction
  */
  @ApiModelProperty(value = "")


  public String getDocumentArchivingAction() {
    return documentArchivingAction;
  }

  public void setDocumentArchivingAction(String documentArchivingAction) {
    this.documentArchivingAction = documentArchivingAction;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RequestDocumentDirectoryEntryRequestDocumentDirectoryEntry requestDocumentDirectoryEntryRequestDocumentDirectoryEntry = (RequestDocumentDirectoryEntryRequestDocumentDirectoryEntry) o;
    return Objects.equals(this.documentProvisioningHistory, requestDocumentDirectoryEntryRequestDocumentDirectoryEntry.documentProvisioningHistory) &&
        Objects.equals(this.documentProvisioningRequest, requestDocumentDirectoryEntryRequestDocumentDirectoryEntry.documentProvisioningRequest) &&
        Objects.equals(this.documentProvisioningSchedule, requestDocumentDirectoryEntryRequestDocumentDirectoryEntry.documentProvisioningSchedule) &&
        Objects.equals(this.documentVersionHistory, requestDocumentDirectoryEntryRequestDocumentDirectoryEntry.documentVersionHistory) &&
        Objects.equals(this.documentVersionDate, requestDocumentDirectoryEntryRequestDocumentDirectoryEntry.documentVersionDate) &&
        Objects.equals(this.documentVerificationHistory, requestDocumentDirectoryEntryRequestDocumentDirectoryEntry.documentVerificationHistory) &&
        Objects.equals(this.documentVerificationTaskDescription, requestDocumentDirectoryEntryRequestDocumentDirectoryEntry.documentVerificationTaskDescription) &&
        Objects.equals(this.documentVerificationServiceProviderReference, requestDocumentDirectoryEntryRequestDocumentDirectoryEntry.documentVerificationServiceProviderReference) &&
        Objects.equals(this.documentAmendmentHistory, requestDocumentDirectoryEntryRequestDocumentDirectoryEntry.documentAmendmentHistory) &&
        Objects.equals(this.documentAmendmentDescription, requestDocumentDirectoryEntryRequestDocumentDirectoryEntry.documentAmendmentDescription) &&
        Objects.equals(this.documentUpdateHistory, requestDocumentDirectoryEntryRequestDocumentDirectoryEntry.documentUpdateHistory) &&
        Objects.equals(this.documentUpdateDescription, requestDocumentDirectoryEntryRequestDocumentDirectoryEntry.documentUpdateDescription) &&
        Objects.equals(this.documentArchivingHistory, requestDocumentDirectoryEntryRequestDocumentDirectoryEntry.documentArchivingHistory) &&
        Objects.equals(this.documentArchivingAction, requestDocumentDirectoryEntryRequestDocumentDirectoryEntry.documentArchivingAction);
  }

  @Override
  public int hashCode() {
    return Objects.hash(documentProvisioningHistory, documentProvisioningRequest, documentProvisioningSchedule, documentVersionHistory, documentVersionDate, documentVerificationHistory, documentVerificationTaskDescription, documentVerificationServiceProviderReference, documentAmendmentHistory, documentAmendmentDescription, documentUpdateHistory, documentUpdateDescription, documentArchivingHistory, documentArchivingAction);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RequestDocumentDirectoryEntryRequestDocumentDirectoryEntry {\n");
    
    sb.append("    documentProvisioningHistory: ").append(toIndentedString(documentProvisioningHistory)).append("\n");
    sb.append("    documentProvisioningRequest: ").append(toIndentedString(documentProvisioningRequest)).append("\n");
    sb.append("    documentProvisioningSchedule: ").append(toIndentedString(documentProvisioningSchedule)).append("\n");
    sb.append("    documentVersionHistory: ").append(toIndentedString(documentVersionHistory)).append("\n");
    sb.append("    documentVersionDate: ").append(toIndentedString(documentVersionDate)).append("\n");
    sb.append("    documentVerificationHistory: ").append(toIndentedString(documentVerificationHistory)).append("\n");
    sb.append("    documentVerificationTaskDescription: ").append(toIndentedString(documentVerificationTaskDescription)).append("\n");
    sb.append("    documentVerificationServiceProviderReference: ").append(toIndentedString(documentVerificationServiceProviderReference)).append("\n");
    sb.append("    documentAmendmentHistory: ").append(toIndentedString(documentAmendmentHistory)).append("\n");
    sb.append("    documentAmendmentDescription: ").append(toIndentedString(documentAmendmentDescription)).append("\n");
    sb.append("    documentUpdateHistory: ").append(toIndentedString(documentUpdateHistory)).append("\n");
    sb.append("    documentUpdateDescription: ").append(toIndentedString(documentUpdateDescription)).append("\n");
    sb.append("    documentArchivingHistory: ").append(toIndentedString(documentArchivingHistory)).append("\n");
    sb.append("    documentArchivingAction: ").append(toIndentedString(documentArchivingAction)).append("\n");
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

