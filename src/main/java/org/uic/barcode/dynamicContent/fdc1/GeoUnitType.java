/*
 *   This file was generated by openASN.1 - an open source ASN.1 toolkit for java
 *
 *   openASN.1 is Copyright (C) 2007 Clayton Hoss, Marc Weyland
 *
 *   openASN.1 is free software: you can redistribute it and/or modify
 *   it under the terms of the GNU Lesser General Public License as
 *   published by the Free Software Foundation, either version 3 of
 *   the License, or (at your option) any later version.
 *
 *   openASN.1 is distributed in the hope that it will be useful,
 *   but WITHOUT ANY WARRANTY; without even the implied warranty of
 *   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 *   GNU Lesser General Public License for more details.
 *
 *   You should have received a copy of the GNU Lesser General Public License
 *   along with openASN.1. If not, see <http://www.gnu.org/licenses/>.
 *
 */
package org.uic.barcode.dynamicContent.fdc1;

/**
 * The Enum GeoUnitType.
 */
public enum GeoUnitType {
		
		/** The micro degree. */
		microDegree("microDegree"),
		
		/** The tenthmilli degree. */
		tenthmilliDegree("tenthmilliDegree"),
		
		/** The milli degree. */
		milliDegree("milliDegree"),
		
		/** The centi degree. */
		centiDegree("centiDegree"),
		
		/** The deci degree. */
		deciDegree("deciDegree");
		
		
		/** The text. */
		public String text;

		/**
		 * Instantiates a new geo unit type.
		 *
		 * @param text the text
		 */
		GeoUnitType(String text) {
			this.text = text;
		}
		
		/**
		 * To string.
		 *
		 * @return the string
		 */
		public String toString(){
			return text;
		}		
}

