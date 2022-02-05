package com.bahadirmemis.accessmodifiers.methodtest.test;

import com.bahadirmemis.accessmodifiers.methodtest.MethodAccessTestPrivate;
import com.bahadirmemis.accessmodifiers.methodtest.MethodAccessTestProtected;
import com.bahadirmemis.accessmodifiers.methodtest.MethodAccessTestPublic;
import com.bahadirmemis.accessmodifiers.methodtest.MethodAccessTestFriendly;

public class TestDifferentPackage {

    public static void main(String[] args) {

        MethodAccessTestPublic methodAccessTestPublic = new MethodAccessTestPublic();
        MethodAccessTestFriendly methodAccessTestFriendly = new MethodAccessTestFriendly();
        MethodAccessTestProtected methodAccessTestProtected = new MethodAccessTestProtected();
        MethodAccessTestPrivate methodAccessTestPrivate = new MethodAccessTestPrivate();

        methodAccessTestPublic.print();
//        methodAccessTest2.print();
//        methodAccessTestProtected.print();
//        methodAccessTestPrivate.print();
    }
}
