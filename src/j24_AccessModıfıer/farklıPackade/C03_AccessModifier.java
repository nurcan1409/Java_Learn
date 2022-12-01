package j24_AccessModıfıer.farklıPackade;

import j24_AccessModıfıer.C01_AccessModifier;

public class C03_AccessModifier {

   private String prıvateTeamLead="hakan aydın";
   String defaultName="cebrail bey";
   protected String protectedname="dılek hanım";
   public String publıcname="gamze hanım";


    public static void main(String[] args) {// publıc cons

        C01_AccessModifier obj9=new C01_AccessModifier(23,63);
//obj9.default//default varıable package dısı erısılemz
        System.out.println("obj9.publicYas = " + obj9.publicYas);
    }












    }

