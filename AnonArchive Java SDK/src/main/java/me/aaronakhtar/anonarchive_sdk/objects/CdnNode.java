package me.aaronakhtar.anonarchive_sdk.objects;
import me.aaronakhtar.anonarchive_sdk.Database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Locale;

public class CdnNode {

    public static CdnNode getNodeById(int id){
        try(Connection connection = Database.getMainDatabase(); PreparedStatement statement =
                connection.prepareStatement("SELECT * FROM cdn_socks WHERE id = ?")){
            statement.setInt(1, id);
            try(ResultSet set = statement.executeQuery()){
                while (set.next()){
                    return new CdnNode(set.getInt("id"), set.getString("host"), set.getInt("port"), set.getString("payload"), set.getString("encryption_key"), CdnType.valueOf(set.getString("type").toUpperCase(Locale.ROOT)), set.getInt("available_storage_mb"));
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

    private int id;
    private String host;
    private int port;
    private String payload;
    private String encryptionKey;
    private CdnType cdnType;
    private int availableStorage;

    public CdnNode(int id, String host, int port, String payload, String encryptionKey, CdnType cdnType, int availableStorage) {
        this.id = id;
        this.host = host;
        this.port = port;
        this.payload = payload;
        this.encryptionKey = encryptionKey;
        this.cdnType = cdnType;
        this.availableStorage = availableStorage;
    }

    public int getId() {
        return id;
    }

    public String getHost() {
        return host;
    }

    public int getPort() {
        return port;
    }

    public String getPayload() {
        return payload;
    }

    public String getEncryptionKey() {
        return encryptionKey;
    }

    public CdnType getCdnType() {
        return cdnType;
    }

    public int getAvailableStorage() {
        return availableStorage;
    }
}