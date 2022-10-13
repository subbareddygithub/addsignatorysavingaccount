package com.ibm.dip.model.documentlibrary;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * UpdateDocumentDirectoryEntryRequestDocumentDirectoryEntry
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-13T05:08:30.812Z[GMT]")

public class UpdateDocumentDirectoryEntryRequestDocumentDirectoryEntry   {
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

  @JsonProperty("DocumentSubjectReference")
  private Object documentSubjectReference;

  @JsonProperty("DocumentLocation")
  private String documentLocation;

  @JsonProperty("DocumentStatus")
  private String documentStatus;

  public UpdateDocumentDirectoryEntryRequestDocumentDirectoryEntry documentName(String documentName) {
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

  public UpdateDocumentDirectoryEntryRequestDocumentDirectoryEntry locationReference(Object locationReference) {
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

  public UpdateDocumentDirectoryEntryRequestDocumentDirectoryEntry businessUnitOrEmployeeReference(Object businessUnitOrEmployeeReference) {
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

  public UpdateDocumentDirectoryEntryRequestDocumentDirectoryEntry productandServiceReference(Object productandServiceReference) {
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

  public UpdateDocumentDirectoryEntryRequestDocumentDirectoryEntry productandServiceActionReference(Object productandServiceActionReference) {
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

  public UpdateDocumentDirectoryEntryRequestDocumentDirectoryEntry documentCreationDate(String documentCreationDate) {
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

  public UpdateDocumentDirectoryEntryRequestDocumentDirectoryEntry documentCaptureDateOrTime(String documentCaptureDateOrTime) {
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

  public UpdateDocumentDirectoryEntryRequestDocumentDirectoryEntry documentTypeOrDescription(String documentTypeOrDescription) {
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

  public UpdateDocumentDirectoryEntryRequestDocumentDirectoryEntry documentContent(String documentContent) {
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

  public UpdateDocumentDirectoryEntryRequestDocumentDirectoryEntry documentProvisioningHistory(String documentProvisioningHistory) {
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

  public UpdateDocumentDirectoryEntryRequestDocumentDirectoryEntry documentProvisioningRequest(String documentProvisioningRequest) {
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

  public UpdateDocumentDirectoryEntryRequestDocumentDirectoryEntry documentVersionHistory(String documentVersionHistory) {
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

  public UpdateDocumentDirectoryEntryRequestDocumentDirectoryEntry documentVersionDate(String documentVersionDate) {
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

  public UpdateDocumentDirectoryEntryRequestDocumentDirectoryEntry documentVerificationHistory(String documentVerificationHistory) {
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

  public UpdateDocumentDirectoryEntryRequestDocumentDirectoryEntry documentVerificationTaskDescription(String documentVerificationTaskDescription) {
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

  public UpdateDocumentDirectoryEntryRequestDocumentDirectoryEntry documentVerificationServiceProviderReference(Object documentVerificationServiceProviderReference) {
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

  public UpdateDocumentDirectoryEntryRequestDocumentDirectoryEntry documentAmendmentHistory(String documentAmendmentHistory) {
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

  public UpdateDocumentDirectoryEntryRequestDocumentDirectoryEntry documentAmendmentDescription(String documentAmendmentDescription) {
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

  public UpdateDocumentDirectoryEntryRequestDocumentDirectoryEntry documentUpdateHistory(String documentUpdateHistory) {
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

  public UpdateDocumentDirectoryEntryRequestDocumentDirectoryEntry documentUpdateDescription(String documentUpdateDescription) {
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

  public UpdateDocumentDirectoryEntryRequestDocumentDirectoryEntry documentArchivingHistory(String documentArchivingHistory) {
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

  public UpdateDocumentDirectoryEntryRequestDocumentDirectoryEntry documentArchivingAction(String documentArchivingAction) {
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

  public UpdateDocumentDirectoryEntryRequestDocumentDirectoryEntry documentSubjectReference(Object documentSubjectReference) {
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

  public UpdateDocumentDirectoryEntryRequestDocumentDirectoryEntry documentLocation(String documentLocation) {
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

  public UpdateDocumentDirectoryEntryRequestDocumentDirectoryEntry documentStatus(String documentStatus) {
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
    UpdateDocumentDirectoryEntryRequestDocumentDirectoryEntry updateDocumentDirectoryEntryRequestDocumentDirectoryEntry = (UpdateDocumentDirectoryEntryRequestDocumentDirectoryEntry) o;
    return Objects.equals(this.documentName, updateDocumentDirectoryEntryRequestDocumentDirectoryEntry.documentName) &&
        Objects.equals(this.locationReference, updateDocumentDirectoryEntryRequestDocumentDirectoryEntry.locationReference) &&
        Objects.equals(this.businessUnitOrEmployeeReference, updateDocumentDirectoryEntryRequestDocumentDirectoryEntry.businessUnitOrEmployeeReference) &&
        Objects.equals(this.productandServiceReference, updateDocumentDirectoryEntryRequestDocumentDirectoryEntry.productandServiceReference) &&
        Objects.equals(this.productandServiceActionReference, updateDocumentDirectoryEntryRequestDocumentDirectoryEntry.productandServiceActionReference) &&
        Objects.equals(this.documentCreationDate, updateDocumentDirectoryEntryRequestDocumentDirectoryEntry.documentCreationDate) &&
        Objects.equals(this.documentCaptureDateOrTime, updateDocumentDirectoryEntryRequestDocumentDirectoryEntry.documentCaptureDateOrTime) &&
        Objects.equals(this.documentTypeOrDescription, updateDocumentDirectoryEntryRequestDocumentDirectoryEntry.documentTypeOrDescription) &&
        Objects.equals(this.documentContent, updateDocumentDirectoryEntryRequestDocumentDirectoryEntry.documentContent) &&
        Objects.equals(this.documentProvisioningHistory, updateDocumentDirectoryEntryRequestDocumentDirectoryEntry.documentProvisioningHistory) &&
        Objects.equals(this.documentProvisioningRequest, updateDocumentDirectoryEntryRequestDocumentDirectoryEntry.documentProvisioningRequest) &&
        Objects.equals(this.documentVersionHistory, updateDocumentDirectoryEntryRequestDocumentDirectoryEntry.documentVersionHistory) &&
        Objects.equals(this.documentVersionDate, updateDocumentDirectoryEntryRequestDocumentDirectoryEntry.documentVersionDate) &&
        Objects.equals(this.documentVerificationHistory, updateDocumentDirectoryEntryRequestDocumentDirectoryEntry.documentVerificationHistory) &&
        Objects.equals(this.documentVerificationTaskDescription, updateDocumentDirectoryEntryRequestDocumentDirectoryEntry.documentVerificationTaskDescription) &&
        Objects.equals(this.documentVerificationServiceProviderReference, updateDocumentDirectoryEntryRequestDocumentDirectoryEntry.documentVerificationServiceProviderReference) &&
        Objects.equals(this.documentAmendmentHistory, updateDocumentDirectoryEntryRequestDocumentDirectoryEntry.documentAmendmentHistory) &&
        Objects.equals(this.documentAmendmentDescription, updateDocumentDirectoryEntryRequestDocumentDirectoryEntry.documentAmendmentDescription) &&
        Objects.equals(this.documentUpdateHistory, updateDocumentDirectoryEntryRequestDocumentDirectoryEntry.documentUpdateHistory) &&
        Objects.equals(this.documentUpdateDescription, updateDocumentDirectoryEntryRequestDocumentDirectoryEntry.documentUpdateDescription) &&
        Objects.equals(this.documentArchivingHistory, updateDocumentDirectoryEntryRequestDocumentDirectoryEntry.documentArchivingHistory) &&
        Objects.equals(this.documentArchivingAction, updateDocumentDirectoryEntryRequestDocumentDirectoryEntry.documentArchivingAction) &&
        Objects.equals(this.documentSubjectReference, updateDocumentDirectoryEntryRequestDocumentDirectoryEntry.documentSubjectReference) &&
        Objects.equals(this.documentLocation, updateDocumentDirectoryEntryRequestDocumentDirectoryEntry.documentLocation) &&
        Objects.equals(this.documentStatus, updateDocumentDirectoryEntryRequestDocumentDirectoryEntry.documentStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(documentName, locationReference, businessUnitOrEmployeeReference, productandServiceReference, productandServiceActionReference, documentCreationDate, documentCaptureDateOrTime, documentTypeOrDescription, documentContent, documentProvisioningHistory, documentProvisioningRequest, documentVersionHistory, documentVersionDate, documentVerificationHistory, documentVerificationTaskDescription, documentVerificationServiceProviderReference, documentAmendmentHistory, documentAmendmentDescription, documentUpdateHistory, documentUpdateDescription, documentArchivingHistory, documentArchivingAction, documentSubjectReference, documentLocation, documentStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateDocumentDirectoryEntryRequestDocumentDirectoryEntry {\n");
    
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

