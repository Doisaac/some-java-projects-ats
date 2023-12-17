package com.doisaac.model;

import java.nio.charset.StandardCharsets;
import java.security.NoSuchAlgorithmException;

public class EncryptPassword {
    
    public static String getHash(String txt, String hashType) {
        try {
            java.security.MessageDigest digest = java.security.MessageDigest.getInstance(hashType);
            byte[] hash = digest.digest(txt.getBytes(StandardCharsets.UTF_8));
            return bytesToHex(hash);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static String md5(String txt) {
        return getHash(txt, "MD5");
    }
    
     public static String sha1(String txt) {
        return getHash(txt, "SHA1");
    }
    

    private static String bytesToHex(byte[] bytes) {
        StringBuilder result = new StringBuilder();
        for (byte aByte : bytes) {
            result.append(Integer.toString((aByte & 0xff) + 0x100, 16).substring(1));
        }
        return result.toString();
    }

}
