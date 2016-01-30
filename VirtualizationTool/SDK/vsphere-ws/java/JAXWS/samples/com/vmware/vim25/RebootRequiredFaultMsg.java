
package com.vmware.vim25;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.4-b01-
 * Generated source version: 2.1
 * 
 */
@WebFault(name = "RebootRequiredFault", targetNamespace = "urn:vim25")
public class RebootRequiredFaultMsg
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private RebootRequired faultInfo;

    /**
     * 
     * @param message
     * @param faultInfo
     */
    public RebootRequiredFaultMsg(String message, RebootRequired faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param message
     * @param faultInfo
     * @param cause
     */
    public RebootRequiredFaultMsg(String message, RebootRequired faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: com.vmware.vim25.RebootRequired
     */
    public RebootRequired getFaultInfo() {
        return faultInfo;
    }

}
