public class final_vs_immutability 
{

    public static void main(String[] args) {
       final StringBuffer cric= new StringBuffer("ms");
        cric.append("dhoni");
        // System.out.println(cric);

        //  cric= new StringBuffer("thala");
        System.out.println(cric);
    }
}
