
package jetbrains.teamcity.rest.client.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for investigations complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="investigations">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}investigation" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="count" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="nextHref" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="prevHref" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="href" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "investigations", propOrder = {
    "investigation"
})
public class Investigations {

    public List<Investigation> investigation;
    @XmlAttribute(name = "count")
    public Integer count;
    @XmlAttribute(name = "nextHref")
    public String nextHref;
    @XmlAttribute(name = "prevHref")
    public String prevHref;
    @XmlAttribute(name = "href")
    public String href;

}