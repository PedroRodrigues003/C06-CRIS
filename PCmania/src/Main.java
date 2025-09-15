import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Promoção 1
        //criando objeto/estância do tipo hardware basico
        HardwareBasico hardware1 = new HardwareBasico("Pentium core i3",2200);
        HardwareBasico hardware2 = new HardwareBasico("Memoria RAM", 8);
        HardwareBasico hardware3 = new HardwareBasico("HD", 500);

        //promoção 2
        HardwareBasico hardware4 = new HardwareBasico("Pentium core i5",3370);
        HardwareBasico hardware5 = new HardwareBasico("Memoria RAM", 16);
        HardwareBasico hardware6 = new HardwareBasico("HD", 1000);

        //promoção 3
        HardwareBasico hardware7 = new HardwareBasico("Pentium core i7",4500);
        HardwareBasico hardware8 = new HardwareBasico("Memoria RAM", 32);
        HardwareBasico hardware9 = new HardwareBasico("HD", 2000);

        //criando sistema operacional
        //promoção 1
        SistemaOperacional sistemaOperacional1 = new SistemaOperacional();
        sistemaOperacional1.setNome("macOS Sequoia");
        sistemaOperacional1.setTipo(64);

        //promoção 2
        SistemaOperacional sistemaOperacional2 = new SistemaOperacional();
        sistemaOperacional2.setNome("Windows 8");
        sistemaOperacional2.setTipo(64);

        //promoção 3
        SistemaOperacional sistemaOperacional3 = new SistemaOperacional();
        sistemaOperacional3.setNome("Windows 10");
        sistemaOperacional3.setTipo(64);

        //criando memorial usb
        //promoção1
        MemoriaUSB memoriaUSB1 = new MemoriaUSB();
        memoriaUSB1.setNome("Pen-drive ");
        memoriaUSB1.setCapacidade(16);

        //promoção2
        MemoriaUSB memoriaUSB2 = new MemoriaUSB();
        memoriaUSB2.setNome("Pen-drive ");
        memoriaUSB2.setCapacidade(32);

        //promoção3
        MemoriaUSB memoriaUSB3 = new MemoriaUSB();
        memoriaUSB3.setNome("HD Externo ");
        memoriaUSB3.setCapacidade(1000);

        //juntando todos os hardware nas arrays
        HardwareBasico[] hardwarepromo1 = new HardwareBasico[]{hardware1,hardware2, hardware3};
        HardwareBasico[] hardwarepromo2 = new HardwareBasico[]{hardware4,hardware5, hardware6};
        HardwareBasico[] hardwarepromo3 = new HardwareBasico[]{hardware7,hardware8, hardware9};

        //criei três computadores e atribui preço, marca, hardware e sistema operacional
        Computador computador1 = new Computador("Apple", 145,hardwarepromo1,sistemaOperacional1 );
        Computador computador2 = new Computador("Samsung", 1379,hardwarepromo2,sistemaOperacional2 );
        Computador computador3 = new Computador("Dell", 5823,hardwarepromo3,sistemaOperacional3 );

        // adiciona memória USB a cada computador
        computador1.addMemoriaUSB(memoriaUSB1);
        computador2.addMemoriaUSB(memoriaUSB2);
        computador3.addMemoriaUSB(memoriaUSB3);

        //criar uma interface no qual eu consigo cadastrar o cliente
        int cadastrarCliente;
        String nomeCliente;
        String cpfCliente;

        Scanner entrada = new Scanner(System.in);


        System.out.println("cadastrar cliente ? 1-Sim 2-Não");

        cadastrarCliente = entrada.nextInt();
        entrada.nextLine();
        //teste
        Cliente cliente = new Cliente("Temporario","Temporario");
        if(cadastrarCliente == 1){

            System.out.println("Nome: ");
            nomeCliente = entrada.nextLine();

            System.out.println("CPF: ");
            cpfCliente = entrada.nextLine();
           cliente.setNome(nomeCliente);
           cliente.setCpf(cpfCliente);

        }
        else{
            System.out.println("Sendo direcionado para loja");
        }

        //depois mostrar as promoções cada com um codigo
        int codigo = -1;
        Computador computadorComprado[] = new Computador[80];
        int contComputadores = 0;


        //selecionar o codigo para compra  se caso for 0 fecha a loja
        do {
            //promo1
            System.out.println("Qual promocao deseja ?");
            System.out.println("Promoção 1: ");
            computador1.mostraPCConfigs();
            System.out.println("_________________________________________________");

            //promo2
            System.out.println("Promoção 2: ");
            computador2.mostraPCConfigs();
            System.out.println("Qual promocao deseja ?");
            System.out.println("_________________________________________________");

            //promo3
            System.out.println("Promoção 3: ");
            computador3.mostraPCConfigs();
            System.out.println("Qual promocao deseja ?");
            System.out.println("_________________________________________________");

            codigo = entrada.nextInt();
            entrada.nextLine();

            if(codigo ==0 ){
                break;
            }

            switch (codigo){

                case 1:
                    computadorComprado[contComputadores]= computador1;
                    contComputadores++;
                    computador1.mostraPCConfigs();
                    System.out.println("_________________________________________________");
                    break;

                case 2:
                    computadorComprado[contComputadores]= computador2;
                    contComputadores++;
                    computador2.mostraPCConfigs();
                    System.out.println("_________________________________________________");
                    break;

                case 3:
                    computadorComprado[contComputadores] = computador3;
                    contComputadores++;
                    computador3.mostraPCConfigs();
                    System.out.println("_________________________________________________");
                    break;

                default:
                    break;


            }

        }while(codigo != 0);

        //e vai aparecer nome e cpf do cliente
        System.out.println("Nome Cliente: " + cliente.getNome() );
        System.out.println("CPF cliente: " + cliente.getCpf());
        //vai usar o mostra pc config da classe computador para aparecer os computadores

        for (int i = 0; i < contComputadores; i++) {

            computadorComprado[i].mostraPCConfigs();

        }

        cliente.setComputador(computadorComprado);

        //e vai usar a classe calcula total compra para mostrar o valor total
        System.out.println("Valor total da compra R$ " + cliente.calculaTotalCompra());



    }


}