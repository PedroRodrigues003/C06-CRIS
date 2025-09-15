public class Cliente {

    private String nome;
    private String cpf;
    private Computador[] computador;

    //setters


    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setComputador(Computador[] computador) {
        this.computador = computador;
    }

    //getters

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }


    //construtor

    //+Cliente(String nome, String cpf)
    public Cliente(String nome, String cpf){

        this.nome = nome;
        this.cpf = cpf;



    }

    //metodo
    //+calculaTotalCompra():float
    public float calculaTotalCompra(){
        float total = 0;
        for (int i = 0; i < computador.length; i++) {
            if (computador[i] != null) {
                total += computador[i].getPreco();
            }
        }
        return total;
    }


}
