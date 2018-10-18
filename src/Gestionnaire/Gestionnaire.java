/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gestionnaire;

/**
 *
 * @author 1895088
 */
public class Gestionnaire {

    public static String proccessusActivite(java.lang.String userName, java.lang.String annee) {
        services.WebServiceProccessusActivite_Service service = new services.WebServiceProccessusActivite_Service();
        services.WebServiceProccessusActivite port = service.getWebServiceProccessusActivitePort();
        return port.proccessusActivite(userName, annee);
    }

}
