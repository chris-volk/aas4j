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

package org.eclipse.aas4j.v3.rc02.model.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;



import org.eclipse.aas4j.v3.rc02.model.*;
import org.eclipse.aas4j.v3.rc02.model.annotations.IRI;
import org.eclipse.aas4j.v3.rc02.model.builder.*;
import org.eclipse.aas4j.v3.rc02.model.Key;
import org.eclipse.aas4j.v3.rc02.model.Reference;
import org.eclipse.aas4j.v3.rc02.model.ReferenceTypes;
import org.eclipse.aas4j.v3.rc02.model.builder.ReferenceBuilder;

/**
 * Default implementation of package org.eclipse.aas4j.v3.rc02.model.Reference
 * 
 * Reference to either a model element of the same or another AAS or to an external entity.
 */

@IRI("aas:Reference")
public class DefaultReference implements Reference {

    @IRI("https://admin-shell.io/aas/3/0/RC02/Reference/keys")
    protected List<Key> keys = new ArrayList<>();

    @IRI("https://admin-shell.io/aas/3/0/RC02/Reference/referredSemanticId")
    protected Reference referredSemanticId;

    @IRI("https://admin-shell.io/aas/3/0/RC02/Reference/type")
    protected ReferenceTypes type;

    public DefaultReference() {}

    @Override
    public int hashCode() {
        return Objects.hash(this.type,
            this.referredSemanticId,
            this.keys);
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
            DefaultReference other = (DefaultReference) obj;
            return Objects.equals(this.type, other.type) &&
                Objects.equals(this.referredSemanticId, other.referredSemanticId) &&
                Objects.equals(this.keys, other.keys);
        }
    }

    @Override
    public ReferenceTypes getType() {
        return type;
    }

    @Override
    public void setType(ReferenceTypes type) {
        this.type = type;
    }

    @Override
    public Reference getReferredSemanticId() {
        return referredSemanticId;
    }

    @Override
    public void setReferredSemanticId(Reference referredSemanticId) {
        this.referredSemanticId = referredSemanticId;
    }

    @Override
    public List<Key> getKeys() {
        return keys;
    }

    @Override
    public void setKeys(List<Key> keys) {
        this.keys = keys;
    }

    /**
     * This builder class can be used to construct a DefaultReference bean.
     */
    public static class Builder extends ReferenceBuilder<DefaultReference, Builder> {

        @Override
        protected Builder getSelf() {
            return this;
        }

        @Override
        protected DefaultReference newBuildingInstance() {
            return new DefaultReference();
        }
    }
}
