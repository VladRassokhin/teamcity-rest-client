package jetbrains.teamcity.rest.client.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for propEntitySnapshotDep complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="propEntitySnapshotDep">
 *   &lt;complexContent>
 *     &lt;extension base="{}propEntity">
 *       &lt;sequence>
 *         &lt;element name="source-buildType" type="{}buildType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */

@XmlType(name = "propEntitySnapshotDep", propOrder = {
        "sourceBuildType"
})
public class PropEntitySnapshotDep
        extends PropEntity {

    @XmlElement(name = "source-buildType")
    public BuildType sourceBuildType;

}
