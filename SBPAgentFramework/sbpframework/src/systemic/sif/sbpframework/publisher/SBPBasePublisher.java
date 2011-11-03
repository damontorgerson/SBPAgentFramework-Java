/*
 * SBPBasePublisher.java
 * Created: 02/11/2011
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

package systemic.sif.sbpframework.publisher;

import openadk.library.ElementDef;
import systemic.sif.sifcommon.publisher.BasePublisher;

/**
 * @author Joerg Huber
 *
 */
public abstract class SBPBasePublisher extends BasePublisher
{
	/*
	 * Default constructor
	 */
    public SBPBasePublisher(String publisherID, ElementDef dtd)
	{
        super(publisherID);
		setDtd(dtd);		
   }

}
