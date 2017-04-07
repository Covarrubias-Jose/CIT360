/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package httpUrlConnection;

import java.net.HttpURLConnection;
import java.net.URL;

/**
 *
 * @author josecovarrubias
 */
public class IforgotHttpUrlConnection {
    
    public static void main(String[] args){
      try{
        URL url=new URL("http://www.lds.org");    
        HttpURLConnection huc=(HttpURLConnection)url.openConnection();
        for(int i=1;i<=8;i++){
        System.out.println(huc.getHeaderFieldKey(i)+" = "+huc.getHeaderField(i));
        }
        huc.disconnect();
        }catch(Exception e){
            System.out.println(e);
        }

    }
            
            
            
            
            
//https://github.com/joseCov/test/edit/master/saveListFromIforgot

}
