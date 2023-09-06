import contaBancaria.ContaBancaria;

public class Main {
    public static void main(String[] args) {
        //instanciando pessoa 1
        ContaBancaria pessoa1 = new ContaBancaria();
        pessoa1.setNumConta(123);
        pessoa1.setTipo("CC");
        pessoa1.setDono("Jubileu");
        pessoa1.abrirConta("CC");
        pessoa1.estadoAtual();

        System.out.println("-------------------------");
        //instanciando pessoa 2
        ContaBancaria pessoa2 = new ContaBancaria();
        pessoa2.setNumConta(456);
        pessoa2.setTipo("CP");
        pessoa2.setDono("Creuza");
        pessoa2.abrirConta("CP");
        pessoa2.estadoAtual();

        System.out.println("-------------------------");
        //deposito
        pessoa1.depositar(300);
        pessoa1.estadoAtual();
        System.out.println("-------------------------");
        pessoa2.depositar(500);
        pessoa2.estadoAtual();

        System.out.println("-------------------------");
        //saque
        pessoa2.sacar(100);
        pessoa2.estadoAtual();

        System.out.println("-------------------------");
        //fechar conta
        pessoa1.sacar(150);
        pessoa1.fecharConta();


    }
}

//conta corrente - para abrir: ganha 50; mensalidade: perde 12/mes
//conta poupanca - para abrir: ganha 150; mensalidade: perde 20/mes