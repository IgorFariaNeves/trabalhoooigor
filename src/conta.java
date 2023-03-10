import java.util.ArrayList;
import java.util.Collection;

public abstract class Conta {
    private String numero;
    private Double valorCaixa;

    public Collection<Credito> credito = new ArrayList<Credito>();
    public Collection<Debito> debito = new ArrayList<Debito>();

    public  Conta(String numero, Double valorCaixa){
        this.setNumero(numero);
        this.setValorCaixa(valorCaixa);
    }

    public Double depositar(Double valor){

        this.valorCaixa += valor;

        return this.valorCaixa;
    }

    public Double sacar(Double valor){

        if (valor > this.valorCaixa){
            System.out.println("nao tem saldo:");
            return this.valorCaixa;
        }
        valorCaixa -= valor;
        return  this.valorCaixa;

    }


    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Double getValorCaixa() {
        return valorCaixa;
    }

    public void setValorCaixa(Double valorCaixa) {
        this.valorCaixa = valorCaixa;
    }
