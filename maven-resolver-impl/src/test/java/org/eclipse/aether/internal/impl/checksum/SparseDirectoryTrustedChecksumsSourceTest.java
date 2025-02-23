package org.eclipse.aether.internal.impl.checksum;

/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

import org.eclipse.aether.DefaultRepositorySystemSession;
import org.eclipse.aether.RepositorySystemSession;
import org.eclipse.aether.impl.RepositorySystemLifecycle;
import org.eclipse.aether.internal.impl.DefaultFileProcessor;
import org.eclipse.aether.internal.impl.DefaultLocalPathComposer;

public class SparseDirectoryTrustedChecksumsSourceTest extends FileTrustedChecksumsSourceTestSupport
{
    @Override
    protected FileTrustedChecksumsSourceSupport prepareSubject( RepositorySystemLifecycle lifecycle )
    {
        return new SparseDirectoryTrustedChecksumsSource( new DefaultFileProcessor(), new DefaultLocalPathComposer() );
    }

    @Override
    protected void enableSource( DefaultRepositorySystemSession session )
    {
        session.setConfigProperty( "aether.trustedChecksumsSource.sparseDirectory", Boolean.TRUE.toString() );
    }
}
