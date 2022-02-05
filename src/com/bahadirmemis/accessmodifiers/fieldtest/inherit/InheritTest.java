package com.bahadirmemis.accessmodifiers.fieldtest.inherit;

import com.bahadirmemis.accessmodifiers.fieldtest.FieldAccessUtil;

public class InheritTest extends FieldAccessUtil {

    public void printPublic(){
        System.out.println(publici);
    }

    public void printProtected(int i){
        System.out.println(protectedi);
    }

    public void printFriendly(int i){
//        System.out.println(friendlyi);
    }

    public void printPrivate(int i){
//        System.out.println(privatei);
    }
}
