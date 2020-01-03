package org.uic.ticket.api.asn.omv1;

import java.util.Collection;

import net.gcdc.asn1.datatypes.Asn1SequenceOf;

public class SequenceOfTariffType extends Asn1SequenceOf<TariffType> {
    public SequenceOfTariffType() { super(); }
    public SequenceOfTariffType(Collection<TariffType> coll) { super(coll); }
}	