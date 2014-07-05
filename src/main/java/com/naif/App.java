package com.naif;

// java -jar target/recibos-1.0-SNAPSHOT.jar >1.txt

import java.io.*;
import java.util.*;
import java.util.Map.Entry;

import com.mongodb.Mongo;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.BasicDBObject;
import com.mongodb.DBObject;
import com.mongodb.DBCursor;
import com.mongodb.WriteConcern;

import com.naif.tools.dbffile.DBFFieldDescriptor;
import com.naif.tools.dbffile.DBFFile;
import com.naif.tools.dbffile.DBFReader;
import com.naif.tools.dbffile.DBFRecord;

import com.naif.sima.dbf.*;

import  com.naif.tools.dbf.DbfUtils;


public class App {

  static String sfile = "D:/sima/simacart/2014.diu/RECIBOS/JUN/RECIJUN.DAT";

  static Recibos recibos;

  static ArrayList<String> codigos;

  public static void main(String[] args) {

      DbfUtils.beanDbfile(sfile);

      recibos = new Recibos(sfile);
      codigos = recibos.getIds("CCODIGOEST");

      registro("209843");
      registros();



  } // END : MAIN

      public static void registros() {

         for (String codigo : codigos) {
           registro(codigo);
         } // for

      } // registros

      public static void registro(String codigo) {

          recibos.seek(codigo);

          System.out.println("-----------------------Registro No." + recibos.getNIDECODRFA()+"-----------------------");
          System.out.println("NIDECODRFA:" + recibos.getNIDECODRFA());
          System.out.println("CCODIGOEST:" + recibos.getCCODIGOEST());
          System.out.println("NMESINIPAG:" + recibos.getNMESINIPAG());
          System.out.println("NMESFINPAG:" + recibos.getNMESFINPAG());
          System.out.println("CNOMEMPCON:" + recibos.getCNOMEMPCON());
          System.out.println("CNRONITCON:" + recibos.getCNRONITCON());
          System.out.println("CNROFACCAA:" + recibos.getCNROFACCAA());
          System.out.println("CNOMBANREC:" + recibos.getCNOMBANREC());
          System.out.println("CNROCTABAN:" + recibos.getCNROCTABAN());
          System.out.println("CNOMBREREC:" + recibos.getCNOMBREREC());
          System.out.println("CCODREFREC:" + recibos.getCCODREFREC());
          System.out.println("CCODIGOGRU:" + recibos.getCCODIGOGRU());
          System.out.println("CFECFACPAG:" + recibos.getCFECFACPAG());
          System.out.println("CPAGOPOPAG:" + recibos.getCPAGOPOPAG());
          System.out.println("CPAGEXTPAG:" + recibos.getCPAGEXTPAG());
          System.out.println("CPERFACREC:" + recibos.getCPERFACREC());
          System.out.println("CNOMCO1REC:" + recibos.getCNOMCO1REC());
          System.out.println("CVLRMO1REC:" + recibos.getCVLRMO1REC());
          System.out.println("CVLRME1REC:" + recibos.getCVLRME1REC());
          System.out.println("CVLRTO1REC:" + recibos.getCVLRTO1REC());
          System.out.println("CNOMCO2REC:" + recibos.getCNOMCO2REC());
          System.out.println("CVLRMO2REC:" + recibos.getCVLRMO2REC());
          System.out.println("CVLRME2REC:" + recibos.getCVLRME2REC());
          System.out.println("CVLRTO2REC:" + recibos.getCVLRTO2REC());
          System.out.println("CNOMCO3REC:" + recibos.getCNOMCO3REC());
          System.out.println("CVLRMO3REC:" + recibos.getCVLRMO3REC());
          System.out.println("CVLRME3REC:" + recibos.getCVLRME3REC());
          System.out.println("CVLRTO3REC:" + recibos.getCVLRTO3REC());
          System.out.println("CNOMCO4REC:" + recibos.getCNOMCO4REC());
          System.out.println("CVLRMO4REC:" + recibos.getCVLRMO4REC());
          System.out.println("CVLRME4REC:" + recibos.getCVLRME4REC());
          System.out.println("CVLRTO4REC:" + recibos.getCVLRTO4REC());
          System.out.println("CNOMCO5REC:" + recibos.getCNOMCO5REC());
          System.out.println("CVLRMO5REC:" + recibos.getCVLRMO5REC());
          System.out.println("CVLRME5REC:" + recibos.getCVLRME5REC());
          System.out.println("CVLRTO5REC:" + recibos.getCVLRTO5REC());
          System.out.println("CNOMCO6REC:" + recibos.getCNOMCO6REC());
          System.out.println("CVLRMO6REC:" + recibos.getCVLRMO6REC());
          System.out.println("CVLRME6REC:" + recibos.getCVLRME6REC());
          System.out.println("CVLRTO6REC:" + recibos.getCVLRTO6REC());
          System.out.println("CNOMCO7REC:" + recibos.getCNOMCO7REC());
          System.out.println("CVLRMO7REC:" + recibos.getCVLRMO7REC());
          System.out.println("CVLRME7REC:" + recibos.getCVLRME7REC());
          System.out.println("CVLRTO7REC:" + recibos.getCVLRTO7REC());
          System.out.println("CNOMCO8REC:" + recibos.getCNOMCO8REC());
          System.out.println("CVLRMO8REC:" + recibos.getCVLRMO8REC());
          System.out.println("CVLRME8REC:" + recibos.getCVLRME8REC());
          System.out.println("CVLRTO8REC:" + recibos.getCVLRTO8REC());
          System.out.println("CNOMCO9REC:" + recibos.getCNOMCO9REC());
          System.out.println("CVLRMO9REC:" + recibos.getCVLRMO9REC());
          System.out.println("CVLRME9REC:" + recibos.getCVLRME9REC());
          System.out.println("CVLRTO9REC:" + recibos.getCVLRTO9REC());
          System.out.println("CVLROPOREC:" + recibos.getCVLROPOREC());
          System.out.println("CVLREXTREC:" + recibos.getCVLREXTREC());
          System.out.println("CBAROPOREC:" + recibos.getCBAROPOREC());
          System.out.println("CBAREXTREC:" + recibos.getCBAREXTREC());
          System.out.println("CTXTUNOREC:" + recibos.getCTXTUNOREC());
          System.out.println("CTXTDOSREC:" + recibos.getCTXTDOSREC());
          System.out.println("CNOMUSRRFA:" + recibos.getCNOMUSRRFA());
          System.out.println("DFECUSRRFA:" + recibos.getDFECUSRRFA());
          System.out.println("CHORUSRRFA:" + recibos.getCHORUSRRFA());

          System.out.println();

      }

}