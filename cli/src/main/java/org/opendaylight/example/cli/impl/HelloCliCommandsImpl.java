/*
 * Copyright © 2018 Copyright (c) 2019 Padtec and others.  All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */
package org.opendaylight.example.cli.impl;

import org.opendaylight.controller.md.sal.binding.api.DataBroker;
import org.opendaylight.example.cli.api.HelloCliCommands;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HelloCliCommandsImpl implements HelloCliCommands {

    private static final Logger LOG = LoggerFactory.getLogger(HelloCliCommandsImpl.class);
    private final DataBroker dataBroker;

    public HelloCliCommandsImpl(final DataBroker db) {
        this.dataBroker = db;
        LOG.info("HelloCliCommandImpl initialized");
    }

    @Override
    public Object testCommand(Object testArgument) {
        return "This is a test implementation of test-command";
    }
}