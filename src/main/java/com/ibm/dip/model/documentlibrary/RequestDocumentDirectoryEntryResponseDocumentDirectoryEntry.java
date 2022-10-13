package com.ibm.dip.model.documentlibrary;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RequestDocumentDirectoryEntryResponseDocumentDirectoryEntry
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-13T05:08:30.812Z[GMT]")

public class RequestDocumentDirectoryEntryResponseDocumentDirectoryEntry   {
  @JsonProperty("DocumentProvisioningHistory")
  private String documentProvisioningHistory;

  @JsonProperty("DocumentProvisioningSchedule")
  private String documentProvisioningSchedule;

  @JsonProperty("DocumentProvisioningResult")
  private String documentProvisioningResult;

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

  @JsonProperty("DocumentVerificationTaskResult")
  private String documentVerificationTaskResult;

  @JsonProperty("DocumentAmendmentHistory")
  private String documentAmendmentHistory;

  @JsonProperty("DocumentAmendmentDescription")
  private String documentAmendmentDescription;

  @JsonProperty("DocumentAmendmentResult")
  private String documentAmendmentResult;

  @JsonProperty("DocumentUpdateHistory")
  private String documentUpdateHistory;

  @JsonProperty("DocumentUpdateDescription")
  private String documentUpdateDescription;

  @JsonProperty("DocumentUpdateResult")
  private String documentUpdateResult;

  @JsonProperty("DocumentArchivingHistory")
  private String documentArchivingHistory;

  @JsonProperty("DocumentArchivingAction")
  private String documentArchivingAction;

  @JsonProperty("DocumentArchiveReference")
  private Object documentArchiveReference;

  public RequestDocumentDirectoryEntryResponseDocumentDirectoryEntry documentProvisioningHistory(String documentProvisioningHistory) {
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

  public RequestDocumentDirectoryEntryResponseDocumentDirectoryEntry documentProvisioningSchedule(String documentProvisioningSchedule) {
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

  public RequestDocumentDirectoryEntryResponseDocumentDirectoryEntry documentProvisioningResult(String documentProvisioningResult) {
    this.documentProvisioningResult = documentProvisioningResult;
    return this;
  }

  /**
   * Get documentProvisioningResult
   * @return documentProvisioningResult
  */
  @ApiModelProperty(value = "")


  public String getDocumentProvisioningResult() {
    return documentProvisioningResult;
  }

  public void setDocumentProvisioningResult(String documentProvisioningResult) {
    this.documentProvisioningResult = documentProvisioningResult;
  }

  public RequestDocumentDirectoryEntryResponseDocumentDirectoryEntry documentVersionHistory(String documentVersionHistory) {
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

  public RequestDocumentDirectoryEntryResponseDocumentDirectoryEntry documentVersionDate(String documentVersionDate) {
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

  public RequestDocumentDirectoryEntryResponseDocumentDirectoryEntry documentVerificationHistory(String documentVerificationHistory) {
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

  public RequestDocumentDirectoryEntryResponseDocumentDirectoryEntry documentVerificationTaskDescription(String documentVerificationTaskDescription) {
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

  public RequestDocumentDirectoryEntryResponseDocumentDirectoryEntry documentVerificationServiceProviderReference(Object documentVerificationServiceProviderReference) {
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

  public RequestDocumentDirectoryEntryResponseDocumentDirectoryEntry documentVerificationTaskResult(String documentVerificationTaskResult) {
    this.documentVerificationTaskResult = documentVerificationTaskResult;
    return this;
  }

  /**
   * Get documentVerificationTaskResult
   * @return documentVerificationTaskResult
  */
  @ApiModelProperty(value = "")


  public String getDocumentVerificationTaskResult() {
    return documentVerificationTaskResult;
  }

  public void setDocumentVerificationTaskResult(String documentVerificationTaskResult) {
    this.documentVerificationTaskResult = documentVerificationTaskResult;
  }

  public RequestDocumentDirectoryEntryResponseDocumentDirectoryEntry documentAmendmentHistory(String documentAmendmentHistory) {
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

  public RequestDocumentDirectoryEntryResponseDocumentDirectoryEntry documentAmendmentDescription(String documentAmendmentDescription) {
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

  public RequestDocumentDirectoryEntryResponseDocumentDirectoryEntry documentAmendmentResult(String documentAmendmentResult) {
    this.documentAmendmentResult = documentAmendmentResult;
    return this;
  }

  /**
   * Get documentAmendmentResult
   * @return documentAmendmentResult
  */
  @ApiModelProperty(value = "")


  public String getDocumentAmendmentResult() {
    return documentAmendmentResult;
  }

  public void setDocumentAmendmentResult(String documentAmendmentResult) {
    this.documentAmendmentResult = documentAmendmentResult;
  }

  public RequestDocumentDirectoryEntryResponseDocumentDirectoryEntry documentUpdateHistory(String documentUpdateHistory) {
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

  public RequestDocumentDirectoryEntryResponseDocumentDirectoryEntry documentUpdateDescription(String documentUpdateDescription) {
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

  public RequestDocumentDirectoryEntryResponseDocumentDirectoryEntry documentUpdateResult(String documentUpdateResult) {
    this.documentUpdateResult = documentUpdateResult;
    return this;
  }

  /**
   * Get documentUpdateResult
   * @return documentUpdateResult
  */
  @ApiModelProperty(value = "")


  public String getDocumentUpdateResult() {
    return documentUpdateResult;
  }

  public void setDocumentUpdateResult(String documentUpdateResult) {
    this.documentUpdateResult = documentUpdateResult;
  }

  public RequestDocumentDirectoryEntryResponseDocumentDirectoryEntry documentArchivingHistory(String documentArchivingHistory) {
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

  public RequestDocumentDirectoryEntryResponseDocumentDirectoryEntry documentArchivingAction(String documentArchivingAction) {
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

  public RequestDocumentDirectoryEntryResponseDocumentDirectoryEntry documentArchiveReference(Object documentArchiveReference) {
    this.documentArchiveReference = documentArchiveReference;
    return this;
  }

  /**
   * Get documentArchiveReference
   * @return documentArchiveReference
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getDocumentArchiveReference() {
    return documentArchiveReference;
  }

  public void setDocumentArchiveReference(Object documentArchiveReference) {
    this.documentArchiveReference = documentArchiveReference;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RequestDocumentDirectoryEntryResponseDocumentDirectoryEntry requestDocumentDirectoryEntryResponseDocumentDirectoryEntry = (RequestDocumentDirectoryEntryResponseDocumentDirectoryEntry) o;
    return Objects.equals(this.documentProvisioningHistory, requestDocumentDirectoryEntryResponseDocumentDirectoryEntry.documentProvisioningHistory) &&
        Objects.equals(this.documentProvisioningSchedule, requestDocumentDirectoryEntryResponseDocumentDirectoryEntry.documentProvisioningSchedule) &&
        Objects.equals(this.documentProvisioningResult, requestDocumentDirectoryEntryResponseDocumentDirectoryEntry.documentProvisioningResult) &&
        Objects.equals(this.documentVersionHistory, requestDocumentDirectoryEntryResponseDocumentDirectoryEntry.documentVersionHistory) &&
        Objects.equals(this.documentVersionDate, requestDocumentDirectoryEntryResponseDocumentDirectoryEntry.documentVersionDate) &&
        Objects.equals(this.documentVerificationHistory, requestDocumentDirectoryEntryResponseDocumentDirectoryEntry.documentVerificationHistory) &&
        Objects.equals(this.documentVerificationTaskDescription, requestDocumentDirectoryEntryResponseDocumentDirectoryEntry.documentVerificationTaskDescription) &&
        Objects.equals(this.documentVerificationServiceProviderReference, requestDocumentDirectoryEntryResponseDocumentDirectoryEntry.documentVerificationServiceProviderReference) &&
        Objects.equals(this.documentVerificationTaskResult, requestDocumentDirectoryEntryResponseDocumentDirectoryEntry.documentVerificationTaskResult) &&
        Objects.equals(this.documentAmendmentHistory, requestDocumentDirectoryEntryResponseDocumentDirectoryEntry.documentAmendmentHistory) &&
        Objects.equals(this.documentAmendmentDescription, requestDocumentDirectoryEntryResponseDocumentDirectoryEntry.documentAmendmentDescription) &&
        Objects.equals(this.documentAmendmentResult, requestDocumentDirectoryEntryResponseDocumentDirectoryEntry.documentAmendmentResult) &&
        Objects.equals(this.documentUpdateHistory, requestDocumentDirectoryEntryResponseDocumentDirectoryEntry.documentUpdateHistory) &&
        Objects.equals(this.documentUpdateDescription, requestDocumentDirectoryEntryResponseDocumentDirectoryEntry.documentUpdateDescription) &&
        Objects.equals(this.documentUpdateResult, requestDocumentDirectoryEntryResponseDocumentDirectoryEntry.documentUpdateResult) &&
        Objects.equals(this.documentArchivingHistory, requestDocumentDirectoryEntryResponseDocumentDirectoryEntry.documentArchivingHistory) &&
        Objects.equals(this.documentArchivingAction, requestDocumentDirectoryEntryResponseDocumentDirectoryEntry.documentArchivingAction) &&
        Objects.equals(this.documentArchiveReference, requestDocumentDirectoryEntryResponseDocumentDirectoryEntry.documentArchiveReference);
  }

  @Override
  public int hashCode() {
    return Objects.hash(documentProvisioningHistory, documentProvisioningSchedule, documentProvisioningResult, documentVersionHistory, documentVersionDate, documentVerificationHistory, documentVerificationTaskDescription, documentVerificationServiceProviderReference, documentVerificationTaskResult, documentAmendmentHistory, documentAmendmentDescription, documentAmendmentResult, documentUpdateHistory, documentUpdateDescription, documentUpdateResult, documentArchivingHistory, documentArchivingAction, documentArchiveReference);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RequestDocumentDirectoryEntryResponseDocumentDirectoryEntry {\n");
    
    sb.append("    documentProvisioningHistory: ").append(toIndentedString(documentProvisioningHistory)).append("\n");
    sb.append("    documentProvisioningSchedule: ").append(toIndentedString(documentProvisioningSchedule)).append("\n");
    sb.append("    documentProvisioningResult: ").append(toIndentedString(documentProvisioningResult)).append("\n");
    sb.append("    documentVersionHistory: ").append(toIndentedString(documentVersionHistory)).append("\n");
    sb.append("    documentVersionDate: ").append(toIndentedString(documentVersionDate)).append("\n");
    sb.append("    documentVerificationHistory: ").append(toIndentedString(documentVerificationHistory)).append("\n");
    sb.append("    documentVerificationTaskDescription: ").append(toIndentedString(documentVerificationTaskDescription)).append("\n");
    sb.append("    documentVerificationServiceProviderReference: ").append(toIndentedString(documentVerificationServiceProviderReference)).append("\n");
    sb.append("    documentVerificationTaskResult: ").append(toIndentedString(documentVerificationTaskResult)).append("\n");
    sb.append("    documentAmendmentHistory: ").append(toIndentedString(documentAmendmentHistory)).append("\n");
    sb.append("    documentAmendmentDescription: ").append(toIndentedString(documentAmendmentDescription)).append("\n");
    sb.append("    documentAmendmentResult: ").append(toIndentedString(documentAmendmentResult)).append("\n");
    sb.append("    documentUpdateHistory: ").append(toIndentedString(documentUpdateHistory)).append("\n");
    sb.append("    documentUpdateDescription: ").append(toIndentedString(documentUpdateDescription)).append("\n");
    sb.append("    documentUpdateResult: ").append(toIndentedString(documentUpdateResult)).append("\n");
    sb.append("    documentArchivingHistory: ").append(toIndentedString(documentArchivingHistory)).append("\n");
    sb.append("    documentArchivingAction: ").append(toIndentedString(documentArchivingAction)).append("\n");
    sb.append("    documentArchiveReference: ").append(toIndentedString(documentArchiveReference)).append("\n");
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

