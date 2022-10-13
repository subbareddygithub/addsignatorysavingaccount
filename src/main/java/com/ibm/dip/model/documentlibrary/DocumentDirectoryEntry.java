package com.ibm.dip.model.documentlibrary;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * DocumentDirectoryEntry
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-13T05:08:30.812Z[GMT]")

public class DocumentDirectoryEntry   {
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

  @JsonProperty("DocumentProvisioningResult")
  private String documentProvisioningResult;

  @JsonProperty("DocumentVersionHistory")
  private String documentVersionHistory;

  @JsonProperty("DocumentVersion")
  private String documentVersion;

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

  @JsonProperty("DocumentMediaOrFormat")
  private String documentMediaOrFormat;

  @JsonProperty("DocumentSubjectReference")
  private Object documentSubjectReference;

  @JsonProperty("DocumentLocation")
  private String documentLocation;

  @JsonProperty("DocumentStatus")
  private String documentStatus;

  public DocumentDirectoryEntry documentName(String documentName) {
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

  public DocumentDirectoryEntry locationReference(Object locationReference) {
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

  public DocumentDirectoryEntry businessUnitOrEmployeeReference(Object businessUnitOrEmployeeReference) {
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

  public DocumentDirectoryEntry productandServiceReference(Object productandServiceReference) {
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

  public DocumentDirectoryEntry productandServiceActionReference(Object productandServiceActionReference) {
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

  public DocumentDirectoryEntry documentCreationDate(String documentCreationDate) {
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

  public DocumentDirectoryEntry documentCaptureDateOrTime(String documentCaptureDateOrTime) {
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

  public DocumentDirectoryEntry documentTypeOrDescription(String documentTypeOrDescription) {
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

  public DocumentDirectoryEntry documentContent(String documentContent) {
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

  public DocumentDirectoryEntry documentProvisioningHistory(String documentProvisioningHistory) {
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

  public DocumentDirectoryEntry documentProvisioningRequest(String documentProvisioningRequest) {
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

  public DocumentDirectoryEntry documentProvisioningSchedule(String documentProvisioningSchedule) {
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

  public DocumentDirectoryEntry documentProvisioningResult(String documentProvisioningResult) {
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

  public DocumentDirectoryEntry documentVersionHistory(String documentVersionHistory) {
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

  public DocumentDirectoryEntry documentVersion(String documentVersion) {
    this.documentVersion = documentVersion;
    return this;
  }

  /**
   * Get documentVersion
   * @return documentVersion
  */
  @ApiModelProperty(value = "")


  public String getDocumentVersion() {
    return documentVersion;
  }

  public void setDocumentVersion(String documentVersion) {
    this.documentVersion = documentVersion;
  }

  public DocumentDirectoryEntry documentVersionDate(String documentVersionDate) {
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

  public DocumentDirectoryEntry documentVerificationHistory(String documentVerificationHistory) {
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

  public DocumentDirectoryEntry documentVerificationTaskDescription(String documentVerificationTaskDescription) {
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

  public DocumentDirectoryEntry documentVerificationServiceProviderReference(Object documentVerificationServiceProviderReference) {
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

  public DocumentDirectoryEntry documentVerificationTaskResult(String documentVerificationTaskResult) {
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

  public DocumentDirectoryEntry documentAmendmentHistory(String documentAmendmentHistory) {
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

  public DocumentDirectoryEntry documentAmendmentDescription(String documentAmendmentDescription) {
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

  public DocumentDirectoryEntry documentAmendmentResult(String documentAmendmentResult) {
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

  public DocumentDirectoryEntry documentUpdateHistory(String documentUpdateHistory) {
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

  public DocumentDirectoryEntry documentUpdateDescription(String documentUpdateDescription) {
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

  public DocumentDirectoryEntry documentUpdateResult(String documentUpdateResult) {
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

  public DocumentDirectoryEntry documentArchivingHistory(String documentArchivingHistory) {
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

  public DocumentDirectoryEntry documentArchivingAction(String documentArchivingAction) {
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

  public DocumentDirectoryEntry documentArchiveReference(Object documentArchiveReference) {
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

  public DocumentDirectoryEntry documentMediaOrFormat(String documentMediaOrFormat) {
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

  public DocumentDirectoryEntry documentSubjectReference(Object documentSubjectReference) {
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

  public DocumentDirectoryEntry documentLocation(String documentLocation) {
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

  public DocumentDirectoryEntry documentStatus(String documentStatus) {
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
    DocumentDirectoryEntry documentDirectoryEntry = (DocumentDirectoryEntry) o;
    return Objects.equals(this.documentName, documentDirectoryEntry.documentName) &&
        Objects.equals(this.locationReference, documentDirectoryEntry.locationReference) &&
        Objects.equals(this.businessUnitOrEmployeeReference, documentDirectoryEntry.businessUnitOrEmployeeReference) &&
        Objects.equals(this.productandServiceReference, documentDirectoryEntry.productandServiceReference) &&
        Objects.equals(this.productandServiceActionReference, documentDirectoryEntry.productandServiceActionReference) &&
        Objects.equals(this.documentCreationDate, documentDirectoryEntry.documentCreationDate) &&
        Objects.equals(this.documentCaptureDateOrTime, documentDirectoryEntry.documentCaptureDateOrTime) &&
        Objects.equals(this.documentTypeOrDescription, documentDirectoryEntry.documentTypeOrDescription) &&
        Objects.equals(this.documentContent, documentDirectoryEntry.documentContent) &&
        Objects.equals(this.documentProvisioningHistory, documentDirectoryEntry.documentProvisioningHistory) &&
        Objects.equals(this.documentProvisioningRequest, documentDirectoryEntry.documentProvisioningRequest) &&
        Objects.equals(this.documentProvisioningSchedule, documentDirectoryEntry.documentProvisioningSchedule) &&
        Objects.equals(this.documentProvisioningResult, documentDirectoryEntry.documentProvisioningResult) &&
        Objects.equals(this.documentVersionHistory, documentDirectoryEntry.documentVersionHistory) &&
        Objects.equals(this.documentVersion, documentDirectoryEntry.documentVersion) &&
        Objects.equals(this.documentVersionDate, documentDirectoryEntry.documentVersionDate) &&
        Objects.equals(this.documentVerificationHistory, documentDirectoryEntry.documentVerificationHistory) &&
        Objects.equals(this.documentVerificationTaskDescription, documentDirectoryEntry.documentVerificationTaskDescription) &&
        Objects.equals(this.documentVerificationServiceProviderReference, documentDirectoryEntry.documentVerificationServiceProviderReference) &&
        Objects.equals(this.documentVerificationTaskResult, documentDirectoryEntry.documentVerificationTaskResult) &&
        Objects.equals(this.documentAmendmentHistory, documentDirectoryEntry.documentAmendmentHistory) &&
        Objects.equals(this.documentAmendmentDescription, documentDirectoryEntry.documentAmendmentDescription) &&
        Objects.equals(this.documentAmendmentResult, documentDirectoryEntry.documentAmendmentResult) &&
        Objects.equals(this.documentUpdateHistory, documentDirectoryEntry.documentUpdateHistory) &&
        Objects.equals(this.documentUpdateDescription, documentDirectoryEntry.documentUpdateDescription) &&
        Objects.equals(this.documentUpdateResult, documentDirectoryEntry.documentUpdateResult) &&
        Objects.equals(this.documentArchivingHistory, documentDirectoryEntry.documentArchivingHistory) &&
        Objects.equals(this.documentArchivingAction, documentDirectoryEntry.documentArchivingAction) &&
        Objects.equals(this.documentArchiveReference, documentDirectoryEntry.documentArchiveReference) &&
        Objects.equals(this.documentMediaOrFormat, documentDirectoryEntry.documentMediaOrFormat) &&
        Objects.equals(this.documentSubjectReference, documentDirectoryEntry.documentSubjectReference) &&
        Objects.equals(this.documentLocation, documentDirectoryEntry.documentLocation) &&
        Objects.equals(this.documentStatus, documentDirectoryEntry.documentStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(documentName, locationReference, businessUnitOrEmployeeReference, productandServiceReference, productandServiceActionReference, documentCreationDate, documentCaptureDateOrTime, documentTypeOrDescription, documentContent, documentProvisioningHistory, documentProvisioningRequest, documentProvisioningSchedule, documentProvisioningResult, documentVersionHistory, documentVersion, documentVersionDate, documentVerificationHistory, documentVerificationTaskDescription, documentVerificationServiceProviderReference, documentVerificationTaskResult, documentAmendmentHistory, documentAmendmentDescription, documentAmendmentResult, documentUpdateHistory, documentUpdateDescription, documentUpdateResult, documentArchivingHistory, documentArchivingAction, documentArchiveReference, documentMediaOrFormat, documentSubjectReference, documentLocation, documentStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentDirectoryEntry {\n");
    
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
    sb.append("    documentProvisioningResult: ").append(toIndentedString(documentProvisioningResult)).append("\n");
    sb.append("    documentVersionHistory: ").append(toIndentedString(documentVersionHistory)).append("\n");
    sb.append("    documentVersion: ").append(toIndentedString(documentVersion)).append("\n");
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

