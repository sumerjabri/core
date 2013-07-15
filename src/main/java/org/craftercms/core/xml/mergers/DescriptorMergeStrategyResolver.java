/*
 * Copyright (C) 2007-2013 Crafter Software Corporation.
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.craftercms.core.xml.mergers;

import org.craftercms.core.exception.CrafterException;
import org.dom4j.Document;
import org.craftercms.core.exception.CrafterException;

/**
 * Resolves the {@link DescriptorMergeStrategy} to use for a given descriptor.
 *
 * @author Sumer Jabri
 * @author Alfonso Vásquez
 */
public interface DescriptorMergeStrategyResolver {

    /**
     * Returns a {@link DescriptorMergeStrategy} for a given descriptor.
     *
     * @param descriptorUrl
     *          the URL that identifies the descriptor
     * @param descriptorDom
     *          the XML DOM of the descriptor (optional)
     * @return the {@link DescriptorMergeStrategy} for the descriptor.
     * @throws org.craftercms.core.exception.CrafterException
     *          if an error occurs while resolving the strategy
     */
    public DescriptorMergeStrategy getStrategy(String descriptorUrl, Document descriptorDom) throws CrafterException;

}