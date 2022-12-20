public class Apl3 {

    public static void main(String[] args) {

        Cliente clien = new Cliente("123.12.123.12","Brandt");

        ContaCorrente conc1 = new ContaCorrente("201",0.0,0.);
        Credito cred1 = new Credito(100.);
        Credito cred2 = new Credito(100.);
        Credito cred3 = new Credito(100.);

        conc1.depositar(cred1.getValor());
        conc1.depositar(cred2.getValor());
        conc1.depositar(cred3.getValor());

        conc1.credito.add(cred1);
        conc1.credito.add(cred2);
        conc1.credito.add(cred3);

        clien.listaConta.add(conc1);

        Debito debi = new Debito(50.);

        conc1.debito.add(debi);

        conc1.sacar(debi.getValor());


        System.out.println("Conta número " + conc1.getNumero() + " saldo da conta : R$" + conc1.calcularSaldo(conc1) + ", o limite é : R$" + conc1.getLimite());

    }

}
