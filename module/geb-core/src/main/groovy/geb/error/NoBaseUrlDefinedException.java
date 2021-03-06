/*
 * Copyright 2011 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package geb.error;

public class NoBaseUrlDefinedException extends GebException {
	
	public NoBaseUrlDefinedException() {
		super("There is no base URL configured and it was requested. Please see the Geb manual for different ways of managing the base URL (quick solution: you can set the 'geb.build.baseUrl' JVM system property)");
	}
	
}