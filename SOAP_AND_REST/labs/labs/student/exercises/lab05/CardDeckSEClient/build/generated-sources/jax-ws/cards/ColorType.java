
package cards;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for colorType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="colorType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="WHITE"/>
 *     &lt;enumeration value="RED"/>
 *     &lt;enumeration value="BLACK"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "colorType", namespace = "urn:dukesdecks")
@XmlEnum
public enum ColorType {

    WHITE,
    RED,
    BLACK;

    public String value() {
        return name();
    }

    public static ColorType fromValue(String v) {
        return valueOf(v);
    }

}
