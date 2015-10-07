/**
 * DeathInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package Services;

public class DeathInfo  implements java.io.Serializable {
    private int addressGeoSerial;

    private java.lang.String ancrAddress;

    private int ancrAddressGeoSerial;

    private java.lang.String ancrDateOfBirth;

    private java.lang.String ancrFname;

    private java.lang.String ancrLetterDate;

    private java.lang.String ancrLetterNo;

    private java.lang.String ancrName;

    private long ancrNin;

    private short ancrOfficeCode;

    private java.lang.String ancrPosition;

    private java.lang.String ancrReferenceName;

    private java.lang.String ancrShenasIssuePlace;

    private int ancrShenasNo;

    private java.lang.String ancrShenasSeri;

    private int ancrShenasSrno;

    private long ancrZipCode;

    private java.lang.String dateOfBirth;

    private java.lang.String dateOfDeath;

    private java.lang.String deathCategoryCode;

    private short deathConfirmAutCode;

    private java.lang.String deathDocumentDate;

    private java.lang.String deathDocumentNo;

    private int deathGeoSerial;

    private java.lang.String deathPlaceAddress;

    private short deathReasonCode;

    private java.lang.String deathRecordStage;

    private java.lang.String deathRegstDate;

    private long deathRegstNo;

    private java.lang.String deathSanadPrepAuth;

    private java.lang.String deathSanadSeri;

    private int deathSanadSrno;

    private Services.DeathWitnessInfo deathWitnessInfo1;

    private Services.DeathWitnessInfo deathWitnessInfo2;

    private java.lang.String fatherAddress;

    private java.lang.String fatherDateOfBirth;

    private java.lang.String fatherFname;

    private java.lang.String fatherHozeh;

    private java.lang.String fatherName;

    private long fatherNin;

    private short fatherOfficeCode;

    private java.lang.String fatherShenasIssuePlace;

    private int fatherShenasNo;

    private long fatherZipCode;

    private java.lang.String foreignCityStateName;

    private java.lang.String hozehCode;

    private java.lang.String hozehKind;

    private java.lang.String mamoorId;

    private java.lang.String motherAddress;

    private java.lang.String motherDateOfBirth;

    private java.lang.String motherFname;

    private java.lang.String motherHozeh;

    private java.lang.String motherName;

    private long motherNin;

    private short motherOfficeCode;

    private java.lang.String motherShenasIssuePlace;

    private int motherShenasNo;

    private long motherZipCode;

    private short officeCode;

    private java.lang.String ordinaryDehgardeshi;

    private java.lang.String personAddress;

    private java.lang.String personFname;

    private java.lang.String personName;

    private long personNin;

    private java.lang.String personOccupation;

    private long personZipCode;

    private java.lang.String remarks;

    private java.lang.String sanadIssueOffice;

    private short sanadIssueOfficeCode;

    private java.lang.String sexCode;

    private java.lang.String shenasSeri;

    private int shenasSrno;

    private java.lang.String shenasnameIssueDate;

    private int shenasnameNo;

    private java.lang.String userId;

    public DeathInfo() {
    }

    public DeathInfo(
           int addressGeoSerial,
           java.lang.String ancrAddress,
           int ancrAddressGeoSerial,
           java.lang.String ancrDateOfBirth,
           java.lang.String ancrFname,
           java.lang.String ancrLetterDate,
           java.lang.String ancrLetterNo,
           java.lang.String ancrName,
           long ancrNin,
           short ancrOfficeCode,
           java.lang.String ancrPosition,
           java.lang.String ancrReferenceName,
           java.lang.String ancrShenasIssuePlace,
           int ancrShenasNo,
           java.lang.String ancrShenasSeri,
           int ancrShenasSrno,
           long ancrZipCode,
           java.lang.String dateOfBirth,
           java.lang.String dateOfDeath,
           java.lang.String deathCategoryCode,
           short deathConfirmAutCode,
           java.lang.String deathDocumentDate,
           java.lang.String deathDocumentNo,
           int deathGeoSerial,
           java.lang.String deathPlaceAddress,
           short deathReasonCode,
           java.lang.String deathRecordStage,
           java.lang.String deathRegstDate,
           long deathRegstNo,
           java.lang.String deathSanadPrepAuth,
           java.lang.String deathSanadSeri,
           int deathSanadSrno,
           Services.DeathWitnessInfo deathWitnessInfo1,
           Services.DeathWitnessInfo deathWitnessInfo2,
           java.lang.String fatherAddress,
           java.lang.String fatherDateOfBirth,
           java.lang.String fatherFname,
           java.lang.String fatherHozeh,
           java.lang.String fatherName,
           long fatherNin,
           short fatherOfficeCode,
           java.lang.String fatherShenasIssuePlace,
           int fatherShenasNo,
           long fatherZipCode,
           java.lang.String foreignCityStateName,
           java.lang.String hozehCode,
           java.lang.String hozehKind,
           java.lang.String mamoorId,
           java.lang.String motherAddress,
           java.lang.String motherDateOfBirth,
           java.lang.String motherFname,
           java.lang.String motherHozeh,
           java.lang.String motherName,
           long motherNin,
           short motherOfficeCode,
           java.lang.String motherShenasIssuePlace,
           int motherShenasNo,
           long motherZipCode,
           short officeCode,
           java.lang.String ordinaryDehgardeshi,
           java.lang.String personAddress,
           java.lang.String personFname,
           java.lang.String personName,
           long personNin,
           java.lang.String personOccupation,
           long personZipCode,
           java.lang.String remarks,
           java.lang.String sanadIssueOffice,
           short sanadIssueOfficeCode,
           java.lang.String sexCode,
           java.lang.String shenasSeri,
           int shenasSrno,
           java.lang.String shenasnameIssueDate,
           int shenasnameNo,
           java.lang.String userId) {
           this.addressGeoSerial = addressGeoSerial;
           this.ancrAddress = ancrAddress;
           this.ancrAddressGeoSerial = ancrAddressGeoSerial;
           this.ancrDateOfBirth = ancrDateOfBirth;
           this.ancrFname = ancrFname;
           this.ancrLetterDate = ancrLetterDate;
           this.ancrLetterNo = ancrLetterNo;
           this.ancrName = ancrName;
           this.ancrNin = ancrNin;
           this.ancrOfficeCode = ancrOfficeCode;
           this.ancrPosition = ancrPosition;
           this.ancrReferenceName = ancrReferenceName;
           this.ancrShenasIssuePlace = ancrShenasIssuePlace;
           this.ancrShenasNo = ancrShenasNo;
           this.ancrShenasSeri = ancrShenasSeri;
           this.ancrShenasSrno = ancrShenasSrno;
           this.ancrZipCode = ancrZipCode;
           this.dateOfBirth = dateOfBirth;
           this.dateOfDeath = dateOfDeath;
           this.deathCategoryCode = deathCategoryCode;
           this.deathConfirmAutCode = deathConfirmAutCode;
           this.deathDocumentDate = deathDocumentDate;
           this.deathDocumentNo = deathDocumentNo;
           this.deathGeoSerial = deathGeoSerial;
           this.deathPlaceAddress = deathPlaceAddress;
           this.deathReasonCode = deathReasonCode;
           this.deathRecordStage = deathRecordStage;
           this.deathRegstDate = deathRegstDate;
           this.deathRegstNo = deathRegstNo;
           this.deathSanadPrepAuth = deathSanadPrepAuth;
           this.deathSanadSeri = deathSanadSeri;
           this.deathSanadSrno = deathSanadSrno;
           this.deathWitnessInfo1 = deathWitnessInfo1;
           this.deathWitnessInfo2 = deathWitnessInfo2;
           this.fatherAddress = fatherAddress;
           this.fatherDateOfBirth = fatherDateOfBirth;
           this.fatherFname = fatherFname;
           this.fatherHozeh = fatherHozeh;
           this.fatherName = fatherName;
           this.fatherNin = fatherNin;
           this.fatherOfficeCode = fatherOfficeCode;
           this.fatherShenasIssuePlace = fatherShenasIssuePlace;
           this.fatherShenasNo = fatherShenasNo;
           this.fatherZipCode = fatherZipCode;
           this.foreignCityStateName = foreignCityStateName;
           this.hozehCode = hozehCode;
           this.hozehKind = hozehKind;
           this.mamoorId = mamoorId;
           this.motherAddress = motherAddress;
           this.motherDateOfBirth = motherDateOfBirth;
           this.motherFname = motherFname;
           this.motherHozeh = motherHozeh;
           this.motherName = motherName;
           this.motherNin = motherNin;
           this.motherOfficeCode = motherOfficeCode;
           this.motherShenasIssuePlace = motherShenasIssuePlace;
           this.motherShenasNo = motherShenasNo;
           this.motherZipCode = motherZipCode;
           this.officeCode = officeCode;
           this.ordinaryDehgardeshi = ordinaryDehgardeshi;
           this.personAddress = personAddress;
           this.personFname = personFname;
           this.personName = personName;
           this.personNin = personNin;
           this.personOccupation = personOccupation;
           this.personZipCode = personZipCode;
           this.remarks = remarks;
           this.sanadIssueOffice = sanadIssueOffice;
           this.sanadIssueOfficeCode = sanadIssueOfficeCode;
           this.sexCode = sexCode;
           this.shenasSeri = shenasSeri;
           this.shenasSrno = shenasSrno;
           this.shenasnameIssueDate = shenasnameIssueDate;
           this.shenasnameNo = shenasnameNo;
           this.userId = userId;
    }


    /**
     * Gets the addressGeoSerial value for this DeathInfo.
     * 
     * @return addressGeoSerial
     */
    public int getAddressGeoSerial() {
        return addressGeoSerial;
    }


    /**
     * Sets the addressGeoSerial value for this DeathInfo.
     * 
     * @param addressGeoSerial
     */
    public void setAddressGeoSerial(int addressGeoSerial) {
        this.addressGeoSerial = addressGeoSerial;
    }


    /**
     * Gets the ancrAddress value for this DeathInfo.
     * 
     * @return ancrAddress
     */
    public java.lang.String getAncrAddress() {
        return ancrAddress;
    }


    /**
     * Sets the ancrAddress value for this DeathInfo.
     * 
     * @param ancrAddress
     */
    public void setAncrAddress(java.lang.String ancrAddress) {
        this.ancrAddress = ancrAddress;
    }


    /**
     * Gets the ancrAddressGeoSerial value for this DeathInfo.
     * 
     * @return ancrAddressGeoSerial
     */
    public int getAncrAddressGeoSerial() {
        return ancrAddressGeoSerial;
    }


    /**
     * Sets the ancrAddressGeoSerial value for this DeathInfo.
     * 
     * @param ancrAddressGeoSerial
     */
    public void setAncrAddressGeoSerial(int ancrAddressGeoSerial) {
        this.ancrAddressGeoSerial = ancrAddressGeoSerial;
    }


    /**
     * Gets the ancrDateOfBirth value for this DeathInfo.
     * 
     * @return ancrDateOfBirth
     */
    public java.lang.String getAncrDateOfBirth() {
        return ancrDateOfBirth;
    }


    /**
     * Sets the ancrDateOfBirth value for this DeathInfo.
     * 
     * @param ancrDateOfBirth
     */
    public void setAncrDateOfBirth(java.lang.String ancrDateOfBirth) {
        this.ancrDateOfBirth = ancrDateOfBirth;
    }


    /**
     * Gets the ancrFname value for this DeathInfo.
     * 
     * @return ancrFname
     */
    public java.lang.String getAncrFname() {
        return ancrFname;
    }


    /**
     * Sets the ancrFname value for this DeathInfo.
     * 
     * @param ancrFname
     */
    public void setAncrFname(java.lang.String ancrFname) {
        this.ancrFname = ancrFname;
    }


    /**
     * Gets the ancrLetterDate value for this DeathInfo.
     * 
     * @return ancrLetterDate
     */
    public java.lang.String getAncrLetterDate() {
        return ancrLetterDate;
    }


    /**
     * Sets the ancrLetterDate value for this DeathInfo.
     * 
     * @param ancrLetterDate
     */
    public void setAncrLetterDate(java.lang.String ancrLetterDate) {
        this.ancrLetterDate = ancrLetterDate;
    }


    /**
     * Gets the ancrLetterNo value for this DeathInfo.
     * 
     * @return ancrLetterNo
     */
    public java.lang.String getAncrLetterNo() {
        return ancrLetterNo;
    }


    /**
     * Sets the ancrLetterNo value for this DeathInfo.
     * 
     * @param ancrLetterNo
     */
    public void setAncrLetterNo(java.lang.String ancrLetterNo) {
        this.ancrLetterNo = ancrLetterNo;
    }


    /**
     * Gets the ancrName value for this DeathInfo.
     * 
     * @return ancrName
     */
    public java.lang.String getAncrName() {
        return ancrName;
    }


    /**
     * Sets the ancrName value for this DeathInfo.
     * 
     * @param ancrName
     */
    public void setAncrName(java.lang.String ancrName) {
        this.ancrName = ancrName;
    }


    /**
     * Gets the ancrNin value for this DeathInfo.
     * 
     * @return ancrNin
     */
    public long getAncrNin() {
        return ancrNin;
    }


    /**
     * Sets the ancrNin value for this DeathInfo.
     * 
     * @param ancrNin
     */
    public void setAncrNin(long ancrNin) {
        this.ancrNin = ancrNin;
    }


    /**
     * Gets the ancrOfficeCode value for this DeathInfo.
     * 
     * @return ancrOfficeCode
     */
    public short getAncrOfficeCode() {
        return ancrOfficeCode;
    }


    /**
     * Sets the ancrOfficeCode value for this DeathInfo.
     * 
     * @param ancrOfficeCode
     */
    public void setAncrOfficeCode(short ancrOfficeCode) {
        this.ancrOfficeCode = ancrOfficeCode;
    }


    /**
     * Gets the ancrPosition value for this DeathInfo.
     * 
     * @return ancrPosition
     */
    public java.lang.String getAncrPosition() {
        return ancrPosition;
    }


    /**
     * Sets the ancrPosition value for this DeathInfo.
     * 
     * @param ancrPosition
     */
    public void setAncrPosition(java.lang.String ancrPosition) {
        this.ancrPosition = ancrPosition;
    }


    /**
     * Gets the ancrReferenceName value for this DeathInfo.
     * 
     * @return ancrReferenceName
     */
    public java.lang.String getAncrReferenceName() {
        return ancrReferenceName;
    }


    /**
     * Sets the ancrReferenceName value for this DeathInfo.
     * 
     * @param ancrReferenceName
     */
    public void setAncrReferenceName(java.lang.String ancrReferenceName) {
        this.ancrReferenceName = ancrReferenceName;
    }


    /**
     * Gets the ancrShenasIssuePlace value for this DeathInfo.
     * 
     * @return ancrShenasIssuePlace
     */
    public java.lang.String getAncrShenasIssuePlace() {
        return ancrShenasIssuePlace;
    }


    /**
     * Sets the ancrShenasIssuePlace value for this DeathInfo.
     * 
     * @param ancrShenasIssuePlace
     */
    public void setAncrShenasIssuePlace(java.lang.String ancrShenasIssuePlace) {
        this.ancrShenasIssuePlace = ancrShenasIssuePlace;
    }


    /**
     * Gets the ancrShenasNo value for this DeathInfo.
     * 
     * @return ancrShenasNo
     */
    public int getAncrShenasNo() {
        return ancrShenasNo;
    }


    /**
     * Sets the ancrShenasNo value for this DeathInfo.
     * 
     * @param ancrShenasNo
     */
    public void setAncrShenasNo(int ancrShenasNo) {
        this.ancrShenasNo = ancrShenasNo;
    }


    /**
     * Gets the ancrShenasSeri value for this DeathInfo.
     * 
     * @return ancrShenasSeri
     */
    public java.lang.String getAncrShenasSeri() {
        return ancrShenasSeri;
    }


    /**
     * Sets the ancrShenasSeri value for this DeathInfo.
     * 
     * @param ancrShenasSeri
     */
    public void setAncrShenasSeri(java.lang.String ancrShenasSeri) {
        this.ancrShenasSeri = ancrShenasSeri;
    }


    /**
     * Gets the ancrShenasSrno value for this DeathInfo.
     * 
     * @return ancrShenasSrno
     */
    public int getAncrShenasSrno() {
        return ancrShenasSrno;
    }


    /**
     * Sets the ancrShenasSrno value for this DeathInfo.
     * 
     * @param ancrShenasSrno
     */
    public void setAncrShenasSrno(int ancrShenasSrno) {
        this.ancrShenasSrno = ancrShenasSrno;
    }


    /**
     * Gets the ancrZipCode value for this DeathInfo.
     * 
     * @return ancrZipCode
     */
    public long getAncrZipCode() {
        return ancrZipCode;
    }


    /**
     * Sets the ancrZipCode value for this DeathInfo.
     * 
     * @param ancrZipCode
     */
    public void setAncrZipCode(long ancrZipCode) {
        this.ancrZipCode = ancrZipCode;
    }


    /**
     * Gets the dateOfBirth value for this DeathInfo.
     * 
     * @return dateOfBirth
     */
    public java.lang.String getDateOfBirth() {
        return dateOfBirth;
    }


    /**
     * Sets the dateOfBirth value for this DeathInfo.
     * 
     * @param dateOfBirth
     */
    public void setDateOfBirth(java.lang.String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }


    /**
     * Gets the dateOfDeath value for this DeathInfo.
     * 
     * @return dateOfDeath
     */
    public java.lang.String getDateOfDeath() {
        return dateOfDeath;
    }


    /**
     * Sets the dateOfDeath value for this DeathInfo.
     * 
     * @param dateOfDeath
     */
    public void setDateOfDeath(java.lang.String dateOfDeath) {
        this.dateOfDeath = dateOfDeath;
    }


    /**
     * Gets the deathCategoryCode value for this DeathInfo.
     * 
     * @return deathCategoryCode
     */
    public java.lang.String getDeathCategoryCode() {
        return deathCategoryCode;
    }


    /**
     * Sets the deathCategoryCode value for this DeathInfo.
     * 
     * @param deathCategoryCode
     */
    public void setDeathCategoryCode(java.lang.String deathCategoryCode) {
        this.deathCategoryCode = deathCategoryCode;
    }


    /**
     * Gets the deathConfirmAutCode value for this DeathInfo.
     * 
     * @return deathConfirmAutCode
     */
    public short getDeathConfirmAutCode() {
        return deathConfirmAutCode;
    }


    /**
     * Sets the deathConfirmAutCode value for this DeathInfo.
     * 
     * @param deathConfirmAutCode
     */
    public void setDeathConfirmAutCode(short deathConfirmAutCode) {
        this.deathConfirmAutCode = deathConfirmAutCode;
    }


    /**
     * Gets the deathDocumentDate value for this DeathInfo.
     * 
     * @return deathDocumentDate
     */
    public java.lang.String getDeathDocumentDate() {
        return deathDocumentDate;
    }


    /**
     * Sets the deathDocumentDate value for this DeathInfo.
     * 
     * @param deathDocumentDate
     */
    public void setDeathDocumentDate(java.lang.String deathDocumentDate) {
        this.deathDocumentDate = deathDocumentDate;
    }


    /**
     * Gets the deathDocumentNo value for this DeathInfo.
     * 
     * @return deathDocumentNo
     */
    public java.lang.String getDeathDocumentNo() {
        return deathDocumentNo;
    }


    /**
     * Sets the deathDocumentNo value for this DeathInfo.
     * 
     * @param deathDocumentNo
     */
    public void setDeathDocumentNo(java.lang.String deathDocumentNo) {
        this.deathDocumentNo = deathDocumentNo;
    }


    /**
     * Gets the deathGeoSerial value for this DeathInfo.
     * 
     * @return deathGeoSerial
     */
    public int getDeathGeoSerial() {
        return deathGeoSerial;
    }


    /**
     * Sets the deathGeoSerial value for this DeathInfo.
     * 
     * @param deathGeoSerial
     */
    public void setDeathGeoSerial(int deathGeoSerial) {
        this.deathGeoSerial = deathGeoSerial;
    }


    /**
     * Gets the deathPlaceAddress value for this DeathInfo.
     * 
     * @return deathPlaceAddress
     */
    public java.lang.String getDeathPlaceAddress() {
        return deathPlaceAddress;
    }


    /**
     * Sets the deathPlaceAddress value for this DeathInfo.
     * 
     * @param deathPlaceAddress
     */
    public void setDeathPlaceAddress(java.lang.String deathPlaceAddress) {
        this.deathPlaceAddress = deathPlaceAddress;
    }


    /**
     * Gets the deathReasonCode value for this DeathInfo.
     * 
     * @return deathReasonCode
     */
    public short getDeathReasonCode() {
        return deathReasonCode;
    }


    /**
     * Sets the deathReasonCode value for this DeathInfo.
     * 
     * @param deathReasonCode
     */
    public void setDeathReasonCode(short deathReasonCode) {
        this.deathReasonCode = deathReasonCode;
    }


    /**
     * Gets the deathRecordStage value for this DeathInfo.
     * 
     * @return deathRecordStage
     */
    public java.lang.String getDeathRecordStage() {
        return deathRecordStage;
    }


    /**
     * Sets the deathRecordStage value for this DeathInfo.
     * 
     * @param deathRecordStage
     */
    public void setDeathRecordStage(java.lang.String deathRecordStage) {
        this.deathRecordStage = deathRecordStage;
    }


    /**
     * Gets the deathRegstDate value for this DeathInfo.
     * 
     * @return deathRegstDate
     */
    public java.lang.String getDeathRegstDate() {
        return deathRegstDate;
    }


    /**
     * Sets the deathRegstDate value for this DeathInfo.
     * 
     * @param deathRegstDate
     */
    public void setDeathRegstDate(java.lang.String deathRegstDate) {
        this.deathRegstDate = deathRegstDate;
    }


    /**
     * Gets the deathRegstNo value for this DeathInfo.
     * 
     * @return deathRegstNo
     */
    public long getDeathRegstNo() {
        return deathRegstNo;
    }


    /**
     * Sets the deathRegstNo value for this DeathInfo.
     * 
     * @param deathRegstNo
     */
    public void setDeathRegstNo(long deathRegstNo) {
        this.deathRegstNo = deathRegstNo;
    }


    /**
     * Gets the deathSanadPrepAuth value for this DeathInfo.
     * 
     * @return deathSanadPrepAuth
     */
    public java.lang.String getDeathSanadPrepAuth() {
        return deathSanadPrepAuth;
    }


    /**
     * Sets the deathSanadPrepAuth value for this DeathInfo.
     * 
     * @param deathSanadPrepAuth
     */
    public void setDeathSanadPrepAuth(java.lang.String deathSanadPrepAuth) {
        this.deathSanadPrepAuth = deathSanadPrepAuth;
    }


    /**
     * Gets the deathSanadSeri value for this DeathInfo.
     * 
     * @return deathSanadSeri
     */
    public java.lang.String getDeathSanadSeri() {
        return deathSanadSeri;
    }


    /**
     * Sets the deathSanadSeri value for this DeathInfo.
     * 
     * @param deathSanadSeri
     */
    public void setDeathSanadSeri(java.lang.String deathSanadSeri) {
        this.deathSanadSeri = deathSanadSeri;
    }


    /**
     * Gets the deathSanadSrno value for this DeathInfo.
     * 
     * @return deathSanadSrno
     */
    public int getDeathSanadSrno() {
        return deathSanadSrno;
    }


    /**
     * Sets the deathSanadSrno value for this DeathInfo.
     * 
     * @param deathSanadSrno
     */
    public void setDeathSanadSrno(int deathSanadSrno) {
        this.deathSanadSrno = deathSanadSrno;
    }


    /**
     * Gets the deathWitnessInfo1 value for this DeathInfo.
     * 
     * @return deathWitnessInfo1
     */
    public Services.DeathWitnessInfo getDeathWitnessInfo1() {
        return deathWitnessInfo1;
    }


    /**
     * Sets the deathWitnessInfo1 value for this DeathInfo.
     * 
     * @param deathWitnessInfo1
     */
    public void setDeathWitnessInfo1(Services.DeathWitnessInfo deathWitnessInfo1) {
        this.deathWitnessInfo1 = deathWitnessInfo1;
    }


    /**
     * Gets the deathWitnessInfo2 value for this DeathInfo.
     * 
     * @return deathWitnessInfo2
     */
    public Services.DeathWitnessInfo getDeathWitnessInfo2() {
        return deathWitnessInfo2;
    }


    /**
     * Sets the deathWitnessInfo2 value for this DeathInfo.
     * 
     * @param deathWitnessInfo2
     */
    public void setDeathWitnessInfo2(Services.DeathWitnessInfo deathWitnessInfo2) {
        this.deathWitnessInfo2 = deathWitnessInfo2;
    }


    /**
     * Gets the fatherAddress value for this DeathInfo.
     * 
     * @return fatherAddress
     */
    public java.lang.String getFatherAddress() {
        return fatherAddress;
    }


    /**
     * Sets the fatherAddress value for this DeathInfo.
     * 
     * @param fatherAddress
     */
    public void setFatherAddress(java.lang.String fatherAddress) {
        this.fatherAddress = fatherAddress;
    }


    /**
     * Gets the fatherDateOfBirth value for this DeathInfo.
     * 
     * @return fatherDateOfBirth
     */
    public java.lang.String getFatherDateOfBirth() {
        return fatherDateOfBirth;
    }


    /**
     * Sets the fatherDateOfBirth value for this DeathInfo.
     * 
     * @param fatherDateOfBirth
     */
    public void setFatherDateOfBirth(java.lang.String fatherDateOfBirth) {
        this.fatherDateOfBirth = fatherDateOfBirth;
    }


    /**
     * Gets the fatherFname value for this DeathInfo.
     * 
     * @return fatherFname
     */
    public java.lang.String getFatherFname() {
        return fatherFname;
    }


    /**
     * Sets the fatherFname value for this DeathInfo.
     * 
     * @param fatherFname
     */
    public void setFatherFname(java.lang.String fatherFname) {
        this.fatherFname = fatherFname;
    }


    /**
     * Gets the fatherHozeh value for this DeathInfo.
     * 
     * @return fatherHozeh
     */
    public java.lang.String getFatherHozeh() {
        return fatherHozeh;
    }


    /**
     * Sets the fatherHozeh value for this DeathInfo.
     * 
     * @param fatherHozeh
     */
    public void setFatherHozeh(java.lang.String fatherHozeh) {
        this.fatherHozeh = fatherHozeh;
    }


    /**
     * Gets the fatherName value for this DeathInfo.
     * 
     * @return fatherName
     */
    public java.lang.String getFatherName() {
        return fatherName;
    }


    /**
     * Sets the fatherName value for this DeathInfo.
     * 
     * @param fatherName
     */
    public void setFatherName(java.lang.String fatherName) {
        this.fatherName = fatherName;
    }


    /**
     * Gets the fatherNin value for this DeathInfo.
     * 
     * @return fatherNin
     */
    public long getFatherNin() {
        return fatherNin;
    }


    /**
     * Sets the fatherNin value for this DeathInfo.
     * 
     * @param fatherNin
     */
    public void setFatherNin(long fatherNin) {
        this.fatherNin = fatherNin;
    }


    /**
     * Gets the fatherOfficeCode value for this DeathInfo.
     * 
     * @return fatherOfficeCode
     */
    public short getFatherOfficeCode() {
        return fatherOfficeCode;
    }


    /**
     * Sets the fatherOfficeCode value for this DeathInfo.
     * 
     * @param fatherOfficeCode
     */
    public void setFatherOfficeCode(short fatherOfficeCode) {
        this.fatherOfficeCode = fatherOfficeCode;
    }


    /**
     * Gets the fatherShenasIssuePlace value for this DeathInfo.
     * 
     * @return fatherShenasIssuePlace
     */
    public java.lang.String getFatherShenasIssuePlace() {
        return fatherShenasIssuePlace;
    }


    /**
     * Sets the fatherShenasIssuePlace value for this DeathInfo.
     * 
     * @param fatherShenasIssuePlace
     */
    public void setFatherShenasIssuePlace(java.lang.String fatherShenasIssuePlace) {
        this.fatherShenasIssuePlace = fatherShenasIssuePlace;
    }


    /**
     * Gets the fatherShenasNo value for this DeathInfo.
     * 
     * @return fatherShenasNo
     */
    public int getFatherShenasNo() {
        return fatherShenasNo;
    }


    /**
     * Sets the fatherShenasNo value for this DeathInfo.
     * 
     * @param fatherShenasNo
     */
    public void setFatherShenasNo(int fatherShenasNo) {
        this.fatherShenasNo = fatherShenasNo;
    }


    /**
     * Gets the fatherZipCode value for this DeathInfo.
     * 
     * @return fatherZipCode
     */
    public long getFatherZipCode() {
        return fatherZipCode;
    }


    /**
     * Sets the fatherZipCode value for this DeathInfo.
     * 
     * @param fatherZipCode
     */
    public void setFatherZipCode(long fatherZipCode) {
        this.fatherZipCode = fatherZipCode;
    }


    /**
     * Gets the foreignCityStateName value for this DeathInfo.
     * 
     * @return foreignCityStateName
     */
    public java.lang.String getForeignCityStateName() {
        return foreignCityStateName;
    }


    /**
     * Sets the foreignCityStateName value for this DeathInfo.
     * 
     * @param foreignCityStateName
     */
    public void setForeignCityStateName(java.lang.String foreignCityStateName) {
        this.foreignCityStateName = foreignCityStateName;
    }


    /**
     * Gets the hozehCode value for this DeathInfo.
     * 
     * @return hozehCode
     */
    public java.lang.String getHozehCode() {
        return hozehCode;
    }


    /**
     * Sets the hozehCode value for this DeathInfo.
     * 
     * @param hozehCode
     */
    public void setHozehCode(java.lang.String hozehCode) {
        this.hozehCode = hozehCode;
    }


    /**
     * Gets the hozehKind value for this DeathInfo.
     * 
     * @return hozehKind
     */
    public java.lang.String getHozehKind() {
        return hozehKind;
    }


    /**
     * Sets the hozehKind value for this DeathInfo.
     * 
     * @param hozehKind
     */
    public void setHozehKind(java.lang.String hozehKind) {
        this.hozehKind = hozehKind;
    }


    /**
     * Gets the mamoorId value for this DeathInfo.
     * 
     * @return mamoorId
     */
    public java.lang.String getMamoorId() {
        return mamoorId;
    }


    /**
     * Sets the mamoorId value for this DeathInfo.
     * 
     * @param mamoorId
     */
    public void setMamoorId(java.lang.String mamoorId) {
        this.mamoorId = mamoorId;
    }


    /**
     * Gets the motherAddress value for this DeathInfo.
     * 
     * @return motherAddress
     */
    public java.lang.String getMotherAddress() {
        return motherAddress;
    }


    /**
     * Sets the motherAddress value for this DeathInfo.
     * 
     * @param motherAddress
     */
    public void setMotherAddress(java.lang.String motherAddress) {
        this.motherAddress = motherAddress;
    }


    /**
     * Gets the motherDateOfBirth value for this DeathInfo.
     * 
     * @return motherDateOfBirth
     */
    public java.lang.String getMotherDateOfBirth() {
        return motherDateOfBirth;
    }


    /**
     * Sets the motherDateOfBirth value for this DeathInfo.
     * 
     * @param motherDateOfBirth
     */
    public void setMotherDateOfBirth(java.lang.String motherDateOfBirth) {
        this.motherDateOfBirth = motherDateOfBirth;
    }


    /**
     * Gets the motherFname value for this DeathInfo.
     * 
     * @return motherFname
     */
    public java.lang.String getMotherFname() {
        return motherFname;
    }


    /**
     * Sets the motherFname value for this DeathInfo.
     * 
     * @param motherFname
     */
    public void setMotherFname(java.lang.String motherFname) {
        this.motherFname = motherFname;
    }


    /**
     * Gets the motherHozeh value for this DeathInfo.
     * 
     * @return motherHozeh
     */
    public java.lang.String getMotherHozeh() {
        return motherHozeh;
    }


    /**
     * Sets the motherHozeh value for this DeathInfo.
     * 
     * @param motherHozeh
     */
    public void setMotherHozeh(java.lang.String motherHozeh) {
        this.motherHozeh = motherHozeh;
    }


    /**
     * Gets the motherName value for this DeathInfo.
     * 
     * @return motherName
     */
    public java.lang.String getMotherName() {
        return motherName;
    }


    /**
     * Sets the motherName value for this DeathInfo.
     * 
     * @param motherName
     */
    public void setMotherName(java.lang.String motherName) {
        this.motherName = motherName;
    }


    /**
     * Gets the motherNin value for this DeathInfo.
     * 
     * @return motherNin
     */
    public long getMotherNin() {
        return motherNin;
    }


    /**
     * Sets the motherNin value for this DeathInfo.
     * 
     * @param motherNin
     */
    public void setMotherNin(long motherNin) {
        this.motherNin = motherNin;
    }


    /**
     * Gets the motherOfficeCode value for this DeathInfo.
     * 
     * @return motherOfficeCode
     */
    public short getMotherOfficeCode() {
        return motherOfficeCode;
    }


    /**
     * Sets the motherOfficeCode value for this DeathInfo.
     * 
     * @param motherOfficeCode
     */
    public void setMotherOfficeCode(short motherOfficeCode) {
        this.motherOfficeCode = motherOfficeCode;
    }


    /**
     * Gets the motherShenasIssuePlace value for this DeathInfo.
     * 
     * @return motherShenasIssuePlace
     */
    public java.lang.String getMotherShenasIssuePlace() {
        return motherShenasIssuePlace;
    }


    /**
     * Sets the motherShenasIssuePlace value for this DeathInfo.
     * 
     * @param motherShenasIssuePlace
     */
    public void setMotherShenasIssuePlace(java.lang.String motherShenasIssuePlace) {
        this.motherShenasIssuePlace = motherShenasIssuePlace;
    }


    /**
     * Gets the motherShenasNo value for this DeathInfo.
     * 
     * @return motherShenasNo
     */
    public int getMotherShenasNo() {
        return motherShenasNo;
    }


    /**
     * Sets the motherShenasNo value for this DeathInfo.
     * 
     * @param motherShenasNo
     */
    public void setMotherShenasNo(int motherShenasNo) {
        this.motherShenasNo = motherShenasNo;
    }


    /**
     * Gets the motherZipCode value for this DeathInfo.
     * 
     * @return motherZipCode
     */
    public long getMotherZipCode() {
        return motherZipCode;
    }


    /**
     * Sets the motherZipCode value for this DeathInfo.
     * 
     * @param motherZipCode
     */
    public void setMotherZipCode(long motherZipCode) {
        this.motherZipCode = motherZipCode;
    }


    /**
     * Gets the officeCode value for this DeathInfo.
     * 
     * @return officeCode
     */
    public short getOfficeCode() {
        return officeCode;
    }


    /**
     * Sets the officeCode value for this DeathInfo.
     * 
     * @param officeCode
     */
    public void setOfficeCode(short officeCode) {
        this.officeCode = officeCode;
    }


    /**
     * Gets the ordinaryDehgardeshi value for this DeathInfo.
     * 
     * @return ordinaryDehgardeshi
     */
    public java.lang.String getOrdinaryDehgardeshi() {
        return ordinaryDehgardeshi;
    }


    /**
     * Sets the ordinaryDehgardeshi value for this DeathInfo.
     * 
     * @param ordinaryDehgardeshi
     */
    public void setOrdinaryDehgardeshi(java.lang.String ordinaryDehgardeshi) {
        this.ordinaryDehgardeshi = ordinaryDehgardeshi;
    }


    /**
     * Gets the personAddress value for this DeathInfo.
     * 
     * @return personAddress
     */
    public java.lang.String getPersonAddress() {
        return personAddress;
    }


    /**
     * Sets the personAddress value for this DeathInfo.
     * 
     * @param personAddress
     */
    public void setPersonAddress(java.lang.String personAddress) {
        this.personAddress = personAddress;
    }


    /**
     * Gets the personFname value for this DeathInfo.
     * 
     * @return personFname
     */
    public java.lang.String getPersonFname() {
        return personFname;
    }


    /**
     * Sets the personFname value for this DeathInfo.
     * 
     * @param personFname
     */
    public void setPersonFname(java.lang.String personFname) {
        this.personFname = personFname;
    }


    /**
     * Gets the personName value for this DeathInfo.
     * 
     * @return personName
     */
    public java.lang.String getPersonName() {
        return personName;
    }


    /**
     * Sets the personName value for this DeathInfo.
     * 
     * @param personName
     */
    public void setPersonName(java.lang.String personName) {
        this.personName = personName;
    }


    /**
     * Gets the personNin value for this DeathInfo.
     * 
     * @return personNin
     */
    public long getPersonNin() {
        return personNin;
    }


    /**
     * Sets the personNin value for this DeathInfo.
     * 
     * @param personNin
     */
    public void setPersonNin(long personNin) {
        this.personNin = personNin;
    }


    /**
     * Gets the personOccupation value for this DeathInfo.
     * 
     * @return personOccupation
     */
    public java.lang.String getPersonOccupation() {
        return personOccupation;
    }


    /**
     * Sets the personOccupation value for this DeathInfo.
     * 
     * @param personOccupation
     */
    public void setPersonOccupation(java.lang.String personOccupation) {
        this.personOccupation = personOccupation;
    }


    /**
     * Gets the personZipCode value for this DeathInfo.
     * 
     * @return personZipCode
     */
    public long getPersonZipCode() {
        return personZipCode;
    }


    /**
     * Sets the personZipCode value for this DeathInfo.
     * 
     * @param personZipCode
     */
    public void setPersonZipCode(long personZipCode) {
        this.personZipCode = personZipCode;
    }


    /**
     * Gets the remarks value for this DeathInfo.
     * 
     * @return remarks
     */
    public java.lang.String getRemarks() {
        return remarks;
    }


    /**
     * Sets the remarks value for this DeathInfo.
     * 
     * @param remarks
     */
    public void setRemarks(java.lang.String remarks) {
        this.remarks = remarks;
    }


    /**
     * Gets the sanadIssueOffice value for this DeathInfo.
     * 
     * @return sanadIssueOffice
     */
    public java.lang.String getSanadIssueOffice() {
        return sanadIssueOffice;
    }


    /**
     * Sets the sanadIssueOffice value for this DeathInfo.
     * 
     * @param sanadIssueOffice
     */
    public void setSanadIssueOffice(java.lang.String sanadIssueOffice) {
        this.sanadIssueOffice = sanadIssueOffice;
    }


    /**
     * Gets the sanadIssueOfficeCode value for this DeathInfo.
     * 
     * @return sanadIssueOfficeCode
     */
    public short getSanadIssueOfficeCode() {
        return sanadIssueOfficeCode;
    }


    /**
     * Sets the sanadIssueOfficeCode value for this DeathInfo.
     * 
     * @param sanadIssueOfficeCode
     */
    public void setSanadIssueOfficeCode(short sanadIssueOfficeCode) {
        this.sanadIssueOfficeCode = sanadIssueOfficeCode;
    }


    /**
     * Gets the sexCode value for this DeathInfo.
     * 
     * @return sexCode
     */
    public java.lang.String getSexCode() {
        return sexCode;
    }


    /**
     * Sets the sexCode value for this DeathInfo.
     * 
     * @param sexCode
     */
    public void setSexCode(java.lang.String sexCode) {
        this.sexCode = sexCode;
    }


    /**
     * Gets the shenasSeri value for this DeathInfo.
     * 
     * @return shenasSeri
     */
    public java.lang.String getShenasSeri() {
        return shenasSeri;
    }


    /**
     * Sets the shenasSeri value for this DeathInfo.
     * 
     * @param shenasSeri
     */
    public void setShenasSeri(java.lang.String shenasSeri) {
        this.shenasSeri = shenasSeri;
    }


    /**
     * Gets the shenasSrno value for this DeathInfo.
     * 
     * @return shenasSrno
     */
    public int getShenasSrno() {
        return shenasSrno;
    }


    /**
     * Sets the shenasSrno value for this DeathInfo.
     * 
     * @param shenasSrno
     */
    public void setShenasSrno(int shenasSrno) {
        this.shenasSrno = shenasSrno;
    }


    /**
     * Gets the shenasnameIssueDate value for this DeathInfo.
     * 
     * @return shenasnameIssueDate
     */
    public java.lang.String getShenasnameIssueDate() {
        return shenasnameIssueDate;
    }


    /**
     * Sets the shenasnameIssueDate value for this DeathInfo.
     * 
     * @param shenasnameIssueDate
     */
    public void setShenasnameIssueDate(java.lang.String shenasnameIssueDate) {
        this.shenasnameIssueDate = shenasnameIssueDate;
    }


    /**
     * Gets the shenasnameNo value for this DeathInfo.
     * 
     * @return shenasnameNo
     */
    public int getShenasnameNo() {
        return shenasnameNo;
    }


    /**
     * Sets the shenasnameNo value for this DeathInfo.
     * 
     * @param shenasnameNo
     */
    public void setShenasnameNo(int shenasnameNo) {
        this.shenasnameNo = shenasnameNo;
    }


    /**
     * Gets the userId value for this DeathInfo.
     * 
     * @return userId
     */
    public java.lang.String getUserId() {
        return userId;
    }


    /**
     * Sets the userId value for this DeathInfo.
     * 
     * @param userId
     */
    public void setUserId(java.lang.String userId) {
        this.userId = userId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DeathInfo)) return false;
        DeathInfo other = (DeathInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.addressGeoSerial == other.getAddressGeoSerial() &&
            ((this.ancrAddress==null && other.getAncrAddress()==null) || 
             (this.ancrAddress!=null &&
              this.ancrAddress.equals(other.getAncrAddress()))) &&
            this.ancrAddressGeoSerial == other.getAncrAddressGeoSerial() &&
            ((this.ancrDateOfBirth==null && other.getAncrDateOfBirth()==null) || 
             (this.ancrDateOfBirth!=null &&
              this.ancrDateOfBirth.equals(other.getAncrDateOfBirth()))) &&
            ((this.ancrFname==null && other.getAncrFname()==null) || 
             (this.ancrFname!=null &&
              this.ancrFname.equals(other.getAncrFname()))) &&
            ((this.ancrLetterDate==null && other.getAncrLetterDate()==null) || 
             (this.ancrLetterDate!=null &&
              this.ancrLetterDate.equals(other.getAncrLetterDate()))) &&
            ((this.ancrLetterNo==null && other.getAncrLetterNo()==null) || 
             (this.ancrLetterNo!=null &&
              this.ancrLetterNo.equals(other.getAncrLetterNo()))) &&
            ((this.ancrName==null && other.getAncrName()==null) || 
             (this.ancrName!=null &&
              this.ancrName.equals(other.getAncrName()))) &&
            this.ancrNin == other.getAncrNin() &&
            this.ancrOfficeCode == other.getAncrOfficeCode() &&
            ((this.ancrPosition==null && other.getAncrPosition()==null) || 
             (this.ancrPosition!=null &&
              this.ancrPosition.equals(other.getAncrPosition()))) &&
            ((this.ancrReferenceName==null && other.getAncrReferenceName()==null) || 
             (this.ancrReferenceName!=null &&
              this.ancrReferenceName.equals(other.getAncrReferenceName()))) &&
            ((this.ancrShenasIssuePlace==null && other.getAncrShenasIssuePlace()==null) || 
             (this.ancrShenasIssuePlace!=null &&
              this.ancrShenasIssuePlace.equals(other.getAncrShenasIssuePlace()))) &&
            this.ancrShenasNo == other.getAncrShenasNo() &&
            ((this.ancrShenasSeri==null && other.getAncrShenasSeri()==null) || 
             (this.ancrShenasSeri!=null &&
              this.ancrShenasSeri.equals(other.getAncrShenasSeri()))) &&
            this.ancrShenasSrno == other.getAncrShenasSrno() &&
            this.ancrZipCode == other.getAncrZipCode() &&
            ((this.dateOfBirth==null && other.getDateOfBirth()==null) || 
             (this.dateOfBirth!=null &&
              this.dateOfBirth.equals(other.getDateOfBirth()))) &&
            ((this.dateOfDeath==null && other.getDateOfDeath()==null) || 
             (this.dateOfDeath!=null &&
              this.dateOfDeath.equals(other.getDateOfDeath()))) &&
            ((this.deathCategoryCode==null && other.getDeathCategoryCode()==null) || 
             (this.deathCategoryCode!=null &&
              this.deathCategoryCode.equals(other.getDeathCategoryCode()))) &&
            this.deathConfirmAutCode == other.getDeathConfirmAutCode() &&
            ((this.deathDocumentDate==null && other.getDeathDocumentDate()==null) || 
             (this.deathDocumentDate!=null &&
              this.deathDocumentDate.equals(other.getDeathDocumentDate()))) &&
            ((this.deathDocumentNo==null && other.getDeathDocumentNo()==null) || 
             (this.deathDocumentNo!=null &&
              this.deathDocumentNo.equals(other.getDeathDocumentNo()))) &&
            this.deathGeoSerial == other.getDeathGeoSerial() &&
            ((this.deathPlaceAddress==null && other.getDeathPlaceAddress()==null) || 
             (this.deathPlaceAddress!=null &&
              this.deathPlaceAddress.equals(other.getDeathPlaceAddress()))) &&
            this.deathReasonCode == other.getDeathReasonCode() &&
            ((this.deathRecordStage==null && other.getDeathRecordStage()==null) || 
             (this.deathRecordStage!=null &&
              this.deathRecordStage.equals(other.getDeathRecordStage()))) &&
            ((this.deathRegstDate==null && other.getDeathRegstDate()==null) || 
             (this.deathRegstDate!=null &&
              this.deathRegstDate.equals(other.getDeathRegstDate()))) &&
            this.deathRegstNo == other.getDeathRegstNo() &&
            ((this.deathSanadPrepAuth==null && other.getDeathSanadPrepAuth()==null) || 
             (this.deathSanadPrepAuth!=null &&
              this.deathSanadPrepAuth.equals(other.getDeathSanadPrepAuth()))) &&
            ((this.deathSanadSeri==null && other.getDeathSanadSeri()==null) || 
             (this.deathSanadSeri!=null &&
              this.deathSanadSeri.equals(other.getDeathSanadSeri()))) &&
            this.deathSanadSrno == other.getDeathSanadSrno() &&
            ((this.deathWitnessInfo1==null && other.getDeathWitnessInfo1()==null) || 
             (this.deathWitnessInfo1!=null &&
              this.deathWitnessInfo1.equals(other.getDeathWitnessInfo1()))) &&
            ((this.deathWitnessInfo2==null && other.getDeathWitnessInfo2()==null) || 
             (this.deathWitnessInfo2!=null &&
              this.deathWitnessInfo2.equals(other.getDeathWitnessInfo2()))) &&
            ((this.fatherAddress==null && other.getFatherAddress()==null) || 
             (this.fatherAddress!=null &&
              this.fatherAddress.equals(other.getFatherAddress()))) &&
            ((this.fatherDateOfBirth==null && other.getFatherDateOfBirth()==null) || 
             (this.fatherDateOfBirth!=null &&
              this.fatherDateOfBirth.equals(other.getFatherDateOfBirth()))) &&
            ((this.fatherFname==null && other.getFatherFname()==null) || 
             (this.fatherFname!=null &&
              this.fatherFname.equals(other.getFatherFname()))) &&
            ((this.fatherHozeh==null && other.getFatherHozeh()==null) || 
             (this.fatherHozeh!=null &&
              this.fatherHozeh.equals(other.getFatherHozeh()))) &&
            ((this.fatherName==null && other.getFatherName()==null) || 
             (this.fatherName!=null &&
              this.fatherName.equals(other.getFatherName()))) &&
            this.fatherNin == other.getFatherNin() &&
            this.fatherOfficeCode == other.getFatherOfficeCode() &&
            ((this.fatherShenasIssuePlace==null && other.getFatherShenasIssuePlace()==null) || 
             (this.fatherShenasIssuePlace!=null &&
              this.fatherShenasIssuePlace.equals(other.getFatherShenasIssuePlace()))) &&
            this.fatherShenasNo == other.getFatherShenasNo() &&
            this.fatherZipCode == other.getFatherZipCode() &&
            ((this.foreignCityStateName==null && other.getForeignCityStateName()==null) || 
             (this.foreignCityStateName!=null &&
              this.foreignCityStateName.equals(other.getForeignCityStateName()))) &&
            ((this.hozehCode==null && other.getHozehCode()==null) || 
             (this.hozehCode!=null &&
              this.hozehCode.equals(other.getHozehCode()))) &&
            ((this.hozehKind==null && other.getHozehKind()==null) || 
             (this.hozehKind!=null &&
              this.hozehKind.equals(other.getHozehKind()))) &&
            ((this.mamoorId==null && other.getMamoorId()==null) || 
             (this.mamoorId!=null &&
              this.mamoorId.equals(other.getMamoorId()))) &&
            ((this.motherAddress==null && other.getMotherAddress()==null) || 
             (this.motherAddress!=null &&
              this.motherAddress.equals(other.getMotherAddress()))) &&
            ((this.motherDateOfBirth==null && other.getMotherDateOfBirth()==null) || 
             (this.motherDateOfBirth!=null &&
              this.motherDateOfBirth.equals(other.getMotherDateOfBirth()))) &&
            ((this.motherFname==null && other.getMotherFname()==null) || 
             (this.motherFname!=null &&
              this.motherFname.equals(other.getMotherFname()))) &&
            ((this.motherHozeh==null && other.getMotherHozeh()==null) || 
             (this.motherHozeh!=null &&
              this.motherHozeh.equals(other.getMotherHozeh()))) &&
            ((this.motherName==null && other.getMotherName()==null) || 
             (this.motherName!=null &&
              this.motherName.equals(other.getMotherName()))) &&
            this.motherNin == other.getMotherNin() &&
            this.motherOfficeCode == other.getMotherOfficeCode() &&
            ((this.motherShenasIssuePlace==null && other.getMotherShenasIssuePlace()==null) || 
             (this.motherShenasIssuePlace!=null &&
              this.motherShenasIssuePlace.equals(other.getMotherShenasIssuePlace()))) &&
            this.motherShenasNo == other.getMotherShenasNo() &&
            this.motherZipCode == other.getMotherZipCode() &&
            this.officeCode == other.getOfficeCode() &&
            ((this.ordinaryDehgardeshi==null && other.getOrdinaryDehgardeshi()==null) || 
             (this.ordinaryDehgardeshi!=null &&
              this.ordinaryDehgardeshi.equals(other.getOrdinaryDehgardeshi()))) &&
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
            ((this.personOccupation==null && other.getPersonOccupation()==null) || 
             (this.personOccupation!=null &&
              this.personOccupation.equals(other.getPersonOccupation()))) &&
            this.personZipCode == other.getPersonZipCode() &&
            ((this.remarks==null && other.getRemarks()==null) || 
             (this.remarks!=null &&
              this.remarks.equals(other.getRemarks()))) &&
            ((this.sanadIssueOffice==null && other.getSanadIssueOffice()==null) || 
             (this.sanadIssueOffice!=null &&
              this.sanadIssueOffice.equals(other.getSanadIssueOffice()))) &&
            this.sanadIssueOfficeCode == other.getSanadIssueOfficeCode() &&
            ((this.sexCode==null && other.getSexCode()==null) || 
             (this.sexCode!=null &&
              this.sexCode.equals(other.getSexCode()))) &&
            ((this.shenasSeri==null && other.getShenasSeri()==null) || 
             (this.shenasSeri!=null &&
              this.shenasSeri.equals(other.getShenasSeri()))) &&
            this.shenasSrno == other.getShenasSrno() &&
            ((this.shenasnameIssueDate==null && other.getShenasnameIssueDate()==null) || 
             (this.shenasnameIssueDate!=null &&
              this.shenasnameIssueDate.equals(other.getShenasnameIssueDate()))) &&
            this.shenasnameNo == other.getShenasnameNo() &&
            ((this.userId==null && other.getUserId()==null) || 
             (this.userId!=null &&
              this.userId.equals(other.getUserId())));
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
        _hashCode += getAddressGeoSerial();
        if (getAncrAddress() != null) {
            _hashCode += getAncrAddress().hashCode();
        }
        _hashCode += getAncrAddressGeoSerial();
        if (getAncrDateOfBirth() != null) {
            _hashCode += getAncrDateOfBirth().hashCode();
        }
        if (getAncrFname() != null) {
            _hashCode += getAncrFname().hashCode();
        }
        if (getAncrLetterDate() != null) {
            _hashCode += getAncrLetterDate().hashCode();
        }
        if (getAncrLetterNo() != null) {
            _hashCode += getAncrLetterNo().hashCode();
        }
        if (getAncrName() != null) {
            _hashCode += getAncrName().hashCode();
        }
        _hashCode += new Long(getAncrNin()).hashCode();
        _hashCode += getAncrOfficeCode();
        if (getAncrPosition() != null) {
            _hashCode += getAncrPosition().hashCode();
        }
        if (getAncrReferenceName() != null) {
            _hashCode += getAncrReferenceName().hashCode();
        }
        if (getAncrShenasIssuePlace() != null) {
            _hashCode += getAncrShenasIssuePlace().hashCode();
        }
        _hashCode += getAncrShenasNo();
        if (getAncrShenasSeri() != null) {
            _hashCode += getAncrShenasSeri().hashCode();
        }
        _hashCode += getAncrShenasSrno();
        _hashCode += new Long(getAncrZipCode()).hashCode();
        if (getDateOfBirth() != null) {
            _hashCode += getDateOfBirth().hashCode();
        }
        if (getDateOfDeath() != null) {
            _hashCode += getDateOfDeath().hashCode();
        }
        if (getDeathCategoryCode() != null) {
            _hashCode += getDeathCategoryCode().hashCode();
        }
        _hashCode += getDeathConfirmAutCode();
        if (getDeathDocumentDate() != null) {
            _hashCode += getDeathDocumentDate().hashCode();
        }
        if (getDeathDocumentNo() != null) {
            _hashCode += getDeathDocumentNo().hashCode();
        }
        _hashCode += getDeathGeoSerial();
        if (getDeathPlaceAddress() != null) {
            _hashCode += getDeathPlaceAddress().hashCode();
        }
        _hashCode += getDeathReasonCode();
        if (getDeathRecordStage() != null) {
            _hashCode += getDeathRecordStage().hashCode();
        }
        if (getDeathRegstDate() != null) {
            _hashCode += getDeathRegstDate().hashCode();
        }
        _hashCode += new Long(getDeathRegstNo()).hashCode();
        if (getDeathSanadPrepAuth() != null) {
            _hashCode += getDeathSanadPrepAuth().hashCode();
        }
        if (getDeathSanadSeri() != null) {
            _hashCode += getDeathSanadSeri().hashCode();
        }
        _hashCode += getDeathSanadSrno();
        if (getDeathWitnessInfo1() != null) {
            _hashCode += getDeathWitnessInfo1().hashCode();
        }
        if (getDeathWitnessInfo2() != null) {
            _hashCode += getDeathWitnessInfo2().hashCode();
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
        if (getFatherHozeh() != null) {
            _hashCode += getFatherHozeh().hashCode();
        }
        if (getFatherName() != null) {
            _hashCode += getFatherName().hashCode();
        }
        _hashCode += new Long(getFatherNin()).hashCode();
        _hashCode += getFatherOfficeCode();
        if (getFatherShenasIssuePlace() != null) {
            _hashCode += getFatherShenasIssuePlace().hashCode();
        }
        _hashCode += getFatherShenasNo();
        _hashCode += new Long(getFatherZipCode()).hashCode();
        if (getForeignCityStateName() != null) {
            _hashCode += getForeignCityStateName().hashCode();
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
        if (getMotherAddress() != null) {
            _hashCode += getMotherAddress().hashCode();
        }
        if (getMotherDateOfBirth() != null) {
            _hashCode += getMotherDateOfBirth().hashCode();
        }
        if (getMotherFname() != null) {
            _hashCode += getMotherFname().hashCode();
        }
        if (getMotherHozeh() != null) {
            _hashCode += getMotherHozeh().hashCode();
        }
        if (getMotherName() != null) {
            _hashCode += getMotherName().hashCode();
        }
        _hashCode += new Long(getMotherNin()).hashCode();
        _hashCode += getMotherOfficeCode();
        if (getMotherShenasIssuePlace() != null) {
            _hashCode += getMotherShenasIssuePlace().hashCode();
        }
        _hashCode += getMotherShenasNo();
        _hashCode += new Long(getMotherZipCode()).hashCode();
        _hashCode += getOfficeCode();
        if (getOrdinaryDehgardeshi() != null) {
            _hashCode += getOrdinaryDehgardeshi().hashCode();
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
        if (getPersonOccupation() != null) {
            _hashCode += getPersonOccupation().hashCode();
        }
        _hashCode += new Long(getPersonZipCode()).hashCode();
        if (getRemarks() != null) {
            _hashCode += getRemarks().hashCode();
        }
        if (getSanadIssueOffice() != null) {
            _hashCode += getSanadIssueOffice().hashCode();
        }
        _hashCode += getSanadIssueOfficeCode();
        if (getSexCode() != null) {
            _hashCode += getSexCode().hashCode();
        }
        if (getShenasSeri() != null) {
            _hashCode += getShenasSeri().hashCode();
        }
        _hashCode += getShenasSrno();
        if (getShenasnameIssueDate() != null) {
            _hashCode += getShenasnameIssueDate().hashCode();
        }
        _hashCode += getShenasnameNo();
        if (getUserId() != null) {
            _hashCode += getUserId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DeathInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://Server", "deathInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addressGeoSerial");
        elemField.setXmlName(new javax.xml.namespace.QName("http://Server", "addressGeoSerial"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ancrAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("http://Server", "ancrAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ancrAddressGeoSerial");
        elemField.setXmlName(new javax.xml.namespace.QName("http://Server", "ancrAddressGeoSerial"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ancrDateOfBirth");
        elemField.setXmlName(new javax.xml.namespace.QName("http://Server", "ancrDateOfBirth"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ancrFname");
        elemField.setXmlName(new javax.xml.namespace.QName("http://Server", "ancrFname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ancrLetterDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://Server", "ancrLetterDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ancrLetterNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://Server", "ancrLetterNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ancrName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://Server", "ancrName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ancrNin");
        elemField.setXmlName(new javax.xml.namespace.QName("http://Server", "ancrNin"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ancrOfficeCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://Server", "ancrOfficeCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ancrPosition");
        elemField.setXmlName(new javax.xml.namespace.QName("http://Server", "ancrPosition"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ancrReferenceName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://Server", "ancrReferenceName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ancrShenasIssuePlace");
        elemField.setXmlName(new javax.xml.namespace.QName("http://Server", "ancrShenasIssuePlace"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ancrShenasNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://Server", "ancrShenasNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ancrShenasSeri");
        elemField.setXmlName(new javax.xml.namespace.QName("http://Server", "ancrShenasSeri"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ancrShenasSrno");
        elemField.setXmlName(new javax.xml.namespace.QName("http://Server", "ancrShenasSrno"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ancrZipCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://Server", "ancrZipCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateOfBirth");
        elemField.setXmlName(new javax.xml.namespace.QName("http://Server", "dateOfBirth"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateOfDeath");
        elemField.setXmlName(new javax.xml.namespace.QName("http://Server", "dateOfDeath"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deathCategoryCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://Server", "deathCategoryCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deathConfirmAutCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://Server", "deathConfirmAutCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deathDocumentDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://Server", "deathDocumentDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deathDocumentNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://Server", "deathDocumentNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deathGeoSerial");
        elemField.setXmlName(new javax.xml.namespace.QName("http://Server", "deathGeoSerial"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deathPlaceAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("http://Server", "deathPlaceAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deathReasonCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://Server", "deathReasonCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deathRecordStage");
        elemField.setXmlName(new javax.xml.namespace.QName("http://Server", "deathRecordStage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deathRegstDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://Server", "deathRegstDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deathRegstNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://Server", "deathRegstNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deathSanadPrepAuth");
        elemField.setXmlName(new javax.xml.namespace.QName("http://Server", "deathSanadPrepAuth"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deathSanadSeri");
        elemField.setXmlName(new javax.xml.namespace.QName("http://Server", "deathSanadSeri"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deathSanadSrno");
        elemField.setXmlName(new javax.xml.namespace.QName("http://Server", "deathSanadSrno"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deathWitnessInfo1");
        elemField.setXmlName(new javax.xml.namespace.QName("http://Server", "deathWitnessInfo1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://info.model.dcu", "DeathWitnessInfo"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deathWitnessInfo2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://Server", "deathWitnessInfo2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://info.model.dcu", "DeathWitnessInfo"));
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
        elemField.setFieldName("fatherHozeh");
        elemField.setXmlName(new javax.xml.namespace.QName("http://Server", "fatherHozeh"));
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
        elemField.setFieldName("fatherShenasIssuePlace");
        elemField.setXmlName(new javax.xml.namespace.QName("http://Server", "fatherShenasIssuePlace"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fatherShenasNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://Server", "fatherShenasNo"));
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
        elemField.setFieldName("foreignCityStateName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://Server", "foreignCityStateName"));
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
        elemField.setFieldName("motherHozeh");
        elemField.setXmlName(new javax.xml.namespace.QName("http://Server", "motherHozeh"));
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
        elemField.setFieldName("motherShenasIssuePlace");
        elemField.setXmlName(new javax.xml.namespace.QName("http://Server", "motherShenasIssuePlace"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("motherShenasNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://Server", "motherShenasNo"));
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
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ordinaryDehgardeshi");
        elemField.setXmlName(new javax.xml.namespace.QName("http://Server", "ordinaryDehgardeshi"));
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
        elemField.setFieldName("personOccupation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://Server", "personOccupation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("personZipCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://Server", "personZipCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
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
        elemField.setFieldName("sanadIssueOfficeCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://Server", "sanadIssueOfficeCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sexCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://Server", "sexCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shenasSeri");
        elemField.setXmlName(new javax.xml.namespace.QName("http://Server", "shenasSeri"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shenasSrno");
        elemField.setXmlName(new javax.xml.namespace.QName("http://Server", "shenasSrno"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shenasnameIssueDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://Server", "shenasnameIssueDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shenasnameNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://Server", "shenasnameNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://Server", "userId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
