public class Main {
    public static void main(String[] args) {
        Usuario u = criar_Usuario(5);

        u.cria("usuario1", "sobrenome1", 20, "email1", "senha1");
        u.cria("usuario2", "sobrenome2", 21, "email2", "senha2");
        u.cria("usuario3", "sobrenome3", 22, "email3", "senha3");
    }
}
