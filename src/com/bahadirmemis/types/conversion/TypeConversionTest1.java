package com.bahadirmemis.types.conversion;

public class TypeConversionTest1 {

    public static void main(String[] args) {
        byte byteValue = 127;
        short shortValue = 129;
        int intValue = 5_555_777;
        long longValue = 7l;
        char charValue = 65;
        double doubleValue = 3.14d;

        shortValue = byteValue;
        longValue = intValue;
//       	intValue = longValue; //compile error, değeri daha küçük olsa bile

    }
}
