package javaTask1;

public class ExamplesPrimitiveTypes {
    public static void main(String[] args) {
        /* Целые числа */
        byte parameterByte1 = -128;
        byte parameterByte2 = -128;
        byte parameterByte3 = 127;
        System.out.println(parameterByte1 == parameterByte2);
        System.out.println(parameterByte2 == parameterByte3);

        short parameterShort1 = -768;
        short parameterShort2 = -768;
        short parameterShort3 = 767;
        System.out.println(parameterShort1 == parameterShort2);
        System.out.println(parameterShort2 == parameterShort3);

        int parameterInt1 = 4;
        int parameterInt2 = 4;
        int parameterInt3 = 9;
        System.out.println(parameterInt1 == parameterInt2);
        System.out.println(parameterInt2 == parameterInt3);

        long parameterLong1 = -55;
        long parameterLong2 = -55;
        long parameterLong3 = 29;
        System.out.println(parameterLong1 == parameterLong2);
        System.out.println(parameterLong2 == parameterLong3);

        /*  Символьный тип */
        char parameterChar1 = 65;
        char parameterChar2 = 65;
        char parameterChar3 = 90;
        System.out.println(parameterChar1 == parameterChar2);
        System.out.println(parameterChar2 == parameterChar3);

        /* Числа с плавающей точкой */
        float parameterFloat1 = 3.14f; //При использовании типа float требуется указывать суффикс f
        float parameterFloat2 = 3.14f;
        float parameterFloat3 = 34.5f;
        System.out.println(parameterFloat1 == parameterFloat2);
        System.out.println(parameterFloat2 == parameterFloat3);

        double parameterDouble1 = 154.12;
        double parameterDouble2 = 154.12;
        double parameterDouble3 = 155;
        System.out.println(parameterDouble1 == parameterDouble2);
        System.out.println(parameterDouble2 == parameterDouble3);

        /* Числа с плавающей точкой */
        boolean parameterBoolean1 = true;
        boolean parameterBoolean2 = true;
        boolean parameterBoolean3 = false;
        System.out.println(parameterBoolean1 == parameterBoolean2);
        System.out.println(parameterBoolean2 == parameterBoolean3);
    }
}
