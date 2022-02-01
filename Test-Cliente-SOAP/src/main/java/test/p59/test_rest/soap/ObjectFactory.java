
package test.p59.test_rest.soap;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the test.p59.test_rest.soap package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetVehiculos_QNAME = new QName("http://soap.Test_Rest.p59.test/", "getVehiculos");
    private final static QName _GetVehiculosResponse_QNAME = new QName("http://soap.Test_Rest.p59.test/", "getVehiculosResponse");
    private final static QName _InsertarVehiculo_QNAME = new QName("http://soap.Test_Rest.p59.test/", "insertarVehiculo");
    private final static QName _InsertarVehiculoResponse_QNAME = new QName("http://soap.Test_Rest.p59.test/", "insertarVehiculoResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: test.p59.test_rest.soap
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetVehiculos }
     * 
     */
    public GetVehiculos createGetVehiculos() {
        return new GetVehiculos();
    }

    /**
     * Create an instance of {@link InsertarVehiculoResponse }
     * 
     */
    public InsertarVehiculoResponse createInsertarVehiculoResponse() {
        return new InsertarVehiculoResponse();
    }

    /**
     * Create an instance of {@link GetVehiculosResponse }
     * 
     */
    public GetVehiculosResponse createGetVehiculosResponse() {
        return new GetVehiculosResponse();
    }

    /**
     * Create an instance of {@link InsertarVehiculo }
     * 
     */
    public InsertarVehiculo createInsertarVehiculo() {
        return new InsertarVehiculo();
    }

    /**
     * Create an instance of {@link Persona }
     * 
     */
    public Persona createPersona() {
        return new Persona();
    }

    /**
     * Create an instance of {@link Vehiculo }
     * 
     */
    public Vehiculo createVehiculo() {
        return new Vehiculo();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetVehiculos }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.Test_Rest.p59.test/", name = "getVehiculos")
    public JAXBElement<GetVehiculos> createGetVehiculos(GetVehiculos value) {
        return new JAXBElement<GetVehiculos>(_GetVehiculos_QNAME, GetVehiculos.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetVehiculosResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.Test_Rest.p59.test/", name = "getVehiculosResponse")
    public JAXBElement<GetVehiculosResponse> createGetVehiculosResponse(GetVehiculosResponse value) {
        return new JAXBElement<GetVehiculosResponse>(_GetVehiculosResponse_QNAME, GetVehiculosResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertarVehiculo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.Test_Rest.p59.test/", name = "insertarVehiculo")
    public JAXBElement<InsertarVehiculo> createInsertarVehiculo(InsertarVehiculo value) {
        return new JAXBElement<InsertarVehiculo>(_InsertarVehiculo_QNAME, InsertarVehiculo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertarVehiculoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.Test_Rest.p59.test/", name = "insertarVehiculoResponse")
    public JAXBElement<InsertarVehiculoResponse> createInsertarVehiculoResponse(InsertarVehiculoResponse value) {
        return new JAXBElement<InsertarVehiculoResponse>(_InsertarVehiculoResponse_QNAME, InsertarVehiculoResponse.class, null, value);
    }

}
