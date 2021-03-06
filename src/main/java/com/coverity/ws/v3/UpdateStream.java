package com.coverity.ws.v3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for updateStream complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="updateStream">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="streamId" type="{http://ws.coverity.com/v3}streamIdDataObj" minOccurs="0"/>
 *         &lt;element name="streamSpec" type="{http://ws.coverity.com/v3}streamSpecDataObj" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "updateStream", propOrder = {
    "streamId",
    "streamSpec"
})
public class UpdateStream {

    protected StreamIdDataObj streamId;
    protected StreamSpecDataObj streamSpec;

    /**
     * Gets the value of the streamId property.
     * 
     * @return
     *     possible object is
     *     {@link com.coverity.ws.v3.StreamIdDataObj }
     *     
     */
    public StreamIdDataObj getStreamId() {
        return streamId;
    }

    /**
     * Sets the value of the streamId property.
     * 
     * @param value
     *     allowed object is
     *     {@link com.coverity.ws.v3.StreamIdDataObj }
     *     
     */
    public void setStreamId(StreamIdDataObj value) {
        this.streamId = value;
    }

    /**
     * Gets the value of the streamSpec property.
     * 
     * @return
     *     possible object is
     *     {@link com.coverity.ws.v3.StreamSpecDataObj }
     *     
     */
    public StreamSpecDataObj getStreamSpec() {
        return streamSpec;
    }

    /**
     * Sets the value of the streamSpec property.
     * 
     * @param value
     *     allowed object is
     *     {@link com.coverity.ws.v3.StreamSpecDataObj }
     *     
     */
    public void setStreamSpec(StreamSpecDataObj value) {
        this.streamSpec = value;
    }

}
