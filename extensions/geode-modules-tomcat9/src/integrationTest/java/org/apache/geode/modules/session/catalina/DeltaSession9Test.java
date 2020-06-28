/*
 * Licensed to the Apache Software Foundation (ASF) under one or more contributor license
 * agreements. See the NOTICE file distributed with this work for additional information regarding
 * copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance with the License. You may obtain a
 * copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
package org.apache.geode.modules.session.catalina;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class DeltaSession9Test
    extends AbstractDeltaSessionIntegrationTest<Tomcat9DeltaSessionManager, DeltaSession9> {

  public DeltaSession9Test() {
    super(mock(Tomcat9DeltaSessionManager.class));
  }

  @Override
  public void before() {
    super.before();
    when(manager.getContext()).thenReturn(context);
  }

  @Override
  protected DeltaSession9 newSession(Tomcat9DeltaSessionManager manager) {
    return new DeltaSession9(manager);
  }

}
