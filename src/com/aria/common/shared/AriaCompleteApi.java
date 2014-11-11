package com.aria.common.shared;

import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * WSDL definition for complete
 *
 * This class was generated by Apache CXF 2.7.6
 * 2013-08-13T10:48:37.695-07:00
 * Generated source version: 2.7.6
 *
 */
@WebServiceClient(name = "aria_complete_api",
                  wsdlLocation = "D:/file.xml",
                  targetNamespace = "urn:client:api:wsdl:document/literal_wrapped:vers:6.27:aria_complete_api")
public class AriaCompleteApi extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("urn:client:api:wsdl:document/literal_wrapped:vers:6.27:aria_complete_api", "aria_complete_api");
    public final static QName CompletePort = new QName("urn:client:api:wsdl:document/literal_wrapped:vers:6.27:aria_complete_api", "completePort");
    static {
        URL url = AriaCompleteApi.class.getResource("D:/file.xml");
        if (url == null) {
            url = AriaCompleteApi.class.getClassLoader().getResource("D:/file.xml");
        }
        if (url == null) {
            java.util.logging.Logger.getLogger(AriaCompleteApi.class.getName())
                .log(java.util.logging.Level.INFO,
                     "Can not initialize the default wsdl from {0}", "D:/file.xml");
        }
        WSDL_LOCATION = url;
    }

    public AriaCompleteApi(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public AriaCompleteApi(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public AriaCompleteApi() {
        super(WSDL_LOCATION, SERVICE);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public AriaCompleteApi(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public AriaCompleteApi(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public AriaCompleteApi(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     *
     * @return
     *     returns CompletePort
     */
    @WebEndpoint(name = "completePort")
    public CompletePort getCompletePort() {
        return super.getPort(CompletePort, CompletePort.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns CompletePort
     */
    @WebEndpoint(name = "completePort")
    public CompletePort getCompletePort(WebServiceFeature... features) {
        return super.getPort(CompletePort, CompletePort.class, features);
    }

}
