package com.ibm.dip.model.documentlibrary;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RegisterDocumentDirectoryEntryRequestDocumentDirectoryEntry
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-13T05:08:30.812Z[GMT]")

public class RegisterDocumentDirectoryEntryRequestDocumentDirectoryEntry   {
  @JsonProperty("DocumentName")
  private String documentName;

  @JsonProperty("LocationReference")
  private Object locationReference;

  @JsonProperty("BusinessUnitOrEmployeeReference")
  private Object businessUnitOrEmployeeReference;

  @JsonProperty("ProductandServiceReference")
  private Object productandServiceReference;

  @JsonProperty("ProductandServiceActionReference")
  private Object productandServiceActionReference;

  @JsonProperty("DocumentCreationDate")
  private String documentCreationDate;

  @JsonProperty("DocumentCaptureDateOrTime")
  private String documentCaptureDateOrTime;

  @JsonProperty("DocumentTypeOrDescription")
  private String documentTypeOrDescription;

  @JsonProperty("DocumentContent")
  private String documentContent;

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

  @JsonProperty("DocumentSubjectReference")
  private Object documentSubjectReference;

  @JsonProperty("DocumentLocation")
  private String documentLocation;

  @JsonProperty("DocumentStatus")
  private String documentStatus;

  public RegisterDocumentDirectoryEntryRequestDocumentDirectoryEntry documentName(String documentName) {
    this.documentName = documentName;
    return this;
  }

  /**
   * Get documentName
   * @return documentName
  */
  @ApiModelProperty(value = "")


  public String getDocumentName() {
    return documentName;
  }

  public void setDocumentName(String documentName) {
    this.documentName = documentName;
  }

  public RegisterDocumentDirectoryEntryRequestDocumentDirectoryEntry locationReference(Object locationReference) {
    this.locationReference = locationReference;
    return this;
  }

  /**
   * Get locationReference
   * @return locationReference
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getLocationReference() {
    return locationReference;
  }

  public void setLocationReference(Object locationReference) {
    this.locationReference = locationReference;
  }

  public RegisterDocumentDirectoryEntryRequestDocumentDirectoryEntry businessUnitOrEmployeeReference(Object businessUnitOrEmployeeReference) {
    this.businessUnitOrEmployeeReference = businessUnitOrEmployeeReference;
    return this;
  }

  /**
   * Get businessUnitOrEmployeeReference
   * @return businessUnitOrEmployeeReference
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getBusinessUnitOrEmployeeReference() {
    return businessUnitOrEmployeeReference;
  }

  public void setBusinessUnitOrEmployeeReference(Object businessUnitOrEmployeeReference) {
    this.businessUnitOrEmployeeReference = businessUnitOrEmployeeReference;
  }

  public RegisterDocumentDirectoryEntryRequestDocumentDirectoryEntry productandServiceReference(Object productandServiceReference) {
    this.productandServiceReference = productandServiceReference;
    return this;
  }

  /**
   * Get productandServiceReference
   * @return productandServiceReference
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getProductandServiceReference() {
    return productandServiceReference;
  }

  public void setProductandServiceReference(Object productandServiceReference) {
    this.productandServiceReference = productandServiceReference;
  }

  public RegisterDocumentDirectoryEntryRequestDocumentDirectoryEntry productandServiceActionReference(Object productandServiceActionReference) {
    this.productandServiceActionReference = productandServiceActionReference;
    return this;
  }

  /**
   * Get productandServiceActionReference
   * @return productandServiceActionReference
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getProductandServiceActionReference() {
    return productandServiceActionReference;
  }

  public void setProductandServiceActionReference(Object productandServiceActionReference) {
    this.productandServiceActionReference = productandServiceActionReference;
  }

  public RegisterDocumentDirectoryEntryRequestDocumentDirectoryEntry documentCreationDate(String documentCreationDate) {
    this.documentCreationDate = documentCreationDate;
    return this;
  }

  /**
   * Get documentCreationDate
   * @return documentCreationDate
  */
  @ApiModelProperty(value = "")


  public String getDocumentCreationDate() {
    return documentCreationDate;
  }

  public void setDocumentCreationDate(String documentCreationDate) {
    this.documentCreationDate = documentCreationDate;
  }

  public RegisterDocumentDirectoryEntryRequestDocumentDirectoryEntry documentCaptureDateOrTime(String documentCaptureDateOrTime) {
    this.documentCaptureDateOrTime = documentCaptureDateOrTime;
    return this;
  }

  /**
   * Get documentCaptureDateOrTime
   * @return documentCaptureDateOrTime
  */
  @ApiModelProperty(value = "")


  public String getDocumentCaptureDateOrTime() {
    return documentCaptureDateOrTime;
  }

  public void setDocumentCaptureDateOrTime(String documentCaptureDateOrTime) {
    this.documentCaptureDateOrTime = documentCaptureDateOrTime;
  }

  public RegisterDocumentDirectoryEntryRequestDocumentDirectoryEntry documentTypeOrDescription(String documentTypeOrDescription) {
    this.documentTypeOrDescription = documentTypeOrDescription;
    return this;
  }

  /**
   * Get documentTypeOrDescription
   * @return documentTypeOrDescription
  */
  @ApiModelProperty(value = "")


  public String getDocumentTypeOrDescription() {
    return documentTypeOrDescription;
  }

  public void setDocumentTypeOrDescription(String documentTypeOrDescription) {
    this.documentTypeOrDescription = documentTypeOrDescription;
  }

  public RegisterDocumentDirectoryEntryRequestDocumentDirectoryEntry documentContent(String documentContent) {
    this.documentContent = documentContent;
    return this;
  }

  /**
   * Get documentContent
   * @return documentContent
  */
  @ApiModelProperty(value = "")


  public String getDocumentContent() {
    return documentContent;
  }

  public void setDocumentContent(String documentContent) {
    this.documentContent = documentContent;
  }

  public RegisterDocumentDirectoryEntryRequestDocumentDirectoryEntry documentProvisioningHistory(String documentProvisioningHistory) {
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

  public RegisterDocumentDirectoryEntryRequestDocumentDirectoryEntry documentProvisioningRequest(String documentProvisioningRequest) {
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

  public RegisterDocumentDirectoryEntryRequestDocumentDirectoryEntry documentProvisioningSchedule(String documentProvisioningSchedule) {
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

  public RegisterDocumentDirectoryEntryRequestDocumentDirectoryEntry documentVersionHistory(String documentVersionHistory) {
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

  public RegisterDocumentDirectoryEntryRequestDocumentDirectoryEntry documentVersionDate(String documentVersionDate) {
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

  public RegisterDocumentDirectoryEntryRequestDocumentDirectoryEntry documentVerificationHistory(String documentVerificationHistory) {
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

  public RegisterDocumentDirectoryEntryRequestDocumentDirectoryEntry documentAmendmentHistory(String documentAmendmentHistory) {
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

  public RegisterDocumentDirectoryEntryRequestDocumentDirectoryEntry documentAmendmentDescription(String documentAmendmentDescription) {
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

  public RegisterDocumentDirectoryEntryRequestDocumentDirectoryEntry documentUpdateHistory(String documentUpdateHistory) {
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

  public RegisterDocumentDirectoryEntryRequestDocumentDirectoryEntry documentUpdateDescription(String documentUpdateDescription) {
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

  public RegisterDocumentDirectoryEntryRequestDocumentDirectoryEntry documentArchivingHistory(String documentArchivingHistory) {
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

  public RegisterDocumentDirectoryEntryRequestDocumentDirectoryEntry documentArchivingAction(String documentArchivingAction) {
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

  public RegisterDocumentDirectoryEntryRequestDocumentDirectoryEntry documentSubjectReference(Object documentSubjectReference) {
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

  public RegisterDocumentDirectoryEntryRequestDocumentDirectoryEntry documentLocation(String documentLocation) {
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

  public RegisterDocumentDirectoryEntryRequestDocumentDirectoryEntry documentStatus(String documentStatus) {
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
    RegisterDocumentDirectoryEntryRequestDocumentDirectoryEntry registerDocumentDirectoryEntryRequestDocumentDirectoryEntry = (RegisterDocumentDirectoryEntryRequestDocumentDirectoryEntry) o;
    return Objects.equals(this.documentName, registerDocumentDirectoryEntryRequestDocumentDirectoryEntry.documentName) &&
        Objects.equals(this.locationReference, registerDocumentDirectoryEntryRequestDocumentDirectoryEntry.locationReference) &&
        Objects.equals(this.businessUnitOrEmployeeReference, registerDocumentDirectoryEntryRequestDocumentDirectoryEntry.businessUnitOrEmployeeReference) &&
        Objects.equals(this.productandServiceReference, registerDocumentDirectoryEntryRequestDocumentDirectoryEntry.productandServiceReference) &&
        Objects.equals(this.productandServiceActionReference, registerDocumentDirectoryEntryRequestDocumentDirectoryEntry.productandServiceActionReference) &&
        Objects.equals(this.documentCreationDate, registerDocumentDirectoryEntryRequestDocumentDirectoryEntry.documentCreationDate) &&
        Objects.equals(this.documentCaptureDateOrTime, registerDocumentDirectoryEntryRequestDocumentDirectoryEntry.documentCaptureDateOrTime) &&
        Objects.equals(this.documentTypeOrDescription, registerDocumentDirectoryEntryRequestDocumentDirectoryEntry.documentTypeOrDescription) &&
        Objects.equals(this.documentContent, registerDocumentDirectoryEntryRequestDocumentDirectoryEntry.documentContent) &&
        Objects.equals(this.documentProvisioningHistory, registerDocumentDirectoryEntryRequestDocumentDirectoryEntry.documentProvisioningHistory) &&
        Objects.equals(this.documentProvisioningRequest, registerDocumentDirectoryEntryRequestDocumentDirectoryEntry.documentProvisioningRequest) &&
        Objects.equals(this.documentProvisioningSchedule, registerDocumentDirectoryEntryRequestDocumentDirectoryEntry.documentProvisioningSchedule) &&
        Objects.equals(this.documentVersionHistory, registerDocumentDirectoryEntryRequestDocumentDirectoryEntry.documentVersionHistory) &&
        Objects.equals(this.documentVersionDate, registerDocumentDirectoryEntryRequestDocumentDirectoryEntry.documentVersionDate) &&
        Objects.equals(this.documentVerificationHistory, registerDocumentDirectoryEntryRequestDocumentDirectoryEntry.documentVerificationHistory) &&
        Objects.equals(this.documentAmendmentHistory, registerDocumentDirectoryEntryRequestDocumentDirectoryEntry.documentAmendmentHistory) &&
        Objects.equals(this.documentAmendmentDescription, registerDocumentDirectoryEntryRequestDocumentDirectoryEntry.documentAmendmentDescription) &&
        Objects.equals(this.documentUpdateHistory, registerDocumentDirectoryEntryRequestDocumentDirectoryEntry.documentUpdateHistory) &&
        Objects.equals(this.documentUpdateDescription, registerDocumentDirectoryEntryRequestDocumentDirectoryEntry.documentUpdateDescription) &&
        Objects.equals(this.documentArchivingHistory, registerDocumentDirectoryEntryRequestDocumentDirectoryEntry.documentArchivingHistory) &&
        Objects.equals(this.documentArchivingAction, registerDocumentDirectoryEntryRequestDocumentDirectoryEntry.documentArchivingAction) &&
        Objects.equals(this.documentSubjectReference, registerDocumentDirectoryEntryRequestDocumentDirectoryEntry.documentSubjectReference) &&
        Objects.equals(this.documentLocation, registerDocumentDirectoryEntryRequestDocumentDirectoryEntry.documentLocation) &&
        Objects.equals(this.documentStatus, registerDocumentDirectoryEntryRequestDocumentDirectoryEntry.documentStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(documentName, locationReference, businessUnitOrEmployeeReference, productandServiceReference, productandServiceActionReference, documentCreationDate, documentCaptureDateOrTime, documentTypeOrDescription, documentContent, documentProvisioningHistory, documentProvisioningRequest, documentProvisioningSchedule, documentVersionHistory, documentVersionDate, documentVerificationHistory, documentAmendmentHistory, documentAmendmentDescription, documentUpdateHistory, documentUpdateDescription, documentArchivingHistory, documentArchivingAction, documentSubjectReference, documentLocation, documentStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RegisterDocumentDirectoryEntryRequestDocumentDirectoryEntry {\n");
    
    sb.append("    documentName: ").append(toIndentedString(documentName)).append("\n");
    sb.append("    locationReference: ").append(toIndentedString(locationReference)).append("\n");
    sb.append("    businessUnitOrEmployeeReference: ").append(toIndentedString(businessUnitOrEmployeeReference)).append("\n");
    sb.append("    productandServiceReference: ").append(toIndentedString(productandServiceReference)).append("\n");
    sb.append("    productandServiceActionReference: ").append(toIndentedString(productandServiceActionReference)).append("\n");
    sb.append("    documentCreationDate: ").append(toIndentedString(documentCreationDate)).append("\n");
    sb.append("    documentCaptureDateOrTime: ").append(toIndentedString(documentCaptureDateOrTime)).append("\n");
    sb.append("    documentTypeOrDescription: ").append(toIndentedString(documentTypeOrDescription)).append("\n");
    sb.append("    documentContent: ").append(toIndentedString(documentContent)).append("\n");
    sb.append("    documentProvisioningHistory: ").append(toIndentedString(documentProvisioningHistory)).append("\n");
    sb.append("    documentProvisioningRequest: ").append(toIndentedString(documentProvisioningRequest)).append("\n");
    sb.append("    documentProvisioningSchedule: ").append(toIndentedString(documentProvisioningSchedule)).append("\n");
    sb.append("    documentVersionHistory: ").append(toIndentedString(documentVersionHistory)).append("\n");
    sb.append("    documentVersionDate: ").append(toIndentedString(documentVersionDate)).append("\n");
    sb.append("    documentVerificationHistory: ").append(toIndentedString(documentVerificationHistory)).append("\n");
    sb.append("    documentAmendmentHistory: ").append(toIndentedString(documentAmendmentHistory)).append("\n");
    sb.append("    documentAmendmentDescription: ").append(toIndentedString(documentAmendmentDescription)).append("\n");
    sb.append("    documentUpdateHistory: ").append(toIndentedString(documentUpdateHistory)).append("\n");
    sb.append("    documentUpdateDescription: ").append(toIndentedString(documentUpdateDescription)).append("\n");
    sb.append("    documentArchivingHistory: ").append(toIndentedString(documentArchivingHistory)).append("\n");
    sb.append("    documentArchivingAction: ").append(toIndentedString(documentArchivingAction)).append("\n");
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

