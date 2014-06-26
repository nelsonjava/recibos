package com.naif.sima.dbf;

import java.util.*;

import com.naif.tools.dbffile.DBFFieldDescriptor;
import com.naif.tools.dbffile.DBFFile;
import com.naif.tools.dbffile.DBFReader;
import com.naif.tools.dbffile.DBFRecord;

public class Recibos implements java.io.Serializable {

    private int nIDECODRFA;
    private String cCODIGOEST;
    private int nMESINIPAG;
    private int nMESFINPAG;
    private String cNOMEMPCON;
    private String cNRONITCON;
    private String cNROFACCAA;
    private String cNOMBANREC;
    private String cNROCTABAN;
    private String cNOMBREREC;
    private String cCODREFREC;
    private String cCODIGOGRU;
    private String cFECFACPAG;
    private String cPAGOPOPAG;
    private String cPAGEXTPAG;
    private String cPERFACREC;
    private String cNOMCO1REC;
    private String cVLRMO1REC;
    private String cVLRME1REC;
    private String cVLRTO1REC;
    private String cNOMCO2REC;
    private String cVLRMO2REC;
    private String cVLRME2REC;
    private String cVLRTO2REC;
    private String cNOMCO3REC;
    private String cVLRMO3REC;
    private String cVLRME3REC;
    private String cVLRTO3REC;
    private String cNOMCO4REC;
    private String cVLRMO4REC;
    private String cVLRME4REC;
    private String cVLRTO4REC;
    private String cNOMCO5REC;
    private String cVLRMO5REC;
    private String cVLRME5REC;
    private String cVLRTO5REC;
    private String cNOMCO6REC;
    private String cVLRMO6REC;
    private String cVLRME6REC;
    private String cVLRTO6REC;
    private String cNOMCO7REC;
    private String cVLRMO7REC;
    private String cVLRME7REC;
    private String cVLRTO7REC;
    private String cNOMCO8REC;
    private String cVLRMO8REC;
    private String cVLRME8REC;
    private String cVLRTO8REC;
    private String cNOMCO9REC;
    private String cVLRMO9REC;
    private String cVLRME9REC;
    private String cVLRTO9REC;
    private String cVLROPOREC;
    private String cVLREXTREC;
    private String cBAROPOREC;
    private String cBAREXTREC;
    private String cTXTUNOREC;
    private String cTXTDOSREC;
    private String cNOMUSRRFA;
    private Date dFECUSRRFA;
    private String cHORUSRRFA;

    private DBFFile dbf;
    private ArrayList<DBFRecord> registros;
    private DBFRecord registro;

    public Recibos(String sFile) {
        dbf = new DBFReader().readDBFFile(sFile);
        registros = dbf.getRecords();
    }

public int getNIDECODRFA() {
    return nIDECODRFA;
}

public String getCCODIGOEST() {
    return cCODIGOEST;
}

public int getNMESINIPAG() {
    return nMESINIPAG;
}

public int getNMESFINPAG() {
    return nMESFINPAG;
}

public String getCNOMEMPCON() {
    return cNOMEMPCON;
}

public String getCNRONITCON() {
    return cNRONITCON;
}

public String getCNROFACCAA() {
    return cNROFACCAA;
}

public String getCNOMBANREC() {
    return cNOMBANREC;
}

public String getCNROCTABAN() {
    return cNROCTABAN;
}

public String getCNOMBREREC() {
    return cNOMBREREC;
}

public String getCCODREFREC() {
    return cCODREFREC;
}

public String getCCODIGOGRU() {
    return cCODIGOGRU;
}

public String getCFECFACPAG() {
    return cFECFACPAG;
}

public String getCPAGOPOPAG() {
    return cPAGOPOPAG;
}

public String getCPAGEXTPAG() {
    return cPAGEXTPAG;
}

public String getCPERFACREC() {
    return cPERFACREC;
}

public String getCNOMCO1REC() {
    return cNOMCO1REC;
}

public String getCVLRMO1REC() {
    return cVLRMO1REC;
}

public String getCVLRME1REC() {
    return cVLRME1REC;
}

public String getCVLRTO1REC() {
    return cVLRTO1REC;
}

public String getCNOMCO2REC() {
    return cNOMCO2REC;
}

public String getCVLRMO2REC() {
    return cVLRMO2REC;
}

public String getCVLRME2REC() {
    return cVLRME2REC;
}

public String getCVLRTO2REC() {
    return cVLRTO2REC;
}

public String getCNOMCO3REC() {
    return cNOMCO3REC;
}

public String getCVLRMO3REC() {
    return cVLRMO3REC;
}

public String getCVLRME3REC() {
    return cVLRME3REC;
}

public String getCVLRTO3REC() {
    return cVLRTO3REC;
}

public String getCNOMCO4REC() {
    return cNOMCO4REC;
}

public String getCVLRMO4REC() {
    return cVLRMO4REC;
}

public String getCVLRME4REC() {
    return cVLRME4REC;
}

public String getCVLRTO4REC() {
    return cVLRTO4REC;
}

public String getCNOMCO5REC() {
    return cNOMCO5REC;
}

public String getCVLRMO5REC() {
    return cVLRMO5REC;
}

public String getCVLRME5REC() {
    return cVLRME5REC;
}

public String getCVLRTO5REC() {
    return cVLRTO5REC;
}

public String getCNOMCO6REC() {
    return cNOMCO6REC;
}

public String getCVLRMO6REC() {
    return cVLRMO6REC;
}

public String getCVLRME6REC() {
    return cVLRME6REC;
}

public String getCVLRTO6REC() {
    return cVLRTO6REC;
}

public String getCNOMCO7REC() {
    return cNOMCO7REC;
}

public String getCVLRMO7REC() {
    return cVLRMO7REC;
}

public String getCVLRME7REC() {
    return cVLRME7REC;
}

public String getCVLRTO7REC() {
    return cVLRTO7REC;
}

public String getCNOMCO8REC() {
    return cNOMCO8REC;
}

public String getCVLRMO8REC() {
    return cVLRMO8REC;
}

public String getCVLRME8REC() {
    return cVLRME8REC;
}

public String getCVLRTO8REC() {
    return cVLRTO8REC;
}

public String getCNOMCO9REC() {
    return cNOMCO9REC;
}

public String getCVLRMO9REC() {
    return cVLRMO9REC;
}

public String getCVLRME9REC() {
    return cVLRME9REC;
}

public String getCVLRTO9REC() {
    return cVLRTO9REC;
}

public String getCVLROPOREC() {
    return cVLROPOREC;
}

public String getCVLREXTREC() {
    return cVLREXTREC;
}

public String getCBAROPOREC() {
    return cBAROPOREC;
}

public String getCBAREXTREC() {
    return cBAREXTREC;
}

public String getCTXTUNOREC() {
    return cTXTUNOREC;
}

public String getCTXTDOSREC() {
    return cTXTDOSREC;
}

public String getCNOMUSRRFA() {
    return cNOMUSRRFA;
}

public Date getDFECUSRRFA() {
    return dFECUSRRFA;
}

public String getCHORUSRRFA() {
    return cHORUSRRFA;
}

public ArrayList<DBFRecord> getRegistros() {
    return registros;
}

public ArrayList<String> getIds(String id) {

    ArrayList<String> ids = new ArrayList<String>();

    for (DBFRecord registro : registros) {
        ids.add((String)registro.getField(id));
    }

    return ids;
}

public void seek(String cCodigoEst) {
    registro = dbf.getRecord("CCODIGOEST",cCodigoEst);

    this.nIDECODRFA = ((Integer)registro.getField("NIDECODRFA")).intValue();
    this.cCODIGOEST = (String)registro.getField("CCODIGOEST");
    this.nMESINIPAG = ((Integer)registro.getField("NMESINIPAG")).intValue();
    this.nMESFINPAG = ((Integer)registro.getField("NMESFINPAG")).intValue();
    this.cNOMEMPCON = (String)registro.getField("CNOMEMPCON");
    this.cNRONITCON = (String)registro.getField("CNRONITCON");
    this.cNROFACCAA = (String)registro.getField("CNROFACCAA");
    this.cNOMBANREC = (String)registro.getField("CNOMBANREC");
    this.cNROCTABAN = (String)registro.getField("CNROCTABAN");
    this.cNOMBREREC = (String)registro.getField("CNOMBREREC");
    this.cCODREFREC = (String)registro.getField("CCODREFREC");
    this.cCODIGOGRU = (String)registro.getField("CCODIGOGRU");
    this.cFECFACPAG = (String)registro.getField("CFECFACPAG");
    this.cPAGOPOPAG = (String)registro.getField("CPAGOPOPAG");
    this.cPAGEXTPAG = (String)registro.getField("CPAGEXTPAG");
    this.cPERFACREC = (String)registro.getField("CPERFACREC");
    this.cNOMCO1REC = (String)registro.getField("CNOMCO1REC");
    this.cVLRMO1REC = (String)registro.getField("CVLRMO1REC");
    this.cVLRME1REC = (String)registro.getField("CVLRME1REC");
    this.cVLRTO1REC = (String)registro.getField("CVLRTO1REC");
    this.cNOMCO2REC = (String)registro.getField("CNOMCO2REC");
    this.cVLRMO2REC = (String)registro.getField("CVLRMO2REC");
    this.cVLRME2REC = (String)registro.getField("CVLRME2REC");
    this.cVLRTO2REC = (String)registro.getField("CVLRTO2REC");
    this.cNOMCO3REC = (String)registro.getField("CNOMCO3REC");
    this.cVLRMO3REC = (String)registro.getField("CVLRMO3REC");
    this.cVLRME3REC = (String)registro.getField("CVLRME3REC");
    this.cVLRTO3REC = (String)registro.getField("CVLRTO3REC");
    this.cNOMCO4REC = (String)registro.getField("CNOMCO4REC");
    this.cVLRMO4REC = (String)registro.getField("CVLRMO4REC");
    this.cVLRME4REC = (String)registro.getField("CVLRME4REC");
    this.cVLRTO4REC = (String)registro.getField("CVLRTO4REC");
    this.cNOMCO5REC = (String)registro.getField("CNOMCO5REC");
    this.cVLRMO5REC = (String)registro.getField("CVLRMO5REC");
    this.cVLRME5REC = (String)registro.getField("CVLRME5REC");
    this.cVLRTO5REC = (String)registro.getField("CVLRTO5REC");
    this.cNOMCO6REC = (String)registro.getField("CNOMCO6REC");
    this.cVLRMO6REC = (String)registro.getField("CVLRMO6REC");
    this.cVLRME6REC = (String)registro.getField("CVLRME6REC");
    this.cVLRTO6REC = (String)registro.getField("CVLRTO6REC");
    this.cNOMCO7REC = (String)registro.getField("CNOMCO7REC");
    this.cVLRMO7REC = (String)registro.getField("CVLRMO7REC");
    this.cVLRME7REC = (String)registro.getField("CVLRME7REC");
    this.cVLRTO7REC = (String)registro.getField("CVLRTO7REC");
    this.cNOMCO8REC = (String)registro.getField("CNOMCO8REC");
    this.cVLRMO8REC = (String)registro.getField("CVLRMO8REC");
    this.cVLRME8REC = (String)registro.getField("CVLRME8REC");
    this.cVLRTO8REC = (String)registro.getField("CVLRTO8REC");
    this.cNOMCO9REC = (String)registro.getField("CNOMCO9REC");
    this.cVLRMO9REC = (String)registro.getField("CVLRMO9REC");
    this.cVLRME9REC = (String)registro.getField("CVLRME9REC");
    this.cVLRTO9REC = (String)registro.getField("CVLRTO9REC");
    this.cVLROPOREC = (String)registro.getField("CVLROPOREC");
    this.cVLREXTREC = (String)registro.getField("CVLREXTREC");
    this.cBAROPOREC = (String)registro.getField("CBAROPOREC");
    this.cBAREXTREC = (String)registro.getField("CBAREXTREC");
    this.cTXTUNOREC = (String)registro.getField("CTXTUNOREC");
    this.cTXTDOSREC = (String)registro.getField("CTXTDOSREC");
    this.cNOMUSRRFA = (String)registro.getField("CNOMUSRRFA");
    this.dFECUSRRFA = (Date)registro.getField("DFECUSRRFA");
    this.cHORUSRRFA = (String)registro.getField("CHORUSRRFA");
}

} // Fin de la clase