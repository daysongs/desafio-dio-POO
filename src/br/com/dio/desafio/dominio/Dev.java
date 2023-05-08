package br.com.dio.desafio.dominio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {
    private String nome;
    private Set<Conteodo> conteodosInscritos = new LinkedHashSet<>();
    private Set<Conteodo> conteodosConcluidos = new LinkedHashSet<>();


    // criando os metodos
    public void inscreverBootcamp(Bootcamp bootcamp){
        this.conteodosInscritos.addAll(bootcamp.getConteodos());
        bootcamp.getDevsInscritos().add(this);
    }

    public void proguedir() {
        Optional<Conteodo> conteodo = this.conteodosInscritos.stream().findFirst();
        if(conteodo.isPresent()){
            this.conteodosConcluidos.add(conteodo.get());
            this.conteodosInscritos.remove(conteodo.get());
        } else {
            System.err.println("Você não esta matriculado em nenhum conteodo");
        }
    }

    public double calcularTotalXp() {
       return this.conteodosConcluidos.stream()
               .mapToDouble(Conteodo::calcularXp).
               sum();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Conteodo> getConteodosInscritos() {
        return conteodosInscritos;
    }

    public void setConteodosInscritos(Set<Conteodo> conteodosInscritos) {
        this.conteodosInscritos = conteodosInscritos;
    }

    public Set<Conteodo> getConteodosConcluidos() {
        return conteodosConcluidos;
    }

    public void setConteodosConcluidos(Set<Conteodo> conteodosConcluidos) {
        this.conteodosConcluidos = conteodosConcluidos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return Objects.equals(nome, dev.nome) && Objects.equals(conteodosInscritos, dev.conteodosInscritos) && Objects.equals(conteodosConcluidos, dev.conteodosConcluidos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, conteodosInscritos, conteodosConcluidos);
    }
}
