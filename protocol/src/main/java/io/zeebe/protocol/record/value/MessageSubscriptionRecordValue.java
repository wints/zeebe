/*
 * Copyright © 2017 camunda services GmbH (info@camunda.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.zeebe.protocol.record.value;

import io.zeebe.protocol.record.RecordValue;
import io.zeebe.protocol.record.intent.MessageSubscriptionIntent;

/**
 * Represents a message correlation subscription event or command.
 *
 * <p>See {@link MessageSubscriptionIntent} for intents.
 */
public interface MessageSubscriptionRecordValue extends RecordValue {

  /** @return the workflow instance key tied to the subscription */
  long getWorkflowInstanceKey();

  /** @return the element instance key tied to the subscription */
  long getElementInstanceKey();

  /** @return the name of the message */
  String getMessageName();

  /** @return the correlation key */
  String getCorrelationKey();
}
