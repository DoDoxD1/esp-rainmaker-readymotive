// Copyright 2020 Espressif Systems (Shanghai) PTE LTD
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.readymotive.cloudapi;

/**
 * This class represents custom exception. Application will throw this exception when any error received from cloud API.
 */
public class CloudException extends RuntimeException {

    public CloudException(String message) {
        super(message);
    }

    public CloudException(String message, Throwable cause) {
        super(message, cause);
    }
}
