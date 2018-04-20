
package organiser_web_service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>demand complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="demand">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="date" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numberOfPeople" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="numberOfRoom" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "demand", propOrder = {
    "date",
    "name",
    "numberOfPeople",
    "numberOfRoom"
})
public class Demand {

    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar date;
    protected String name;
    protected int numberOfPeople;
    protected int numberOfRoom;

    /**
     * 获取date属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDate() {
        return date;
    }

    /**
     * 设置date属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDate(XMLGregorianCalendar value) {
        this.date = value;
    }

    /**
     * 获取name属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * 设置name属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * 获取numberOfPeople属性的值。
     * 
     */
    public int getNumberOfPeople() {
        return numberOfPeople;
    }

    /**
     * 设置numberOfPeople属性的值。
     * 
     */
    public void setNumberOfPeople(int value) {
        this.numberOfPeople = value;
    }

    /**
     * 获取numberOfRoom属性的值。
     * 
     */
    public int getNumberOfRoom() {
        return numberOfRoom;
    }

    /**
     * 设置numberOfRoom属性的值。
     * 
     */
    public void setNumberOfRoom(int value) {
        this.numberOfRoom = value;
    }

}
