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

package org.eclipse.digitaltwin.aas4j.v3.model;

import org.eclipse.digitaltwin.aas4j.v3.model.annotations.IRI;
import org.eclipse.digitaltwin.aas4j.v3.model.annotations.KnownSubtypes;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultMultiLanguageProperty;

import java.util.List;


/**
 * A property is a data element that has a multi-language value.
 */
@KnownSubtypes({
    @KnownSubtypes.Type(value = DefaultMultiLanguageProperty.class)
})
public interface MultiLanguageProperty extends DataElement {

    /**
     * The value of the property instance.
     *
     * More information under https://admin-shell.io/aas/3/0/MultiLanguageProperty/value
     *
     * @return Returns the List of LangStringTextTypes for the property value.
     */
    @IRI("https://admin-shell.io/aas/3/0/MultiLanguageProperty/value")
    List<LangStringTextType> getValue();

    /**
     * The value of the property instance.
     *
     * More information under https://admin-shell.io/aas/3/0/MultiLanguageProperty/value
     *
     * @param value desired value for the property value.
     */
    void setValue(List<LangStringTextType> value);

    /**
     * Reference to the global unique ID of a coded value.
     *
     * More information under https://admin-shell.io/aas/3/0/MultiLanguageProperty/valueID
     *
     * @return Returns the Reference for the property valueID.
     */
    @IRI("https://admin-shell.io/aas/3/0/MultiLanguageProperty/valueID")
    Reference getValueID();

    /**
     * Reference to the global unique ID of a coded value.
     *
     * More information under https://admin-shell.io/aas/3/0/MultiLanguageProperty/valueID
     *
     * @param valueID desired value for the property valueID.
     */
    void setValueID(Reference valueID);

}
