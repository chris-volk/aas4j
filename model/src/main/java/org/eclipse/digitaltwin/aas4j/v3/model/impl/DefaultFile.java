/*
 * Copyright (c) 2021 Fraunhofer-Gesellschaft zur Foerderung der angewandten Forschung e. V.
 * 
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

package org.eclipse.digitaltwin.aas4j.v3.model.impl;

import org.eclipse.digitaltwin.aas4j.v3.model.*;
import org.eclipse.digitaltwin.aas4j.v3.model.annotations.IRI;
import org.eclipse.digitaltwin.aas4j.v3.model.builder.FileBuilder;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


/**
 * Default implementation of package org.eclipse.digitaltwin.aas4j.v3.model.File
 * 
 * A File is a data element that represents an address to a file (a locator).
 */

@IRI("aas:File")
public class DefaultFile implements File {

    @IRI("https://admin-shell.io/aas/3/0/File/contentType")
    protected String contentType;

    @IRI("https://admin-shell.io/aas/3/0/File/value")
    protected String value;

    @IRI("https://admin-shell.io/aas/3/0/HasDataSpecification/embeddedDataSpecifications")
    protected List<EmbeddedDataSpecification> embeddedDataSpecifications = new ArrayList<>();

    @IRI("https://admin-shell.io/aas/3/0/HasExtensions/extensions")
    protected List<Extension> extensions = new ArrayList<>();

    @IRI("https://admin-shell.io/aas/3/0/HasSemantics/semanticID")
    protected Reference semanticID;

    @IRI("https://admin-shell.io/aas/3/0/HasSemantics/supplementalSemanticIds")
    protected List<Reference> supplementalSemanticIds = new ArrayList<>();

    @IRI("https://admin-shell.io/aas/3/0/Qualifiable/qualifiers")
    protected List<Qualifier> qualifiers = new ArrayList<>();

    @IRI("https://admin-shell.io/aas/3/0/Referable/category")
    protected String category;

    @IRI("https://admin-shell.io/aas/3/0/Referable/description")
    protected List<LangStringTextType> description = new ArrayList<>();

    @IRI("https://admin-shell.io/aas/3/0/Referable/displayName")
    protected List<LangStringNameType> displayName = new ArrayList<>();

    @IRI("https://admin-shell.io/aas/3/0/Referable/idShort")
    protected String idShort;

    public DefaultFile() {

    }

    @Override
    public int hashCode() {
        return Objects.hash(this.contentType,
            this.value,
            this.embeddedDataSpecifications,
            this.semanticID,
            this.supplementalSemanticIds,
            this.category,
            this.description,
            this.displayName,
            this.idShort,
            this.extensions,
            this.qualifiers);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        } else if (obj == null) {
            return false;
        } else if (this.getClass() != obj.getClass()) {
            return false;
        } else {
            DefaultFile other = (DefaultFile) obj;
            return Objects.equals(this.contentType, other.contentType) &&
                Objects.equals(this.value, other.value) &&
                Objects.equals(this.embeddedDataSpecifications, other.embeddedDataSpecifications) &&
                Objects.equals(this.semanticID, other.semanticID) &&
                Objects.equals(this.supplementalSemanticIds, other.supplementalSemanticIds) &&
                Objects.equals(this.category, other.category) &&
                Objects.equals(this.description, other.description) &&
                Objects.equals(this.displayName, other.displayName) &&
                Objects.equals(this.idShort, other.idShort) &&
                Objects.equals(this.extensions, other.extensions) &&
                Objects.equals(this.qualifiers, other.qualifiers);
        }
    }

    @Override
    public String getContentType() {
        return contentType;
    }

    @Override
    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    @Override
    public String getValue() {
        return value;
    }

    @Override
    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public List<EmbeddedDataSpecification> getEmbeddedDataSpecifications() {
        return embeddedDataSpecifications;
    }

    @Override
    public void setEmbeddedDataSpecifications(List<EmbeddedDataSpecification> embeddedDataSpecifications) {
        this.embeddedDataSpecifications = embeddedDataSpecifications;
    }

    @Override
    public Reference getSemanticID() {
        return semanticID;
    }

    @Override
    public void setSemanticID(Reference semanticID) {
        this.semanticID = semanticID;
    }

    @Override
    public List<Reference> getSupplementalSemanticIds() {
        return supplementalSemanticIds;
    }

    @Override
    public void setSupplementalSemanticIds(List<Reference> supplementalSemanticIds) {
        this.supplementalSemanticIds = supplementalSemanticIds;
    }

    @Override
    public String getCategory() {
        return category;
    }

    @Override
    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public List<LangStringTextType> getDescription() {
        return description;
    }

    @Override
    public void setDescription(List<LangStringTextType> description) {
        this.description = description;
    }

    @Override
    public List<LangStringNameType> getDisplayName() {
        return displayName;
    }

    @Override
    public void setDisplayName(List<LangStringNameType> displayName) {
        this.displayName = displayName;
    }

    @Override
    public String getIdShort() {
        return idShort;
    }

    @Override
    public void setIdShort(String idShort) {
        this.idShort = idShort;
    }

    @Override
    public List<Extension> getExtensions() {
        return extensions;
    }

    @Override
    public void setExtensions(List<Extension> extensions) {
        this.extensions = extensions;
    }

    @Override
    public List<Qualifier> getQualifiers() {
        return qualifiers;
    }

    @Override
    public void setQualifiers(List<Qualifier> qualifiers) {
        this.qualifiers = qualifiers;
    }

    /**
     * This builder class can be used to construct a DefaultFile bean.
     */
    public static class Builder extends FileBuilder<DefaultFile, Builder> {

        @Override
        protected Builder getSelf() {
            return this;
        }

        @Override
        protected DefaultFile newBuildingInstance() {
            return new DefaultFile();
        }
    }
}
