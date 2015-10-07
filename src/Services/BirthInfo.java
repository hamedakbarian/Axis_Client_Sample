/**
 * BirthInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package Services;

public class BirthInfo  implements java.io.Serializable {
    private java.lang.String addressGeoSerial;

    private Services.AnnouncerInfo announcer1;

    private Services.AnnouncerInfo announcer2;

    private short announcerRelationCode;

    private java.lang.String birthGeoSerial;

    private short birthRegstSourceCode;

    private java.lang.String dateOfBirthSun;

    private java.lang.String fatherAddress;

    private java.lang.String fatherDateOfBirth;

    private java.lang.String fatherFname;

    private short fatherHozehCode;

    private java.lang.String fatherHozehKind;

    private java.lang.String fatherName;

    private long fatherNin;

    private short fatherOfficeCode;

    private int fatherShenasNo;

    private java.lang.String fatherShenasSeri;

    private int fatherShenasSrno;

    private long fatherZipCode;

    private java.lang.String foreginCityName;

    private java.lang.String foreginStateName;

    private java.lang.String hozehCode;

    private java.lang.String hozehKind;

    private java.lang.String mamoorId;

    private java.lang.String moludSeqCode;

    private java.lang.String motherAddress;

    private java.lang.String motherDateOfBirth;

    private java.lang.String motherFname;

    private short motherHozehCode;

    private java.lang.String motherHozehKind;

    private java.lang.String motherName;

    private long motherNin;

    private short motherOfficeCode;

    private int motherShenasNo;

    private java.lang.String motherShenasSeri;

    private int motherShenasSrno;

    private long motherZipCode;

    private java.lang.String officeCode;

    private java.lang.String ordinaryDehgardeshi;

    private java.lang.String parentDateOfMarriage;

    private java.lang.String parentMarrRegstNo;

    private java.lang.String parentRegstOfficeGeo;

    private java.lang.String parentRegstOfficeNo;

    private java.lang.String personAddress;

    private java.lang.String personFname;

    private java.lang.String personName;

    private long personNin;

    private long personZipCode;

    private java.lang.String religionKind;

    private java.lang.String remarks;

    private java.lang.String sanadIssueOffice;

    private java.lang.String sanadPrepDate;

    private int sanadPrepGeoSerial;

    private java.lang.String sanadSeri;

    private int sanadSrno;

    private java.lang.String sexCode;

    private java.lang.String shenasnameSeri;

    private java.lang.String shenasnameSrno;

    private java.lang.String singleTwinTripleCode;

    private java.lang.String timeOfBirth;

    private java.lang.String userId;

    private Services.WitnessInfo witness1;

    private Services.WitnessInfo witness2;

    public BirthInfo() {
    }

    public BirthInfo(
           java.lang.String addressGeoSerial,
           Services.AnnouncerInfo announcer1,
           Services.AnnouncerInfo announcer2,
           short announcerRelationCode,
           java.lang.String birthGeoSerial,
           short birthRegstSourceCode,
           java.lang.String dateOfBirthSun,
           java.lang.String fatherAddress,
           java.lang.String fatherDateOfBirth,
           java.lang.String fatherFname,
           short fatherHozehCode,
           java.lang.String fatherHozehKind,
           java.lang.String fatherName,
           long fatherNin,
           short fatherOfficeCode,
           int fatherShenasNo,
           java.lang.String fatherShenasSeri,
           int fatherShenasSrno,
           long fatherZipCode,
           java.lang.String foreginCityName,
           java.lang.String foreginStateName,
           java.lang.String hozehCode,
           java.lang.String hozehKind,
           java.lang.String mamoorId,
           java.lang.String moludSeqCode,
           java.lang.String motherAddress,
           java.lang.String motherDateOfBirth,
           java.lang.String motherFname,
           short motherHozehCode,
           java.lang.String motherHozehKind,
           java.lang.String motherName,
           long motherNin,
           short motherOfficeCode,
           int motherShenasNo,
           java.lang.String motherShenasSeri,
           int motherShenasSrno,
           long motherZipCode,
           java.lang.String officeCode,
           java.lang.String ordinaryDehgardeshi,
           java.lang.String parentDateOfMarriage,
           java.lang.String parentMarrRegstNo,
           java.lang.String parentRegstOfficeGeo,
           java.lang.String parentRegstOfficeNo,
           java.lang.String personAddress,
           java.lang.String personFname,
           java.lang.String personName,
           long personNin,
           long personZipCode,
           java.lang.String religionKind,
           java.lang.String remarks,
           java.lang.String sanadIssueOffice,
           java.lang.String sanadPrepDate,
           int sanadPrepGeoSerial,
           java.lang.String sanadSeri,
           int sanadSrno,
           java.lang.String sexCode,
           java.lang.String shenasnameSeri,
           java.lang.String shenasnameSrno,
           java.lang.String singleTwinTripleCode,
           java.lang.String timeOfBirth,
           java.lang.String userId,
           Services.WitnessInfo witness1,
           Services.WitnessInfo witness2) {
           this.addressGeoSerial = addressGeoSerial;
           this.announcer1 = announcer1;
           this.announcer2 = announcer2;
           this.announcerRelationCode = announcerRelationCode;
           this.birthGeoSerial = birthGeoSerial;
           this.birthRegstSourceCode = birthRegstSourceCode;
           this.dateOfBirthSun = dateOfBirthSun;
           this.fatherAddress = fatherAddress;
           this.fatherDateOfBirth = fatherDateOfBirth;
           this.fatherFname = fatherFname;
           this.fatherHozehCode = fatherHozehCode;
           this.fatherHozehKind = fatherHozehKind;
           this.fatherName = fatherName;
           this.fatherNin = fatherNin;
           this.fatherOfficeCode = fatherOfficeCode;
           this.fatherShenasNo = fatherShenasNo;
           this.fatherShenasSeri = fatherShenasSeri;
           this.fatherShenasSrno = fatherShenasSrno;
           this.fatherZipCode = fatherZipCode;
           this.foreginCityName = foreginCityName;
           this.foreginStateName = foreginStateName;
           this.hozehCode = hozehCode;
           this.hozehKind = hozehKind;
           this.mamoorId = mamoorId;
           this.moludSeqCode = moludSeqCode;
           this.motherAddress = motherAddress;
           this.motherDateOfBirth = motherDateOfBirth;
           this.motherFname = motherFname;
           this.motherHozehCode = motherHozehCode;
           this.motherHozehKind = motherHozehKind;
           this.motherName = motherName;
           this.motherNin = motherNin;
           this.motherOfficeCode = motherOfficeCode;
           this.motherShenasNo = motherShenasNo;
           this.motherShenasSeri = motherShenasSeri;
           this.motherShenasSrno = motherShenasSrno;
           this.motherZipCode = motherZipCode;
           this.officeCode = officeCode;
           this.ordinaryDehgardeshi = ordinaryDehgardeshi;
           this.parentDateOfMarriage = parentDateOfMarriage;
           this.parentMarrRegstNo = parentMarrRegstNo;
           this.parentRegstOfficeGeo = parentRegstOfficeGeo;
           this.parentRegstOfficeNo = parentRegstOfficeNo;
           this.personAddress = personAddress;
           this.personFname = personFname;
           this.personName = personName;
           this.personNin = personNin;
           this.personZipCode = personZipCode;
           this.religionKind = religionKind;
           this.remarks = remarks;
           this.sanadIssueOffice = sanadIssueOffice;
           this.sanadPrepDate = sanadPrepDate;
           this.sanadPrepGeoSerial = sanadPrepGeoSerial;
           this.sanadSeri = sanadSeri;
           this.sanadSrno = sanadSrno;
           this.sexCode = sexCode;
           this.shenasnameSeri = shenasnameSeri;
           this.shenasnameSrno = shenasnameSrno;
           this.singleTwinTripleCode = singleTwinTripleCode;
           this.timeOfBirth = timeOfBirth;
           this.userId = userId;
           this.witness1 = witness1;
           this.witness2 = witness2;
    }


    /**
     * Gets the addressGeoSerial value for this BirthInfo.
     * 
     * @return addressGeoSerial
     */
    public java.lang.String getAddressGeoSerial() {
        return addressGeoSerial;
    }


    /**
     * Sets the addressGeoSerial value for this BirthInfo.
     * 
     * @param addressGeoSerial
     */
    public void setAddressGeoSerial(java.lang.String addressGeoSerial) {
        this.addressGeoSerial = addressGeoSerial;
    }


    /**
     * Gets the announcer1 value for this BirthInfo.
     * 
     * @return announcer1
     */
    public Services.AnnouncerInfo getAnnouncer1() {
        return announcer1;
    }


    /**
     * Sets the announcer1 value for this BirthInfo.
     * 
     * @param announcer1
     */
    public void setAnnouncer1(Services.AnnouncerInfo announcer1) {
        this.announcer1 = announcer1;
    }


    /**
     * Gets the announcer2 value for this BirthInfo.
     * 
     * @return announcer2
     */
    public Services.AnnouncerInfo getAnnouncer2() {
        return announcer2;
    }


    /**
     * Sets the announcer2 value for this BirthInfo.
     * 
     * @param announcer2
     */
    public void setAnnouncer2(Services.AnnouncerInfo announcer2) {
        this.announcer2 = announcer2;
    }


    /**
     * Gets the announcerRelationCode value for this BirthInfo.
     * 
     * @return announcerRelationCode
     */
    public short getAnnouncerRelationCode() {
        return announcerRelationCode;
    }


    /**
     * Sets the announcerRelationCode value for this BirthInfo.
     * 
     * @param announcerRelationCode
     */
    public void setAnnouncerRelationCode(short announcerRelationCode) {
        this.announcerRelationCode = announcerRelationCode;
    }


    /**
     * Gets the birthGeoSerial value for this BirthInfo.
     * 
     * @return birthGeoSerial
     */
    public java.lang.String getBirthGeoSerial() {
        return birthGeoSerial;
    }


    /**
     * Sets the birthGeoSerial value for this BirthInfo.
     * 
     * @param birthGeoSerial
     */
    public void setBirthGeoSerial(java.lang.String birthGeoSerial) {
        this.birthGeoSerial = birthGeoSerial;
    }


    /**
     * Gets the birthRegstSourceCode value for this BirthInfo.
     * 
     * @return birthRegstSourceCode
     */
    public short getBirthRegstSourceCode() {
        return birthRegstSourceCode;
    }


    /**
     * Sets the birthRegstSourceCode value for this BirthInfo.
     * 
     * @param birthRegstSourceCode
     */
    public void setBirthRegstSourceCode(short birthRegstSourceCode) {
        this.birthRegstSourceCode = birthRegstSourceCode;
    }


    /**
     * Gets the dateOfBirthSun value for this BirthInfo.
     * 
     * @return dateOfBirthSun
     */
    public java.lang.String getDateOfBirthSun() {
        return dateOfBirthSun;
    }


    /**
     * Sets the dateOfBirthSun value for this BirthInfo.
     * 
     * @param dateOfBirthSun
     */
    public void setDateOfBirthSun(java.lang.String dateOfBirthSun) {
        this.dateOfBirthSun = dateOfBirthSun;
    }


    /**
     * Gets the fatherAddress value for this BirthInfo.
     * 
     * @return fatherAddress
     */
    public java.lang.String getFatherAddress() {
        return fatherAddress;
    }


    /**
     * Sets the fatherAddress value for this BirthInfo.
     * 
     * @param fatherAddress
     */
    public void setFatherAddress(java.lang.String fatherAddress) {
        this.fatherAddress = fatherAddress;
    }


    /**
     * Gets the fatherDateOfBirth value for this BirthInfo.
     * 
     * @return fatherDateOfBirth
     */
    public java.lang.String getFatherDateOfBirth() {
        return fatherDateOfBirth;
    }


    /**
     * Sets the fatherDateOfBirth value for this BirthInfo.
     * 
     * @param fatherDateOfBirth
     */
    public void setFatherDateOfBirth(java.lang.String fatherDateOfBirth) {
        this.fatherDateOfBirth = fatherDateOfBirth;
    }


    /**
     * Gets the fatherFname value for this BirthInfo.
     * 
     * @return fatherFname
     */
    public java.lang.String getFatherFname() {
        return fatherFname;
    }


    /**
     * Sets the fatherFname value for this BirthInfo.
     * 
     * @param fatherFname
     */
    public void setFatherFname(java.lang.String fatherFname) {
        this.fatherFname = fatherFname;
    }


    /**
     * Gets the fatherHozehCode value for this BirthInfo.
     * 
     * @return fatherHozehCode
     */
    public short getFatherHozehCode() {
        return fatherHozehCode;
    }


    /**
     * Sets the fatherHozehCode value for this BirthInfo.
     * 
     * @param fatherHozehCode
     */
    public void setFatherHozehCode(short fatherHozehCode) {
        this.fatherHozehCode = fatherHozehCode;
    }


    /**
     * Gets the fatherHozehKind value for this BirthInfo.
     * 
     * @return fatherHozehKind
     */
    public java.lang.String getFatherHozehKind() {
        return fatherHozehKind;
    }


    /**
     * Sets the fatherHozehKind value for this BirthInfo.
     * 
     * @param fatherHozehKind
     */
    public void setFatherHozehKind(java.lang.String fatherHozehKind) {
        this.fatherHozehKind = fatherHozehKind;
    }


    /**
     * Gets the fatherName value for this BirthInfo.
     * 
     * @return fatherName
     */
    public java.lang.String getFatherName() {
        return fatherName;
    }


    /**
     * Sets the fatherName value for this BirthInfo.
     * 
     * @param fatherName
     */
    public void setFatherName(java.lang.String fatherName) {
        this.fatherName = fatherName;
    }


    /**
     * Gets the fatherNin value for this BirthInfo.
     * 
     * @return fatherNin
     */
    public long getFatherNin() {
        return fatherNin;
    }


    /**
     * Sets the fatherNin value for this BirthInfo.
     * 
     * @param fatherNin
     */
    public void setFatherNin(long fatherNin) {
        this.fatherNin = fatherNin;
    }


    /**
     * Gets the fatherOfficeCode value for this BirthInfo.
     * 
     * @return fatherOfficeCode
     */
    public short getFatherOfficeCode() {
        return fatherOfficeCode;
    }


    /**
     * Sets the fatherOfficeCode value for this BirthInfo.
     * 
     * @param fatherOfficeCode
     */
    public void setFatherOfficeCode(short fatherOfficeCode) {
        this.fatherOfficeCode = fatherOfficeCode;
    }


    /**
     * Gets the fatherShenasNo value for this BirthInfo.
     * 
     * @return fatherShenasNo
     */
    public int getFatherShenasNo() {
        return fatherShenasNo;
    }


    /**
     * Sets the fatherShenasNo value for this BirthInfo.
     * 
     * @param fatherShenasNo
     */
    public void setFatherShenasNo(int fatherShenasNo) {
        this.fatherShenasNo = fatherShenasNo;
    }


    /**
     * Gets the fatherShenasSeri value for this BirthInfo.
     * 
     * @return fatherShenasSeri
     */
    public java.lang.String getFatherShenasSeri() {
        return fatherShenasSeri;
    }


    /**
     * Sets the fatherShenasSeri value for this BirthInfo.
     * 
     * @param fatherShenasSeri
     */
    public void setFatherShenasSeri(java.lang.String fatherShenasSeri) {
        this.fatherShenasSeri = fatherShenasSeri;
    }


    /**
     * Gets the fatherShenasSrno value for this BirthInfo.
     * 
     * @return fatherShenasSrno
     */
    public int getFatherShenasSrno() {
        return fatherShenasSrno;
    }


    /**
     * Sets the fatherShenasSrno value for this BirthInfo.
     * 
     * @param fatherShenasSrno
     */
    public void setFatherShenasSrno(int fatherShenasSrno) {
        this.fatherShenasSrno = fatherShenasSrno;
    }


    /**
     * Gets the fatherZipCode value for this BirthInfo.
     * 
     * @return fatherZipCode
     */
    public long getFatherZipCode() {
        return fatherZipCode;
    }


    /**
     * Sets the fatherZipCode value for this BirthInfo.
     * 
     * @param fatherZipCode
     */
    public void setFatherZipCode(long fatherZipCode) {
        this.fatherZipCode = fatherZipCode;
    }


    /**
     * Gets the foreginCityName value for this BirthInfo.
     * 
     * @return foreginCityName
     */
    public java.lang.String getForeginCityName() {
        return foreginCityName;
    }


    /**
     * Sets the foreginCityName value for this BirthInfo.
     * 
     * @param foreginCityName
     */
    public void setForeginCityName(java.lang.String foreginCityName) {
        this.foreginCityName = foreginCityName;
    }


    /**
     * Gets the foreginStateName value for this BirthInfo.
     * 
     * @return foreginStateName
     */
    public java.lang.String getForeginStateName() {
        return foreginStateName;
    }


    /**
     * Sets the foreginStateName value for this BirthInfo.
     * 
     * @param foreginStateName
     */
    public void setForeginStateName(java.lang.String foreginStateName) {
        this.foreginStateName = foreginStateName;
    }


    /**
     * Gets the hozehCode value for this BirthInfo.
     * 
     * @return hozehCode
     */
    public java.lang.String getHozehCode() {
        return hozehCode;
    }


    /**
     * Sets the hozehCode value for this BirthInfo.
     * 
     * @param hozehCode
     */
    public void setHozehCode(java.lang.String hozehCode) {
        this.hozehCode = hozehCode;
    }


    /**
     * Gets the hozehKind value for this BirthInfo.
     * 
     * @return hozehKind
     */
    public java.lang.String getHozehKind() {
        return hozehKind;
    }


    /**
     * Sets the hozehKind value for this BirthInfo.
     * 
     * @param hozehKind
     */
    public void setHozehKind(java.lang.String hozehKind) {
        this.hozehKind = hozehKind;
    }


    /**
     * Gets the mamoorId value for this BirthInfo.
     * 
     * @return mamoorId
     */
    public java.lang.String getMamoorId() {
        return mamoorId;
    }


    /**
     * Sets the mamoorId value for this BirthInfo.
     * 
     * @param mamoorId
     */
    public void setMamoorId(java.lang.String mamoorId) {
        this.mamoorId = mamoorId;
    }


    /**
     * Gets the moludSeqCode value for this BirthInfo.
     * 
     * @return moludSeqCode
     */
    public java.lang.String getMoludSeqCode() {
        return moludSeqCode;
    }


    /**
     * Sets the moludSeqCode value for this BirthInfo.
     * 
     * @param moludSeqCode
     */
    public void setMoludSeqCode(java.lang.String moludSeqCode) {
        this.moludSeqCode = moludSeqCode;
    }


    /**
     * Gets the motherAddress value for this BirthInfo.
     * 
     * @return motherAddress
     */
    public java.lang.String getMotherAddress() {
        return motherAddress;
    }


    /**
     * Sets the motherAddress value for this BirthInfo.
     * 
     * @param motherAddress
     */
    public void setMotherAddress(java.lang.String motherAddress) {
        this.motherAddress = motherAddress;
    }


    /**
     * Gets the motherDateOfBirth value for this BirthInfo.
     * 
     * @return motherDateOfBirth
     */
    public java.lang.String getMotherDateOfBirth() {
        return motherDateOfBirth;
    }


    /**
     * Sets the motherDateOfBirth value for this BirthInfo.
     * 
     * @param motherDateOfBirth
     */
    public void setMotherDateOfBirth(java.lang.String motherDateOfBirth) {
        this.motherDateOfBirth = motherDateOfBirth;
    }


    /**
     * Gets the motherFname value for this BirthInfo.
     * 
     * @return motherFname
     */
    public java.lang.String getMotherFname() {
        return motherFname;
    }


    /**
     * Sets the motherFname value for this BirthInfo.
     * 
     * @param motherFname
     */
    public void setMotherFname(java.lang.String motherFname) {
        this.motherFname = motherFname;
    }


    /**
     * Gets the motherHozehCode value for this BirthInfo.
     * 
     * @return motherHozehCode
     */
    public short getMotherHozehCode() {
        return motherHozehCode;
    }


    /**
     * Sets the motherHozehCode value for this BirthInfo.
     * 
     * @param motherHozehCode
     */
    public void setMotherHozehCode(short motherHozehCode) {
        this.motherHozehCode = motherHozehCode;
    }


    /**
     * Gets the motherHozehKind value for this BirthInfo.
     * 
     * @return motherHozehKind
     */
    public java.lang.String getMotherHozehKind() {
        return motherHozehKind;
    }


    /**
     * Sets the motherHozehKind value for this BirthInfo.
     * 
     * @param motherHozehKind
     */
    public void setMotherHozehKind(java.lang.String motherHozehKind) {
        this.motherHozehKind = motherHozehKind;
    }


    /**
     * Gets the motherName value for this BirthInfo.
     * 
     * @return motherName
     */
    public java.lang.String getMotherName() {
        return motherName;
    }


    /**
     * Sets the motherName value for this BirthInfo.
     * 
     * @param motherName
     */
    public void setMotherName(java.lang.String motherName) {
        this.motherName = motherName;
    }


    /**
     * Gets the motherNin value for this BirthInfo.
     * 
     * @return motherNin
     */
    public long getMotherNin() {
        return motherNin;
    }


    /**
     * Sets the motherNin value for this BirthInfo.
     * 
     * @param motherNin
     */
    public void setMotherNin(long motherNin) {
        this.motherNin = motherNin;
    }


    /**
     * Gets the motherOfficeCode value for this BirthInfo.
     * 
     * @return motherOfficeCode
     */
    public short getMotherOfficeCode() {
        return motherOfficeCode;
    }


    /**
     * Sets the motherOfficeCode value for this BirthInfo.
     * 
     * @param motherOfficeCode
     */
    public void setMotherOfficeCode(short motherOfficeCode) {
        this.motherOfficeCode = motherOfficeCode;
    }


    /**
     * Gets the motherShenasNo value for this BirthInfo.
     * 
     * @return motherShenasNo
     */
    public int getMotherShenasNo() {
        return motherShenasNo;
    }


    /**
     * Sets the motherShenasNo value for this BirthInfo.
     * 
     * @param motherShenasNo
     */
    public void setMotherShenasNo(int motherShenasNo) {
        this.motherShenasNo = motherShenasNo;
    }


    /**
     * Gets the motherShenasSeri value for this BirthInfo.
     * 
     * @return motherShenasSeri
     */
    public java.lang.String getMotherShenasSeri() {
        return motherShenasSeri;
    }


    /**
     * Sets the motherShenasSeri value for this BirthInfo.
     * 
     * @param motherShenasSeri
     */
    public void setMotherShenasSeri(java.lang.String motherShenasSeri) {
        this.motherShenasSeri = motherShenasSeri;
    }


    /**
     * Gets the motherShenasSrno value for this BirthInfo.
     * 
     * @return motherShenasSrno
     */
    public int getMotherShenasSrno() {
        return motherShenasSrno;
    }


    /**
     * Sets the motherShenasSrno value for this BirthInfo.
     * 
     * @param motherShenasSrno
     */
    public void setMotherShenasSrno(int motherShenasSrno) {
        this.motherShenasSrno = motherShenasSrno;
    }


    /**
     * Gets the motherZipCode value for this BirthInfo.
     * 
     * @return motherZipCode
     */
    public long getMotherZipCode() {
        return motherZipCode;
    }


    /**
     * Sets the motherZipCode value for this BirthInfo.
     * 
     * @param motherZipCode
     */
    public void setMotherZipCode(long motherZipCode) {
        this.motherZipCode = motherZipCode;
    }


    /**
     * Gets the officeCode value for this BirthInfo.
     * 
     * @return officeCode
     */
    public java.lang.String getOfficeCode() {
        return officeCode;
    }


    /**
     * Sets the officeCode value for this BirthInfo.
     * 
     * @param officeCode
     */
    public void setOfficeCode(java.lang.String officeCode) {
        this.officeCode = officeCode;
    }


    /**
     * Gets the ordinaryDehgardeshi value for this BirthInfo.
     * 
     * @return ordinaryDehgardeshi
     */
    public java.lang.String getOrdinaryDehgardeshi() {
        return ordinaryDehgardeshi;
    }


    /**
     * Sets the ordinaryDehgardeshi value for this BirthInfo.
     * 
     * @param ordinaryDehgardeshi
     */
    public void setOrdinaryDehgardeshi(java.lang.String ordinaryDehgardeshi) {
        this.ordinaryDehgardeshi = ordinaryDehgardeshi;
    }


    /**
     * Gets the parentDateOfMarriage value for this BirthInfo.
     * 
     * @return parentDateOfMarriage
     */
    public java.lang.String getParentDateOfMarriage() {
        return parentDateOfMarriage;
    }


    /**
     * Sets the parentDateOfMarriage value for this BirthInfo.
     * 
     * @param parentDateOfMarriage
     */
    public void setParentDateOfMarriage(java.lang.String parentDateOfMarriage) {
        this.parentDateOfMarriage = parentDateOfMarriage;
    }


    /**
     * Gets the parentMarrRegstNo value for this BirthInfo.
     * 
     * @return parentMarrRegstNo
     */
    public java.lang.String getParentMarrRegstNo() {
        return parentMarrRegstNo;
    }


    /**
     * Sets the parentMarrRegstNo value for this BirthInfo.
     * 
     * @param parentMarrRegstNo
     */
    public void setParentMarrRegstNo(java.lang.String parentMarrRegstNo) {
        this.parentMarrRegstNo = parentMarrRegstNo;
    }


    /**
     * Gets the parentRegstOfficeGeo value for this BirthInfo.
     * 
     * @return parentRegstOfficeGeo
     */
    public java.lang.String getParentRegstOfficeGeo() {
        return parentRegstOfficeGeo;
    }


    /**
     * Sets the parentRegstOfficeGeo value for this BirthInfo.
     * 
     * @param parentRegstOfficeGeo
     */
    public void setParentRegstOfficeGeo(java.lang.String parentRegstOfficeGeo) {
        this.parentRegstOfficeGeo = parentRegstOfficeGeo;
    }


    /**
     * Gets the parentRegstOfficeNo value for this BirthInfo.
     * 
     * @return parentRegstOfficeNo
     */
    public java.lang.String getParentRegstOfficeNo() {
        return parentRegstOfficeNo;
    }


    /**
     * Sets the parentRegstOfficeNo value for this BirthInfo.
     * 
     * @param parentRegstOfficeNo
     */
    public void setParentRegstOfficeNo(java.lang.String parentRegstOfficeNo) {
        this.parentRegstOfficeNo = parentRegstOfficeNo;
    }


    /**
     * Gets the personAddress value for this BirthInfo.
     * 
     * @return personAddress
     */
    public java.lang.String getPersonAddress() {
        return personAddress;
    }


    /**
     * Sets the personAddress value for this BirthInfo.
     * 
     * @param personAddress
     */
    public void setPersonAddress(java.lang.String personAddress) {
        this.personAddress = personAddress;
    }


    /**
     * Gets the personFname value for this BirthInfo.
     * 
     * @return personFname
     */
    public java.lang.String getPersonFname() {
        return personFname;
    }


    /**
     * Sets the personFname value for this BirthInfo.
     * 
     * @param personFname
     */
    public void setPersonFname(java.lang.String personFname) {
        this.personFname = personFname;
    }


    /**
     * Gets the personName value for this BirthInfo.
     * 
     * @return personName
     */
    public java.lang.String getPersonName() {
        return personName;
    }


    /**
     * Sets the personName value for this BirthInfo.
     * 
     * @param personName
     */
    public void setPersonName(java.lang.String personName) {
        this.personName = personName;
    }


    /**
     * Gets the personNin value for this BirthInfo.
     * 
     * @return personNin
     */
    public long getPersonNin() {
        return personNin;
    }


    /**
     * Sets the personNin value for this BirthInfo.
     * 
     * @param personNin
     */
    public void setPersonNin(long personNin) {
        this.personNin = personNin;
    }


    /**
     * Gets the personZipCode value for this BirthInfo.
     * 
     * @return personZipCode
     */
    public long getPersonZipCode() {
        return personZipCode;
    }


    /**
     * Sets the personZipCode value for this BirthInfo.
     * 
     * @param personZipCode
     */
    public void setPersonZipCode(long personZipCode) {
        this.personZipCode = personZipCode;
    }


    /**
     * Gets the religionKind value for this BirthInfo.
     * 
     * @return religionKind
     */
    public java.lang.String getReligionKind() {
        return religionKind;
    }


    /**
     * Sets the religionKind value for this BirthInfo.
     * 
     * @param religionKind
     */
    public void setReligionKind(java.lang.String religionKind) {
        this.religionKind = religionKind;
    }


    /**
     * Gets the remarks value for this BirthInfo.
     * 
     * @return remarks
     */
    public java.lang.String getRemarks() {
        return remarks;
    }


    /**
     * Sets the remarks value for this BirthInfo.
     * 
     * @param remarks
     */
    public void setRemarks(java.lang.String remarks) {
        this.remarks = remarks;
    }


    /**
     * Gets the sanadIssueOffice value for this BirthInfo.
     * 
     * @return sanadIssueOffice
     */
    public java.lang.String getSanadIssueOffice() {
        return sanadIssueOffice;
    }


    /**
     * Sets the sanadIssueOffice value for this BirthInfo.
     * 
     * @param sanadIssueOffice
     */
    public void setSanadIssueOffice(java.lang.String sanadIssueOffice) {
        this.sanadIssueOffice = sanadIssueOffice;
    }


    /**
     * Gets the sanadPrepDate value for this BirthInfo.
     * 
     * @return sanadPrepDate
     */
    public java.lang.String getSanadPrepDate() {
        return sanadPrepDate;
    }


    /**
     * Sets the sanadPrepDate value for this BirthInfo.
     * 
     * @param sanadPrepDate
     */
    public void setSanadPrepDate(java.lang.String sanadPrepDate) {
        this.sanadPrepDate = sanadPrepDate;
    }


    /**
     * Gets the sanadPrepGeoSerial value for this BirthInfo.
     * 
     * @return sanadPrepGeoSerial
     */
    public int getSanadPrepGeoSerial() {
        return sanadPrepGeoSerial;
    }


    /**
     * Sets the sanadPrepGeoSerial value for this BirthInfo.
     * 
     * @param sanadPrepGeoSerial
     */
    public void setSanadPrepGeoSerial(int sanadPrepGeoSerial) {
        this.sanadPrepGeoSerial = sanadPrepGeoSerial;
    }


    /**
     * Gets the sanadSeri value for this BirthInfo.
     * 
     * @return sanadSeri
     */
    public java.lang.String getSanadSeri() {
        return sanadSeri;
    }


    /**
     * Sets the sanadSeri value for this BirthInfo.
     * 
     * @param sanadSeri
     */
    public void setSanadSeri(java.lang.String sanadSeri) {
        this.sanadSeri = sanadSeri;
    }


    /**
     * Gets the sanadSrno value for this BirthInfo.
     * 
     * @return sanadSrno
     */
    public int getSanadSrno() {
        return sanadSrno;
    }


    /**
     * Sets the sanadSrno value for this BirthInfo.
     * 
     * @param sanadSrno
     */
    public void setSanadSrno(int sanadSrno) {
        this.sanadSrno = sanadSrno;
    }


    /**
     * Gets the sexCode value for this BirthInfo.
     * 
     * @return sexCode
     */
    public java.lang.String getSexCode() {
        return sexCode;
    }


    /**
     * Sets the sexCode value for this BirthInfo.
     * 
     * @param sexCode
     */
    public void setSexCode(java.lang.String sexCode) {
        this.sexCode = sexCode;
    }


    /**
     * Gets the shenasnameSeri value for this BirthInfo.
     * 
     * @return shenasnameSeri
     */
    public java.lang.String getShenasnameSeri() {
        return shenasnameSeri;
    }


    /**
     * Sets the shenasnameSeri value for this BirthInfo.
     * 
     * @param shenasnameSeri
     */
    public void setShenasnameSeri(java.lang.String shenasnameSeri) {
        this.shenasnameSeri = shenasnameSeri;
    }


    /**
     * Gets the shenasnameSrno value for this BirthInfo.
     * 
     * @return shenasnameSrno
     */
    public java.lang.String getShenasnameSrno() {
        return shenasnameSrno;
    }


    /**
     * Sets the shenasnameSrno value for this BirthInfo.
     * 
     * @param shenasnameSrno
     */
    public void setShenasnameSrno(java.lang.String shenasnameSrno) {
        this.shenasnameSrno = shenasnameSrno;
    }


    /**
     * Gets the singleTwinTripleCode value for this BirthInfo.
     * 
     * @return singleTwinTripleCode
     */
    public java.lang.String getSingleTwinTripleCode() {
        return singleTwinTripleCode;
    }


    /**
     * Sets the singleTwinTripleCode value for this BirthInfo.
     * 
     * @param singleTwinTripleCode
     */
    public void setSingleTwinTripleCode(java.lang.String singleTwinTripleCode) {
        this.singleTwinTripleCode = singleTwinTripleCode;
    }


    /**
     * Gets the timeOfBirth value for this BirthInfo.
     * 
     * @return timeOfBirth
     */
    public java.lang.String getTimeOfBirth() {
        return timeOfBirth;
    }


    /**
     * Sets the timeOfBirth value for this BirthInfo.
     * 
     * @param timeOfBirth
     */
    public void setTimeOfBirth(java.lang.String timeOfBirth) {
        this.timeOfBirth = timeOfBirth;
    }


    /**
     * Gets the userId value for this BirthInfo.
     * 
     * @return userId
     */
    public java.lang.String getUserId() {
        return userId;
    }


    /**
     * Sets the userId value for this BirthInfo.
     * 
     * @param userId
     */
    public void setUserId(java.lang.String userId) {
        this.userId = userId;
    }


    /**
     * Gets the witness1 value for this BirthInfo.
     * 
     * @return witness1
     */
    public Services.WitnessInfo getWitness1() {
        return witness1;
    }


    /**
     * Sets the witness1 value for this BirthInfo.
     * 
     * @param witness1
     */
    public void setWitness1(Services.WitnessInfo witness1) {
        this.witness1 = witness1;
    }


    /**
     * Gets the witness2 value for this BirthInfo.
     * 
     * @return witness2
     */
    public Services.WitnessInfo getWitness2() {
        return witness2;
    }


    /**
     * Sets the witness2 value for this BirthInfo.
     * 
     * @param witness2
     */
    public void setWitness2(Services.WitnessInfo witness2) {
        this.witness2 = witness2;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BirthInfo)) return false;
        BirthInfo other = (BirthInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.addressGeoSerial==null && other.getAddressGeoSerial()==null) || 
             (this.addressGeoSerial!=null &&
              this.addressGeoSerial.equals(other.getAddressGeoSerial()))) &&
            ((this.announcer1==null && other.getAnnouncer1()==null) || 
             (this.announcer1!=null &&
              this.announcer1.equals(other.getAnnouncer1()))) &&
            ((this.announcer2==null && other.getAnnouncer2()==null) || 
             (this.announcer2!=null &&
              this.announcer2.equals(other.getAnnouncer2()))) &&
            this.announcerRelationCode == other.getAnnouncerRelationCode() &&
            ((this.birthGeoSerial==null && other.getBirthGeoSerial()==null) || 
             (this.birthGeoSerial!=null &&
              this.birthGeoSerial.equals(other.getBirthGeoSerial()))) &&
            this.birthRegstSourceCode == other.getBirthRegstSourceCode() &&
            ((this.dateOfBirthSun==null && other.getDateOfBirthSun()==null) || 
             (this.dateOfBirthSun!=null &&
              this.dateOfBirthSun.equals(other.getDateOfBirthSun()))) &&
            ((this.fatherAddress==null && other.getFatherAddress()==null) || 
             (this.fatherAddress!=null &&
              this.fatherAddress.equals(other.getFatherAddress()))) &&
            ((this.fatherDateOfBirth==null && other.getFatherDateOfBirth()==null) || 
             (this.fatherDateOfBirth!=null &&
              this.fatherDateOfBirth.equals(other.getFatherDateOfBirth()))) &&
            ((this.fatherFname==null && other.getFatherFname()==null) || 
             (this.fatherFname!=null &&
              this.fatherFname.equals(other.getFatherFname()))) &&
            this.fatherHozehCode == other.getFatherHozehCode() &&
            ((this.fatherHozehKind==null && other.getFatherHozehKind()==null) || 
             (this.fatherHozehKind!=null &&
              this.fatherHozehKind.equals(other.getFatherHozehKind()))) &&
            ((this.fatherName==null && other.getFatherName()==null) || 
             (this.fatherName!=null &&
              this.fatherName.equals(other.getFatherName()))) &&
            this.fatherNin == other.getFatherNin() &&
            this.fatherOfficeCode == other.getFatherOfficeCode() &&
            this.fatherShenasNo == other.getFatherShenasNo() &&
            ((this.fatherShenasSeri==null && other.getFatherShenasSeri()==null) || 
             (this.fatherShenasSeri!=null &&
              this.fatherShenasSeri.equals(other.getFatherShenasSeri()))) &&
            this.fatherShenasSrno == other.getFatherShenasSrno() &&
            this.fatherZipCode == other.getFatherZipCode() &&
            ((this.foreginCityName==null && other.getForeginCityName()==null) || 
             (this.foreginCityName!=null &&
              this.foreginCityName.equals(other.getForeginCityName()))) &&
            ((this.foreginStateName==null && other.getForeginStateName()==null) || 
             (this.foreginStateName!=null &&
              this.foreginStateName.equals(other.getForeginStateName()))) &&
            ((this.hozehCode==null && other.getHozehCode()==null) || 
             (this.hozehCode!=null &&
              this.hozehCode.equals(other.getHozehCode()))) &&
            ((this.hozehKind==null && other.getHozehKind()==null) || 
             (this.hozehKind!=null &&
              this.hozehKind.equals(other.getHozehKind()))) &&
            ((this.mamoorId==null && other.getMamoorId()==null) || 
             (this.mamoorId!=null &&
              this.mamoorId.equals(other.getMamoorId()))) &&
            ((this.moludSeqCode==null && other.getMoludSeqCode()==null) || 
             (this.moludSeqCode!=null &&
              this.moludSeqCode.equals(other.getMoludSeqCode()))) &&
            ((this.motherAddress==null && other.getMotherAddress()==null) || 
             (this.motherAddress!=null &&
              this.motherAddress.equals(other.getMotherAddress()))) &&
            ((this.motherDateOfBirth==null && other.getMotherDateOfBirth()==null) || 
             (this.motherDateOfBirth!=null &&
              this.motherDateOfBirth.equals(other.getMotherDateOfBirth()))) &&
            ((this.motherFname==null && other.getMotherFname()==null) || 
             (this.motherFname!=null &&
              this.motherFname.equals(other.getMotherFname()))) &&
            this.motherHozehCode == other.getMotherHozehCode() &&
            ((this.motherHozehKind==null && other.getMotherHozehKind()==null) || 
             (this.motherHozehKind!=null &&
              this.motherHozehKind.equals(other.getMotherHozehKind()))) &&
            ((this.motherName==null && other.getMotherName()==null) || 
             (this.motherName!=null &&
              this.motherName.equals(other.getMotherName()))) &&
            this.motherNin == other.getMotherNin() &&
            this.motherOfficeCode == other.getMotherOfficeCode() &&
            this.motherShenasNo == other.getMotherShenasNo() &&
            ((this.motherShenasSeri==null && other.getMotherShenasSeri()==null) || 
             (this.motherShenasSeri!=null &&
              this.motherShenasSeri.equals(other.getMotherShenasSeri()))) &&
            this.motherShenasSrno == other.getMotherShenasSrno() &&
            this.motherZipCode == other.getMotherZipCode() &&
            ((this.officeCode==null && other.getOfficeCode()==null) || 
             (this.officeCode!=null &&
              this.officeCode.equals(other.getOfficeCode()))) &&
            ((this.ordinaryDehgardeshi==null && other.getOrdinaryDehgardeshi()==null) || 
             (this.ordinaryDehgardeshi!=null &&
              this.ordinaryDehgardeshi.equals(other.getOrdinaryDehgardeshi()))) &&
            ((this.parentDateOfMarriage==null && other.getParentDateOfMarriage()==null) || 
             (this.parentDateOfMarriage!=null &&
              this.parentDateOfMarriage.equals(other.getParentDateOfMarriage()))) &&
            ((this.parentMarrRegstNo==null && other.getParentMarrRegstNo()==null) || 
             (this.parentMarrRegstNo!=null &&
              this.parentMarrRegstNo.equals(other.getParentMarrRegstNo()))) &&
            ((this.parentRegstOfficeGeo==null && other.getParentRegstOfficeGeo()==null) || 
             (this.parentRegstOfficeGeo!=null &&
              this.parentRegstOfficeGeo.equals(other.getParentRegstOfficeGeo()))) &&
            ((this.parentRegstOfficeNo==null && other.getParentRegstOfficeNo()==null) || 
             (this.parentRegstOfficeNo!=null &&
              this.parentRegstOfficeNo.equals(other.getParentRegstOfficeNo()))) &&
            ((this.personAddress==null && other.getPersonAddress()==null) || 
             (this.personAddress!=null &&
              this.personAddress.equals(other.getPersonAddress()))) &&
            ((this.personFname==null && other.getPersonFname()==null) || 
             (this.personFname!=null &&
              this.personFname.equals(other.getPersonFname()))) &&
            ((this.personName==null && other.getPersonName()==null) || 
             (this.personName!=null &&
              this.personName.equals(other.getPersonName()))) &&
            this.personNin == other.getPersonNin() &&
            this.personZipCode == other.getPersonZipCode() &&
            ((this.religionKind==null && other.getReligionKind()==null) || 
             (this.religionKind!=null &&
              this.religionKind.equals(other.getReligionKind()))) &&
            ((this.remarks==null && other.getRemarks()==null) || 
             (this.remarks!=null &&
              this.remarks.equals(other.getRemarks()))) &&
            ((this.sanadIssueOffice==null && other.getSanadIssueOffice()==null) || 
             (this.sanadIssueOffice!=null &&
              this.sanadIssueOffice.equals(other.getSanadIssueOffice()))) &&
            ((this.sanadPrepDate==null && other.getSanadPrepDate()==null) || 
             (this.sanadPrepDate!=null &&
              this.sanadPrepDate.equals(other.getSanadPrepDate()))) &&
            this.sanadPrepGeoSerial == other.getSanadPrepGeoSerial() &&
            ((this.sanadSeri==null && other.getSanadSeri()==null) || 
             (this.sanadSeri!=null &&
              this.sanadSeri.equals(other.getSanadSeri()))) &&
            this.sanadSrno == other.getSanadSrno() &&
            ((this.sexCode==null && other.getSexCode()==null) || 
             (this.sexCode!=null &&
              this.sexCode.equals(other.getSexCode()))) &&
            ((this.shenasnameSeri==null && other.getShenasnameSeri()==null) || 
             (this.shenasnameSeri!=null &&
              this.shenasnameSeri.equals(other.getShenasnameSeri()))) &&
            ((this.shenasnameSrno==null && other.getShenasnameSrno()==null) || 
             (this.shenasnameSrno!=null &&
              this.shenasnameSrno.equals(other.getShenasnameSrno()))) &&
            ((this.singleTwinTripleCode==null && other.getSingleTwinTripleCode()==null) || 
             (this.singleTwinTripleCode!=null &&
              this.singleTwinTripleCode.equals(other.getSingleTwinTripleCode()))) &&
            ((this.timeOfBirth==null && other.getTimeOfBirth()==null) || 
             (this.timeOfBirth!=null &&
              this.timeOfBirth.equals(other.getTimeOfBirth()))) &&
            ((this.userId==null && other.getUserId()==null) || 
             (this.userId!=null &&
              this.userId.equals(other.getUserId()))) &&
            ((this.witness1==null && other.getWitness1()==null) || 
             (this.witness1!=null &&
              this.witness1.equals(other.getWitness1()))) &&
            ((this.witness2==null && other.getWitness2()==null) || 
             (this.witness2!=null &&
              this.witness2.equals(other.getWitness2())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getAddressGeoSerial() != null) {
            _hashCode += getAddressGeoSerial().hashCode();
        }
        if (getAnnouncer1() != null) {
            _hashCode += getAnnouncer1().hashCode();
        }
        if (getAnnouncer2() != null) {
            _hashCode += getAnnouncer2().hashCode();
        }
        _hashCode += getAnnouncerRelationCode();
        if (getBirthGeoSerial() != null) {
            _hashCode += getBirthGeoSerial().hashCode();
        }
        _hashCode += getBirthRegstSourceCode();
        if (getDateOfBirthSun() != null) {
            _hashCode += getDateOfBirthSun().hashCode();
        }
        if (getFatherAddress() != null) {
            _hashCode += getFatherAddress().hashCode();
        }
        if (getFatherDateOfBirth() != null) {
            _hashCode += getFatherDateOfBirth().hashCode();
        }
        if (getFatherFname() != null) {
            _hashCode += getFatherFname().hashCode();
        }
        _hashCode += getFatherHozehCode();
        if (getFatherHozehKind() != null) {
            _hashCode += getFatherHozehKind().hashCode();
        }
        if (getFatherName() != null) {
            _hashCode += getFatherName().hashCode();
        }
        _hashCode += new Long(getFatherNin()).hashCode();
        _hashCode += getFatherOfficeCode();
        _hashCode += getFatherShenasNo();
        if (getFatherShenasSeri() != null) {
            _hashCode += getFatherShenasSeri().hashCode();
        }
        _hashCode += getFatherShenasSrno();
        _hashCode += new Long(getFatherZipCode()).hashCode();
        if (getForeginCityName() != null) {
            _hashCode += getForeginCityName().hashCode();
        }
        if (getForeginStateName() != null) {
            _hashCode += getForeginStateName().hashCode();
        }
        if (getHozehCode() != null) {
            _hashCode += getHozehCode().hashCode();
        }
        if (getHozehKind() != null) {
            _hashCode += getHozehKind().hashCode();
        }
        if (getMamoorId() != null) {
            _hashCode += getMamoorId().hashCode();
        }
        if (getMoludSeqCode() != null) {
            _hashCode += getMoludSeqCode().hashCode();
        }
        if (getMotherAddress() != null) {
            _hashCode += getMotherAddress().hashCode();
        }
        if (getMotherDateOfBirth() != null) {
            _hashCode += getMotherDateOfBirth().hashCode();
        }
        if (getMotherFname() != null) {
            _hashCode += getMotherFname().hashCode();
        }
        _hashCode += getMotherHozehCode();
        if (getMotherHozehKind() != null) {
            _hashCode += getMotherHozehKind().hashCode();
        }
        if (getMotherName() != null) {
            _hashCode += getMotherName().hashCode();
        }
        _hashCode += new Long(getMotherNin()).hashCode();
        _hashCode += getMotherOfficeCode();
        _hashCode += getMotherShenasNo();
        if (getMotherShenasSeri() != null) {
            _hashCode += getMotherShenasSeri().hashCode();
        }
        _hashCode += getMotherShenasSrno();
        _hashCode += new Long(getMotherZipCode()).hashCode();
        if (getOfficeCode() != null) {
            _hashCode += getOfficeCode().hashCode();
        }
        if (getOrdinaryDehgardeshi() != null) {
            _hashCode += getOrdinaryDehgardeshi().hashCode();
        }
        if (getParentDateOfMarriage() != null) {
            _hashCode += getParentDateOfMarriage().hashCode();
        }
        if (getParentMarrRegstNo() != null) {
            _hashCode += getParentMarrRegstNo().hashCode();
        }
        if (getParentRegstOfficeGeo() != null) {
            _hashCode += getParentRegstOfficeGeo().hashCode();
        }
        if (getParentRegstOfficeNo() != null) {
            _hashCode += getParentRegstOfficeNo().hashCode();
        }
        if (getPersonAddress() != null) {
            _hashCode += getPersonAddress().hashCode();
        }
        if (getPersonFname() != null) {
            _hashCode += getPersonFname().hashCode();
        }
        if (getPersonName() != null) {
            _hashCode += getPersonName().hashCode();
        }
        _hashCode += new Long(getPersonNin()).hashCode();
        _hashCode += new Long(getPersonZipCode()).hashCode();
        if (getReligionKind() != null) {
            _hashCode += getReligionKind().hashCode();
        }
        if (getRemarks() != null) {
            _hashCode += getRemarks().hashCode();
        }
        if (getSanadIssueOffice() != null) {
            _hashCode += getSanadIssueOffice().hashCode();
        }
        if (getSanadPrepDate() != null) {
            _hashCode += getSanadPrepDate().hashCode();
        }
        _hashCode += getSanadPrepGeoSerial();
        if (getSanadSeri() != null) {
            _hashCode += getSanadSeri().hashCode();
        }
        _hashCode += getSanadSrno();
        if (getSexCode() != null) {
            _hashCode += getSexCode().hashCode();
        }
        if (getShenasnameSeri() != null) {
            _hashCode += getShenasnameSeri().hashCode();
        }
        if (getShenasnameSrno() != null) {
            _hashCode += getShenasnameSrno().hashCode();
        }
        if (getSingleTwinTripleCode() != null) {
            _hashCode += getSingleTwinTripleCode().hashCode();
        }
        if (getTimeOfBirth() != null) {
            _hashCode += getTimeOfBirth().hashCode();
        }
        if (getUserId() != null) {
            _hashCode += getUserId().hashCode();
        }
        if (getWitness1() != null) {
            _hashCode += getWitness1().hashCode();
        }
        if (getWitness2() != null) {
            _hashCode += getWitness2().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BirthInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://Server", "birthInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addressGeoSerial");
        elemField.setXmlName(new javax.xml.namespace.QName("http://Server", "addressGeoSerial"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("announcer1");
        elemField.setXmlName(new javax.xml.namespace.QName("http://Server", "announcer1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://info.model.dcu", "AnnouncerInfo"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("announcer2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://Server", "announcer2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://info.model.dcu", "AnnouncerInfo"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("announcerRelationCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://Server", "announcerRelationCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("birthGeoSerial");
        elemField.setXmlName(new javax.xml.namespace.QName("http://Server", "birthGeoSerial"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("birthRegstSourceCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://Server", "birthRegstSourceCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateOfBirthSun");
        elemField.setXmlName(new javax.xml.namespace.QName("http://Server", "dateOfBirthSun"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fatherAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("http://Server", "fatherAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fatherDateOfBirth");
        elemField.setXmlName(new javax.xml.namespace.QName("http://Server", "fatherDateOfBirth"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fatherFname");
        elemField.setXmlName(new javax.xml.namespace.QName("http://Server", "fatherFname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fatherHozehCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://Server", "fatherHozehCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fatherHozehKind");
        elemField.setXmlName(new javax.xml.namespace.QName("http://Server", "fatherHozehKind"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fatherName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://Server", "fatherName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fatherNin");
        elemField.setXmlName(new javax.xml.namespace.QName("http://Server", "fatherNin"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fatherOfficeCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://Server", "fatherOfficeCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fatherShenasNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://Server", "fatherShenasNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fatherShenasSeri");
        elemField.setXmlName(new javax.xml.namespace.QName("http://Server", "fatherShenasSeri"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fatherShenasSrno");
        elemField.setXmlName(new javax.xml.namespace.QName("http://Server", "fatherShenasSrno"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fatherZipCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://Server", "fatherZipCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("foreginCityName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://Server", "foreginCityName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("foreginStateName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://Server", "foreginStateName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hozehCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://Server", "hozehCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hozehKind");
        elemField.setXmlName(new javax.xml.namespace.QName("http://Server", "hozehKind"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mamoorId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://Server", "mamoorId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("moludSeqCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://Server", "moludSeqCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("motherAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("http://Server", "motherAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("motherDateOfBirth");
        elemField.setXmlName(new javax.xml.namespace.QName("http://Server", "motherDateOfBirth"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("motherFname");
        elemField.setXmlName(new javax.xml.namespace.QName("http://Server", "motherFname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("motherHozehCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://Server", "motherHozehCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("motherHozehKind");
        elemField.setXmlName(new javax.xml.namespace.QName("http://Server", "motherHozehKind"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("motherName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://Server", "motherName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("motherNin");
        elemField.setXmlName(new javax.xml.namespace.QName("http://Server", "motherNin"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("motherOfficeCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://Server", "motherOfficeCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("motherShenasNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://Server", "motherShenasNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("motherShenasSeri");
        elemField.setXmlName(new javax.xml.namespace.QName("http://Server", "motherShenasSeri"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("motherShenasSrno");
        elemField.setXmlName(new javax.xml.namespace.QName("http://Server", "motherShenasSrno"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("motherZipCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://Server", "motherZipCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("officeCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://Server", "officeCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ordinaryDehgardeshi");
        elemField.setXmlName(new javax.xml.namespace.QName("http://Server", "ordinaryDehgardeshi"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parentDateOfMarriage");
        elemField.setXmlName(new javax.xml.namespace.QName("http://Server", "parentDateOfMarriage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parentMarrRegstNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://Server", "parentMarrRegstNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parentRegstOfficeGeo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://Server", "parentRegstOfficeGeo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parentRegstOfficeNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://Server", "parentRegstOfficeNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("personAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("http://Server", "personAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("personFname");
        elemField.setXmlName(new javax.xml.namespace.QName("http://Server", "personFname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("personName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://Server", "personName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("personNin");
        elemField.setXmlName(new javax.xml.namespace.QName("http://Server", "personNin"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("personZipCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://Server", "personZipCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("religionKind");
        elemField.setXmlName(new javax.xml.namespace.QName("http://Server", "religionKind"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("remarks");
        elemField.setXmlName(new javax.xml.namespace.QName("http://Server", "remarks"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sanadIssueOffice");
        elemField.setXmlName(new javax.xml.namespace.QName("http://Server", "sanadIssueOffice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sanadPrepDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://Server", "sanadPrepDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sanadPrepGeoSerial");
        elemField.setXmlName(new javax.xml.namespace.QName("http://Server", "sanadPrepGeoSerial"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sanadSeri");
        elemField.setXmlName(new javax.xml.namespace.QName("http://Server", "sanadSeri"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sanadSrno");
        elemField.setXmlName(new javax.xml.namespace.QName("http://Server", "sanadSrno"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sexCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://Server", "sexCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shenasnameSeri");
        elemField.setXmlName(new javax.xml.namespace.QName("http://Server", "shenasnameSeri"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shenasnameSrno");
        elemField.setXmlName(new javax.xml.namespace.QName("http://Server", "shenasnameSrno"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("singleTwinTripleCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://Server", "singleTwinTripleCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeOfBirth");
        elemField.setXmlName(new javax.xml.namespace.QName("http://Server", "timeOfBirth"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://Server", "userId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("witness1");
        elemField.setXmlName(new javax.xml.namespace.QName("http://Server", "witness1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://info.model.dcu", "WitnessInfo"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("witness2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://Server", "witness2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://info.model.dcu", "WitnessInfo"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
