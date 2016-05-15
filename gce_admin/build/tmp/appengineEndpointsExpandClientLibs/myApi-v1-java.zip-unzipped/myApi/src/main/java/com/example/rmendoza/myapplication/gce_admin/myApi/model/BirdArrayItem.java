/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/google/apis-client-generator/
 * (build: 2016-05-04 15:59:39 UTC)
 * on 2016-05-15 at 23:33:05 UTC 
 * Modify at your own risk.
 */

package com.example.rmendoza.myapplication.gce_admin.myApi.model;

/**
 * Model definition for BirdArrayItem.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the myApi. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class BirdArrayItem extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String commonName;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String family;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String fullName;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String imageFileName;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String imageID;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key("iucn_Category2014")
  private java.lang.String iucnCategory2014;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key("na_Occurrence")
  private java.lang.String naOccurrence;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String order;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String scientificName;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String sisrecID;

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getCommonName() {
    return commonName;
  }

  /**
   * @param commonName commonName or {@code null} for none
   */
  public BirdArrayItem setCommonName(java.lang.String commonName) {
    this.commonName = commonName;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * @param description description or {@code null} for none
   */
  public BirdArrayItem setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getFamily() {
    return family;
  }

  /**
   * @param family family or {@code null} for none
   */
  public BirdArrayItem setFamily(java.lang.String family) {
    this.family = family;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getFullName() {
    return fullName;
  }

  /**
   * @param fullName fullName or {@code null} for none
   */
  public BirdArrayItem setFullName(java.lang.String fullName) {
    this.fullName = fullName;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getImageFileName() {
    return imageFileName;
  }

  /**
   * @param imageFileName imageFileName or {@code null} for none
   */
  public BirdArrayItem setImageFileName(java.lang.String imageFileName) {
    this.imageFileName = imageFileName;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getImageID() {
    return imageID;
  }

  /**
   * @param imageID imageID or {@code null} for none
   */
  public BirdArrayItem setImageID(java.lang.String imageID) {
    this.imageID = imageID;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getIucnCategory2014() {
    return iucnCategory2014;
  }

  /**
   * @param iucnCategory2014 iucnCategory2014 or {@code null} for none
   */
  public BirdArrayItem setIucnCategory2014(java.lang.String iucnCategory2014) {
    this.iucnCategory2014 = iucnCategory2014;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getNaOccurrence() {
    return naOccurrence;
  }

  /**
   * @param naOccurrence naOccurrence or {@code null} for none
   */
  public BirdArrayItem setNaOccurrence(java.lang.String naOccurrence) {
    this.naOccurrence = naOccurrence;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getOrder() {
    return order;
  }

  /**
   * @param order order or {@code null} for none
   */
  public BirdArrayItem setOrder(java.lang.String order) {
    this.order = order;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getScientificName() {
    return scientificName;
  }

  /**
   * @param scientificName scientificName or {@code null} for none
   */
  public BirdArrayItem setScientificName(java.lang.String scientificName) {
    this.scientificName = scientificName;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getSisrecID() {
    return sisrecID;
  }

  /**
   * @param sisrecID sisrecID or {@code null} for none
   */
  public BirdArrayItem setSisrecID(java.lang.String sisrecID) {
    this.sisrecID = sisrecID;
    return this;
  }

  @Override
  public BirdArrayItem set(String fieldName, Object value) {
    return (BirdArrayItem) super.set(fieldName, value);
  }

  @Override
  public BirdArrayItem clone() {
    return (BirdArrayItem) super.clone();
  }

}