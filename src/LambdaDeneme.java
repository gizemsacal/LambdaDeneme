
//Parametre alarak kullanma şekline bakalım.
interface Merhaba{
    public String soyle(String mesaj);
}

public class LambdaDeneme{
    public static void main(String[] args) {

        Merhaba m1=(mesaj)->{
            return "Merhaba, "+mesaj;
        };
        System.out.println(m1.soyle("Gizem"));

    }
}
