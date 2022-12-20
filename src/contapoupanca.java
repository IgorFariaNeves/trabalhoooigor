public class contapoupanca extends Conta{

    private Double rentabilidadeMensal;

    public contapoupanca(String numero, Double valorCaixa, Double rentabilidadeMensal) {

        super(numero, valorCaixa);
        this.setRentabilidadeMensal(rentabilidadeMensal);

    }

    public Double calcularSaldo(contapoupanca conta){
        Double total = conta.getValorCaixa();

        return total;
    }

    public Double getRentabilidadeMensal() {
        return rentabilidadeMensal;
    }




    public void setRentabilidadeMensal(Double rentabilidadeMensal) {
        this.rentabilidadeMensal = rentabilidadeMensal;
    }
}
