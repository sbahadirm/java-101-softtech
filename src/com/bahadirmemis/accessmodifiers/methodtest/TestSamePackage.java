package com.bahadirmemis.accessmodifiers.methodtest;

public class TestSamePackage {

    public static void main(String[] args) {

        MethodAccessTestPublic methodAccessTestPublic = new MethodAccessTestPublic();
        MethodAccessTestFriendly methodAccessTestFriendly = new MethodAccessTestFriendly();
        MethodAccessTestProtected methodAccessTestProtected = new MethodAccessTestProtected();
        MethodAccessTestPrivate methodAccessTestPrivate = new MethodAccessTestPrivate();

        methodAccessTestPublic.print();
        methodAccessTestFriendly.print();
        methodAccessTestProtected.print();
//        methodAccessTestPrivate.print();
    }
}
