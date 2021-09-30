public class Principal{
    public static void main(String []args){

        Funcionario f=new Funcionario();
        f.setNome("Elidio");
        f.setCpf("055669466");
        f.setSalario(7000);
        f.setDepartamento("RH");
        
        System.out.println("O nome do funcionario é"+f.getNome());
        System.out.println("O CPF do funcionario é"+f.getCpf());
        System.out.println("O Salário do funcionario é R$"+f.getSalario());
        System.out.println("O Depatamento do funcionario é"+f.getDepartamento() + "empresa");
        System.out.println("O salário do funcionário com bonificaçao é"+f.bonificacao());
    }
}