/*
 * DAOBaseTest.java
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

package systemic.sif.sbpframework.test.persist;

import systemic.sif.sbpframework.persist.common.BasicTransaction;
import systemic.sif.sbpframework.persist.common.HibernateUtil;
import systemic.sif.sbpframework.persist.dao.BaseDAO;

/**
 * @author Joerg Huber
 *
 */
public class DAOBaseTest
{
	private BasicTransaction tx;
	
	public void startTransaction(BaseDAO dao)
	{
		tx = new BasicTransaction();
		tx.startTransaction();
	}
	
	public BasicTransaction getTransaction()
	{
		return tx;
	}
	
	/* commits changes and finalises transaction */
	public void commit()
	{
		tx.commit();
	}
	
	/* commits changes and finalises transaction */
	public void rollback()
	{
		tx.rollback();
	}
	
	public void shutdown()
	{
		HibernateUtil.shutdown();
	}
}
