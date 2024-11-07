package dominio;

public class main {

    public static IPersona persona1;

    public static void main(String[] args) {
        persona1 = new Persona();
        System.out.println(persona1);
        persona1.caminar("Johan","Huaman",30);
    }
}
