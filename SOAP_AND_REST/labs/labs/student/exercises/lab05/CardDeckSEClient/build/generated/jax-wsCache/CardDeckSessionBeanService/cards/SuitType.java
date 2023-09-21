
package cards;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for suitType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="suitType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CLUBS"/>
 *     &lt;enumeration value="DIAMONDS"/>
 *     &lt;enumeration value="HEARTS"/>
 *     &lt;enumeration value="SPADES"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "suitType", namespace = "urn:dukesdecks")
@XmlEnum
public enum SuitType {

    CLUBS,
    DIAMONDS,
    HEARTS,
    SPADES;

    public String value() {
        return name();
    }

    public static SuitType fromValue(String v) {
        return valueOf(v);
    }

}
