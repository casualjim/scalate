/**
 * Copyright (C) 2009-2010 the original author or authors.
 * See the notice.md file distributed with this work for additional
 * information regarding copyright ownership.
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

package org.fusesource.scalate.servlet

import org.fusesource.scalate.TemplateEngine

/**
 * Some helper methods for servlet and web app based code
 */
object ServletHelper {

  /**
   * The default URIs to look for error templates
   */
  def errorUris(errorCode: String = "500"): List[String] = TemplateEngine.templateTypes.map("/WEB-INF/scalate/errors/" + errorCode + "." + _)


  /**
   * The default directories to look for templates
   */
  def templateDirectories = List("/WEB-INF", "")

}