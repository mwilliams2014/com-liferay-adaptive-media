/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.adaptive.media.image.configuration;

import java.util.Map;

/**
 * Represents a single configuration entry used by Adaptive Media to generate
 * adaptive media images. Image configuration entries are company scoped.
 *
 * <p>
 * It is recommended that you use {@link AdaptiveMediaImageConfigurationHelper} 
 * to manage and fetch image configuration entries.
 * </p>
 *
 * @author Alejandro Hernández
 */
public interface AdaptiveMediaImageConfigurationEntry {

	/**
	 * Returns the description of the image configuration entry.
	 *
	 * @return the description of the image configuration entry.
	 */
	public String getDescription();

	/**
	 * Returns the name of the image configuration entry.
	 *
	 * @return the name of the image configuration entry.
	 */
	public String getName();

	/**
	 * Returns a set of properties that tell how adaptive media images should be 
	 * generated for the image configuration entry.
	 *
	 * @return a set of properties for the image configuration entry.
	 */
	public Map<String, String> getProperties();

	/**
	 * Returns the unique identifier for the image configuration entry.
	 *
	 * @return the unique identifier for the image configuration entry.
	 */
	public String getUUID();

	/**
	 * Returns <code>true</code> if the image configuration entry is enabled and 
	 * used to generate adaptive media images.
	 *
	 * @return <code>true</code> if the image configuration entry is enabled and
	 *         used to generate adaptive media images.
	 */
	public boolean isEnabled();

}