package Entities.Abstract;

import Entities.Interface.Between;

import java.util.ArrayList;
import java.util.List;

public abstract class Banco{
    private Integer ID;
    private String Name;

    public static List<Cliente> listCliente = new ArrayList<>();
    public static List<Empresa> listEmpresa = new ArrayList<>();


    public static <T> boolean Verificacao(T gn) {
        if (gn instanceof Cliente && listCliente.contains(gn)) {
            return true;
        }
        if (gn instanceof Empresa && listEmpresa.contains(gn)) {
            return true;
        }

        return false;
    }

}
