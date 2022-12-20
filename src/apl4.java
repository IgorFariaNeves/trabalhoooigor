public class Aplicacao4 {

    public static void main(String[] args) {

        Cliente clien1 = new Cliente("123.123.13-13","´Reus");
        Cliente clien2 = new Cliente("123.123.13-12","Brandt");

        ContaCorrente conc1 = new ContaCorrente("123",0.,0.);
        Credito cred1 = new Credito(1000.);
        conc1.depositar(cred1.getValor());
        conc1.credito.add(cred1);

        ContaPoupanca conp = new ContaPoupanca("321", 0.0, 0.001);
        Credito cred2 = new Credito(1000.);
        conp.depositar(cred2.getValor());
        conp.credito.add(cred2);


        Debito trans = new Debito(500.);
        conc1.debito.add(trans);
        conc1.transferir(conp,conc1,trans.getValor());

        System.out.println("Conta número " + conc1.getNumero() + " saldo é : R$" + conc1.calcularSaldo(conc1) + ", tem o limite de: R$" + conc1.getLimite());
        System.out.println("Conta número " + conp.getNumero() + " ´saldo é : R$" + conp.calcularSaldo(conp) + ", a rentabilidade é: " + conp.getRentabilidadeMensal());
