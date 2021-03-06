/*
 * SIFObjectKey.java
 * Created: 10/10/2011
 *
 * Copyright 2011 Systemic Pty Ltd
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software distributed under the License 
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied.
 * See the License for the specific language governing permissions and limitations under the License.
 */

package systemic.sif.sbpframework.persist.model;


/**
 * @author Joerg Huber
 *
 */
public class SIFObjectKey extends SIFKeyComponent
{
    private static final long serialVersionUID = 35709348907L;

    public SIFObjectKey() 
	{
		super();
	}
	
	public SIFObjectKey(Long id, String xpathToKey, Integer sortOrder)
	{
		super(id, xpathToKey, sortOrder);
	}
}
