package com.bahadirmemis.accessmodifiers.fieldtest.test;

import com.bahadirmemis.accessmodifiers.fieldtest.FieldAccessTest;
import com.bahadirmemis.accessmodifiers.fieldtest.FieldAccessUtil;

public class DifferentPackageTest {

    public static void main(String[] args) {

//        int friendlyi = FieldAccessUtil.friendlyi;
//        int protectedi = FieldAccessUtil.protectedi;
        int publici = FieldAccessUtil.publici;

        FieldAccessTest fieldAccessTest = new FieldAccessTest();
//        fieldAccessTest.print(friendlyi);
//        fieldAccessTest.print(protectedi);
        fieldAccessTest.print(publici);
    }
}
