/*
 * ServiceBaseTest.java
 * Created: 08/10/2011
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

package systemic.sif.sbpframework.test.service;

import openadk.library.ADK;
import openadk.library.ADKException;
import systemic.sif.sbpframework.persist.common.HibernateUtil;
import au.com.systemic.framework.utils.FileReaderWriter;

/**
 * @author Joerg Huber
 *
 */
public class ServiceBaseTest
{
	
	public ServiceBaseTest()
	{
	}
	
	public void shutdown()
	{
		HibernateUtil.shutdown();
	}
	
    public void initADK() throws ADKException
    {
    	ADK.initialize();
    }

    public String loadXMLFileData(String fullPathAndName)
    {
    	System.out.println("loadXMLFileData("+fullPathAndName+") called ...");
        String xmlStr = null;
        xmlStr = FileReaderWriter.getFileContent(fullPathAndName);
        if (xmlStr == null)
        {
        	System.out.println("No file or empty file found at '" + fullPathAndName + "'");
        }
        System.out.println("Size of XML String read: "+((xmlStr==null)?null:xmlStr.length()));

        return xmlStr;
    }
   
}
