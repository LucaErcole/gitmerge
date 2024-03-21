public class Usuario {
    
    private String Nome;
    private String Sobrenome;
    private double idade;
    private String email;
    private String senha;

    public Usuario(String Nome, String Sobrenome, double idade, String email, String senha) {
        this.Nome = Nome;
        this.Sobrenome = Sobrenome;
        this.idade = idade;
        this.email = email;
        this.senha = senha;
    }

    public String getNome() {
        return Nome;
    }

    public String getSobrenome() {
        return Sobrenome;
    }

    public double getIdade() {
        return idade;
    }

    public String getEmail() {
        return email;
    }

    public String getSenha() {
        return senha;
    }

}
