package project8;
public class StringConversion {

    public static void main(String[] args) {
        
        String originalString = "Mounika,26";
        
        System.out.println("Original String: " + originalString);

        StringBuffer stringBuffer = convertToStringBuffer(originalString);
        System.out.println("StringBuffer: " + stringBuffer);
       
        StringBuilder stringBuilder = convertToStringBuilder(originalString);
        System.out.println("StringBuilder: " + stringBuilder);
    }

    private static StringBuffer convertToStringBuffer(String str) {
        return new StringBuffer(str);
    }

    private static StringBuilder convertToStringBuilder(String str) {
        return new StringBuilder(str);
    }
}

