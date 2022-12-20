public class apl1 {

    public static void main(String[] args) {
        Funcionario fn2 = new Funcionario("123.123.13-13","´Reus");
        Funcionario fun2 = new Funcionario("123.123.13-12","Brandt");
        CargoFuncionario at = new CargoFuncionario("Atendente");
        CargoFuncionario  ger = new CargoFuncionario("Gerente");

        fn2.setCargo(at);
        fun2.setCargo(ger);

    }

}
