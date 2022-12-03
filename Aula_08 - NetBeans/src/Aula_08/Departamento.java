package Aula_08;

import java.util.ArrayList;


public class Departamento {
    
    private int codigo;
    private String Nome;
    ArrayList<Funcionario> listafunc;

    public Departamento() {
        listafunc = new ArrayList();
    }

    public Departamento(int codigo, String Nome) {
        this.codigo = codigo;
        this.Nome = Nome;
        listafunc = new ArrayList();
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public ArrayList<Funcionario> getListafunc() {
        return listafunc;
    }

    public void setListafunc(ArrayList<Funcionario> listafunc) {
        this.listafunc = listafunc;
    }
    
    public void addFunc(Funcionario F){
        F.setDep(this);
        listafunc.add(F);
    }

}
