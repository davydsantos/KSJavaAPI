/******************************************************************************
 * The following is part of the KeySupport.org PIV API
 * 
 * $Id: TLVEncodingException.java 3 2013-07-23 16:00:13Z grandamp@gmail.com $
 *
 * The KeySupport.org PIV API is free software: you can redistribute it
 * and/or modify it under the terms of the GNU General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 *
 * This code is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with the KeySupport.org PIV API.  If not,
 * see <http://www.gnu.org/licenses/>.
 *
 * @author Todd E. Johnson (tejohnson@yahoo.com)
 * @version $Revision: 3 $
 * Last changed: $LastChangedDate: 2013-07-23 12:00:13 -0400 (Tue, 23 Jul 2013) $
 *****************************************************************************/

package org.keysupport.encoding;

/**
 */
public class TLVEncodingException extends Throwable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Constructs an <code>TLVEncodingException</code> with no specified detail
	 * message.
	 */
	public TLVEncodingException() {
		super();
	}

	/**
	 * Constructs an <code>TLVEncodingException</code> with the specified detail
	 * message.
	 * 
	 * @param s
	 *            the detail message.
	 */
	public TLVEncodingException(String s) {
		super(s);
	}
}
