/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PraktikumGUI_Login;

/**
 *
 * @author Daffa Danendra
 */
public class Session {
    public static String username = "";
    public static String role = "";
    
    // Method untuk clear session
    public static void clear() {
        username = "";
        role = "";
    }
    
    // Method untuk set session
    public static void set(String user, String userRole) {
        username = user;
        role = userRole;
    }
}