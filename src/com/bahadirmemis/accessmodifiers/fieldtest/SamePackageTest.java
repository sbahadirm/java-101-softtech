package com.bahadirmemis.accessmodifiers.fieldtest;

public class SamePackageTest {

    public static void main(String[] args) {

        int friendlyi = FieldAccessUtil.friendlyi;
        int protectedi = FieldAccessUtil.protectedi;
        int publici = FieldAccessUtil.publici;

        FieldAccessTest fieldAccessTest = new FieldAccessTest();
        fieldAccessTest.print(friendlyi);
        fieldAccessTest.print(protectedi);
        fieldAccessTest.print(publici);
    }
}
