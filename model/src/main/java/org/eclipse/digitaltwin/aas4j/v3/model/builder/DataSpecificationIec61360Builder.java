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

package org.eclipse.digitaltwin.aas4j.v3.model.builder;

import org.eclipse.digitaltwin.aas4j.v3.model.*;

import java.util.List;


public abstract class DataSpecificationIec61360Builder<T extends DataSpecificationIec61360, B extends DataSpecificationIec61360Builder<T, B>>
    extends ExtendableBuilder<T, B> {

    /**
     * This function allows setting a value for dataType
     * 
     * @param dataType desired value to be set
     * @return Builder object with new value for dataType
     */
    public B dataType(DataTypeIec61360 dataType) {
        getBuildingInstance().setDataType(dataType);
        return getSelf();
    }

    /**
     * This function allows setting a value for definition
     * 
     * @param definition desired value to be set
     * @return Builder object with new value for definition
     */
    public B definition(List<LangStringDefinitionTypeIec61360> definition) {
        getBuildingInstance().setDefinition(definition);
        return getSelf();
    }

    /**
     * This function allows adding a value to the List definition
     * 
     * @param definition desired value to be added
     * @return Builder object with new value for definition
     */
    public B definition(LangStringDefinitionTypeIec61360 definition) {
        getBuildingInstance().getDefinition().add(definition);
        return getSelf();
    }

    /**
     * This function allows setting a value for levelType
     * 
     * @param levelType desired value to be set
     * @return Builder object with new value for levelType
     */
    public B levelType(LevelType levelType) {
        getBuildingInstance().setLevelType(levelType);
        return getSelf();
    }

    /**
     * This function allows setting a value for preferredName
     * 
     * @param preferredName desired value to be set
     * @return Builder object with new value for preferredName
     */
    public B preferredName(List<LangStringPreferredNameTypeIec61360> preferredName) {
        getBuildingInstance().setPreferredName(preferredName);
        return getSelf();
    }

    /**
     * This function allows adding a value to the List preferredName
     * 
     * @param preferredName desired value to be added
     * @return Builder object with new value for preferredName
     */
    public B preferredName(LangStringPreferredNameTypeIec61360 preferredName) {
        getBuildingInstance().getPreferredName().add(preferredName);
        return getSelf();
    }

    /**
     * This function allows setting a value for shortName
     * 
     * @param shortName desired value to be set
     * @return Builder object with new value for shortName
     */
    public B shortName(List<LangStringShortNameTypeIec61360> shortName) {
        getBuildingInstance().setShortName(shortName);
        return getSelf();
    }

    /**
     * This function allows adding a value to the List shortName
     * 
     * @param shortName desired value to be added
     * @return Builder object with new value for shortName
     */
    public B shortName(LangStringShortNameTypeIec61360 shortName) {
        getBuildingInstance().getShortName().add(shortName);
        return getSelf();
    }

    /**
     * This function allows setting a value for sourceOfDefinition
     * 
     * @param sourceOfDefinition desired value to be set
     * @return Builder object with new value for sourceOfDefinition
     */
    public B sourceOfDefinition(String sourceOfDefinition) {
        getBuildingInstance().setSourceOfDefinition(sourceOfDefinition);
        return getSelf();
    }

    /**
     * This function allows setting a value for symbol
     * 
     * @param symbol desired value to be set
     * @return Builder object with new value for symbol
     */
    public B symbol(String symbol) {
        getBuildingInstance().setSymbol(symbol);
        return getSelf();
    }

    /**
     * This function allows setting a value for unit
     * 
     * @param unit desired value to be set
     * @return Builder object with new value for unit
     */
    public B unit(String unit) {
        getBuildingInstance().setUnit(unit);
        return getSelf();
    }

    /**
     * This function allows setting a value for unitID
     * 
     * @param unitID desired value to be set
     * @return Builder object with new value for unitID
     */
    public B unitID(Reference unitID) {
        getBuildingInstance().setUnitID(unitID);
        return getSelf();
    }

    /**
     * This function allows setting a value for value
     * 
     * @param value desired value to be set
     * @return Builder object with new value for value
     */
    public B value(String value) {
        getBuildingInstance().setValue(value);
        return getSelf();
    }

    /**
     * This function allows setting a value for valueFormat
     * 
     * @param valueFormat desired value to be set
     * @return Builder object with new value for valueFormat
     */
    public B valueFormat(String valueFormat) {
        getBuildingInstance().setValueFormat(valueFormat);
        return getSelf();
    }

    /**
     * This function allows setting a value for valueList
     * 
     * @param valueList desired value to be set
     * @return Builder object with new value for valueList
     */
    public B valueList(ValueList valueList) {
        getBuildingInstance().setValueList(valueList);
        return getSelf();
    }

}
