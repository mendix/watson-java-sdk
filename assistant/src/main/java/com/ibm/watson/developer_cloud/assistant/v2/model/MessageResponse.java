/*
 * Copyright 2018 IBM Corp. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */
package com.ibm.watson.developer_cloud.assistant.v2.model;

import com.ibm.watson.developer_cloud.service.model.GenericModel;

/**
 * A response from the Watson Assistant service.
 */
public class MessageResponse extends GenericModel {

  private MessageOutput output;
  private MessageContext context;

  /**
   * Gets the output.
   *
   * Assistant output to be rendered or processed by the client.
   *
   * @return the output
   */
  public MessageOutput getOutput() {
    return output;
  }

  /**
   * Gets the context.
   *
   * The current session context. Included in the response if the `return_context` property of the message input was set
   * to `true`.
   *
   * @return the context
   */
  public MessageContext getContext() {
    return context;
  }
}
