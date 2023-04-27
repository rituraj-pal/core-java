public class String_Type {
    public static void main(String[] args) {
        // immutable --- i.e non changeble
        String name= "rituraj";
        System.out.println(name);
        name.concat("pal");
        System.out.println(name);
        // mutable i.e changeble

        StringBuilder full_name = new StringBuilder("rituraj");
        System.out.println(full_name);
        full_name.append("pal");
        System.out.println(full_name);


    }
}
