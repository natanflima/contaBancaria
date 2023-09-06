package contaBancaria;

public class ContaBancaria {

    //atributos

    public int numConta;
    protected String tipo;
    private String dono;
    private double saldo;
    private boolean status;

    double v = 0;

    // para rodar
    public void estadoAtual() {
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("tipo da conta: " + this.getTipo());
        System.out.println("dono da conta: " + this.getDono());
        System.out.println("saldo da conta: " + this.getSaldo());
        System.out.println("status da conta: " + this.getStatus());

    }

    // metodos personalizados

    public void abrirConta(String tipo) {
        if (tipo == "CC") {
            this.saldo = 50;
            setStatus(true);
        } else if (tipo == "CP") {
            this.saldo = 150;
            setStatus(true);
        }
        System.out.println("Conta aberta com sucesso!");
    }

    public void fecharConta() {
        if(this.saldo == 0){
            this.status = false;
            System.out.println("Conta fechada com sucesso!");
        } else if (this.saldo != 0){
            System.out.println("Esvazie sua conta ou pague os debitos para fecha-la.");
        }
    }
    public void depositar(double v) {
        if (this.status == true) {
            //saldo = saldo + v;
            this.setSaldo(this.getSaldo() + v);
            System.out.println("Valor depositado com sucesso!");
        } else {
            System.out.println("Regularize sua conta para realizar o deposito.");
        }
    }
    public void sacar(double v) {
        if((this.getSaldo() > v) && (this.getStatus() == true)) {
            this.setSaldo(this.getSaldo() - v);
            System.out.println("Valor sacado com sucesso!");
        } else if(this.getSaldo() < v) {
            System.out.println("Saldo insuficiente para saque.");
        }
    }
    public void pagarMensalidade(String tipo) {
        if(tipo == "CC") {
            v = 12;
        } else if(tipo == "CP") {
            v = 20;
        } else {
            System.out.println("mensalidade nao se aplica");
        }
    }

    public ContaBancaria() {
        this.saldo = 0;
        this.status = false;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }


}