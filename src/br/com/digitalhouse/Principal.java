package br.com.digitalhouse;

import java.util.ArrayList;
import java.util.List;

public class Principal {

    public static void main(String[] args) {
        Curso Android = new Curso("Mobile Android - muito massa");
        Curso fullstack = new Curso ("web fullstack - muito massa tbm");

        Aluno vini = new Aluno( "Vinicius", 123, "Oliveira", Android);
        Aluno vinicius = new Aluno( "Vinicius", 123456, "Oliveira", Android);
        Aluno Jessica = new Aluno("Jessica", 321, "Milena",fullstack);
        Aluno Hendy = new Aluno( "Hendy", 333, "Pedro", fullstack);
        Aluno Ana = new Aluno ( "Ana", 444, "pereira", Android);

        List<Aluno> alunos = new ArrayList<>();
        alunos.add(vini);
        alunos.add(Jessica);
        alunos.add(Hendy);
        alunos.add(Ana);

        System.out.println(
                //vini.equals(vinicius)

                alunos.contains(vinicius));

        }
}
