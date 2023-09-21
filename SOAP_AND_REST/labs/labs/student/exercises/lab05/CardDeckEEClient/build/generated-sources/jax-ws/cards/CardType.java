
package cards;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for cardType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="cardType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="rank" type="{urn:dukesdecks}rankType"/>
 *         &lt;choice>
 *           &lt;element name="suit" type="{urn:dukesdecks}suitType"/>
 *           &lt;element name="color" type="{urn:dukesdecks}colorType"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cardType", namespace = "urn:dukesdecks", propOrder = {
    "rank",
    "suit",
    "color"
})
public class CardType {

    @XmlElement(namespace = "urn:dukesdecks", required = true)
    protected String rank;
    @XmlElement(namespace = "urn:dukesdecks")
    protected SuitType suit;
    @XmlElement(namespace = "urn:dukesdecks")
    protected ColorType color;

    /**
     * Gets the value of the rank property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRank() {
        return rank;
    }

    /**
     * Sets the value of the rank property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRank(String value) {
        this.rank = value;
    }

    /**
     * Gets the value of the suit property.
     * 
     * @return
     *     possible object is
     *     {@link SuitType }
     *     
     */
    public SuitType getSuit() {
        return suit;
    }

    /**
     * Sets the value of the suit property.
     * 
     * @param value
     *     allowed object is
     *     {@link SuitType }
     *     
     */
    public void setSuit(SuitType value) {
        this.suit = value;
    }

    /**
     * Gets the value of the color property.
     * 
     * @return
     *     possible object is
     *     {@link ColorType }
     *     
     */
    public ColorType getColor() {
        return color;
    }

    /**
     * Sets the value of the color property.
     * 
     * @param value
     *     allowed object is
     *     {@link ColorType }
     *     
     */
    public void setColor(ColorType value) {
        this.color = value;
    }

}
