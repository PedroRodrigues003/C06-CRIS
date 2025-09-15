public class Computador {

    private String marca;
    private float  preco;
    private  HardwareBasico[] hardwareBasicos;
    private  SistemaOperacional sistemaOperacional;
    private MemoriaUSB memoriaUSB;


    //construtor

    public Computador(String marca, float preco, HardwareBasico[] hardwareBasicos, SistemaOperacional sistemaOperacional) {
        this.marca = marca;
        this.preco = preco;
        this.sistemaOperacional = sistemaOperacional;

       // this.hardwareBasicos = new HardwareBasico[3]; //Ram, core,HD
        if(hardwareBasicos != null){

            //cria uma copia do vetor que vc passou como atributo;

            this.hardwareBasicos = new HardwareBasico[hardwareBasicos.length];
            for (int i = 0; i < hardwareBasicos.length; i++) {

                this.hardwareBasicos[i] = hardwareBasicos[i];

            }

        }

        else {
            //se nada for escrito ele cria um vetor vazio
            this.hardwareBasicos = new HardwareBasico[0];
        }

    }


    //getters

    public String getMarca() {
        return marca;
    }

    public float getPreco() {
        return preco;
    }

    public HardwareBasico[] getHardwareBasicos() {
        return hardwareBasicos;
    }

    public SistemaOperacional getSistemaOperacional() {
        return sistemaOperacional;
    }

    public MemoriaUSB getMemoriaUSB() {
        return memoriaUSB;
    }

    //metodo

    //+mostraPCConfigs()
    //fazer os sout chamando outra classe
    public void mostraPCConfigs(){
        System.out.println("Marca: " + this.marca);
        System.out.println("Preço: " + this.preco);
        System.out.println("Processador: "+ this.hardwareBasicos[0].getNome());
        System.out.println("Memoria RAM: "+ this.hardwareBasicos[1].getCapacidade());
        System.out.println("Armazenamento: "+ this.hardwareBasicos[2].getNome());
        System.out.println("Sistema operacional: "+ this.sistemaOperacional.getNome());
        System.out.println("Memoria Externa: "+ this.memoriaUSB.getNome());



    }

    //+addMemorialUSB(musb: MemoriaUSB)
public void addMemoriaUSB(MemoriaUSB musb){

    this.memoriaUSB = musb;

}



}
