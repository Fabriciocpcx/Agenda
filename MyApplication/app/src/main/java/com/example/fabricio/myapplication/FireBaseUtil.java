package com.example.fabricio.myapplication;

import com.firebase.client.Firebase;

/**
 * Created by Fabrício Natanael on 27/04/2016.
 */

public class FireBaseUtil {

    private static Firebase firebase;
    private static final String URL ="https://sweltering-torch-5098.firebaseio.com/";


    /**
     *
     * @return  retorna conexao com firebase
     */
    public static Firebase getFirebase(){
        if( firebase == null ){
            firebase = new Firebase(URL);
        }
        return( firebase );
    }
}