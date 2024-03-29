/**
 *  OpenKM, Open Document Management System (http://www.openkm.com)
 *  Copyright (c) 2006-2011  Paco Avila & Josep Llort
 *
 *  No bytes were intentionally harmed during the development of this application.
 *
 *  This program is free software; you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation; either version 2 of the License, or
 *  (at your option) any later version.
 *  
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License along
 *  with this program; if not, write to the Free Software Foundation, Inc.,
 *  51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA.
 */

package com.openkm.frontend.client.util;

import java.util.Comparator;
import java.util.Date;

import com.openkm.frontend.client.bean.GWTObjectToOrder;

/**
 * ColumnComparatorDate
 * 
 * @author jllort
 *
 */
public class ColumnComparatorDate implements Comparator<GWTObjectToOrder> {
	private static final Comparator<GWTObjectToOrder> INSTANCE  = new ColumnComparatorDate();
	
	public static Comparator<GWTObjectToOrder> getInstance() {
		return INSTANCE;
	}

	public int compare(GWTObjectToOrder arg0, GWTObjectToOrder arg1) {
		return ((Date)arg0.getObject()).compareTo((Date)arg1.getObject());
	}
}