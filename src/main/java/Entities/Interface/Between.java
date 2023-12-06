package Entities.Interface;

import Entities.Abstract.Cliente;
import Entities.Abstract.Empresa;

import java.util.List;

public interface Between {
      int between(List<Empresa> empresaList, List<Cliente> clienteList);
}
