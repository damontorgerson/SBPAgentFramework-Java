/*
 * NoneSBPBasePublisher.java
 * Created: 08/11/2011
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
 * Publishers for Objects that are not defined as part of the SBP must extend this class rather than the 
 * SBPBasePublisher.  Only SIF Objects that are not part of the SBP should use this class to implement 
 * Publishers. If an agent with a publisher for a SBP Object is required then the SBPBasePublisher should be
 * use for the appropriate SIF Object. 
 * 
 * @author Joerg Huber
 *
 */
public abstract class NoneSBPBasePublisher extends BasePublisher
{
	/*
	 * Default constructor
	 */
    public NoneSBPBasePublisher(String publisherID, ElementDef dtd)
	{
        super(publisherID);
		setDtd(dtd);		
   }
}
