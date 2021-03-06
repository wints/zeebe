/*
 * Copyright Camunda Services GmbH and/or licensed to Camunda Services GmbH under
 * one or more contributor license agreements. See the NOTICE file distributed
 * with this work for additional information regarding copyright ownership.
 * Licensed under the Zeebe Community License 1.0. You may not use this file
 * except in compliance with the Zeebe Community License 1.0.
 */
package io.zeebe.transport.impl;

import io.zeebe.dispatcher.FragmentHandler;
import io.zeebe.transport.impl.TransportChannel.ChannelLifecycleListener;
import java.nio.channels.SocketChannel;

public interface TransportChannelFactory {

  TransportChannel buildClientChannel(
      ChannelLifecycleListener listener,
      RemoteAddressImpl remoteAddress,
      int maxMessageSize,
      FragmentHandler readHandler);

  TransportChannel buildServerChannel(
      ChannelLifecycleListener listener,
      RemoteAddressImpl remoteAddress,
      int maxMessageSize,
      FragmentHandler readHandler,
      SocketChannel media);
}
