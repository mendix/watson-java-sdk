/*
 * Copyright 2018 IBM Corp. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */
package com.ibm.watson.developer_cloud.compare_comply.v1.model;

import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.ibm.watson.developer_cloud.service.model.GenericModel;

/**
 * The comparison of the two submitted documents.
 */
public class CompareReturn extends GenericModel {

  private List<Document> documents;
  @SerializedName("aligned_elements")
  private List<AlignedElement> alignedElements;
  @SerializedName("unaligned_elements")
  private List<UnalignedElement> unalignedElements;
  @SerializedName("model_id")
  private String modelId;
  @SerializedName("model_version")
  private String modelVersion;

  /**
   * Gets the documents.
   *
   * Information about the documents being compared.
   *
   * @return the documents
   */
  public List<Document> getDocuments() {
    return documents;
  }

  /**
   * Gets the alignedElements.
   *
   * A list of pairs of elements that semantically align between the compared documents.
   *
   * @return the alignedElements
   */
  public List<AlignedElement> getAlignedElements() {
    return alignedElements;
  }

  /**
   * Gets the unalignedElements.
   *
   * A list of elements that do not semantically align between the compared documents.
   *
   * @return the unalignedElements
   */
  public List<UnalignedElement> getUnalignedElements() {
    return unalignedElements;
  }

  /**
   * Gets the modelId.
   *
   * The analysis model used to classify the input document. For the `/v1/element_classification` method, the only valid
   * value is `contracts`.
   *
   * @return the modelId
   */
  public String getModelId() {
    return modelId;
  }

  /**
   * Gets the modelVersion.
   *
   * The version of the analysis model identified by the value of the `model_id` key.
   *
   * @return the modelVersion
   */
  public String getModelVersion() {
    return modelVersion;
  }
}
