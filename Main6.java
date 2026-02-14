package Ejercicio6;
public class Main6 {
    public static void main(String[] args) {
        AreaConocimiento a1 = new AreaConocimiento("AC00","Lenguas");
        Departamento dep_Ingles = new Departamento("LEN03","Deptartamento lenguas extranjeras",a1);
        Profesor JoseL = new Profesor("18937652F","Jose Luis Fernandez Llansola",dep_Ingles);
        Facultad facIdiomas = new Facultad("F02","Facultad de Lenguas");
        Catedra filIng = new Catedra("C023","Filología general Inglesa",facIdiomas,dep_Ingles);
        Adscrito ad00 = new Adscrito("ADS00",filIng,JoseL,"22/04/2020");
        System.out.println(a1 + "\n" + dep_Ingles + "\n" + JoseL + "\n" + facIdiomas + "\n" + filIng + "\n" + ad00);
    }
}