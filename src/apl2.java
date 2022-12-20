public class Apl2 {

    public static void main(String[] args) {

        Cliente clien = new Cliente("123.324.675-30","Reus", "998785422");
        Endereco e1 = new Endereco("400","ap1","Santos Dumont", "rua x");
        Endereco e2 = new Endereco("500","ap2","Santos Dumont", "rua y");
        Endereco e3 = new Endereco("300","ap3","Santos Dumont", "rua z");

        clien.listaEndereco.add(e1);
        clien.listaEndereco.add(e2);
        clien.listaEndereco.add(e3);

        clien.imprimirEndereco(clien);

    }

}
