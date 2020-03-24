/*******************************************************************************
 * Copyright (c) 2015 Takari, Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *      Anton Tanasenko - initial API and implementation
 *******************************************************************************/

package org.eclipse.m2e.editor.mojo;

import java.util.List;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;

import org.apache.maven.plugin.descriptor.MojoDescriptor;
import org.apache.maven.plugin.descriptor.PluginDescriptor;


/**
 * @since 1.6
 */
public interface IMojoParameterMetadata {

  /**
   * Returns a list of parameters that are applicable to a specified plugin mojo
   */
  List<MojoParameter> loadMojoParameters(PluginDescriptor desc, MojoDescriptor mojo, PlexusConfigHelper helper,
      IProgressMonitor monitor) throws CoreException;

}
