package jetbrains.teamcity.rest.client.model;

import javax.xml.bind.annotation.XmlType;

/**
 * <p>Java class for issueUsage complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="issueUsage">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}changes" minOccurs="0"/>
 *         &lt;element name="issue" type="{}issue" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */

@XmlType(name = "issueUsage", propOrder = {
        "changes",
        "issue"
})
public class IssueUsage {

    public Changes changes;
    public Issue issue;

}
