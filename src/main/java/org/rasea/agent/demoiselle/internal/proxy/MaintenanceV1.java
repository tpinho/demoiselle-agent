
package org.rasea.agent.demoiselle.internal.proxy;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.3-b02-
 * Generated source version: 2.1
 * 
 */
@WebService(name = "Maintenance_v1", targetNamespace = "http://rasea.org/ps/wsdl/Maintenance_v1")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface MaintenanceV1 {


    /**
     * 
     * @param addOperation
     * @param arg1
     * @throws WebServiceFault
     */
    @WebMethod
    public void addOperation(
        @WebParam(name = "addOperation", targetNamespace = "http://rasea.org/ps/wsdl/Maintenance_v1", partName = "addOperation")
        OperationRequest addOperation,
        @WebParam(name = "arg1", targetNamespace = "http://rasea.org/ps/wsdl/Maintenance_v1", header = true, partName = "arg1")
        Credentials arg1)
        throws WebServiceFault
    ;

    /**
     * 
     * @param arg1
     * @param addResource
     * @throws WebServiceFault
     */
    @WebMethod
    public void addResource(
        @WebParam(name = "addResource", targetNamespace = "http://rasea.org/ps/wsdl/Maintenance_v1", partName = "addResource")
        ResourceRequest addResource,
        @WebParam(name = "arg1", targetNamespace = "http://rasea.org/ps/wsdl/Maintenance_v1", header = true, partName = "arg1")
        Credentials arg1)
        throws WebServiceFault
    ;

    /**
     * 
     * @param addPermission
     * @param arg1
     * @throws WebServiceFault
     */
    @WebMethod
    public void addPermission(
        @WebParam(name = "addPermission", targetNamespace = "http://rasea.org/ps/wsdl/Maintenance_v1", partName = "addPermission")
        PermissionRequest addPermission,
        @WebParam(name = "arg1", targetNamespace = "http://rasea.org/ps/wsdl/Maintenance_v1", header = true, partName = "arg1")
        Credentials arg1)
        throws WebServiceFault
    ;

    /**
     * 
     * @param arg1
     * @param addApplication
     * @throws WebServiceFault
     */
    @WebMethod
    public void addApplication(
        @WebParam(name = "addApplication", targetNamespace = "http://rasea.org/ps/wsdl/Maintenance_v1", partName = "addApplication")
        ApplicationRequest addApplication,
        @WebParam(name = "arg1", targetNamespace = "http://rasea.org/ps/wsdl/Maintenance_v1", header = true, partName = "arg1")
        Credentials arg1)
        throws WebServiceFault
    ;

    /**
     * 
     * @param arg1
     * @param deletePermission
     * @throws WebServiceFault
     */
    @WebMethod
    public void deletePermission(
        @WebParam(name = "deletePermission", targetNamespace = "http://rasea.org/ps/wsdl/Maintenance_v1", partName = "deletePermission")
        PermissionRequest deletePermission,
        @WebParam(name = "arg1", targetNamespace = "http://rasea.org/ps/wsdl/Maintenance_v1", header = true, partName = "arg1")
        Credentials arg1)
        throws WebServiceFault
    ;

    /**
     * 
     * @param arg1
     * @param applicationDetail
     * @return
     *     returns org.rasea.agent.demoiselle.internal.proxy.ApplicationType
     * @throws WebServiceFault
     */
    @WebMethod
    @WebResult(name = "application", targetNamespace = "http://rasea.org/ps/wsdl/Maintenance_v1", partName = "application")
    public ApplicationType applicationDetail(
        @WebParam(name = "applicationDetail", targetNamespace = "http://rasea.org/ps/wsdl/Maintenance_v1", partName = "applicationDetail")
        ApplicationNameRequest applicationDetail,
        @WebParam(name = "arg1", targetNamespace = "http://rasea.org/ps/wsdl/Maintenance_v1", header = true, partName = "arg1")
        Credentials arg1)
        throws WebServiceFault
    ;

    /**
     * 
     * @param assignOwner
     * @param arg1
     * @throws WebServiceFault
     */
    @WebMethod
    public void assignOwner(
        @WebParam(name = "assignOwner", targetNamespace = "http://rasea.org/ps/wsdl/Maintenance_v1", partName = "assignOwner")
        UserNameRequest assignOwner,
        @WebParam(name = "arg1", targetNamespace = "http://rasea.org/ps/wsdl/Maintenance_v1", header = true, partName = "arg1")
        Credentials arg1)
        throws WebServiceFault
    ;

    /**
     * 
     * @param arg1
     * @param deassignOwner
     * @throws WebServiceFault
     */
    @WebMethod
    public void deassignOwner(
        @WebParam(name = "deassignOwner", targetNamespace = "http://rasea.org/ps/wsdl/Maintenance_v1", partName = "deassignOwner")
        UserNameRequest deassignOwner,
        @WebParam(name = "arg1", targetNamespace = "http://rasea.org/ps/wsdl/Maintenance_v1", header = true, partName = "arg1")
        Credentials arg1)
        throws WebServiceFault
    ;

    /**
     * 
     * @param arg1
     * @param deleteApplication
     * @throws WebServiceFault
     */
    @WebMethod
    public void deleteApplication(
        @WebParam(name = "deleteApplication", targetNamespace = "http://rasea.org/ps/wsdl/Maintenance_v1", partName = "deleteApplication")
        ApplicationNameRequest deleteApplication,
        @WebParam(name = "arg1", targetNamespace = "http://rasea.org/ps/wsdl/Maintenance_v1", header = true, partName = "arg1")
        Credentials arg1)
        throws WebServiceFault
    ;

    /**
     * 
     * @param deleteOperation
     * @param arg1
     * @throws WebServiceFault
     */
    @WebMethod
    public void deleteOperation(
        @WebParam(name = "deleteOperation", targetNamespace = "http://rasea.org/ps/wsdl/Maintenance_v1", partName = "deleteOperation")
        OperationNameRequest deleteOperation,
        @WebParam(name = "arg1", targetNamespace = "http://rasea.org/ps/wsdl/Maintenance_v1", header = true, partName = "arg1")
        Credentials arg1)
        throws WebServiceFault
    ;

    /**
     * 
     * @param deleteResource
     * @param arg1
     * @throws WebServiceFault
     */
    @WebMethod
    public void deleteResource(
        @WebParam(name = "deleteResource", targetNamespace = "http://rasea.org/ps/wsdl/Maintenance_v1", partName = "deleteResource")
        ResourceNameRequest deleteResource,
        @WebParam(name = "arg1", targetNamespace = "http://rasea.org/ps/wsdl/Maintenance_v1", header = true, partName = "arg1")
        Credentials arg1)
        throws WebServiceFault
    ;

    /**
     * 
     * @param operationDetail
     * @param arg1
     * @return
     *     returns org.rasea.agent.demoiselle.internal.proxy.OperationType
     * @throws WebServiceFault
     */
    @WebMethod
    @WebResult(name = "operation", targetNamespace = "http://rasea.org/ps/wsdl/Maintenance_v1", partName = "operation")
    public OperationType operationDetail(
        @WebParam(name = "operationDetail", targetNamespace = "http://rasea.org/ps/wsdl/Maintenance_v1", partName = "operationDetail")
        OperationNameRequest operationDetail,
        @WebParam(name = "arg1", targetNamespace = "http://rasea.org/ps/wsdl/Maintenance_v1", header = true, partName = "arg1")
        Credentials arg1)
        throws WebServiceFault
    ;

    /**
     * 
     * @param arg1
     * @param resourceDetail
     * @return
     *     returns org.rasea.agent.demoiselle.internal.proxy.ResourceType
     * @throws WebServiceFault
     */
    @WebMethod
    @WebResult(name = "resource", targetNamespace = "http://rasea.org/ps/wsdl/Maintenance_v1", partName = "resource")
    public ResourceType resourceDetail(
        @WebParam(name = "resourceDetail", targetNamespace = "http://rasea.org/ps/wsdl/Maintenance_v1", partName = "resourceDetail")
        ResourceNameRequest resourceDetail,
        @WebParam(name = "arg1", targetNamespace = "http://rasea.org/ps/wsdl/Maintenance_v1", header = true, partName = "arg1")
        Credentials arg1)
        throws WebServiceFault
    ;

    /**
     * 
     * @param arg1
     * @param resourceOperations
     * @return
     *     returns org.rasea.agent.demoiselle.internal.proxy.OperationsResponse
     * @throws WebServiceFault
     */
    @WebMethod
    @WebResult(name = "operations", targetNamespace = "http://rasea.org/ps/wsdl/Maintenance_v1", partName = "operations")
    public OperationsResponse resourceOperations(
        @WebParam(name = "resourceOperations", targetNamespace = "http://rasea.org/ps/wsdl/Maintenance_v1", partName = "resourceOperations")
        ResourceNameRequest resourceOperations,
        @WebParam(name = "arg1", targetNamespace = "http://rasea.org/ps/wsdl/Maintenance_v1", header = true, partName = "arg1")
        Credentials arg1)
        throws WebServiceFault
    ;

}
