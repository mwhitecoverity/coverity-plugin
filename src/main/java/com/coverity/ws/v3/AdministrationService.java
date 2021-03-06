package com.coverity.ws.v3;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.7-b01-
 * Generated source version: 2.1
 * 
 */
@WebService(name = "AdministrationService", targetNamespace = "http://ws.coverity.com/v3")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface AdministrationService {


    /**
     * 
     * @param message
     * @param usernames
     * @param subject
     * @return
     *     returns java.util.List<java.lang.String>
     * @throws CovRemoteServiceException_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "notify", targetNamespace = "http://ws.coverity.com/v3", className = "com.coverity.ws.v3.Notify")
    @ResponseWrapper(localName = "notifyResponse", targetNamespace = "http://ws.coverity.com/v3", className = "com.coverity.ws.v3.NotifyResponse")
    public List<String> notify(
            @WebParam(name = "usernames", targetNamespace = "")
            List<String> usernames,
            @WebParam(name = "subject", targetNamespace = "")
            String subject,
            @WebParam(name = "message", targetNamespace = "")
            String message)
        throws CovRemoteServiceException_Exception
    ;

    /**
     * 
     * @param groupId
     * @return
     *     returns com.coverity.ws.v3.GroupDataObj
     * @throws CovRemoteServiceException_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getGroup", targetNamespace = "http://ws.coverity.com/v3", className = "com.coverity.ws.v3.GetGroup")
    @ResponseWrapper(localName = "getGroupResponse", targetNamespace = "http://ws.coverity.com/v3", className = "com.coverity.ws.v3.GetGroupResponse")
    public GroupDataObj getGroup(
            @WebParam(name = "groupId", targetNamespace = "")
            GroupIdDataObj groupId)
        throws CovRemoteServiceException_Exception
    ;

    /**
     * 
     * @return
     *     returns java.util.List<com.coverity.ws.v3.RoleDataObj>
     * @throws CovRemoteServiceException_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getAllRoles", targetNamespace = "http://ws.coverity.com/v3", className = "com.coverity.ws.v3.GetAllRoles")
    @ResponseWrapper(localName = "getAllRolesResponse", targetNamespace = "http://ws.coverity.com/v3", className = "com.coverity.ws.v3.GetAllRolesResponse")
    public List<RoleDataObj> getAllRoles()
        throws CovRemoteServiceException_Exception
    ;

    /**
     * 
     * @param groupSpec
     * @throws CovRemoteServiceException_Exception
     */
    @WebMethod
    @RequestWrapper(localName = "createGroup", targetNamespace = "http://ws.coverity.com/v3", className = "com.coverity.ws.v3.CreateGroup")
    @ResponseWrapper(localName = "createGroupResponse", targetNamespace = "http://ws.coverity.com/v3", className = "com.coverity.ws.v3.CreateGroupResponse")
    public void createGroup(
            @WebParam(name = "groupSpec", targetNamespace = "")
            GroupSpecDataObj groupSpec)
        throws CovRemoteServiceException_Exception
    ;

    /**
     * 
     * @param pageSpec
     * @return
     *     returns com.coverity.ws.v3.GroupsPageDataObj
     * @throws CovRemoteServiceException_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getAllGroups", targetNamespace = "http://ws.coverity.com/v3", className = "com.coverity.ws.v3.GetAllGroups")
    @ResponseWrapper(localName = "getAllGroupsResponse", targetNamespace = "http://ws.coverity.com/v3", className = "com.coverity.ws.v3.GetAllGroupsResponse")
    public GroupsPageDataObj getAllGroups(
            @WebParam(name = "pageSpec", targetNamespace = "")
            PageSpecDataObj pageSpec)
        throws CovRemoteServiceException_Exception
    ;

    /**
     * 
     * @param groupId
     * @throws CovRemoteServiceException_Exception
     */
    @WebMethod
    @RequestWrapper(localName = "deleteGroup", targetNamespace = "http://ws.coverity.com/v3", className = "com.coverity.ws.v3.DeleteGroup")
    @ResponseWrapper(localName = "deleteGroupResponse", targetNamespace = "http://ws.coverity.com/v3", className = "com.coverity.ws.v3.DeleteGroupResponse")
    public void deleteGroup(
            @WebParam(name = "groupId", targetNamespace = "")
            GroupIdDataObj groupId)
        throws CovRemoteServiceException_Exception
    ;

    /**
     * 
     * @param username
     * @param userSpec
     * @throws CovRemoteServiceException_Exception
     */
    @WebMethod
    @RequestWrapper(localName = "updateUser", targetNamespace = "http://ws.coverity.com/v3", className = "com.coverity.ws.v3.UpdateUser")
    @ResponseWrapper(localName = "updateUserResponse", targetNamespace = "http://ws.coverity.com/v3", className = "com.coverity.ws.v3.UpdateUserResponse")
    public void updateUser(
            @WebParam(name = "username", targetNamespace = "")
            String username,
            @WebParam(name = "userSpec", targetNamespace = "")
            UserSpecDataObj userSpec)
        throws CovRemoteServiceException_Exception
    ;

    /**
     * 
     * @param username
     * @throws CovRemoteServiceException_Exception
     */
    @WebMethod
    @RequestWrapper(localName = "deleteUser", targetNamespace = "http://ws.coverity.com/v3", className = "com.coverity.ws.v3.DeleteUser")
    @ResponseWrapper(localName = "deleteUserResponse", targetNamespace = "http://ws.coverity.com/v3", className = "com.coverity.ws.v3.DeleteUserResponse")
    public void deleteUser(
            @WebParam(name = "username", targetNamespace = "")
            String username)
        throws CovRemoteServiceException_Exception
    ;

    /**
     * 
     * @param username
     * @return
     *     returns com.coverity.ws.v3.UserDataObj
     * @throws CovRemoteServiceException_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getUser", targetNamespace = "http://ws.coverity.com/v3", className = "com.coverity.ws.v3.GetUser")
    @ResponseWrapper(localName = "getUserResponse", targetNamespace = "http://ws.coverity.com/v3", className = "com.coverity.ws.v3.GetUserResponse")
    public UserDataObj getUser(
            @WebParam(name = "username", targetNamespace = "")
            String username)
        throws CovRemoteServiceException_Exception
    ;

    /**
     * 
     * @param userSpec
     * @throws CovRemoteServiceException_Exception
     */
    @WebMethod
    @RequestWrapper(localName = "createUser", targetNamespace = "http://ws.coverity.com/v3", className = "com.coverity.ws.v3.CreateUser")
    @ResponseWrapper(localName = "createUserResponse", targetNamespace = "http://ws.coverity.com/v3", className = "com.coverity.ws.v3.CreateUserResponse")
    public void createUser(
            @WebParam(name = "userSpec", targetNamespace = "")
            UserSpecDataObj userSpec)
        throws CovRemoteServiceException_Exception
    ;

    /**
     * 
     * @param pageSpec
     * @return
     *     returns com.coverity.ws.v3.UsersPageDataObj
     * @throws CovRemoteServiceException_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getAssignableUsers", targetNamespace = "http://ws.coverity.com/v3", className = "com.coverity.ws.v3.GetAssignableUsers")
    @ResponseWrapper(localName = "getAssignableUsersResponse", targetNamespace = "http://ws.coverity.com/v3", className = "com.coverity.ws.v3.GetAssignableUsersResponse")
    public UsersPageDataObj getAssignableUsers(
            @WebParam(name = "pageSpec", targetNamespace = "")
            PageSpecDataObj pageSpec)
        throws CovRemoteServiceException_Exception
    ;

    /**
     * 
     * @param groupId
     * @return
     *     returns java.util.List<com.coverity.ws.v3.UserDataObj>
     * @throws CovRemoteServiceException_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getUsersForGroup", targetNamespace = "http://ws.coverity.com/v3", className = "com.coverity.ws.v3.GetUsersForGroup")
    @ResponseWrapper(localName = "getUsersForGroupResponse", targetNamespace = "http://ws.coverity.com/v3", className = "com.coverity.ws.v3.GetUsersForGroupResponse")
    public List<UserDataObj> getUsersForGroup(
            @WebParam(name = "groupId", targetNamespace = "")
            GroupIdDataObj groupId)
        throws CovRemoteServiceException_Exception
    ;

    /**
     * 
     * @param groupSpec
     * @param groupId
     * @throws CovRemoteServiceException_Exception
     */
    @WebMethod
    @RequestWrapper(localName = "updateGroup", targetNamespace = "http://ws.coverity.com/v3", className = "com.coverity.ws.v3.UpdateGroup")
    @ResponseWrapper(localName = "updateGroupResponse", targetNamespace = "http://ws.coverity.com/v3", className = "com.coverity.ws.v3.UpdateGroupResponse")
    public void updateGroup(
            @WebParam(name = "groupId", targetNamespace = "")
            GroupIdDataObj groupId,
            @WebParam(name = "groupSpec", targetNamespace = "")
            GroupSpecDataObj groupSpec)
        throws CovRemoteServiceException_Exception
    ;

    /**
     * 
     * @return
     *     returns javax.xml.datatype.XMLGregorianCalendar
     * @throws CovRemoteServiceException_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getServerTime", targetNamespace = "http://ws.coverity.com/v3", className = "com.coverity.ws.v3.GetServerTime")
    @ResponseWrapper(localName = "getServerTimeResponse", targetNamespace = "http://ws.coverity.com/v3", className = "com.coverity.ws.v3.GetServerTimeResponse")
    public XMLGregorianCalendar getServerTime()
        throws CovRemoteServiceException_Exception
    ;

}
