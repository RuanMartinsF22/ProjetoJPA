package teste.basico;

import infra2.DAO;
import modelo.basico.Produto;

public class NovoProduto {

    public static void main(String[] args) {

        Produto produto = new Produto("Monitor Gamer 24.5", 1300.00);

        DAO<Produto> dao = new DAO<>(Produto.class);
        dao.incluirAtomico(produto).fechar();

        System.out.println("ID do produto: " + produto.getId());
    }
}
