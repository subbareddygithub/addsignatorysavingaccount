package com.ibm.dip.model.documentlibrary;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RegisterDocumentDirectoryEntryResponseDocumentDirectoryEntry
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-13T05:08:30.812Z[GMT]")

public class RegisterDocumentDirectoryEntryResponseDocumentDirectoryEntry   {
  @JsonProperty("DocumentProvisioningHistory")
  private String documentProvisioningHistory;

  @JsonProperty("DocumentProvisioningSchedule")
  private String documentProvisioningSchedule;

  @JsonProperty("DocumentProvisioningResult")
  private String documentProvisioningResult;

  @JsonProperty("DocumentVersionHistory")
  private String documentVersionHistory;

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

  @JsonProperty("DocumentAmendmentResult")
  private String documentAmendmentResult;

  @JsonProperty("DocumentUpdateHistory")
  private String documentUpdateHistory;

  @JsonProperty("DocumentUpdateResult")
  private String documentUpdateResult;

  @JsonProperty("DocumentArchivingHistory")
  private String documentArchivingHistory;

  @JsonProperty("DocumentArchivingAction")
  private String documentArchivingAction;

  @JsonProperty("DocumentArchiveReference")
  private Object documentArchiveReference;

  @JsonProperty("DocumentMediaOrFormat")
  private String documentMediaOrFormat;

  @JsonProperty("DocumentSubjectReference")
  private Object documentSubjectReference;

  @JsonProperty("DocumentLocation")
  private String documentLocation;

  @JsonProperty("DocumentStatus")
  private String documentStatus;

  public RegisterDocumentDirectoryEntryResponseDocumentDirectoryEntry documentProvisioningHistory(String documentProvisioningHistory) {
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

  public RegisterDocumentDirectoryEntryResponseDocumentDirectoryEntry documentProvisioningSchedule(String documentProvisioningSchedule) {
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

  public RegisterDocumentDirectoryEntryResponseDocumentDirectoryEntry documentProvisioningResult(String documentProvisioningResult) {
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

  public RegisterDocumentDirectoryEntryResponseDocumentDirectoryEntry documentVersionHistory(String documentVersionHistory) {
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

  public RegisterDocumentDirectoryEntryResponseDocumentDirectoryEntry documentVerificationHistory(String documentVerificationHistory) {
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

  public RegisterDocumentDirectoryEntryResponseDocumentDirectoryEntry documentVerificationTaskDescription(String documentVerificationTaskDescription) {
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

  public RegisterDocumentDirectoryEntryResponseDocumentDirectoryEntry documentVerificationServiceProviderReference(Object documentVerificationServiceProviderReference) {
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

  public RegisterDocumentDirectoryEntryResponseDocumentDirectoryEntry documentVerificationTaskResult(String documentVerificationTaskResult) {
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

  public RegisterDocumentDirectoryEntryResponseDocumentDirectoryEntry documentAmendmentHistory(String documentAmendmentHistory) {
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

  public RegisterDocumentDirectoryEntryResponseDocumentDirectoryEntry documentAmendmentResult(String documentAmendmentResult) {
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

  public RegisterDocumentDirectoryEntryResponseDocumentDirectoryEntry documentUpdateHistory(String documentUpdateHistory) {
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

  public RegisterDocumentDirectoryEntryResponseDocumentDirectoryEntry documentUpdateResult(String documentUpdateResult) {
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

  public RegisterDocumentDirectoryEntryResponseDocumentDirectoryEntry documentArchivingHistory(String documentArchivingHistory) {
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

  public RegisterDocumentDirectoryEntryResponseDocumentDirectoryEntry documentArchivingAction(String documentArchivingAction) {
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

  public RegisterDocumentDirectoryEntryResponseDocumentDirectoryEntry documentArchiveReference(Object documentArchiveReference) {
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

  public RegisterDocumentDirectoryEntryResponseDocumentDirectoryEntry documentMediaOrFormat(String documentMediaOrFormat) {
    this.documentMediaOrFormat = documentMediaOrFormat;
    return this;
  }

  /**
   * Get documentMediaOrFormat
   * @return documentMediaOrFormat
  */
  @ApiModelProperty(value = "")


  public String getDocumentMediaOrFormat() {
    return documentMediaOrFormat;
  }

  public void setDocumentMediaOrFormat(String documentMediaOrFormat) {
    this.documentMediaOrFormat = documentMediaOrFormat;
  }

  public RegisterDocumentDirectoryEntryResponseDocumentDirectoryEntry documentSubjectReference(Object documentSubjectReference) {
    this.documentSubjectReference = documentSubjectReference;
    return this;
  }

  /**
   * Get documentSubjectReference
   * @return documentSubjectReference
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getDocumentSubjectReference() {
    return documentSubjectReference;
  }

  public void setDocumentSubjectReference(Object documentSubjectReference) {
    this.documentSubjectReference = documentSubjectReference;
  }

  public RegisterDocumentDirectoryEntryResponseDocumentDirectoryEntry documentLocation(String documentLocation) {
    this.documentLocation = documentLocation;
    return this;
  }

  /**
   * Get documentLocation
   * @return documentLocation
  */
  @ApiModelProperty(value = "")


  public String getDocumentLocation() {
    return documentLocation;
  }

  public void setDocumentLocation(String documentLocation) {
    this.documentLocation = documentLocation;
  }

  public RegisterDocumentDirectoryEntryResponseDocumentDirectoryEntry documentStatus(String documentStatus) {
    this.documentStatus = documentStatus;
    return this;
  }

  /**
   * Get documentStatus
   * @return documentStatus
  */
  @ApiModelProperty(value = "")


  public String getDocumentStatus() {
    return documentStatus;
  }

  public void setDocumentStatus(String documentStatus) {
    this.documentStatus = documentStatus;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RegisterDocumentDirectoryEntryResponseDocumentDirectoryEntry registerDocumentDirectoryEntryResponseDocumentDirectoryEntry = (RegisterDocumentDirectoryEntryResponseDocumentDirectoryEntry) o;
    return Objects.equals(this.documentProvisioningHistory, registerDocumentDirectoryEntryResponseDocumentDirectoryEntry.documentProvisioningHistory) &&
        Objects.equals(this.documentProvisioningSchedule, registerDocumentDirectoryEntryResponseDocumentDirectoryEntry.documentProvisioningSchedule) &&
        Objects.equals(this.documentProvisioningResult, registerDocumentDirectoryEntryResponseDocumentDirectoryEntry.documentProvisioningResult) &&
        Objects.equals(this.documentVersionHistory, registerDocumentDirectoryEntryResponseDocumentDirectoryEntry.documentVersionHistory) &&
        Objects.equals(this.documentVerificationHistory, registerDocumentDirectoryEntryResponseDocumentDirectoryEntry.documentVerificationHistory) &&
        Objects.equals(this.documentVerificationTaskDescription, registerDocumentDirectoryEntryResponseDocumentDirectoryEntry.documentVerificationTaskDescription) &&
        Objects.equals(this.documentVerificationServiceProviderReference, registerDocumentDirectoryEntryResponseDocumentDirectoryEntry.documentVerificationServiceProviderReference) &&
        Objects.equals(this.documentVerificationTaskResult, registerDocumentDirectoryEntryResponseDocumentDirectoryEntry.documentVerificationTaskResult) &&
        Objects.equals(this.documentAmendmentHistory, registerDocumentDirectoryEntryResponseDocumentDirectoryEntry.documentAmendmentHistory) &&
        Objects.equals(this.documentAmendmentResult, registerDocumentDirectoryEntryResponseDocumentDirectoryEntry.documentAmendmentResult) &&
        Objects.equals(this.documentUpdateHistory, registerDocumentDirectoryEntryResponseDocumentDirectoryEntry.documentUpdateHistory) &&
        Objects.equals(this.documentUpdateResult, registerDocumentDirectoryEntryResponseDocumentDirectoryEntry.documentUpdateResult) &&
        Objects.equals(this.documentArchivingHistory, registerDocumentDirectoryEntryResponseDocumentDirectoryEntry.documentArchivingHistory) &&
        Objects.equals(this.documentArchivingAction, registerDocumentDirectoryEntryResponseDocumentDirectoryEntry.documentArchivingAction) &&
        Objects.equals(this.documentArchiveReference, registerDocumentDirectoryEntryResponseDocumentDirectoryEntry.documentArchiveReference) &&
        Objects.equals(this.documentMediaOrFormat, registerDocumentDirectoryEntryResponseDocumentDirectoryEntry.documentMediaOrFormat) &&
        Objects.equals(this.documentSubjectReference, registerDocumentDirectoryEntryResponseDocumentDirectoryEntry.documentSubjectReference) &&
        Objects.equals(this.documentLocation, registerDocumentDirectoryEntryResponseDocumentDirectoryEntry.documentLocation) &&
        Objects.equals(this.documentStatus, registerDocumentDirectoryEntryResponseDocumentDirectoryEntry.documentStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(documentProvisioningHistory, documentProvisioningSchedule, documentProvisioningResult, documentVersionHistory, documentVerificationHistory, documentVerificationTaskDescription, documentVerificationServiceProviderReference, documentVerificationTaskResult, documentAmendmentHistory, documentAmendmentResult, documentUpdateHistory, documentUpdateResult, documentArchivingHistory, documentArchivingAction, documentArchiveReference, documentMediaOrFormat, documentSubjectReference, documentLocation, documentStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RegisterDocumentDirectoryEntryResponseDocumentDirectoryEntry {\n");
    
    sb.append("    documentProvisioningHistory: ").append(toIndentedString(documentProvisioningHistory)).append("\n");
    sb.append("    documentProvisioningSchedule: ").append(toIndentedString(documentProvisioningSchedule)).append("\n");
    sb.append("    documentProvisioningResult: ").append(toIndentedString(documentProvisioningResult)).append("\n");
    sb.append("    documentVersionHistory: ").append(toIndentedString(documentVersionHistory)).append("\n");
    sb.append("    documentVerificationHistory: ").append(toIndentedString(documentVerificationHistory)).append("\n");
    sb.append("    documentVerificationTaskDescription: ").append(toIndentedString(documentVerificationTaskDescription)).append("\n");
    sb.append("    documentVerificationServiceProviderReference: ").append(toIndentedString(documentVerificationServiceProviderReference)).append("\n");
    sb.append("    documentVerificationTaskResult: ").append(toIndentedString(documentVerificationTaskResult)).append("\n");
    sb.append("    documentAmendmentHistory: ").append(toIndentedString(documentAmendmentHistory)).append("\n");
    sb.append("    documentAmendmentResult: ").append(toIndentedString(documentAmendmentResult)).append("\n");
    sb.append("    documentUpdateHistory: ").append(toIndentedString(documentUpdateHistory)).append("\n");
    sb.append("    documentUpdateResult: ").append(toIndentedString(documentUpdateResult)).append("\n");
    sb.append("    documentArchivingHistory: ").append(toIndentedString(documentArchivingHistory)).append("\n");
    sb.append("    documentArchivingAction: ").append(toIndentedString(documentArchivingAction)).append("\n");
    sb.append("    documentArchiveReference: ").append(toIndentedString(documentArchiveReference)).append("\n");
    sb.append("    documentMediaOrFormat: ").append(toIndentedString(documentMediaOrFormat)).append("\n");
    sb.append("    documentSubjectReference: ").append(toIndentedString(documentSubjectReference)).append("\n");
    sb.append("    documentLocation: ").append(toIndentedString(documentLocation)).append("\n");
    sb.append("    documentStatus: ").append(toIndentedString(documentStatus)).append("\n");
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

