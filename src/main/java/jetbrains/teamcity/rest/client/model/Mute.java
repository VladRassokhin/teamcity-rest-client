package jetbrains.teamcity.rest.client.model;

import com.google.api.client.util.Key;

import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for mute complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="mute">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="assignment" type="{}comment" minOccurs="0"/>
 *         &lt;element name="scope" type="{}problemScope" minOccurs="0"/>
 *         &lt;element name="target" type="{}problemTarget" minOccurs="0"/>
 *         &lt;element name="resolution" type="{}resolution" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}int" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */

@XmlType(name = "mute", propOrder = {
        "assignment",
        "scope",
        "target",
        "resolution"
})
public class Mute {

    public Comment assignment;
    public ProblemScope scope;
    public ProblemTarget target;
    public Resolution resolution;
    @Key("id")
    public Integer id;

}
