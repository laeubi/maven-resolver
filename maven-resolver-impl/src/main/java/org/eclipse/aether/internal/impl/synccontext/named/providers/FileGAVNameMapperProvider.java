package org.eclipse.aether.internal.impl.synccontext.named.providers;

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

import javax.inject.Named;
import javax.inject.Provider;
import javax.inject.Singleton;

import org.eclipse.aether.internal.impl.synccontext.named.BasedirNameMapper;
import org.eclipse.aether.internal.impl.synccontext.named.GAVNameMapper;
import org.eclipse.aether.internal.impl.synccontext.named.NameMapper;

/**
 * The "file-gav" name mapper provider.
 *
 * @since 1.9.0
 */
@Singleton
@Named( FileGAVNameMapperProvider.NAME )
public class FileGAVNameMapperProvider implements Provider<NameMapper>
{
    public static final String NAME = "file-gav";

    private final NameMapper mapper;

    public FileGAVNameMapperProvider()
    {
        this.mapper = new BasedirNameMapper( GAVNameMapper.fileGav() );
    }

    @Override
    public NameMapper get()
    {
        return mapper;
    }
}
