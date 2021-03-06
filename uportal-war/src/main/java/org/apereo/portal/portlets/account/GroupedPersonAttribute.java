/**
 * Licensed to Apereo under one or more contributor license
 * agreements. See the NOTICE file distributed with this work
 * for additional information regarding copyright ownership.
 * Apereo licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file
 * except in compliance with the License.  You may obtain a
 * copy of the License at the following location:
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apereo.portal.portlets.account;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class GroupedPersonAttribute {

    private final String displayName;
    private final Set<String> attributeNames;
    private final List<Object> values;
    
    public GroupedPersonAttribute(final String displayName, final List<Object> values) {
        this.displayName = displayName;
        this.values = values;
        this.attributeNames = new TreeSet<String>();
    }

    public GroupedPersonAttribute(final String displayName, final List<Object> values, final String attributeName) {
        this(displayName, values);
        this.attributeNames.add(attributeName);
    }

    public String getDisplayName() {
        return displayName;
    }

    public Set<String> getAttributeNames() {
        return attributeNames;
    }

    public List<Object> getValues() {
        return values;
    }

}
