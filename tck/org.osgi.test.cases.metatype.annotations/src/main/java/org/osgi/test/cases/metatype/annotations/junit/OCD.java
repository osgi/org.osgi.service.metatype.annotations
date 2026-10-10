/*******************************************************************************
 * Copyright (c) Contributors to the Eclipse Foundation
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
 *
 * SPDX-License-Identifier: Apache-2.0 
 *******************************************************************************/

package org.osgi.test.cases.metatype.annotations.junit;

import static org.osgi.test.cases.metatype.annotations.junit.AnnotationsTestCase.xmlns_metatype120;

import org.osgi.test.assertj.xml.SimpleNamespaceContext;
import org.osgi.test.assertj.xml.XmlElement;
import org.w3c.dom.Element;

/**
 * @author $Id$
 */
public class OCD extends XmlElement {

	/**
	 * @param id
	 * @param context
	 * @param ocd
	 */
	public OCD(String id, SimpleNamespaceContext context, Element ocd) {
		super(id, context, ocd);
	}

	public String character() {
		return xmlns_metatype120.equals(getNamespaceContext().getURI()) ? "Char"
				: "Character";
	}
}
