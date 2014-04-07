
package generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for buildTriggeringOptions complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="buildTriggeringOptions">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="rebuildDependencies" type="{}buildTypes" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="cleanSources" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="rebuildAllDependencies" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="queueAtTop" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "buildTriggeringOptions", propOrder = {
    "rebuildDependencies"
})
public class BuildTriggeringOptions {

    protected BuildTypes rebuildDependencies;
    @XmlAttribute(name = "cleanSources")
    protected Boolean cleanSources;
    @XmlAttribute(name = "rebuildAllDependencies")
    protected Boolean rebuildAllDependencies;
    @XmlAttribute(name = "queueAtTop")
    protected Boolean queueAtTop;

    /**
     * Gets the value of the rebuildDependencies property.
     * 
     * @return
     *     possible object is
     *     {@link BuildTypes }
     *     
     */
    public BuildTypes getRebuildDependencies() {
        return rebuildDependencies;
    }

    /**
     * Sets the value of the rebuildDependencies property.
     * 
     * @param value
     *     allowed object is
     *     {@link BuildTypes }
     *     
     */
    public void setRebuildDependencies(BuildTypes value) {
        this.rebuildDependencies = value;
    }

    /**
     * Gets the value of the cleanSources property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCleanSources() {
        return cleanSources;
    }

    /**
     * Sets the value of the cleanSources property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCleanSources(Boolean value) {
        this.cleanSources = value;
    }

    /**
     * Gets the value of the rebuildAllDependencies property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRebuildAllDependencies() {
        return rebuildAllDependencies;
    }

    /**
     * Sets the value of the rebuildAllDependencies property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRebuildAllDependencies(Boolean value) {
        this.rebuildAllDependencies = value;
    }

    /**
     * Gets the value of the queueAtTop property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isQueueAtTop() {
        return queueAtTop;
    }

    /**
     * Sets the value of the queueAtTop property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setQueueAtTop(Boolean value) {
        this.queueAtTop = value;
    }

}
