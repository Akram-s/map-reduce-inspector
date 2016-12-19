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

public class JobCountersUrlReader {
    private final String url;

    JobCountersUrlReader(String jobHistoryUrl, String jobId)  {
       url = jobHistoryUrl + "/ws/v1/history/mapreduce/jobs/" + jobId + "/counters";
    }

    public String getJsonString()  {
        UrlReader urlReader = new UrlReader(url);
        return urlReader.read();
    }
}
