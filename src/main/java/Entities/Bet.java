package Entities;

import Entities.Abstract.Cliente;
import Entities.Abstract.Empresa;
import Entities.Interface.Between;

import java.util.List;

public class Bet implements Between {

    @Override
    public int between(List<Empresa> empresaList, List<Cliente> clienteList) {
        return 0;
    }
}
