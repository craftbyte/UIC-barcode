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
package org.uic.ticket.api.asn.omv2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import net.gcdc.asn1.datatypes.Asn1BigInteger;
import net.gcdc.asn1.datatypes.Asn1Default;
import net.gcdc.asn1.datatypes.Asn1Optional;
import net.gcdc.asn1.datatypes.CharacterRestriction;
import net.gcdc.asn1.datatypes.HasExtensionMarker;
import net.gcdc.asn1.datatypes.IntRange;
import net.gcdc.asn1.datatypes.RestrictedString;
import net.gcdc.asn1.datatypes.Sequence;
import net.gcdc.asn1.datatypesimpl.SequenceOfStringIA5;

@Sequence
@HasExtensionMarker
public class PassData extends Object {
	public PassData() {
	}

	@Asn1Optional public Asn1BigInteger referenceNum;
	
	@RestrictedString(CharacterRestriction.IA5String)
	@Asn1Optional public String referenceIA5;

	@IntRange(minValue=1,maxValue=32000)
	@Asn1Optional public Long productOwnerNum;

	@RestrictedString(CharacterRestriction.IA5String)
	@Asn1Optional public String productOwnerIA5;

	@IntRange(minValue=0,maxValue=65535)
	@Asn1Optional public Long productIdNum;

	@RestrictedString(CharacterRestriction.IA5String)
	@Asn1Optional public String productIdIA5;

	@IntRange(minValue=1,maxValue=250)
	@Asn1Optional public Long passType;

	@RestrictedString(CharacterRestriction.UTF8String)
	@Asn1Optional public String passDescription;

	@Asn1Default (value="second")
	@Asn1Optional public TravelClassType classCode;

	@IntRange(minValue=-1,maxValue=700)
	@Asn1Optional public Long validFromDay;

	@IntRange(minValue=0,maxValue=1439)
	@Asn1Optional public Long validFromTime;
	
	@IntRange(minValue=-60, maxValue=60)
	@Asn1Optional public Long validFromUTCOffset;

	@IntRange(minValue=0,maxValue=370)
	@Asn1Optional public Long validUntilDay;

	@IntRange(minValue=0,maxValue=1439)
	@Asn1Optional public Long validUntilTime;
	
	@IntRange(minValue=-60, maxValue=60)
	@Asn1Optional public Long validUntilUTCOffset;

	@Asn1Optional public ValidityPeriodDetailType validityPeriodDetails;

	@IntRange(minValue=0,maxValue=370)
	@Asn1Optional public Long numberOfValidityDays;

	@IntRange(minValue=1,maxValue=250)
	@Asn1Optional public Long numberOfPossibleTrips;

	@IntRange(minValue=1,maxValue=250)
	@Asn1Optional public Long numberOfDaysOfTravel;

	@Asn1Optional public SequenceOfActivatedDays activatedDay;

	@Asn1Optional public SequenceOfCountries countries;
	
	@Asn1Optional public SequenceOfCarrierNum includedCarriersNum;

	@Asn1Optional public SequenceOfStringIA5 includedCarriersIA5;
	
	@Asn1Optional public SequenceOfCarrierNum excludedCarriersNum;

	@Asn1Optional public SequenceOfStringIA5 excludedCarriersIA5;

	@Asn1Optional public SequenceOfServiceBrands includedServiceBrands;

	@Asn1Optional public SequenceOfServiceBrands excludedServiceBrands;

	@Asn1Optional public SequenceOfRegionalValidityType validRegion;

	@Asn1Optional public SequenceOfTariffType tariffs;

	@Asn1Optional Asn1BigInteger price;
	
	@Asn1Optional SequenceOfVatDetail vatDetails;
	
	@RestrictedString(CharacterRestriction.UTF8String)
	@Asn1Optional public String infoText;

	@Asn1Optional public ExtensionData extension;
	
	

	

	public Asn1BigInteger getReferenceNum() {

		return this.referenceNum;
	}

	public String getReferenceIA5() {

		return this.referenceIA5;
	}

	public Long getProductOwnerNum() {

		return this.productOwnerNum;
	}

	public String getProductOwnerIA5() {

		return this.productOwnerIA5;
	}

	public Long getProductIdNum() {

		return this.productIdNum;
	}

	public String getProductIdIA5() {

		return this.productIdIA5;
	}

	public Long getPassType() {

		return this.passType;
	}

	public String getPassDescription() {

		return this.passDescription;
	}

	public TravelClassType getClassCode() {

		if (classCode == null){
			return TravelClassType.second;
		}
		
		return this.classCode;
	}

	public Long getValidFromDay() {

		return this.validFromDay;
	}

	public Long getValidFromTime() {

		return this.validFromTime;
	}

	public Long getValidUntilDay() {

		return this.validUntilDay;
	}

	public Long getValidUntilTime() {

		return this.validUntilTime;
	}

	public ValidityPeriodDetailType getValidityPeriodDetails() {

		return this.validityPeriodDetails;
	}

	public Long getNumberOfValidityDays() {

		return this.numberOfValidityDays;
	}

	public Long getNumberOfPossibleTrips() {

		return this.numberOfPossibleTrips;
	}

	public Long getNumberOfDaysOfTravel() {

		return this.numberOfDaysOfTravel;
	}

	public List<Long> getActivatedDay() {

		return this.activatedDay;
	}

	public List<Long> getCountries() {

		return this.countries;
	}

	public List<Long> getIncludedCarriersNum() {

		return this.includedCarriersNum;
	}

	public List<String> getIncludedCarriersIA5() {

		return this.includedCarriersIA5;
	}

	public List<Long> getExcludedCarriersNum() {

		return this.excludedCarriersNum;
	}

	public SequenceOfStringIA5 getExcludedCarriersIA5() {

		return this.excludedCarriersIA5;
	}

	public SequenceOfServiceBrands getIncludedServiceBrands() {

		return this.includedServiceBrands;
	}

	public SequenceOfServiceBrands getExcludedServiceBrands() {

		return this.excludedServiceBrands;
	}

	public List<RegionalValidityType> getValidRegion() {

		return this.validRegion;
	}

	public List<TariffType> getTariffs() {

		return this.tariffs;
	}

	public String getInfoText() {

		return this.infoText;
	}

	public ExtensionData getExtension() {

		return this.extension;
	}

	public void setReferenceNum(Asn1BigInteger referenceNum) {

		this.referenceNum = referenceNum;
	}

	public void setReferenceIA5(String referenceIA5) {

		this.referenceIA5 = referenceIA5;
	}

	public void setProductOwnerNum(Long productOwnerNum) {

		this.productOwnerNum = productOwnerNum;
	}

	public void setProductOwnerIA5(String productOwnerIA5) {

		this.productOwnerIA5 = productOwnerIA5;
	}

	public void setProductIdNum(Long productIdNum) {

		this.productIdNum = productIdNum;
	}

	public void setProductIdIA5(String productIdIA5) {

		this.productIdIA5 = productIdIA5;
	}

	public void setPassType(Long passType) {

		this.passType = passType;
	}

	public void setPassDescription(String passDescription) {

		this.passDescription = passDescription;
	}

	public void setClassCode(TravelClassType classCode) {

		this.classCode = classCode;
	}

	public void setValidFromDay(Long validFromDay) {

		this.validFromDay = validFromDay;
	}

	public void setValidFromTime(Long validFromTime) {

		this.validFromTime = validFromTime;
	}

	public void setValidUntilDay(Long validUntilDay) {

		this.validUntilDay = validUntilDay;
	}

	public void setValidUntilTime(Long validUntilTime) {

		this.validUntilTime = validUntilTime;
	}

	public void setValidityPeriodDetails(ValidityPeriodDetailType validityPeriodDetails) {

		this.validityPeriodDetails = validityPeriodDetails;
	}

	public void setNumberOfValidityDays(Long numberOfValidityDays) {

		this.numberOfValidityDays = numberOfValidityDays;
	}

	public void setNumberOfPossibleTrips(Long numberOfPossibleTrips) {

		this.numberOfPossibleTrips = numberOfPossibleTrips;
	}

	public void setNumberOfDaysOfTravel(Long numberOfDaysOfTravel) {

		this.numberOfDaysOfTravel = numberOfDaysOfTravel;
	}

	public void setActivatedDay(SequenceOfActivatedDays activatedDay) {

		this.activatedDay = activatedDay;
	}

	public void setCountries(SequenceOfCountries countries) {

		this.countries = countries;
	}

	public void setIncludedCarriersNum(SequenceOfCarrierNum includedCarriersNum) {

		this.includedCarriersNum = includedCarriersNum;
	}

	public void setIncludedCarriersIA5(SequenceOfStringIA5 includedCarriersIA5) {

		this.includedCarriersIA5 = includedCarriersIA5;
	}

	public void setExcludedCarriersNum(SequenceOfCarrierNum excludedCarriersNum) {

		this.excludedCarriersNum = excludedCarriersNum;
	}

	public void setExcludedCarriersIA5(SequenceOfStringIA5 excludedCarriersIA5) {

		this.excludedCarriersIA5 = excludedCarriersIA5;
	}

	public void setIncludedServiceBrands(SequenceOfServiceBrands includedServiceBrands) {

		this.includedServiceBrands = includedServiceBrands;
	}

	public void setExcludedServiceBrands(SequenceOfServiceBrands excludedServiceBrands) {

		this.excludedServiceBrands = excludedServiceBrands;
	}

	public void setValidRegion(SequenceOfRegionalValidityType validRegion) {

		this.validRegion = validRegion;
	}

	public void setTariffs(SequenceOfTariffType tariffs) {

		this.tariffs = tariffs;
	}

	public void setInfoText(String infoText) {

		this.infoText = infoText;
	}

	public void setExtension(ExtensionData extension) {

		this.extension = extension;
	}

	public Long getPrice() {
		return Asn1BigInteger.toLong(price);
	}

	public void setPrice(Long price) {
		this.price = Asn1BigInteger.toAsn1(price);
	}

	public SequenceOfVatDetail getVatDetails() {
		return vatDetails;
	}

	public void setVatDetails(SequenceOfVatDetail vatDetails) {
		this.vatDetails = vatDetails;
	}

	public void addVatDetail(VatDetailType vatDetail) {
		if (this.vatDetails == null) {
			this.vatDetails = new SequenceOfVatDetail();
		}
		this.vatDetails.add(vatDetail);
	}
	
	public void setValidityDates (Date fromDate, Date untilDate, Date issuingDate){
		
		if (issuingDate == null || fromDate == null) return;
				
		this.validFromDay = DateTimeUtils.getDateDifference(issuingDate,fromDate);
		this.validFromTime =  DateTimeUtils.getTime(fromDate);

		if (untilDate != null){
			this.validUntilDay = DateTimeUtils.getDateDifference(fromDate, untilDate);
			this.validUntilTime = DateTimeUtils.getTime(untilDate);
		}

	}
	
	public Date getValidFromDate(Date issuingDate){
		
		return DateTimeUtils.getDate(issuingDate, this.validFromDay, this.validFromTime);
		
	}
	
	public Date getValidUntilDate(Date issuingDate){
		
		if (issuingDate == null) return null;
		
		if (this.validFromDay == null) {
			this.validFromDay = 0L;
		}
		
		if (this.validUntilDay == null) {
			return null;
		}		
		
		
		return DateTimeUtils.getDate(issuingDate, this.validFromDay + this.validUntilDay, this.validUntilTime);
		
	}
	
	public void setActivatedDays(Collection<Date> dates, Date issuingDate){
		
		if (this.activatedDay != null) {
			this.activatedDay.clear();
		} else {
			this.activatedDay= new SequenceOfActivatedDays();
		}
		
		if (dates != null && !dates.isEmpty()) {
			
			for (Date day : dates) {
				this.addActivatedDay(issuingDate, day);
			}
			
		}
		
	}
	
	public void addActivatedDay(Date issuingDate, Date day){
		
		Long dayDiff = DateTimeUtils.getDateDifference(issuingDate, day);
		
		if (this.activatedDay == null) {
			this.activatedDay = new SequenceOfActivatedDays();
		}
		
		if (dayDiff != null) {
			this.activatedDay.add(dayDiff);
		}
		
	}
	
	public Collection<Date> getActivatedDays(Date issuingDate) {
		
		if (this.activatedDay == null) return null;
		
		ArrayList<Date> dates = new ArrayList<Date>();
		
		for (Long diff: this.getActivatedDay()) {
			
			Date day = DateTimeUtils.getDate(issuingDate, diff, null);
			
			if (day != null) {
				dates.add(day);
			}
			
		}
				
		return dates;
		
	}	

	public Long getValidFromUTCOffset() {
		return validFromUTCOffset;
	}

	public void setValidFromUTCOffset(Long validFromUTCOffset) {
		this.validFromUTCOffset = validFromUTCOffset;
	}

	public Long getValidUntilUTCOffset() {
		return validUntilUTCOffset;
	}

	public void setValidUntilUTCOffset(Long validUntilUTCOffset) {
		this.validUntilUTCOffset = validUntilUTCOffset;
	}
	
	
	

}
