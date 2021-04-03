
package server;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for addBooleanOnServer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="addBooleanOnServer">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="b" type="{http://server/}booleanContainer" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addBooleanOnServer", propOrder = {
    "b"
})
public class AddBooleanOnServer {

    protected BooleanContainer b;

    /**
     * Gets the value of the b property.
     * 
     * @return
     *     possible object is
     *     {@link BooleanContainer }
     *     
     */
    public BooleanContainer getB() {
        return b;
    }

    /**
     * Sets the value of the b property.
     * 
     * @param value
     *     allowed object is
     *     {@link BooleanContainer }
     *     
     */
    public void setB(BooleanContainer value) {
        this.b = value;
    }

}
