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

import org.junit.Test;

import static org.junit.Assert.*;

public class UrlReaderTest {

    @Test
    public void readValidUrl() {
        // TODO: Refactor with a mock
        UrlReader urlReader = new UrlReader(
                "http://dbpldassn01.us.dnb.com:19888/ws/v1/history/mapreduce/jobs/job_1478805790803_8364");
        System.out.println(urlReader.read());
    }

    //TODO: Using Mockito to:
    //TODO: Test connectivity issues
    //TODO: Test invalid url
    //TODO: Other failure scenarios?
}