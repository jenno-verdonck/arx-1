/*
 * ARX: Powerful Data Anonymization
 * Copyright 2012 - 2016 Fabian Prasser, Florian Kohlmayer and contributors
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.deidentifier.arx.aggregates.classification;

import org.deidentifier.arx.DataHandleInternal;

/**
 * Implements a classifier
 * @author Fabian Prasser
 */
public interface ClassificationMethod {
    
    /**
     * Classify
     * @param handle
     * @param row
     * @return
     */
    public abstract ClassificationResult classify(DataHandleInternal handle, int row);
    
    /**
     * Close
     */
    public abstract void close();

    /**
     * Train
     * @param features
     * @param clazz
     * @param row
     */
    public abstract void train(DataHandleInternal features, DataHandleInternal clazz, int row);

}
