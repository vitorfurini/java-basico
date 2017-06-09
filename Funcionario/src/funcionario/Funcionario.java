package funcionario;

/**
 *
 * @author vitor.furini
 */
abstract class Funcionario {

    public static void main(String[] args) {
        Teste f1 = new Teste();
        //PRIMEIRO SETAR (SET)
        f1.setNome("Vitor");
        f1.setDataEntrada("08/05/2017");
        f1.setDepartamento("estágiario em dev. Java");
        f1.setNaEmpresa(true);
        f1.setRG("21643312");
        f1.setSalario(1000);

        //Aqui o funcionario recebe aumento
        f1.setRecebeAumento(500);
        //Aqui o funcionario recebeu bonificação
        f1.setBonus(250);

        //SEGUNDO PRINTAR E OBTER (GET)
        System.out.println("Nome: " + f1.getNome());
        System.out.println("RG do funcionario: " + f1.getRG());
        System.out.println("Departamento: " + f1.getDepartamento());
        System.out.println("Salário: " + f1.getSalario());
        System.out.println("Recebeu aumento de salário de: " + f1.getRecebeAumento());
        System.out.println("Bonificação: " + f1.getBonus());
        System.out.println("Ganho anual: " + f1.ganhoAnual());
        System.out.println("Data de entrada: " + f1.getDataEntrada());
        if (f1.isNaEmpresa()) {
            System.out.println("Situação: Ativo");
        } else {
            System.out.println("Situação: Inativo");
        }
    }
}
