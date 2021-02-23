import java.util.ArrayList;
import java.util.List;

public class Oficina{
    private List<OrdemServico> os;

    public Oficina() {
        this.os = new ArrayList<OrdemServico>();
    }

    public void adicionaOS(OrdemServico os) {
        this.os.add(os);
    }

    public void buscaOsCodigo(int codigo, ArrayList<OrdemServico> os) {
        for (OrdemServico os1 : this.os) {
            if(os1.getCodigo() == os1.getCodigo()) {
                System.out.println("Valor achado");
            } else {
                System.out.println("Valor não achado");
            }
        }
    }

    public double calculaFaturamentoTotal() {
        return 0;
    }

    @Override
    public String toString() {
        return "Oficina [ordensServico=" + os + "]";
    }

}