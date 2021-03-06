/*
 * JBoss, Home of Professional Open Source.
 * Copyright 2014 Red Hat, Inc., and individual contributors
 * as indicated by the @author tags.
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

package org.wildfly.security.sasl;

import javax.security.sasl.SaslException;

/**
 * @author <a href="mailto:david.lloyd@redhat.com">David M. Lloyd</a>
 */
public class SaslAuthenticationInterruptedException extends SaslException {

    private static final long serialVersionUID = 3351228768569638601L;

    /**
     * Constructs a new {@code SaslAuthenticationInterruptedException} instance.  The message is left blank ({@code
     * null}), and no cause is specified.
     */
    public SaslAuthenticationInterruptedException() {
    }

    /**
     * Constructs a new {@code SaslAuthenticationInterruptedException} instance with an initial message.  No cause is
     * specified.
     *
     * @param msg the message
     */
    public SaslAuthenticationInterruptedException(final String msg) {
        super(msg);
    }

    /**
     * Constructs a new {@code SaslAuthenticationInterruptedException} instance with an initial cause.  If a non-{@code
     * null} cause is specified, its message is used to initialize the message of this {@code
     * SaslAuthenticationInterruptedException}; otherwise the message is left blank ({@code null}).
     *
     * @param cause the cause
     */
    public SaslAuthenticationInterruptedException(final Throwable cause) {
        super();
        initCause(cause);
    }

    /**
     * Constructs a new {@code SaslAuthenticationInterruptedException} instance with an initial message and cause.
     *
     * @param msg the message
     * @param cause the cause
     */
    public SaslAuthenticationInterruptedException(final String msg, final Throwable cause) {
        super(msg);
        initCause(cause);
    }
}
