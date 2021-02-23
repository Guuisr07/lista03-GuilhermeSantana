import java.util.ArrayList;

public class Principal {

    public static void main(String[] args) {
        ArrayList<Servico> servicos = new ArrayList();
        ArrayList<Mecanico> mecanicos = new ArrayList();
        ArrayList<OrdemServico> os = new ArrayList();

        Servico s1 = new Servico(123, "Arrumar o carro", 25.40);
        Servico s2 = new Servico(234, "Lavar o carro", 30.00);
        Servico s3 = new Servico(431, "Aspirar o carro", 30.00);

        Mecanico m1 = new Mecanico("Carros antigos", "456.897.678-90", "Gilberto");

        OrdemServico o1 = new OrdemServico(12, "Isabela");
        OrdemServico o2 = new OrdemServico(20, "Elayne");
        OrdemServico o3 = new OrdemServico(30, "Mateus");

        Oficina of1 = new Oficina();

        o1.adicionaServico(s1);
        o1.adicionaServico(s2);
        o1.adicionaServico(s3);
        o1.adicionaMecanico(m1);

        o1.calculaValorTotal(servicos);

        System.out.println();

        of1.adicionaOS(o1);

        System.out.println("Adicionando OS: \n" + of1);

        System.out.println();

        of1.buscaOsCodigo(0, os);

        System.out.println(of1);
    }

}