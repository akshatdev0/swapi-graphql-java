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

/**
 * Root of the hierarchy of persistence exceptions that are considered transient - where a
 * previously failed operation might be able to succeed when the operation is retried without any
 * intervention by application-level functionality.
 */
@SuppressWarnings("serial")
public abstract class TransientPersistenceException extends PersistenceException {

  /**
   * Constructor for TransientPersistenceException.
   *
   * @param msg the detail message
   */
  public TransientPersistenceException(String msg) {
    super(msg);
  }

  /**
   * Constructor for TransientPersistenceException.
   *
   * @param msg the detail message
   * @param cause the root cause (usually from using a underlying persistence API such as JDBC)
   */
  public TransientPersistenceException(String msg, Throwable cause) {
    super(msg, cause);
  }
}
