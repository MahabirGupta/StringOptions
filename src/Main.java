public class Main {
    public static void main(String[] args) {

        String helloWorld = "Hello" + " World";
        helloWorld.concat(" and Goodbye");
        printInformation(helloWorld);

//        Cannot assign a string literal to a string builder variable
//        StringBuilder helloWorldBuilder = "Hello" + " World";

        StringBuilder helloWorldBuilder = new StringBuilder( "Hello" + " World");
        helloWorldBuilder.append(" and Goodbye");
        printInformation(helloWorldBuilder);

        StringBuilder emptyStart = new StringBuilder();
        emptyStart.append("a".repeat(57));
        StringBuilder emptyStart32 = new StringBuilder(32);
        emptyStart32.append("a".repeat(17));

        printInformation(emptyStart);
        printInformation(emptyStart32);

        StringBuilder builderPass = new StringBuilder( "Hello" + " World");
        builderPass.append(" and Goodbye");
        builderPass.deleteCharAt(16).insert(16,'g');
        System.out.println(builderPass);
        builderPass.deleteCharAt(3).insert(3,'L');
        System.out.println(builderPass);

        builderPass.replace(16,17,"G");
        System.out.println(builderPass);

        builderPass.reverse().setLength(7);
        System.out.println(builderPass);
    }

    public static void printInformation(String string){
        System.out.println("String = " + string);
        System.out.println("length = " + string.length());
    }

    public static void printInformation(StringBuilder stringBuilder){
        System.out.println("stringBuilder = " + stringBuilder);
        System.out.println("length = " + stringBuilder.length());
        System.out.println("capacity = " + stringBuilder.capacity());
    }
}
