/**
 * Services_PortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package Services;

public interface Services_PortType extends java.rmi.Remote {
    public java.lang.String getCurrentVersion(boolean mInfo) throws java.rmi.RemoteException;
    public Services.ReturnMessage signoutUserByUserId(java.lang.String userId, java.lang.String username, java.lang.String password) throws java.rmi.RemoteException;
    public Services.ReturnMessage signoutUserByUserNin(long userNin, java.lang.String username, java.lang.String password) throws java.rmi.RemoteException;
    public java.lang.String getActiveUser(java.lang.String ip, java.lang.String username, java.lang.String password) throws java.rmi.RemoteException;
    public Services.ReturnMessage saveSeriSerialChange(Services.ChangeInfo info, java.lang.String username, java.lang.String password) throws java.rmi.RemoteException;
    public Services.ReturnMessage saveImageChange(Services.ChangeImageInfo info, java.lang.String username, java.lang.String password) throws java.rmi.RemoteException;
    public Services.ReturnMessage shenasnameConfirm(Services.ShenasnameInfo shenasnameInfo, java.lang.String username, java.lang.String password) throws java.rmi.RemoteException;
    public Services.MarriagesInfo getPersonMarriages(long personNin, java.lang.String username, java.lang.String password) throws java.rmi.RemoteException;
    public Services.MarriagesInfo getParentsMarriages(long husbandNin, long wifeNin, java.lang.String username, java.lang.String password) throws java.rmi.RemoteException;
    public Services.DivorcesInfo getPersonDivorces(long personNin, java.lang.String username, java.lang.String password) throws java.rmi.RemoteException;
    public Services.DivorcesInfo getParentsDivorces(long husbandNin, long wifeNin, java.lang.String username, java.lang.String password) throws java.rmi.RemoteException;
    public Services.ReturnMessage signinUser(Services.SigninInfo info, java.lang.String username, java.lang.String password) throws java.rmi.RemoteException;
    public boolean isActiveUser(java.lang.String userId, java.lang.String username, java.lang.String password) throws java.rmi.RemoteException;
    public Services.ReturnMessage saveBirth(Services.BirthInfo birthInfo, java.lang.String username, java.lang.String password) throws java.rmi.RemoteException;
    public Services.ReturnMessage sanadConfirm(Services.SanadInfo sanadInfo, java.lang.String username, java.lang.String password) throws java.rmi.RemoteException;
    public Services.ReturnMessage saveDeath(Services.DeathInfo deathInfo, java.lang.String username, java.lang.String password) throws java.rmi.RemoteException;
    public Services.ReturnMessage saveMarriage(Services.WifeInfo husbandInfo, Services.WifeInfo wifeInfo, Services.MarriageInfo marriageInfo, java.lang.String username, java.lang.String password) throws java.rmi.RemoteException;
    public Services.ReturnMessage saveDivorce(Services.WifeInfo husbandInfo, Services.WifeInfo wifeInfo, Services.DivorceInfo divorceInfo, java.lang.String username, java.lang.String password) throws java.rmi.RemoteException;
    public Services.ReturnMessage finalConfirmedShenasname(Services.ShenasnameInfo shenasnameInfo, java.lang.String username, java.lang.String password) throws java.rmi.RemoteException;
}
