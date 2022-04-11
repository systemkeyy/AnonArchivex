package me.aaronakhtar.anonarchive_sdk;

public class AnonArchive {

    public static final String version = "1.1.2.3-INITIAL-STABLE";
    public static final String name = "AnonArchive";

    public static final int crypt_bit_size = 256;

  /*  public static final String getTempDumpDirectory(Archive archive){
        return "G:/dump/" + archive.getId();
    }*/

    public static final String getMainArchiveStoragePath(){
        return "/home/archives/";
    }


}
