
import java.util.ArrayList;
import java.util.List;

public class OrdemServico {

    private int codigo;
    private String cliente;
    private List<Servico> servicos;
    private List<Mecanico> mecanicos;

    public OrdemServico(int codigo, String cliente) {
        this.servicos = new ArrayList<Servico>();
        this.mecanicos = new ArrayList<Mecanico>();
        this.codigo = codigo;
        this.cliente = cliente;
    }

    public void adicionaServico(Servico servicos){
        this.servicos.add(servicos);
    }

    public void adicionaMecanico(Mecanico mecanicos){
        this.mecanicos.add(mecanicos);
    }

    public double calculaValorTotal(ArrayList<Servico> servicos) {

        double soma = 0;

        for (Servico servico : this.servicos) {
            System.out.println("Percorrendo o array - " + servico);

            soma += servico.getValor();

            System.out.println("Soma de todos os servicos:  " + soma);
        }

        return soma;
    }

    public void buscaOsCodigo(int codigo, ArrayList<OrdemServico> os) {
        for (OrdemServico os1 : this.os) {
            System.out.println(this.os);
            System.out.println(os1.getCodigo());
            if(os1.getCodigo() == codigo) {
                System.out.println("Valor achado");
            } else {
                System.out.println("Valor não achado");
            }
        }
    }

    public void buscaOsCpf(String cpf, ArrayList<OrdemServico> os) {
        for (OrdemServico os1 : this.os) {
            if(os1.getCliente() == cpf) {
                System.out.println("CPF achado");
                break;
            } else {
                System.out.println("CPF não achado");
            }
        }
    }

    @Override
    public String toString() {
        return "OrdemServico{" +
                "codigo=" + codigo +
                ", cliente=" + cliente +
                ", servicos=" + servicos +
                ", mecanicos=" + mecanicos +
                '}';
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public List<Servico> getServicos() {
        return servicos;
    }

    public void setServicos(List<Servico> servicos) {
        this.servicos = servicos;
    }

    public List<Mecanico> getMecanicos() {
        return mecanicos;
    }

    public void setMecanicos(List<Mecanico> mecanicos) {
        this.mecanicos = mecanicos;
    }
}