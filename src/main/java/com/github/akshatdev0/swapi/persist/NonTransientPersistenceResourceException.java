/*
 * Copyright 2002-2017 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * NOTICE: This work has been taken from spring-framework and modified as per Ethos use-case.
 *         This is a prominent notice stating the same.
 *
 * This work is licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 */

package com.github.akshatdev0.swapi.persist;

/** Persistence exception thrown when a resource fails completely and the failure is permanent. */
@SuppressWarnings("serial")
public class NonTransientPersistenceResourceException extends NonTransientPersistenceException {

  /**
   * Constructor for NonTransientPersistenceResourceException.
   *
   * @param msg the detail message
   */
  public NonTransientPersistenceResourceException(String msg) {
    super(msg);
  }

  /**
   * Constructor for NonTransientPersistenceResourceException.
   *
   * @param msg the detail message
   * @param cause the root cause from the persistence API in use
   */
  public NonTransientPersistenceResourceException(String msg, Throwable cause) {
    super(msg, cause);
  }
}
