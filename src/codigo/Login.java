/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo;

import database.DBConsultas;

public class Login {
    
    DBConsultas consulta = new DBConsultas();
    
    public boolean login(String user, String pass) {
        Boolean boleano = consulta.login(user, pass);
        return boleano;
        
    }
}
