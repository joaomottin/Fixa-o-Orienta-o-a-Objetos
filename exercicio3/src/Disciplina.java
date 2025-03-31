public class Disciplina {
    private String materia, professor;

    public Disciplina(String materia, String professor) {
        this.materia = materia;
        this.professor = professor;
    }

    public void status (){
        System.out.println("Matéria: " + materia);
        System.out.println("Professor: " + professor);
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public String getProfessor() {
        return professor;
    }

    public void setProfessor(String professor) {
        this.professor = professor;
    }

    @Override
    public String toString() {
        return "Disciplina [materia=" + materia + ", professor=" + professor + "]";
    }
    
}

