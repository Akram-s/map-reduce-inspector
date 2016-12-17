/*
 * Copyright 2016 Joao Vicente
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.apm4all.hadoop;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sun.tools.classfile.Synthetic_attribute;

import java.io.IOException;

public class JobConfigurationParser {
    String jsonString;

    JobConfigurationParser(String json)  {
        this.jsonString = json;
    }

    public JobConfiguration parse() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode jsonNode = mapper.readValue(jsonString.getBytes(), JsonNode.class);

        JobConfiguration jobConfiguration = new JobConfiguration();
        for (JsonNode node : jsonNode.path("conf").path("property"))    {
            jobConfiguration.add(
                    node.path("name").asText(),
                    node.path("value").asText());
        }
        return jobConfiguration;
    }
}